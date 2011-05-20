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

import java.io.OutputStream;
import java.io.FileOutputStream;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.awt.Color;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

import gov.nih.nci.lmp.mim.mimVisLevel1.*;

import org.apache.xmlbeans.*;
import org.apache.commons.collections.map.MultiKeyMap;
import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;

import org.pathvisio.biopax.BiopaxElementManager;
import org.pathvisio.biopax.reflect.BiopaxElement;
import org.pathvisio.debug.Logger;
import org.pathvisio.model.AnchorType;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.GroupStyle;
import org.pathvisio.model.LineType;
import org.pathvisio.model.MLine;
import org.pathvisio.model.ObjectType;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.model.GraphLink.GraphRefContainer;
import org.pathvisio.model.PathwayElement.Comment;
import org.pathvisio.model.PathwayElement.MAnchor;
import org.pathvisio.model.PathwayElement.MPoint;
import org.pathvisio.preferences.GlobalPreference;
import org.pathvisio.preferences.PreferenceManager;

/**
 * Methods for the export of MIMML.
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * @author Margot Sunshine 
 * 
 * @version 1.0
 * @since 1.0
 * 
 */
public class ExporterHelper extends CommonHelper {

	/** The root XML node for MimBio. */
	private MimBioType mb;

	/** The MIM-Vis doc. */
	private DiagramDocument visDoc;

	/** The Root XML node for visDoc. */
	private DiagramType dia;

	/** The Pathvisio pathway. */
	private final Pathway pw;

	/**
	 * Instantiates a new exporter helper.
	 * 
	 * @param pw
	 *            the pathway
	 */
	ExporterHelper(Pathway pw) {

		this.pw = pw;
		System.out.println("Saving from GPML to MIMML");

		visDoc = DiagramDocument.Factory.newInstance();
		dia = visDoc.addNewDiagram();

		mb = dia.addNewMimBio();

		mapPathway();
	}

	/**
	 * Gets the visDoc.
	 * 
	 * @return the vis doc
	 */
	public DiagramDocument getVisDoc() {
		return visDoc;
	}

	/**
	 * Sets the visDoc.
	 * 
	 * @param visDoc
	 *            the new vis doc
	 */
	public void setVisDoc(DiagramDocument visDoc) {
		this.visDoc = visDoc;
	}

	/**
	 * Map pathway.
	 */
	private void mapPathway() {
		PathwayElement info = pw.getMappInfo();

		// Map XRef references to mimBioRefs
		String mimBioRelXRefId = mapRelationshipXRef(info);
		if (isNotBlank(mimBioRelXRefId)) {
			Logger.log.info("Pathway: " + mimBioRelXRefId);
			dia.addMimBioRef(mimBioRelXRefId);
		}
		
		for (PathwayElement pwElem : pw.getDataObjects()) {

//			double[] tmp = pw.getMBoardSize();
//
//			dia.setWidth(tmp[0]);
//			dia.setHeight(tmp[1]);
//			
//			Logger.log.info("BoardSize[0]: " + tmp[0]);
//			Logger.log.info("BoardSize[1]: " + tmp[1]);
//			Logger.log.info("BoardWidth: " + pwElem.getMBoardWidth());
//			Logger.log.info("BoardHeight: " + pwElem.getMBoardHeight());

			dia.setWidth(pwElem.getMBoardWidth());
			dia.setHeight(pwElem.getMBoardHeight());

			if (pwElem.getObjectType() == ObjectType.INFOBOX) {

				if (isNotBlank(createSingleComment(info))) {
					mb.setDescription(createSingleComment(info));
				}

				if (isNotBlank(info.getMapInfoDataSource())) {
					mb.setSource(info.getMapInfoDataSource());
				}

				if (isNotBlank(info.getVersion())) {
					mb.setIdentifier(info.getVersion());
				}

				if (isNotBlank(info.getAuthor())) {
					mb.addCreator(info.getAuthor());
				}

				if (isNotBlank(info.getMaintainer())) {
					mb.addContributor(info.getMaintainer());
				}

				if (isNotBlank(info.getMapInfoName())) {
					mb.setTitle(info.getMapInfoName());
				}

				if (isNotBlank(info.getCopyright())) {
					mb.setRights(info.getCopyright());
				}

				if (isNotBlank(info.getLastModified())) {
					try {
						Calendar calDate = new XmlCalendar(info.getLastModified());

						dia.getMimBio().setModified(calDate);
					} catch (IllegalArgumentException e) {
						Logger.log.info("Date Error: " + e.getMessage());
					}
				}
			}

			switch (pwElem.getObjectType()) {
			case DATANODE:
				mapDataNode(pwElem);
				break;
			case LINE:
				mapLine(pwElem);
				break;
			case GROUP:
				mapGroup(pwElem);
				break;
			case BIOPAX:
				mapBiopax(pwElem);
				break;
			}
		}
	}

	/**
	 * Map DataNodes to the MIM schema.
	 * 
	 * TODO: This needs to be changed so it maps to the proper entities types
	 * 
	 * @param pwElem
	 *            the pathway element
	 */
	private void mapDataNode(PathwayElement pwElem) {

		// Now just using the DataNodeType
		// SchemaType mimEntitySchemaType = convertDataNode(pwElem
		// .getDataNodeType());

		Logger.log.info("Current GPML Datanode:"
				+ pwElem.getDataNodeType().toString());

		EntityGlyphType entGlyph = EntityGlyphType.Factory.newInstance();

		// Properties common to all entities
		entGlyph.setVisId(pwElem.getGraphId());
		entGlyph.setCenterX(pwElem.getMCenterX());
		entGlyph.setCenterY(pwElem.getMCenterY());
		entGlyph.setWidth(pwElem.getMWidth());
		entGlyph.setHeight(pwElem.getMHeight());
		entGlyph.setColor(convertColorToHex(pwElem.getColor()));

		// The GraphId of a group is used instead of the GroupId so that 
		// each element only has a single ID. 
		if (isNotBlank(pwElem.getGroupRef())) {			
			// Get the GraphId based on the known GroupId
			entGlyph.setGroupRef(pw.getGroupById(pwElem.getGroupRef()).getGroupId());
		}
		
		entGlyph.setType(EntityGlyphType.Type.Enum.forString(pwElem
				.getDataNodeType()));

		// Set GenericProperties and RelationshipXRefs
		for (String key : pwElem.getDynamicPropertyKeys()) {
			if (!key.equals("DatabaseRelationship")
					&& !key.equals("EntityControlledVocabulary")) {
				EntityGlyphType.GenericProperty genProp = entGlyph
				.addNewGenericProperty();

				genProp.setKey(key);
				genProp.setValue(pwElem.getDynamicProperty(key));
			}
		}

		// Set DataNode.Graphics@ShapeType to GenericProperty
		if(isNotBlank(pwElem.getShapeType().toString())) {
			EntityGlyphType.GenericProperty genProp = entGlyph
				.addNewGenericProperty();
			genProp.setKey("ShapeType");
			genProp.setValue(pwElem.getShapeType().toString());
		}
		
		// Map comments
		for (Comment com : pwElem.getComments()) {
			entGlyph.addComment(com.toString());
		}

		// Map EntityControlledVocabulary and create new mimBioRefs
		String mimECVId = mapEntityControlledVocabulary(pwElem); 
		if(isNotBlank(mimECVId)) {
			entGlyph.addMimBioRef(mimECVId);
		}
		
		// Map RelationshipXref and create new mimBioRefs
		String mimBioRelXRefId = mapRelationshipXRef(pwElem);
		if (isNotBlank(mimBioRelXRefId)) {
			Logger.log.info("Ent: " + mimBioRelXRefId);
			entGlyph.addMimBioRef(mimBioRelXRefId);
		}

		// Convert PathwayElement to a MIM glyph type
		if (pwElem.getDataNodeType().equals("SimplePhysicalEntity")) {
			Logger.log.info("Add SPE");
			mapSimplePhysicalEntity(pwElem, entGlyph);
		}

		if (pwElem.getDataNodeType().equals("EntityFeature")) {
			Logger.log.info("Add EF");
			mapEntityFeature(pwElem, entGlyph);
		}

		if (pwElem.getDataNodeType().equals("Modifier")) {
			Logger.log.info("Add MOD");
			mapModifier(pwElem, entGlyph);
		}

		if (pwElem.getDataNodeType().equals("ConceptualEntity")) {
			mapConceptualEntity(pwElem, entGlyph);
		}

		if (pwElem.getDataNodeType().equals("SourceSink")) {
			mapSourceSink(pwElem, entGlyph);
		}

		if (pwElem.getDataNodeType().equals("RestrictedCopy")) {
			mapRestrictedCopy(pwElem, entGlyph);
		}
	}

	/**
	 * Map simple physical entity. Two step process used for all entity glyphs:
	 * 
	 * 1) Add a new temporary element, which will be replaced with the correct
	 * element.
	 * 
	 * 2) Change the generic entity glyph type into a specific type, then add
	 * any additional features before replacing the glyph that was added using
	 * addNew*
	 * 
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapSimplePhysicalEntity(PathwayElement pwElem,
			EntityGlyphType entGlyph) {

		Logger.log.info("SPE size before: " + dia.sizeOfEntityGlyphArray());

		/*
		 * Add a new temporary element, which will be replaced with the correct
		 * element.
		 */
		dia.addNewEntityGlyph();

		entGlyph.setDisplayName(pwElem.getTextLabel());

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;

		dia.setEntityGlyphArray(nextIdx, entGlyph);

		Logger.log.info("SPE size after: " + dia.sizeOfEntityGlyphArray());

		// DEBUG
		// System.out.println("Size of " +
		// dia.sizeOfSimplePhysicalEntityGlyphArray());
		// System.out.println("GraphId " + pwElem.getGraphId());
	}

	/**
	 * Map entity feature.
	 * 
	 * @see ExporterHelper#mapSimplePhysicalEntity(PathwayElement,
	 *      EntityGlyphType)
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapEntityFeature(PathwayElement pwElem,
			EntityGlyphType entGlyph) {

		// TODO: Fix these lines if still needed for debugging or remove.
		Logger.log.info("EF size before: " + dia.sizeOfEntityGlyphArray());

		dia.addNewEntityGlyph();

		Logger.log.info("EF size after: " + dia.sizeOfEntityGlyphArray());

		entGlyph.setDisplayName(pwElem.getTextLabel());

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;
		dia.setEntityGlyphArray(nextIdx, entGlyph);
		// TODO: Location labels have not been implemented in Pathvisio.
		// entGlyph.setStartLocationLabel(arg0);
		// entGlyph.setEndLocationLabel(arg0);
	}

	/**
	 * Map conceptual entity.
	 * 
	 * @see ExporterHelper#mapSimplePhysicalEntity(PathwayElement,
	 *      EntityGlyphType)
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapConceptualEntity(PathwayElement pwElem,
			EntityGlyphType entGlyph) {

		dia.addNewEntityGlyph();

		entGlyph.setDisplayName(pwElem.getTextLabel());

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;
		dia.setEntityGlyphArray(nextIdx, entGlyph);
	}

	/**
	 * Map modifier.
	 * 
	 * @see ExporterHelper#mapSimplePhysicalEntity(PathwayElement,
	 *      EntityGlyphType)
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapModifier(PathwayElement pwElem, EntityGlyphType entGlyph) {

		dia.addNewEntityGlyph();

		entGlyph.setDisplayName(pwElem.getTextLabel());

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;
		dia.setEntityGlyphArray(nextIdx, entGlyph);

		// TODO: Location labels have not been implemented in Pathvisio.
		// entGlyph.setLocationLabel(arg0);
	}

	/**
	 * Map source sink.
	 * 
	 * @see ExporterHelper#mapSimplePhysicalEntity(PathwayElement,
	 *      EntityGlyphType)
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapSourceSink(PathwayElement pwElem, EntityGlyphType entGlyph) {

		dia.addNewEntityGlyph();

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;
		dia.setEntityGlyphArray(nextIdx, entGlyph);
	}

	/**
	 * Map restricted copy.
	 * 
	 * @see ExporterHelper#mapSimplePhysicalEntity(PathwayElement,
	 *      EntityGlyphType)
	 * @param pwElem
	 *            the pathway element
	 * @param entGlyph
	 *            the entity glyph
	 */
	private void mapRestrictedCopy(PathwayElement pwElem,
			EntityGlyphType entGlyph) {

		dia.addNewEntityGlyph();

		int nextIdx = dia.sizeOfEntityGlyphArray() - 1;
		dia.setEntityGlyphArray(nextIdx, entGlyph);
	}

	/**
	 * Map line.
	 * 
	 * TODO: Add Dataset mappings
	 * 
	 * @param pwElem
	 *            the pathway element
	 */
	private void mapLine(PathwayElement pwElem) {

		InteractionGlyphType interGlyph = dia.addNewInteractionGlyph();

		if (isNotBlank(pwElem.getGraphId())) {
			interGlyph.setVisId(pwElem.getGraphId());
		} else {

			// This was taken from GPMLFormatAbstract in Pathvisio
			// It was commented that this may change
			StringBuilder builder = new StringBuilder();
			builder.append(pwElem.getMStartX());
			builder.append(pwElem.getMStartY());
			builder.append(pwElem.getMEndX());
			builder.append(pwElem.getMEndY());
			builder.append(pwElem.getStartLineType());
			builder.append(pwElem.getEndLineType());

			String newId;
			int i = 1;
			do {
				newId = "id"
						+ Integer.toHexString((builder.toString() + ("_" + i))
								.hashCode());
				i++;
			} while (pw.getGraphIds().contains(newId));

			interGlyph.setVisId(newId);
		}

		interGlyph.setColor(convertColorToHex(pwElem.getColor()));
		
		// The GraphId of a group is used instead of the GroupId so that 
		// each element only has a single ID. 
		if (isNotBlank(pwElem.getGroupRef())) {			
			// Get the GraphId based on the known GroupId
			interGlyph.setGroupRef(pw.getGroupById(pwElem.getGroupRef()).getGroupId());
		}

		// Map comments
		for (Comment com : pwElem.getComments()) {
			interGlyph.addComment(com.toString());
		}

		// Map BioPAX publication cross-references
		ArrayList<String> mimBioRefIds = mapBiopaxRefs(pwElem);

		for (String id : mimBioRefIds) {
			if (isNotBlank(id)) {
				Logger.log.info("mimBioRef: " + id);
				interGlyph.addMimBioRef(id);
			}
		}

		// Attempt to determine coordinates of interaction labels for references
//		int xRefSize = mimBioRefIds.size();
//		int xRefLength = 0;
//
//		xRefLength = 9 * xRefSize;

		// if (xRefSize < 10) {
		// xRefLength = 3 * xRefSize;
		// } else {
		// xRefLength = 3 * 9 + (xRefSize - 9) * 4;
		// }

		// InteractionGlyphType.GenericProperty annoX =
		// interGlyph.addNewGenericProperty();
		// InteractionGlyphType.GenericProperty annoY =
		// interGlyph.addNewGenericProperty();
		// InteractionGlyphTqype.GenericProperty annoWidth =
		// interGlyph.addNewGenericProperty();
		// InteractionGlyphType.GenericProperty annoHeight =
		// interGlyph.addNewGenericProperty();
		//
		// annoX.setKey("annotationX");
		// annoY.setKey("annotationY");
		// annoWidth.setKey("annotationWidth");
		// annoHeight.setKey("annotationHeight");

		// Location where an interaction label for references is placed 
//		Point2D p = ((MLine) pwElem).getConnectorShape()
//				.fromLineCoordinate(0.7);
		
		// Attempt to determine coordinates of interaction labels for references
//		Logger.log.info("ID: " + pwElem.getGraphId() + " XRefLength: "
//				+ xRefLength + " X: " + p.getX() + " Y: " + p.getY());
//	
//		int padding = 3;
//
//		double xVal = p.getX() - xRefLength / 2 - padding;
//		double yVal = p.getY() - padding;
//		double widthVal = xRefLength + 2 * padding;
//		double heightVal = 15 + 2 * padding;

		// annoX.setValue(Double.toString(xVal));
		// annoY.setValue(Double.toString(yVal));
		// annoWidth.setValue(Double.toString(widthVal));
		// annoHeight.setValue(Double.toString(heightVal));

		List<MPoint> mPoints = pwElem.getMPoints();

		/*
		 * Go through the points in the reverse order so that they are added to
		 * files in the original order
		 */
		for (int i = (mPoints.size() - 1); i >= 0; i--) {
			MPoint mPoint = mPoints.get(i);

			InteractionGlyphType.Point pt = InteractionGlyphType.Point.Factory
					.newInstance();

			pt.setX(mPoint.getX());
			pt.setY(mPoint.getY());
			
			ArrowHeadEnumType.Enum mimArrowHead = null;

			// ArrowHeads can only exist on the start and end Points
			if (i == 0) {
			
				String gpmlStartArrowHead = pwElem.getStartLineType().getName();
				// System.out.println("Start: " + gpmlStartArrowHead);

				mimArrowHead = convertArrowHead(gpmlStartArrowHead);
				pt.setArrowHead(mimArrowHead);
			} else if (i == (mPoints.size() - 1)) {
				
				String gpmlEndArrowHead = pwElem.getEndLineType().getName();
				// System.out.println("End: " + gpmlEndArrowHead);

				mimArrowHead = convertArrowHead(gpmlEndArrowHead);
				pt.setArrowHead(mimArrowHead);
			} 
			
			// Don't add graphRefs from groups use the GroupId.
			// This is done to avoid using two IDs for groups. 
			if(isNotBlank(mPoint.getGraphRef())) {

				// If the line is connected to a group, use its groupId 
				PathwayElement tmp = pw.getElementById(mPoint.getGraphRef()); 

				Logger.log.debug("MPoint GraphRef: " + mPoint.getGraphRef());
				
				if(tmp != null && tmp.getObjectType().equals(ObjectType.GROUP)) {
					Logger.log.debug("ObjectType: " + tmp.getObjectType().toString());
					pt.setVisRef(tmp.getGroupId());
				} else {
					pt.setVisRef(mPoint.getGraphRef());
				}
			}

			// Only set RelX and RelY for the first and last points
			if (i == 0 || i == (mPoints.size() - 1)) {
				Logger.log.debug("Line ID: " + pwElem.getGraphId());
				Logger.log.debug("RelX: " + mPoint.getRelX());
				Logger.log.debug("RelY: " + mPoint.getRelY());

				if (isNotBlank(Double.toString(mPoint.getRelX()))) {
					pt.setRelX(mPoint.getRelX());
				}

				if (isNotBlank(Double.toString(mPoint.getRelY()))) {
					pt.setRelY(mPoint.getRelY());
				}
			}

			// Changes to Point must happen before it is added to an Interaction
			// Add points to the beginning of the array
			interGlyph.insertNewPoint(0);
			interGlyph.setPointArray(0, pt);
		}

		for (MAnchor mAnchor : pwElem.getMAnchors()) {
			// for (int i = (pwElem.getMAnchors().size() - 1); i >= 0; i--) {
			// MAnchor mAnchor = pwElem.getMAnchors().get(i);

			/*
			 * TODO: GPML has no current mechanism for setting the annotation
			 * label
			 */
			// if (X) {
			// anc.setAnnotationLabel("NOT_REQUIRED");
			// }

			String gpmlAnchor = mAnchor.getShape().getName();

			Logger.log.debug("gpmlAnchorShape: " + mAnchor.getGraphId());
			Logger.log.debug("gpmlAnchorShape: " + gpmlAnchor);

			// This is considered an explicit complex in MIM
			if (gpmlAnchor.equals("Circle")) {
				EntityGlyphType entGlyph = dia.addNewEntityGlyph();

				if (isNotBlank(mAnchor.getGraphId())) {
					entGlyph.setVisId(mAnchor.getGraphId());
					interGlyph.addAnchorRef(mAnchor.getGraphId());
				} else {
					entGlyph.setVisId(pw.getUniqueGraphId());
					interGlyph.addAnchorRef(entGlyph.getVisId());
				}

				// Properties common to all entities
				entGlyph.setPosition(mAnchor.getPosition());
				entGlyph.setColor(convertColorToHex(pwElem.getColor()));
				if(isNotBlank(pwElem.getGroupRef())) {
					entGlyph.setGroupRef(pwElem.getGroupRef());
				}
				entGlyph.setType(EntityGlyphType.Type.EXPLICIT_COMPLEX);
			} else {

				AnchorGlyphType anc = dia.addNewAnchor();

				if (isNotBlank(mAnchor.getGraphId())) {
					anc.setVisId(mAnchor.getGraphId());
					interGlyph.addAnchorRef(mAnchor.getGraphId());
				} else {
					anc.setVisId(pw.getUniqueGraphId());
					interGlyph.addAnchorRef(anc.getVisId());
				}

				anc.setPosition(mAnchor.getPosition());

				AnchorGlyphType.Type.Enum mimAnchor = convertAnchor(gpmlAnchor);
				anc.setType(mimAnchor);

				// This will be needed in the conversion of MIM-Vis to MIM-Bio
				// // An outcome anchor indicates an ExplicitComplexEntity
				// if (mimAnchor == AnchorGlyphType.AnchorType.) {
				//
				// // References to the start and end nodes to which a line is
				// // connected
				// String mimAnchorStartRef = mAnchor.getParent().getMStart()
				// .getGraphRef();
				// String mimAnchorEndRef = mAnchor.getParent().getMEnd()
				// .getGraphRef();
				//
				//
				// if (mimAnchorStartRef == null || mimAnchorEndRef == null) {
				// Logger.log
				// .info("This outcome node does not have two components");
				// }
				// }
			}
		}

		// Map ConnectorType
		InteractionGlyphType.GenericProperty connectorType = interGlyph
				.addNewGenericProperty();
		connectorType.setKey("ConnectorType");
		connectorType.setValue(pwElem.getConnectorType().getName());

		Logger.log.debug(Integer.toString(pwElem.getDynamicPropertyKeys()
				.size()));

		// Map GenericProperties
		for (String key : pwElem.getDynamicPropertyKeys()) {
			InteractionGlyphType.GenericProperty genProp = interGlyph
					.addNewGenericProperty();

			genProp.setKey(key);
			genProp.setValue(pwElem.getDynamicProperty(key));
		}

		Logger.log.debug("Inter creation: " + interGlyph.xmlText());
	}

	/**
	 * Map group.
	 * 
	 * @param pwElem
	 *            the pathway element
	 */
	private void mapGroup(PathwayElement pwElem) {

		// Logger.log.debug("Group style: " + pwElem.getGroupStyle());

		// Map RelationshipXref
		String mimBioRelXRefId = mapRelationshipXRef(pwElem);

		// TODO: Add the ImplicitComplex group style
		if (pwElem.getGroupStyle().toString().equals("ImplicitComplex")) {

			EntityGlyphType ic = dia.addNewEntityGlyph();
			ic.setVisId(pwElem.getGroupId());
			
			ic.setType(EntityGlyphType.Type.IMPLICIT_COMPLEX);

			// TODO: Add a display name to the implicit complex. This is
			// currently not
			// possible in Pathvisio.
			// grp.setGroupType(GroupEnumType.IMPLICIT_COMPLEX);

			// Add RelationshipXref to this element
			if (isNotBlank(mimBioRelXRefId)) {
				Logger.log.info("IC: " + mimBioRelXRefId);
				ic.addMimBioRef(mimBioRelXRefId);
			}
		} else {
			GroupType grp = dia.addNewGroup();
			grp.setVisId(pwElem.getGroupId());

			if (pwElem.getGroupStyle().toString().equals("EntityWithFeatures")) {
				grp.setType(GroupEnumType.ENTITY_WITH_FEATURES);
			}

			if (pwElem.getGroupStyle().toString().equals("Group")) {
				grp.setType(GroupEnumType.GENERIC);
			}

			// Add RelationshipXref to this element
			if (isNotBlank(mimBioRelXRefId)) {
				Logger.log.info("Grp: " + mimBioRelXRefId);
				grp.addMimBioRef(mimBioRelXRefId);
			}
		}
	}

	/**
	 * Map relationship Xref.
	 * 
	 * @param pwElem
	 *            the pw elem
	 * @return the string
	 */
	private String mapRelationshipXRef(PathwayElement pwElem) {
		if (pwElem.getDataSource() != null && pwElem.getGeneID() != null) {
			String visId = getUniqueVisId();

			// Create correct type of XRef element
			RelationshipXRefType relXRef = mb.addNewRelationshipXRef();
			relXRef.setVisId(visId);

			if(isNotBlank(pwElem.getDynamicProperty("DatabaseRelationship"))) {

				RelationshipXRefType.Type.Enum relXRefType = RelationshipXRefType.Type.Enum.forString(pwElem.getDynamicProperty("DatabaseRelationship"));
				
				if(!relXRefType.equals(null)) {
					relXRef.setType(relXRefType);
				} else {
					Logger.log.error("Unknown database relationship type.");
				}
			} else {
				relXRef.setType(RelationshipXRefType.Type.IS);				
			}
			
			relXRef.setDb(pwElem.getDataSource().getFullName());
			relXRef.setId(pwElem.getGeneID());

			return visId;
		} else {
			return null;
		}
	}

	/**
	 * Map entity controlled vocabulary.
	 * 
	 * @param pwElem
	 *            the pw elem
	 * @return the string
	 */
	private String mapEntityControlledVocabulary(PathwayElement pwElem) {

		if (isNotBlank(pwElem.getDynamicProperty("EntityControlledVocabulary"))) {
			String visId = getUniqueVisId();

			EntityControlledVocabularyType ecv = mb
					.addNewEntityControlledVocabulary();
			ecv.setVisId(visId);

			EntityControlledVocabularyType.Type.Enum ecvType = EntityControlledVocabularyType.Type.Enum
			.forString(pwElem
					.getDynamicProperty("EntityControlledVocabulary"));
			
			if(!ecvType.equals(null)) {
				ecv.setType(ecvType);
				
				return visId; 
			} else {
				Logger.log.error("Unknown entity controlled vocabulary.");
				
				return null;
			}
		} else {
			return null;
		}
	}
	
	/**
	 * Map Biopax elements.
	 * 
	 * @param pwElem
	 *            the pathway element
	 */
	private void mapBiopax(PathwayElement pwElem) {
		BiopaxElementManager refMgr = pw.getBiopaxElementManager();
		
		Collection<BiopaxElement> bpElemColl = refMgr.getElements();

		for (org.pathvisio.biopax.reflect.BiopaxElement bpElem : bpElemColl) {
			org.pathvisio.biopax.reflect.PublicationXref gpmlPubXRef = (org.pathvisio.biopax.reflect.PublicationXref) bpElem; 
			
			PublicationXRefType mimPubXRef = mb.addNewPublicationXRef();

			mimPubXRef.setVisId(gpmlPubXRef.getId());

			for (String author : gpmlPubXRef.getAuthors()) {
				mimPubXRef.addAuthor(author);
			}

			mimPubXRef.setTitle(gpmlPubXRef.getTitle());

			mimPubXRef.setYear(gpmlPubXRef.getYear());
			mimPubXRef.setId(gpmlPubXRef.getPubmedId());

			// TODO: Remove assumption that publication DB is always "PubMed"
			mimPubXRef.setDb("PubMed");

			mimPubXRef.setJournal(gpmlPubXRef.getSource());
		}
	}

	/**
	 * Map Biopax references.
	 * 
	 * @param pwElem
	 *            the pathway element
	 * @return the list of mimBioRef IDs that should be added for the element
	 *         being converted
	 */
	private ArrayList<String> mapBiopaxRefs(PathwayElement pwElem) {
		ArrayList<String> mimBioRefIds = new ArrayList<String>();
		
		for (org.pathvisio.biopax.reflect.PublicationXref gpmlPubXRef : pwElem
				.getBiopaxReferenceManager().getPublicationXRefs()) {

			// Add ID to the list being returned
			mimBioRefIds.add(gpmlPubXRef.getId());
		}

		return mimBioRefIds;
	}

	/**
	 * Convert arrow head.
	 * 
	 * @param gpmlArrowHead
	 *            the GPML arrow head
	 * @return the MIM arrow head type
	 */
	private static ArrowHeadEnumType.Enum convertArrowHead(String gpmlArrowHead) {

		ArrowHeadEnumType.Enum mimArrowHead = null;

		BidiMap arrowHash = getGpmlToMimVisArrowHeadMap();

		// Default to ArrowHeadEnumType.LINE
		if (arrowHash.get(gpmlArrowHead) != null) {
			mimArrowHead = (ArrowHeadEnumType.Enum) arrowHash
					.get(gpmlArrowHead);
		} else {
			mimArrowHead = ArrowHeadEnumType.LINE;
			Logger.log.info("Pathway contains an arrow not supported in MIM: "
					+ gpmlArrowHead);
		}

		return mimArrowHead;
	}

	/**
	 * Convert anchor.
	 * 
	 * @param gpmlAnchor
	 *            the GPML anchor
	 * @return the interaction glyph type. anchor. anchor type. enum
	 */
	private static AnchorGlyphType.Type.Enum convertAnchor(String gpmlAnchor) {

		HashMap<String, AnchorGlyphType.Type.Enum> anchorHash = new HashMap<String, AnchorGlyphType.Type.Enum>();

		// TODO: Naming issue
		anchorHash.put("Intermolecular", AnchorGlyphType.Type.IN_TRANS);

		// TODO: Annotation labels in Pathvisio
		// anchorHash.put("Annotation",
		// AnchorGlyphType.AnchorType.ANNOTATION_ANCHOR);

		anchorHash.put("None", AnchorGlyphType.Type.INVISIBLE);

		AnchorGlyphType.Type.Enum mimAnchor = null;

		if (anchorHash.get(gpmlAnchor) != null) {
			mimAnchor = anchorHash.get(gpmlAnchor);
		} else {
			mimAnchor = AnchorGlyphType.Type.INVISIBLE;
			Logger.log.info("Pathway contains an anchor not supported in MIM: "
					+ gpmlAnchor);
		}

		return mimAnchor;
	}

	/**
	 * Convert data node.
	 * 
	 * @param gpmlGroupType
	 *            the gpml data node type
	 * @return the schema type
	 */
	private static GroupEnumType.Enum convertGroup(String gpmlGroupType) {

		HashMap<String, GroupEnumType.Enum> groupHash = new HashMap<String, GroupEnumType.Enum>();

		groupHash.put("EntityWithFeatures", GroupEnumType.ENTITY_WITH_FEATURES);
		groupHash.put("Group", GroupEnumType.GENERIC);

		GroupEnumType.Enum mimGroupType = null;

		if (groupHash.get(gpmlGroupType) != null) {
			mimGroupType = groupHash.get(gpmlGroupType);
		} else {
			mimGroupType = GroupEnumType.GENERIC;
			Logger.log
					.info("Pathway contains an group type not supported in MIM: "
							+ gpmlGroupType);
		}

		return mimGroupType;
	}

	/**
	 * Export file.
	 * 
	 * @param file
	 *            the file
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	public void export(File file) throws IOException {
		// During validation, errors are added to the ArrayList for
		// retrieval and printing by the printErrors method.
		boolean isVisValid = validateXml(visDoc);

		Logger.log.debug("Is Vis Valid: " + isVisValid);

		OutputStream output = new FileOutputStream(file);

		// Print the errors if the XML is invalid.
		if (isVisValid) {
			System.out.println("Valid. The document follows:");
			try {
				visDoc.save(output, getXmlOptions());
				// visDoc.save(bufferedWriter, this.getXmlOptions());
				// visDoc.save(System.out, this.getXmlOptions());
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				output.close();
			}
		} else {
			System.out.println("Invalid. The document follows:");
			try {
				visDoc.save(output, getXmlOptions());
				// visDoc.save(bufferedWriter, this.getXmlOptions());
				// visDoc.save(System.out, this.getXmlOptions());
			} catch (IOException ioe) {
				ioe.printStackTrace();
			} finally {
				output.close();
			}
		}
	}

	/**
	 * Creates the single comment.
	 * 
	 * @param pwElem
	 *            the pathway element
	 * @return the string
	 */
	private static String createSingleComment(PathwayElement pwElem) {
		String singleComment = "";

		for (Comment com : pwElem.getComments()) {
			singleComment += com.toString();
		}

		return singleComment;
	}

	/**
	 * Gets the unique vis id.
	 * 
	 * @return the unique vis id
	 */
	public String getUniqueVisId() {
		return pw.getUniqueGraphId();
	}
}
