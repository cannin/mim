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
import org.pathvisio.view.MIMShapes;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Test for the export of entities to MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class EntityExportTest {

	/** The namespace for MIM-Vis. */
	private static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("src/test/resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR,
			"entityTest.gpml");

	/** The vis doc. */
	private DiagramDocument visDoc;
	
	/** The vis diagram. */
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

		Pathway pw = new Pathway();

		/*
		 * Validate is set to false because it doesn't seem to be validating
		 * against GPML2010a correctly.
		 */
		pw.readFromXml(TEST_FILE, false);

		ExporterHelper helper = new ExporterHelper(pw);

		visDoc = helper.getVisDoc();
		dia = visDoc.getDiagram();
	}

	@Test 
	public void testDiagramValidates() {					
		assertTrue(CommonHelper.validateXml(visDoc));
	}
	
	@Test
	public void testDiagramEntityVisIdExport() {
		assertEquals("a1d49", dia.getEntityGlyphArray(0).getVisId());
	}
	
	@Test
	public void testDiagramEntityCenterXExport() {
		assertEquals(86.0, dia.getEntityGlyphArray(0).getCenterX(), 0);
	}

	@Test
	public void testDiagramEntityCenterYExport() {
		assertEquals(66.0, dia.getEntityGlyphArray(0).getCenterY(), 0);
	}

	@Test
	public void testDiagramEntityWidthExport() {
		assertEquals(60.0, dia.getEntityGlyphArray(0).getWidth(), 0);
	}

	@Test
	public void testDiagramEntityHeightExport() {
		assertEquals(20.0, dia.getEntityGlyphArray(0).getHeight(), 0);
	}

	@Test
	public void testDiagramEntityTypeExport() {
		assertEquals("SimplePhysicalEntity", dia.getEntityGlyphArray(0).getType().toString());
	}

	@Test
	public void testDiagramEntityDisplayNameExport() {
		assertEquals("SPE", dia.getEntityGlyphArray(0).getDisplayName());
	}
	
	@Ignore("Don't know apriori the BioId")  
	@Test
	public void testDiagramMimBioRelationshipXRefVisIdExport() {
		assertEquals("???", dia.getMimBio().getRelationshipXRefArray(0).getVisId()); 
	}	

	@Test
	public void testDiagramMimBioRelationshipXRefDbExport() {
		assertEquals("HUGO", dia.getMimBio().getRelationshipXRefArray(0).getDb()); 
	}	

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramMimBioRelationshipXRefDbVersionExport() {
		assertEquals("???", dia.getMimBio().getRelationshipXRefArray(0).getDbVersion()); 
	}	

	@Test
	public void testDiagramMimBioRelationshipXRefIdExport() {
		assertEquals("TP53", dia.getMimBio().getRelationshipXRefArray(0).getId()); 
	}	

	@Test
	public void testDiagramMimBioRelationshipXRefTypeExport() {
		assertEquals("other", dia.getMimBio().getRelationshipXRefArray(0).getType().toString()); 
	}	
	
	@Test
	public void testDiagramMimBioEntityControlledVocabularyExport() {
		assertEquals("Protein", dia.getMimBio().getEntityControlledVocabularyArray(0).getType().toString()); 
	}	
	
	@Test 
	public void testDiagramEntityGenericPropertyNotDatabaseRelationshipExport() {
		List<String> list = new ArrayList<String>(); 
		
		for(EntityGlyphType.GenericProperty o : dia.getEntityGlyphArray(0).getGenericPropertyList()) {
			list.add(o.getKey()); 
		}
	
		assertFalse(list.contains("DatabaseRelationship"));				
	}

	@Test 
	public void testDiagramEntityGenericPropertyNotEntityControlledVocabularyExport() {
		List<String> list = new ArrayList<String>(); 
		
		for(EntityGlyphType.GenericProperty o : dia.getEntityGlyphArray(0).getGenericPropertyList()) {
			list.add(o.getKey()); 
		}
		
		assertFalse(list.contains("EntityControlledVocabulary"));		
	}

	@Test 
	public void testDiagramEntityGenericPropertyShapeTypeExport() {
		List<String> list = new ArrayList<String>(); 
		
		for(EntityGlyphType.GenericProperty o : dia.getEntityGlyphArray(0).getGenericPropertyList()) {
			list.add(o.getKey()); 
		}
	
		assertTrue(list.contains("ShapeType"));		
	}

}
