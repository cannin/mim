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

import org.apache.xmlbeans.*;

import java.io.File;

import org.pathvisio.debug.Logger;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.Pathway;
import org.pathvisio.view.MIMShapes;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Test for the export of group to MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class GroupExportTest {

	/** The namespace for MIM-Vis. */
	private static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR,
			"groupTest.gpml");

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
	public void testDiagramGenericGroupVisIdExport() {	
		GroupType o = (GroupType) CommonHelper.getVisXmlObjectById(visDoc, "e5a14");
	
		assertEquals("e5a14", o.getVisId());
	}
	
	@Test
	public void testDiagramGenericGroupTypeExport() {
		GroupType o = (GroupType) CommonHelper.getVisXmlObjectById(visDoc, "e5a14");
		
		assertEquals("Generic", o.getType().toString());
	}

	@Test
	public void testDiagramGenericGroupRefExport() {
		EntityGlyphType ent = (EntityGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "b46e8");
	
		assertEquals("e5a14", ent.getGroupRef());
	}
	
	@Test
	public void testDiagramImplicitComplexVisIdExport() {
		EntityGlyphType ent = (EntityGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "c984b");
	
		assertNotNull(ent);
	}

	@Test
	public void testDiagramImplicitComplexInteractionGlyphPointVisRefExport() {
		InteractionGlyphType.Point p = dia.getInteractionGlyphArray(1).getPointArray(1);
		
		assertEquals("c984b", p.getVisRef());
	}

	@Test
	public void testDiagramImplicitComplexEntityGlyphGroupRefExport() {
		EntityGlyphType ent = (EntityGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "e9d7a");
		
		assertEquals("c984b", ent.getGroupRef());
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testDiagramImplicitComplexDisplayNameExport() {
		EntityGlyphType ent = (EntityGlyphType) CommonHelper.getVisXmlObjectById(visDoc, "c984b");
	
		assertEquals("???", ent.getDisplayName());
	}
		
	//TODO: Add tests to ensure a single Group ID is used related to ImplicitComplexes

}
