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

import org.pathvisio.model.ConverterException;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.view.MIMShapes;

import org.jdom.JDOMException;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Test for the import of entities from MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class EntityImportTest {

	/** The namespace for MIM-Vis. */
	private static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("src/test/resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR, "entityTest.mimml");

	/** The pathway. */
	private Pathway pw; 
	
	/**
	 * Sets the up.
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 */
	@Before
	public void setUp() throws ConverterException {
		MIMShapes.registerShapes();

		ImporterHelper helper = new ImporterHelper(TEST_FILE);
		pw = helper.getPw();
	}

	@Test
	public void testPathwayDataNodeGraphIdImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");

		assertEquals("a1d49", pwElem.getGraphId());
	}
	
	@Test
	public void testPathwayDataNodeCenterXImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals(86.0, pwElem.getMCenterX(), 0);
	}

	@Test
	public void testPathwayDataNodeCenterYImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals(66.0, pwElem.getMCenterY(), 0);
	}
	
	@Test
	public void testPathwayDataNodeWidthImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals(60.0, pwElem.getMWidth(), 0);
	}

	@Test
	public void testPathwayDataNodeHeightImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals(20.0, pwElem.getMHeight(), 0);
	}
	
	@Test
	public void testPathwayDataNodeTypeImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("SimplePhysicalEntity", pwElem.getDataNodeType());
	}

	
	@Test
	public void testPathwayDataNodeShapeTypeImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("RoundedRectangle", pwElem.getShapeType().toString());
	}
	
	@Test
	public void testPathwayDataNodeDisplayNameImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("SPE", pwElem.getTextLabel());
	}

	@Test
	public void testPathwayDataNodeDbImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("HUGO", pwElem.getDataSource().getFullName());
	}
	
	@Test
	public void testPathwayDataNodeIdImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("TP53", pwElem.getGeneID());
	}

	@Test
	public void testPathwayDataNodeRelationshipTypeImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("other", pwElem.getDynamicProperty("DatabaseRelationship"));
	}

	@Test
	public void testPathwayDataNodeEntityControlledVocabularyImport() {
		PathwayElement pwElem = pw.getElementById("a1d49");
		
		assertEquals("Protein", pwElem.getDynamicProperty("EntityControlledVocabulary"));
	}
}
