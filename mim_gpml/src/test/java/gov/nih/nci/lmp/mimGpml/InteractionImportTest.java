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
import java.io.Reader;
import java.io.StringReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;

import org.pathvisio.biopax.reflect.Namespaces;
import org.pathvisio.biopax.reflect.BiopaxElement;
import org.pathvisio.debug.Logger;
import org.pathvisio.model.ConverterException;
import org.pathvisio.model.ObjectType;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.model.PathwayElement.Comment;
import org.pathvisio.model.PathwayElement.MPoint;
import org.pathvisio.model.PathwayElement.MAnchor;
import org.pathvisio.view.MIMShapes;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import org.jdom.JDOMException;
import java.io.IOException;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Test for the import of interactions from MIMML. 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class InteractionImportTest {

	/** The namespace for MIM-Vis. */
	public static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant DIR. */
	private static final File DIR = new File("src/test/resources");

	/** The Constant TEST_FILE. */
	private static final File TEST_FILE = new File(DIR,
			"interactionTest.mimml");

	/** The pathway. */
	private Pathway pw; 
	
	/** The vis doc. */
	private DiagramDocument visDoc; 
	
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
		visDoc = helper.getVisDoc();
	}

	//TODO: Check all comments
	@Test
	public void testPathwayLineCommentImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		
		List<String> list = new ArrayList<String>();
		list.add("LineComment");

		List<String> list2 = new ArrayList<String>();
		
		for(Comment com : pwElem.getComments()) {
			list2.add(com.toString());
		}
		
		assertEquals(list, list2);
	}

	@Test
	public void testPathwayLineGenericPropertyImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		
		assertEquals("visId", pwElem.getDynamicProperty("InteractionStart"));
	}

	@Test
	public void testPathwayLineVisIdImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");

		assertEquals("idbcc10920", pwElem.getGraphId());
	}

	@Test
	public void testPathwayLineColorImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		
		assertEquals("000000", CommonHelper.convertColorToHex(pwElem.getColor()));
	}

	@Test
	public void testPathwayLineGroupRefImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		
		assertEquals("a0fa5", pwElem.getGroupRef());
	}

	@Test
	public void testPathwayLinePointXImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MPoint mp = pwElem.getMPoints().get(0);
		
		assertEquals(295.0, mp.getX(), 0);
	}

	@Test
	public void testPathwayLinePointYImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MPoint mp = pwElem.getMPoints().get(0);

		assertEquals(81.0, mp.getY(), 0);
	}

	@Test
	public void testPathwayLineRelXImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MPoint mp = pwElem.getMPoints().get(0);

		assertEquals(-1.0, mp.getRelX(), 0);
	}

	@Test
	public void testPathwayLineRelYImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MPoint mp = pwElem.getMPoints().get(0);

		assertEquals(0.0, mp.getRelY(), 0);
	}
	
	@Ignore("During this test arrowheads seem to always be set to 'Line'")
	@Test
	public void testPathwayLinePointArrowHeadImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");

		assertEquals("mim-reversible-binding", pwElem.getStartLineType().toString());
	}

	@Test
	public void testPathwayLinePointVisRefImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MPoint mp = pwElem.getMPoints().get(0);
		
		assertEquals("ffd4a", mp.getGraphRef());
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayLineAnchorRefImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(0);
		
		//assertEquals("ece74", ma.get???);
	}

	@Test
	public void testPathwayLineAnchorVisIdImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(1);
		
		assertEquals("ece74", ma.getGraphId());
	}

	@Test
	public void testPathwayLineAnchorPositionImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(1);
		
		assertEquals(0.5225752508361204, ma.getPosition(), 0);
	}

	//TODO: Resolve naming differences 
	@Ignore("During this test anchor shapes seem to always be set to 'None'")
	@Test
	public void testPathwayLineAnchorShapeImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(0);

		assertEquals("Intermolecular", ma.getShape().toString());
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayLineAnchorColorImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(0);
		
		//assertEquals("000000", ma.get???);
	}

	@Test
	public void testPathwayLineAnchorGroupRefImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");

		assertEquals("a0fa5", pwElem.getGroupRef());
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayLineAnchorAnnotationLabelImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		MAnchor ma = pwElem.getMAnchors().get(0);
		
		//assertEquals("???", ma.get???);
	}

	//TODO: Decide if multiple anchors should be tested 
//	@Test
//	public void testPathwayLineAnchorImport() {
//		assertEquals(2, dia.getInteractionGlyphArray(0).sizeOfAnchorRefArray());
//	}

	//TODO: Decide if multiple anchors should be tested 
//	@Test
//	public void testPathwayLineExplicitComplexImport() {
//		boolean isExplicitComplex = false;
//
//		for (EntityGlyphType entGlyph : dia.getEntityGlyphList()) {
//			if (entGlyph.getType().equals(EntityGlyphType.Type.EXPLICIT_COMPLEX)) {
//				isExplicitComplex = true;
//			}
//		}
//
//		assertTrue(isExplicitComplex);
//	}

	@Test
	public void testPathwayBioPaxPublicationXRefBioIdImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		//org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 
	
		assertEquals("ef7", pwElem.getBiopaxRefs().get(0)); 
	}

	@Ignore("Currently all publications are assumed to be from PubMed in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefDbImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("PubMed", pubXRef.get???); 
	}

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefDbVersionImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}

	@Test
	public void testPathwayBioPaxPublicationXRefIdImport() {		
		Object[] biopaxElems = pw.getBiopaxElementManager().getElements().toArray();	
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = (org.pathvisio.biopax.reflect.PublicationXref) biopaxElems[0];
		
		assertEquals("123", pubXRef.getPubmedId()); 
	}	
	
	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefIdVersionImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}	

	@Test
	public void testPathwayBioPaxPublicationXRefTitleImport() {
		Object[] biopaxElems = pw.getBiopaxElementManager().getElements().toArray();	
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = (org.pathvisio.biopax.reflect.PublicationXref) biopaxElems[0];
		
		assertEquals("The importance of an innervated and intact antrum and pylorus in preventing postoperative duodenogastric reflux and gastritis.", pubXRef.getTitle()); 
	}	
	
	@Test
	public void testPathwayBioPaxPublicationXRefAuthorImport() {
		Object[] biopaxElems = pw.getBiopaxElementManager().getElements().toArray();	
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = (org.pathvisio.biopax.reflect.PublicationXref) biopaxElems[0];

		assertEquals("Keighley MR", pubXRef.getAuthors().get(0)); 
	}	

	@Test
	public void testPathwayBioPaxPublicationXRefYearImport() {
		Object[] biopaxElems = pw.getBiopaxElementManager().getElements().toArray();	
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = (org.pathvisio.biopax.reflect.PublicationXref) biopaxElems[0];

		assertEquals("1975", pubXRef.getYear()); 
	}	
	
	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefUrlImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}	

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefPagesImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}	

	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefJournalImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}
	
	@Ignore("Not a current feature in Pathvisio")  
	@Test
	public void testPathwayBioPaxPublicationXRefVolumeImport() {
		PathwayElement pwElem = pw.getElementById("idbcc10920");
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = pwElem.getBiopaxReferenceManager().getPublicationXRefs().get(0); 

		//assertEquals("???", pubXRef.get???); 
	}	
	
	@Test
	public void testPathwayBioPaxPublicationXRefSourceImport() {
		Object[] biopaxElems = pw.getBiopaxElementManager().getElements().toArray();	
		org.pathvisio.biopax.reflect.PublicationXref pubXRef = (org.pathvisio.biopax.reflect.PublicationXref) biopaxElems[0];
		
		assertEquals("Br J Surg", pubXRef.getSource()); 
	}		
}
