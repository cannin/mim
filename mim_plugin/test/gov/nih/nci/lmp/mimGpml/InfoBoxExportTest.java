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
import java.util.List;
import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import org.pathvisio.debug.Logger;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.Pathway;
import org.pathvisio.view.MIMShapes;

import org.junit.*; 

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test for the export of infobox information to MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class InfoBoxExportTest {

	/** The namespace for MIM-Vis. */
	public static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR, "infoboxTest.gpml");
	
	/** The vis doc. */
	private DiagramDocument visDoc; 

	/** The diagram. */
	private DiagramType dia; 
	
	/**
	 * Sets the up.
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
	
	// Diagram@width
	// Diagram@height
	// Diagram/MimBio@title
	// Diagram/MimBio@identifier
	// Diagram/MimBio@creator
	// Diagram/MimBio@contributor
	// Diagram/MimBio@description
	// Diagram/MimBio@rights
	// Diagram/MimBio@source
	// Diagram/MimBio@modified
	
	/**
	 * Test diagram width export.
	 */
	@Test
	public void testDiagramWidthExport() {
		assertEquals(0.0, dia.getWidth(), 0);
	}

	/**
	 * Test diagram height export.
	 */
	@Test
	public void testDiagramHeightExport() {
		assertEquals(0.0, dia.getHeight(), 0);
	}

	/**
	 * Test diagram mim bio title export.
	 */
	@Test
	public void testDiagramMimBioTitleExport() {
		assertEquals("Title", dia.getMimBio().getTitle());
	}

	/**
	 * Test diagram mim bio identifier export.
	 */
	@Test
	public void testDiagramMimBioIdentifierExport() {
		assertEquals("Identifier", dia.getMimBio().getIdentifier());
	}

	/**
	 * Test diagram mim bio creator export.
	 */
	@Test
	public void testDiagramMimBioCreatorExport() {
		List<String> list = new ArrayList<String>(); 
		list.add("Creator");
		
		assertEquals(list, dia.getMimBio().getCreatorList());
	}

	/**
	 * Test diagram mim bio contributor export.
	 */
	@Test
	public void testDiagramMimBioContributorExport() {
		List<String> list = new ArrayList<String>(); 
		list.add("Contributor");
		
		assertEquals(list, dia.getMimBio().getContributorList());
	}

	/**
	 * Test diagram mim bio description export.
	 */
	@Test
	public void testDiagramMimBioDescriptionExport() {
		assertEquals("Description", dia.getMimBio().getDescription());
	}

	/**
	 * Test diagram mim bio rights export.
	 */
	@Test
	public void testDiagramMimBioRightsExport() {
		assertEquals("Rights", dia.getMimBio().getRights());
	}

	/**
	 * Test diagram mim bio source export.
	 */
	@Test
	public void testDiagramMimBioSourceExport() {
		assertEquals("Source", dia.getMimBio().getSource());
	}

	/**
	 * Test diagram mim bio modified export.
	 * 
	 * @throws ParseException
	 *             the parse exception
	 */
	@Test
	public void testDiagramMimBioModifiedExport() throws ParseException {		
		Calendar calDate = new XmlCalendar("2001-01-01");

		assertEquals(calDate, dia.getMimBio().getModified());
	}
}
