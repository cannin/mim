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

import gov.nih.nci.lmp.mim.mimVisLevel1.*;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

import org.pathvisio.debug.Logger;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.view.MIMShapes;

import org.jdom.Document;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import java.io.Reader;
import java.io.StringReader;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test for the export of interactions to MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class InteractionExportTest {

	/** The namespace for MIM-Vis. */
	public static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR,
			"interactionTest.gpml");

	/** The Pathvisio pathway. */
	private Pathway pw;
	
	/** The MIM-Vis doc. */
	private DiagramDocument visDoc;

	/** The MIM-Vis diagram. */
	private DiagramType dia;

	/**
	 * Junit set up.
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 */
	@Before
	public void setUp() throws ConverterException {
		MIMShapes.registerShapes();

		pw = new Pathway();

		/*
		 * Validate is set to false because it doesn't seem to be validating
		 * against GPML2010a correctly.
		 */
		pw.readFromXml(TEST_FILE, false);

		PathwayElement pwElem = pw.getElementById("idbcc10920");

		//TODO: Remove this once decision reached about literature references
		if(pwElem.getBiopax() != null) {
			org.jdom.Document bp = pwElem.getBiopax();
			String s = new XMLOutputter().outputString(bp);
			Logger.log.debug("BP doc: " + s);
		} else {
			Logger.log.debug("No");			
		}
		
		String s = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0).getYear();
		Logger.log.debug("Yr: " + s);
		
		
		ExporterHelper helper = new ExporterHelper(pw);

		visDoc = helper.getVisDoc();
		dia = visDoc.getDiagram();
		
		//InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		InteractionGlyphType o = dia.getInteractionGlyphArray(0); 
		
		Logger.log.debug("idbcc10920 xmlText: " + o.xmlText());
	}
	
	@Test 
	public void testDiagramValidates() {					
		assertTrue(CommonHelper.validateXml(visDoc));
	}

	/**
	 * Test diagram interaction glyph comment export.
	 */
	@Test
	public void testDiagramInteractionGlyphCommentExport() {
		//InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		InteractionGlyphType o = dia.getInteractionGlyphArray(0);
		
		List<String> list = new ArrayList<String>();
		list.add("LineComment");

		assertEquals(list, o.getCommentList());
	}

	/**
	 * TODO: Fix this so it tests all of an interactions generic properties at
	 * once.
	 * 
	 * Test diagram interaction glyph generic property key export.
	 */
	@Test
	public void testDiagramInteractionGlyphGenericPropertyKeyExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("InteractionStart", o.getGenericPropertyArray(2)
				.getKey());
	}
	
	@Test 
	public void testDiagramInteractionNotGenericPropertyDatabaseRelationshipExport() {
		List<String> list = new ArrayList<String>(); 
		
		for(EntityGlyphType.GenericProperty o : dia.getEntityGlyphArray(0).getGenericPropertyList()) {
			list.add(o.getKey()); 
		}
	
		assertFalse(list.contains("DatabaseRelationship"));		
	}


	/**
	 * Test diagram interaction glyph generic property value export.
	 */
	@Test
	public void testDiagramInteractionGlyphGenericPropertyValueExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("visId", o.getGenericPropertyArray(2).getValue());
	}

	/**
	 * Test diagram interaction glyph vis id export.
	 */
	@Test
	public void testDiagramInteractionGlyphVisIdExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("idbcc10920", o.getVisId());
	}

	/**
	 * Test diagram interaction glyph color export.
	 */
	@Test
	public void testDiagramInteractionGlyphColorExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("000000",o.getColor());
	}

	/**
	 * Test diagram interaction glyph group ref export.
	 */
	@Test
	public void testDiagramInteractionGlyphGroupRefExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");
		
		assertEquals("a0fa5", o.getGroupRef());
	}

	/**
	 * Test diagram interaction glyph point x export.
	 */
	@Test
	public void testDiagramInteractionGlyphPointXExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals(295.0, o.getPointArray(0).getX(), 0);
	}

	/**
	 * Test diagram interaction glyph point y export.
	 */
	@Test
	public void testDiagramInteractionGlyphPointYExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals(81.0, o.getPointArray(0).getY(), 0);
	}

	/**
	 * Test diagram interaction glyph rel x export.
	 */
	@Test
	public void testDiagramInteractionGlyphRelXExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals(-1.0, o.getPointArray(0).getRelX(), 0);
	}

	/**
	 * Test diagram interaction glyph rel y export.
	 */
	@Test
	public void testDiagramInteractionGlyphRelYExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals(0.0, o.getPointArray(0).getRelY(), 0);
	}

	/**
	 * Test diagram interaction glyph point arrow head export.
	 */
	@Ignore("During this test arrowheads seem to always be set to 'Line'")
	@Test
	public void testDiagramInteractionGlyphPointArrowHeadExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");
		
		assertEquals(ArrowHeadEnumType.NON_COVALENT_REVERSIBLE_BINDING, o.getPointArray(0).getArrowHead());
	}

	/**
	 * Test diagram interaction glyph point vis ref export.
	 */
	@Test
	public void testDiagramInteractionGlyphPointVisRefExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("ffd4a", o.getPointArray(0).getVisRef());
	}

	// TODO: Make the anchor checks more direct.
	/**
	 * Test diagram interaction anchor ref export.
	 */
	@Test
	public void testDiagramInteractionAnchorRefExport() {
		InteractionGlyphType o = (InteractionGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "idbcc10920");

		assertEquals("ece74", o.getAnchorRefArray(1));
	}

	/**
	 * Test diagram interaction anchor vis id export.
	 */
	@Test
	public void testDiagramInteractionAnchorVisIdExport() {
		assertEquals("ece74", dia.getAnchorArray(1).getVisId());
	}

	/**
	 * Test diagram interaction anchor position export.
	 */
	@Test
	public void testDiagramInteractionAnchorPositionExport() {
		assertEquals(0.5225752508361204, dia.getAnchorArray(1).getPosition(), 0);
	}

	/**
	 * Test diagram interaction anchor type export.
	 */
	@Ignore("During this test anchors seem to be always set to 'None'")
	@Test
	public void testDiagramInteractionAnchorTypeExport() {		
		assertEquals("InTrans", dia.getAnchorArray(1).getType());
	}

	/**
	 * Test diagram interaction anchor annotation label export.
	 * POSTPONED
	 */
//	@Ignore("Not a current feature in Pathvisio")
//	@Test
//	public void testDiagramInteractionAnchorAnnotationLabelExport() {
//		assertEquals("???", dia.getAnchorArray(1).getAnnotationLabel());
//	}

	/**
	 * Test diagram interaction anchor export.
	 */
	@Test
	public void testDiagramInteractionAnchorRefSizeExport() {
		assertEquals(3, dia.getInteractionGlyphArray(0).sizeOfAnchorRefArray());
	}

	/**
	 * Test diagram anchor size export.
	 */
	@Test
	public void testDiagramAnchorSizeExport() {
		assertEquals(2, dia.sizeOfAnchorArray());
	}

	/**
	 * Test diagram interaction explicit complex export.
	 */
	@Test
	public void testDiagramInteractionExplicitComplexExport() {
		boolean isExplicitComplex = false;

		for (EntityGlyphType entGlyph : dia.getEntityGlyphList()) {
			if (entGlyph.getType().equals(EntityGlyphType.Type.EXPLICIT_COMPLEX)) {
				isExplicitComplex = true;
			}
		}

		assertTrue(isExplicitComplex);
	}

	@Test
	public void testDiagramInteractionMimBioRefExport() {		
		Logger.log.debug("Size mimBioRefs: " + Integer.toString(dia.getInteractionGlyphArray(0).sizeOfMimBioRefArray()));
		
		PathwayElement biopax = pw.getBiopax();
		Document biopaxDoc = biopax.getBiopax(); 
		
		XMLOutputter out = new XMLOutputter();
		Logger.log.debug("BP: " + out.outputString(biopaxDoc));
		
		SAXBuilder builder = new SAXBuilder(); 
		
		String str = "<rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\" xmlns:rdfs=\"http://www.w3.org/2000/01/rdf-schema#\" xmlns:owl=\"http://www.w3.org/2002/07/owl#\" xmlns:bp=\"http://www.biopax.org/release/biopax-level3.owl#\" xml:base=\"http://genmapp.org/GPML/2010a#\"><bp:PublicationXref rdf:id=\"ef7\"><bp:ID rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">123</bp:ID><bp:DB rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">PubMed</bp:DB><bp:TITLE rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">NOT THIS</bp:TITLE><bp:SOURCE rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Br J Surg</bp:SOURCE><bp:YEAR rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">1975</bp:YEAR><bp:AUTHORS rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Keighley MR</bp:AUTHORS><bp:AUTHORS rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Asquith P</bp:AUTHORS><bp:AUTHORS rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Edwards JA</bp:AUTHORS><bp:AUTHORS rdf:datatype=\"http://www.w3.org/2001/XMLSchema#string\">Alexander-Williams J</bp:AUTHORS></bp:PublicationXref></rdf:RDF>";		
		Reader in = new StringReader(str); 
		
		try { 
			Document doc = builder.build(in);			
			biopax.setBiopax(doc);
		} catch (Exception e) {
			Logger.log.debug(e.getMessage());
		}
		
		biopaxDoc = biopax.getBiopax(); 
		Logger.log.debug("BP2: " + out.outputString(biopaxDoc));
		
		assertEquals("ef7", dia.getInteractionGlyphArray(0).getMimBioRefArray(0));
	}

	@Test
	public void testDiagramMimBioPublicationXRefVisIdExport() {
		assertEquals("ef7", dia.getMimBio().getPublicationXRefArray(0).getVisId()); 
	}

	@Test
	public void testDiagramMimBioPublicationXRefDbExport() {
		assertEquals("PubMed", dia.getMimBio().getPublicationXRefArray(0).getDb()); 
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramMimBioPublicationXRefDbVersionExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getDbVersion()); 
	}

	@Test
	public void testDiagramMimBioPublicationXRefIdExport() {
		assertEquals("123", dia.getMimBio().getPublicationXRefArray(0).getId()); 
	}	
	
	@Ignore("Not a current feature in Pathvisio") 
	@Test
	public void testDiagramMimBioPublicationXRefIdVersionExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getIdVersion()); 
	}	

	@Test
	public void testDiagramMimBioPublicationXRefTitleExport() {
		assertEquals("The importance of an innervated and intact antrum and pylorus in preventing postoperative duodenogastric reflux and gastritis.", dia.getMimBio().getPublicationXRefArray(0).getTitle()); 
	}	
	
	@Test
	public void testDiagramMimBioPublicationXRefAuthorExport() {
		assertEquals("Keighley MR", dia.getMimBio().getPublicationXRefArray(0).getAuthorArray(0)); 
	}	

	@Test
	public void testDiagramMimBioPublicationXRefYearExport() {
		assertEquals("1975", dia.getMimBio().getPublicationXRefArray(0).getYear()); 
	}	
	
	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramMimBioPublicationXRefUrlExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getUrl()); 
	}	

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramMimBioPublicationXRefPagesExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getPages()); 
	}	

	@Test
	public void testDiagramMimBioPublicationXRefJournalExport() {
		assertEquals("Br J Surg", dia.getMimBio().getPublicationXRefArray(0).getJournal()); 
	}	

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramMimBioPublicationXRefVolumeExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getVolume()); 
	}	

	@Ignore("In Pathvisio, source denotes journal, which is test elsewhere")  
	@Test
	public void testDiagramMimBioPublicationXRefSourceExport() {
		assertEquals("???", dia.getMimBio().getPublicationXRefArray(0).getSource()); 
	}	
}
