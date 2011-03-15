/**
 * The information, opinions, data, and statements contained herein are not 
 * necessarily those of the U.S. Government or the National Institutes of Health (NIH) 
 * and should not be interpreted, acted on, or represented as such.
 * 
 * Reference herein to any specific commercial product, process, or service by 
 * trade name, trademark, manufacturer, or otherwise, does not necessarily 
 * constitute or imply its endorsement, recommendation, or favoring by the U.S. 
 * Government, NIH, or any of their employees and contractors.
 * 
 * The U.S. Government, NIH and their employees and contractors do not make 
 * any warranty, express or implied, including the warranties of merchantability 
 * and fitness for a particular purpose with respect to this document. In addition, 
 * the U.S. Government, NIH, and their employees and contractors assume no legal 
 * liability for the accuracy, completeness, or usefulness of any information, 
 * apparatus, product, or process disclosed herein and do not represent that use 
 * of such information, apparatus, product or process would not infringe on 
 * privately owned rights.
 * 
 * This document is sponsored by the NIH, along with private companies and other 
 * organizations. Accordingly, other parties may retain all rights to publish or 
 * reproduce these documents or to allow others to do so. This document may be 
 * protected under the U.S. and foreign Copyright laws. 
 * 
 * Permission to reproduce may be required.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 *  
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 */
package gov.nih.nci.lmp.mimGpml;

import java.io.Reader;
import java.io.StringReader;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;

import java.awt.Color;
import java.awt.Point;
import java.awt.geom.Point2D;

import gov.nih.nci.lmp.mim.mimVisLevel1.*;

import org.apache.xmlbeans.*;

import org.bridgedb.Xref;
import org.bridgedb.DataSource;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

import org.pathvisio.debug.Logger;
import org.pathvisio.model.AnchorType;
import org.pathvisio.model.ConnectorType;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.DataNodeType;
import org.pathvisio.model.GroupStyle;
import org.pathvisio.model.LineType;
import org.pathvisio.model.MLine;
import org.pathvisio.model.ObjectType;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.model.ShapeType;
import org.pathvisio.model.GraphLink.GraphIdContainer;
import org.pathvisio.model.GraphLink.GraphRefContainer;
import org.pathvisio.model.PathwayElement.Comment;
import org.pathvisio.model.PathwayElement.MAnchor;
import org.pathvisio.model.PathwayElement.MPoint;
import org.pathvisio.biopax.BiopaxReferenceManager;
import org.pathvisio.biopax.BiopaxElementManager;
import org.pathvisio.biopax.reflect.PublicationXref;
import org.pathvisio.util.FileUtils;
import org.pathvisio.view.ShapeRegistry;

import java.io.*;

/**
 * Class for the import of MIMML.
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * @author Margot Sunshine
 * 
 * @version 1.0
 * @since 1.0
 * 
 */
public class ImporterHelper extends CommonHelper {

	/** The imported file. */
	private File file;

	/** Visual diagram document. */
	private DiagramDocument visDoc;

	/** The diagram. */
	private DiagramType dia;

	/** The Pathvisio pathway. */
	private Pathway pw;

	/**
	 * Instantiates a new importer helper.
	 */
	public ImporterHelper(File file) {
		this.file = file;
		this.pw = new Pathway();

		mapDiagram();
	}

	/**
	 * Parses the diagram XML.
	 * 
	 * @param xmlfile
	 *            the xmlfile
	 */
	public void parseDiagramXml(File xmlFile) throws XmlException, IOException {

		Logger.log.trace("Entering parseDiagramXml");

		StringBuilder contents = new StringBuilder();

		try {

			BufferedReader input = new BufferedReader(new FileReader(xmlFile));

			try {
				String line = null;

				while ((line = input.readLine()) != null) {
					contents.append(line);
					contents.append(System.getProperty("line.separator"));
				}
			} finally {
				input.close();
			}

			String fileStr = contents.toString();

			Logger.log.debug(fileStr);

			this.visDoc = DiagramDocument.Factory.parse(xmlFile);
			this.dia = this.visDoc.getDiagram();
			// System.out.println("\n\nVisDoc: ");
			// visDoc.save(System.out, getXmlOptions());
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Process entity glyph.
	 */
	private void processEntityGlyph() {
		List<EntityGlyphType> entGlyphTypeList = this.visDoc.getDiagram()
				.getEntityGlyphList();

		for (EntityGlyphType entGlyphType : entGlyphTypeList) {
			System.out.println("Entity: " + entGlyphType.getDisplayName());
		}
	}

	/**
	 * Recalculate lines. Helps to adjust anchors on lines by clearing out cache.
	 *
	 * @param pathway the pathway
	 * @throws ConverterException the converter exception
	 */
	private static void recalculateLines(Pathway pathway)
			throws ConverterException {
		
		for (PathwayElement pe : pathway.getDataObjects()) {
			if (pe.getObjectType() == ObjectType.LINE) {			
				((MLine) pe).getConnectorShape().recalculateShape(((MLine) pe));
			}
		}
	}

	/**
	 * Gets the pathway.
	 * 
	 * @return the pw
	 */
	public Pathway getPw() throws ConverterException {
		recalculateLines(pw);

		// Taken from Pathway.readFromXml()
		pw.setSourceFile(file);
		pw.clearChangedFlag();
		
		return pw;
	}

	/**
	 * Sets the pathway.
	 * 
	 * @param pw
	 *            the new pw
	 */
	public void setPw(Pathway pw) {
		this.pw = pw;
	}

	/**
	 * Sets the MIM-Vis doc.
	 * 
	 * @param visDoc
	 *            the new vis doc
	 */
	public void setVisDoc(DiagramDocument visDoc) {
		this.visDoc = visDoc;
	}

	/**
	 * Gets the MIM-Vis doc.
	 * 
	 * @return the vis doc
	 */
	public DiagramDocument getVisDoc() {
		return this.visDoc;
	}

	/**
	 * Map diagram.
	 */
	private Pathway mapDiagram() {

		Logger.log.info("Parse diagram");

		// TODO: Validate MIMML before trying to parse
		try {
			parseDiagramXml(this.file);
		} catch (XmlException e) {
			Logger.log.error(e.getMessage());
		} catch (IOException e) {
			Logger.log.error(e.getMessage());
		}

		// Add element that contains BioPAX
		PathwayElement biopax = PathwayElement
				.createPathwayElement(ObjectType.BIOPAX);
		pw.add(biopax);

		PathwayElement info = PathwayElement
				.createPathwayElement(ObjectType.INFOBOX);
		pw.add(info);

		info.setMHeight(dia.getHeight());
		info.setMWidth(dia.getWidth());

		// Check for the case where there is no MIMBio element
		if (dia.isSetMimBio()) {
			if (dia.getMimBio().isSetTitle()) {
				pw.getMappInfo().setMapInfoName(dia.getMimBio().getTitle());
			}

			if (dia.getMimBio().isSetIdentifier()) {
				pw.getMappInfo().setVersion(dia.getMimBio().getIdentifier());
			}

			if (dia.getMimBio().isSetRights()) {
				pw.getMappInfo().setCopyright(dia.getMimBio().getRights());
			}

			if (dia.getMimBio().isSetSource()) {
				pw.getMappInfo().setMapInfoDataSource(
						dia.getMimBio().getSource());
			}

			if (dia.getMimBio().isSetDescription()) {
				pw.getMappInfo().addComment(dia.getMimBio().getDescription(),
						"");
			}

			if (dia.getMimBio().sizeOfCreatorArray() > 0) {
				String str = "";

				for (String s : dia.getMimBio().getCreatorList()) {
					str += s;
				}

				pw.getMappInfo().setAuthor(str);
			}

			if (dia.getMimBio().sizeOfContributorArray() > 0) {
				String str = "";

				for (String s : dia.getMimBio().getContributorList()) {
					str += s;
				}

				pw.getMappInfo().setMaintainer(str);
			}

			if (dia.getMimBio().getModified() != null) {
				pw.getMappInfo().setLastModified(
						dia.getMimBio().getModified().toString());
			}
		}

		// TODO: Map XRefs
		// mapXRefs(info);

		// Map interactions
		mapInteractionGlyphs();

		// Map entities
		mapSimplePhysicalEntityGlyphs();
		mapEntityFeatureGlyphs();
		mapModifierEntityGlyphs();
		mapConceptualEntityGlyphs();
		mapSourceSinkGlyphs();
		mapRestrictedCopyEntityGlyphs();

		// TODO: Map Groups
		mapGroups();
		mapImplicitComplexEntityGlyphs();

		return pw;
	}

	/**
	 * Map simple physical entity glyphs.
	 */
	private void mapSimplePhysicalEntityGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(
					EntityGlyphType.Type.SIMPLE_PHYSICAL_ENTITY)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType
						.create("SimplePhysicalEntity"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setTextLabel(glyph.getDisplayName());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				// Set ShapeType
				pwElem.setShapeType(ShapeType.ROUNDED_RECTANGLE);

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map entity feature glyphs.
	 */
	private void mapEntityFeatureGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.ENTITY_FEATURE)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType.create("EntityFeature"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setTextLabel(glyph.getDisplayName());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				// Set ShapeType
				pwElem.setShapeType(ShapeType.ROUNDED_RECTANGLE);

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map modifier entity glyphs.
	 */
	private void mapModifierEntityGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.MODIFIER)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType.create("Modifier"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setTextLabel(glyph.getDisplayName());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				// Set ShapeType
				pwElem.setShapeType(ShapeType.NONE);

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map conceptual entity glyphs.
	 */
	private void mapConceptualEntityGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.CONCEPTUAL_ENTITY)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType.create("ConceptualEntity"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setTextLabel(glyph.getDisplayName());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				pwElem.setShapeType(ShapeRegistry.fromName("ConceptualEntity"));

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map source sink glyphs.
	 */
	private void mapSourceSinkGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.SOURCE_SINK)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType.create("SourceSink"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				// Set ShapeType
				// pwElem.setShapeType(ShapeType.fromName("SourceSink"));
				pwElem.setShapeType(ShapeRegistry.fromName("SourceSink"));

				/*
				 * DEBUG Make sure that the SourceSink ShapeType has been
				 * registered
				 */
				// String[] shapeTypes = ShapeType.getNames();
				//
				// for (int i = 0; i < shapeTypes.length; i++) {
				// Logger.log.info("ShapeType: " + shapeTypes[i]);
				// }

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map restricted copy entity glyphs.
	 */
	private void mapRestrictedCopyEntityGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.RESTRICTED_COPY)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.DATANODE);

				pwElem.setDataNodeType(DataNodeType.create("RestrictedCopy"));

				pwElem.setGraphId(glyph.getVisId());
				pwElem.setMHeight(glyph.getHeight());
				pwElem.setMWidth(glyph.getWidth());
				pwElem.setMCenterX(glyph.getCenterX());
				pwElem.setMCenterY(glyph.getCenterY());
				pwElem.setGroupRef(glyph.getGroupRef());

				pwElem.setColor(convertHexToColor(glyph.getColor()));

				/*
				 * Set GPML dynamic properties
				 * 
				 * Skip ShapeType because this is known from the entity type
				 */
				for (EntityGlyphType.GenericProperty genProp : glyph
						.getGenericPropertyList()) {
					if (!genProp.getKey().equals("ShapeType")) {
						pwElem.setDynamicProperty(genProp.getKey(), genProp
								.getValue());
					}
				}

				// Set ShapeType
				pwElem.setShapeType(ShapeRegistry.fromName("RestrictedCopy"));

				// Needs to be set for the glyph to be filled
				pwElem.setFillColor(convertHexToColor(glyph.getColor()));

				// Map RelationshipXRefs
				mapRelationshipXRefs(glyph, pwElem);

				// Map EntityControlledVocabulary
				mapEntityControlledVocabularies(glyph, pwElem);

				pw.add(pwElem);
			}
		}
	}

	/**
	 * Map interaction glyphs.
	 */
	private void mapInteractionGlyphs() {
		for (InteractionGlyphType glyph : dia.getInteractionGlyphList()) {
			// Diagram.InteractionGlyph.Point@visRef
			// Diagram.InteractionGlyph.Point@visId
			// Diagram.InteractionGlyph.Point@arrowHead
			// Diagram.InteractionGlyph.Anchor@visId

			PathwayElement pwElem = PathwayElement
					.createPathwayElement(ObjectType.LINE);

			pwElem.setColor(convertHexToColor(glyph.getColor()));

			pwElem.setGraphId(glyph.getVisId());
			pwElem.setGroupRef(glyph.getGroupRef());

			// TODO: Find out what comment source looks like in GPML
			for (String com : glyph.getCommentList()) {
				pwElem.addComment(com, "");
			}

			// Set default ConnectorType to Elbow
			if (!glyph.getGenericPropertyList().contains("ConnectorType")) {
				pwElem.setConnectorType(ConnectorType.ELBOW);
				// Logger.log.info("Line doesn't contain ConnectorType");
			}

			// Logger.log.info("Null connector type:" +
			// pwElem.getConnectorType().toString());

			Logger.log.debug("InterGlyph xmlText: " + glyph.xmlText());

			for (InteractionGlyphType.GenericProperty genProp : glyph
					.getGenericPropertyList()) {
				if (genProp.getKey().equals("ConnectorType")) {
					pwElem.setConnectorType(ConnectorType.fromName(genProp
							.getValue()));
				} else {
					pwElem.setDynamicProperty(genProp.getKey(), genProp
							.getValue());
				}
			}

			Logger.log.info("Current line:" + glyph.getVisId() + "\n");
			Logger.log.info("Point list:" + glyph.getPointList().size() + "\n");

			List<MPoint> mPoints = new ArrayList<MPoint>();

			String startGraphRef = null;
			String endGraphRef = null;

			// Map points
			for (int i = 0; i < glyph.getPointList().size(); i++) {
				InteractionGlyphType.Point pt = glyph.getPointArray(i);

				// Map arrowheads
				if (i == 0) {
					String arrowHead = pt.getArrowHead().toString();
					String gpmlArrowHead = ImporterHelper
							.convertArrowHead(arrowHead);

					LineType lt = LineType.fromName(gpmlArrowHead);
					pwElem.setStartLineType(lt);

					Logger.log.info("startLineType:"
							+ pt.getArrowHead().toString() + "\n");
					Logger.log.info("graphRef:" + pt.getVisRef() + "\n");

					startGraphRef = pt.getVisRef();
				}

				if (i < glyph.getPointList().size()) {
					String arrowHead = pt.getArrowHead().toString();
					String gpmlArrowHead = ImporterHelper
							.convertArrowHead(arrowHead);

					LineType lt = LineType.fromName(gpmlArrowHead);
					pwElem.setEndLineType(lt);

					Logger.log.info("endLineType:"
							+ pt.getArrowHead().toString() + "\n");
					Logger.log.info("graphRef:" + pt.getVisRef() + "\n");

					endGraphRef = pt.getVisRef();
				}

				Logger.log.info("point X:" + pt.getX() + "\n");
				Logger.log.info("point Y:" + pt.getY() + "\n");

				MPoint mp = pwElem.new MPoint(pt.getX(), pt.getY());

				mPoints.add(mp);

				Double relX = new Double(Double.NaN);
				Double relY = new Double(Double.NaN);

				Logger.log.info("Importer set RelX: " + pt.getRelX());
				Logger.log.info("Importer set RelY: " + pt.getRelY());

				// Map RelX and RelY
				relX = pt.getRelX();
				relY = pt.getRelY();

				pwElem.setRelX(relX);
				pwElem.setRelY(relY);

				if (!relX.equals(Double.NaN) || !relY.equals(Double.NaN)) {
					mp.setRelativePosition(relX, relY);
				} else {
					mp.setRelativePosition(1.0, 0.5);
				}
			}

			pwElem.setMPoints(mPoints);

			if (isNotBlank(startGraphRef)) {
				pwElem.setStartGraphRef(startGraphRef);
			}

			if (isNotBlank(endGraphRef)) {
				pwElem.setEndGraphRef(endGraphRef);
			}

			Logger.log.info("Points size: " + mPoints.size());

			// Map anchors
			for (String mimAncRef : glyph.getAnchorRefList()) {

				Logger.log.info("mimAncRef: " + mimAncRef);

				AnchorGlyphType mimAnc = getAnchorGlyphType(mimAncRef);

				if (mimAnc != null) {
					MAnchor gpmlAnc = pwElem.addMAnchor(mimAnc.getPosition());
					gpmlAnc.setGraphId(mimAnc.getVisId());

					if (mimAnc.getType().equals(AnchorGlyphType.Type.IN_TRANS)) {
						gpmlAnc.setShape(AnchorType.create("Intermolecular",
								true));
					}

					if (mimAnc.getType().equals(AnchorGlyphType.Type.INVISIBLE)) {
						gpmlAnc.setShape(AnchorType.NONE);
					}
				} else {
					// TODO: This can be abstracted to other types
					EntityGlyphType mimEc = getExplicitComplexType(mimAncRef);

					MAnchor gpmlAnc = pwElem.addMAnchor(mimEc.getPosition());
					gpmlAnc.setGraphId(mimEc.getVisId());

					gpmlAnc.setShape(AnchorType.CIRCLE);

					Logger.log.debug("Imported Ec: " + mimEc.getVisId());
				}
			}

			// Map PublicationXRefs
			List<String> mimBioRefs = mapPublicationXRefs(glyph, pwElem);
			pwElem.setBiopaxRefs(mimBioRefs);

			pw.add(pwElem);
		}
	}

	private void mapImplicitComplexEntityGlyphs() {
		for (EntityGlyphType glyph : dia.getEntityGlyphList()) {

			if (glyph.getType().equals(EntityGlyphType.Type.IMPLICIT_COMPLEX)) {

				PathwayElement pwElem = PathwayElement
						.createPathwayElement(ObjectType.GROUP);

				pwElem.setGroupId(glyph.getVisId());
				pwElem.setGroupStyle(GroupStyle.fromName("ImplicitComplex"));

				pw.add(pwElem);
			}
		}
	}

	private void mapGroups() {
		for (GroupType grp : dia.getGroupList()) {

			PathwayElement pwElem = PathwayElement
					.createPathwayElement(ObjectType.GROUP);

			// No distinction is made in MIM of one ID type versus the other
			// but in GPML they have different functions.
			pwElem.setGroupId(grp.getVisId());
			pwElem.setGraphId(grp.getVisId());

			if (grp.getType().equals(GroupEnumType.GENERIC)) {
				// GroupStyle.GROUP yields "None"
				pwElem.setGroupStyle(GroupStyle.GROUP);
			} else if (grp.getType().equals(GroupEnumType.ENTITY_WITH_FEATURES)) {
				pwElem.setGroupStyle(GroupStyle.create("EntityWithFeatures",
						true));
			} else {
				Logger.log.error("Unknown group type: " + grp.getType());
			}

			pw.add(pwElem);
		}
	}

	/**
	 * Gets the anchor glyph type.
	 * 
	 * @param anchorRef
	 *            the anchor ref
	 * @return the anchor glyph type
	 */
	private AnchorGlyphType getAnchorGlyphType(String anchorRef) {

		AnchorGlyphType matchedAncGlyph = null;

		Logger.log.debug("Anc anchorRef: " + anchorRef);

		for (AnchorGlyphType ancGlyph : dia.getAnchorList()) {
			if (ancGlyph.getVisId().equals(anchorRef)) {
				matchedAncGlyph = ancGlyph;
			}
		}

		return matchedAncGlyph;
	}

	/**
	 * Gets the explicit complex type.
	 * 
	 * @param anchorRef
	 *            the anchor ref
	 * @return the explicit complex type
	 */
	private EntityGlyphType getExplicitComplexType(String anchorRef) {

		EntityGlyphType matchedEntGlyph = null;

		Logger.log.debug("Ec anchorRef: " + anchorRef);

		for (EntityGlyphType entGlyph : dia.getEntityGlyphList()) {
			if (entGlyph.getVisId().equals(anchorRef)) {
				matchedEntGlyph = entGlyph;
			}
		}

		Logger.log.debug("Matched Ec : " + matchedEntGlyph);

		return matchedEntGlyph;
	}

	/**
	 * Convert arrow head.
	 * 
	 * @param mimArrowHead
	 *            the MIM arrow head
	 * @return the GPML arrowhead type
	 */
	private static String convertArrowHead(String mimArrowHead) {

		BidiMap arrowHash = getGpmlToMimVisArrowHeadMap();

		ArrowHeadEnumType.Enum arr = ArrowHeadEnumType.Enum
				.forString(mimArrowHead);

		String gpmlArrowHead;

		// Default to LINE
		if (arrowHash.inverseBidiMap().get(arr) != null) {
			gpmlArrowHead = arrowHash.inverseBidiMap().get(arr).toString();
		} else {
			gpmlArrowHead = "Line";
			Logger.log.info("Pathway contains an arrow not supported in MIM: "
					+ gpmlArrowHead);
		}

		return gpmlArrowHead;
	}

	/**
	 * Map RelationshipXRefs.
	 * 
	 * 
	 * @param pwElem
	 *            the pw elem
	 */
	private void mapRelationshipXRefs(EntityGlyphType glyph,
			PathwayElement pwElem) {
		for (String mimBioRef : glyph.getMimBioRefList()) {
			XmlObject xmlObj = getVisXmlObjectById(visDoc, mimBioRef);

			// Logger.log.debug("RelXRef xmlText: " + xmlObj.xmlText());

			if (xmlObj instanceof RelationshipXRefType) {
				RelationshipXRefType mimRelXRef = (RelationshipXRefType) xmlObj;

				pwElem.setDataSource(DataSource.getByFullName(mimRelXRef
						.getDb()));
				pwElem.setGeneID(mimRelXRef.getId());

				// Logger.log.debug("RelXRef ID: " + mimRelXRef.getId());
				// Logger.log.debug("RelXRef DB: " + mimRelXRef.getDb());

				pwElem.setDynamicProperty("DatabaseRelationship", mimRelXRef
						.getType().toString());
			}
		}
	}

	private List<String> mapPublicationXRefs(InteractionGlyphType glyph,
			PathwayElement pwElem) {

		List<String> mimBioRefs = new ArrayList<String>();

		Logger.log.debug("mimBioRefs: " + glyph.sizeOfMimBioRefArray());

		for (String mimBioRef : glyph.getMimBioRefList()) {

			XmlObject o1 = getVisXmlObjectById(visDoc, mimBioRef);

			QName objQName = new QName(MIM_VIS_NS, "PublicationXRefType");

			SchemaTypeLoader schemaTypeLoader = XmlBeans.getContextTypeLoader();
			SchemaType objType = schemaTypeLoader.findType(objQName);

			XmlOptions opts = new XmlOptions();
			opts.setLoadReplaceDocumentElement(null);

			try {
				/**
				 * Taken from the XMLBeans autogenerated code of a XSD complex
				 * type. For parsing a XML fragment given the SchemaType.
				 */
				XmlObject xmlObj = XmlBeans.getContextTypeLoader().parse(
						o1.xmlText(), objType, opts);

				if (xmlObj instanceof PublicationXRefType) {

					PublicationXRefType mimPubXRef = (PublicationXRefType) xmlObj;

					SchemaType type = XmlBeans
							.typeForClass(PublicationXRefType.class);
					opts.setDocumentType(type);

					PublicationXRefType p = (PublicationXRefType) XmlObject.Factory
							.parse(xmlObj.xmlText(), opts);

					Logger.log.debug("PubXRef Idx: " + p.getId());

					Logger.log.debug("PubXRef xmlText: " + xmlObj.xmlText());

					BiopaxElementManager refMgr = pw.getBiopaxElementManager();

					// BiopaxReferenceManager refMgr = pwElem
					// .getBiopaxReferenceManager();
					PublicationXref gpmlXRef = new PublicationXref();

					Logger.log.debug("PubXRef Id1: " + mimPubXRef.getId());

					for (String author : mimPubXRef.getAuthorList()) {
						gpmlXRef.addAuthor(author);
						Logger.log.debug("Author: " + author);
					}

					// Set publication attributes
					gpmlXRef.setPubmedId(mimPubXRef.getId());
					gpmlXRef.setTitle(mimPubXRef.getTitle());
					gpmlXRef.setSource(mimPubXRef.getJournal());
					gpmlXRef.setYear(mimPubXRef.getYear());

					refMgr.addElement(gpmlXRef);

					mimBioRefs.add(mimBioRef);
				}
			} catch (XmlException e) {
				Logger.log.debug(e.getMessage());
			}
		}

		return mimBioRefs;
	}

	private void mapEntityControlledVocabularies(EntityGlyphType glyph,
			PathwayElement pwElem) {
		for (String mimBioRef : glyph.getMimBioRefList()) {
			XmlObject xmlObj = getVisXmlObjectById(visDoc, mimBioRef);

			if (xmlObj instanceof EntityControlledVocabularyType) {
				EntityControlledVocabularyType mimEcv = (EntityControlledVocabularyType) xmlObj;
				pwElem.setDynamicProperty("EntityControlledVocabulary", mimEcv
						.getType().toString());
			}
		}
	}
}
