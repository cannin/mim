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
import java.io.StringReader;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.xml.namespace.QName;

import org.pathvisio.model.ConverterException;
import org.pathvisio.model.GpmlFormat;
import org.pathvisio.model.Pathway;
import org.pathvisio.view.MIMShapes;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.Namespace;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;

import java.util.regex.*;

import org.jdom.xpath.XPath;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;

/**
 * Tests for MIMML
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class MIMGPMLTest {

	/** The namespace for MIM-Vis. */
	public static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/** The Constant EXAMPLE. */
	private static final File EXAMPLE = new File("resources/camk.gpml");

	/** The Constant DIR. */
	private static final File DIR = new File("resources");

	/** The Constant EXPORT_FILES. */
	private static final File[] EXPORT_FILES = new File[] { new File(DIR,
			"camk.gpml") };

	/** The Constant IMPORT_FILES. */
	private static final File[] IMPORT_FILES = new File[] { new File(DIR,
			"camk_new.mimml") };

	private static final File INFOBOX_FILE = new File(DIR, "infobox.gpml");

	/*
	 * (non-Javadoc)
	 * 
	 * @see junit.framework.TestCase#setUp()
	 */
	public void setUp() {
		MIMShapes.registerShapes();
	}

	/**
	 * Test sample files exist.
	 */
	@Ignore
	@Test
	public void testFiles() {
		assertTrue(EXAMPLE.exists());

		for (File f : EXPORT_FILES) {
			assertTrue(f.exists());
		}

		for (File f : IMPORT_FILES) {
			assertTrue(f.exists());
		}
	}

	/**
	 * Test read xml write xml.
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Ignore
	@Test
	public void testReadXmlWriteXml() throws ConverterException, IOException {
		// Test if files can be exported without exceptions
		for (File f : EXPORT_FILES) {
			Pathway pw = new Pathway();
			pw.readFromXml(f, true);

			Document doc = GpmlFormat.createJdom(pw);

			XMLOutputter xo = new XMLOutputter();
			xo.output(doc, System.out);
		}
	}

	/**
	 * Test export.
	 * 
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Ignore
	@Test
	public void testExport() throws ConverterException, IOException {
		// Test if files can be exported without exceptions
		for (File f : EXPORT_FILES) {
			Pathway pw = new Pathway();
			pw.readFromXml(f, true);

			ExporterHelper helper = new ExporterHelper(pw);

			File target = new File(f.getAbsoluteFile() + ".mimml");
			helper.export(target);
		}
	}

	/**
	 * Test conversion. This test assumes an input file that covers all the
	 * tests.
	 * 
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Ignore
	@Test
	public void testExportConversion() throws ConverterException, IOException {
		// Test if files can be exported without exceptions
		for (File f : EXPORT_FILES) {
			Pathway pw = new Pathway();
			pw.readFromXml(f, true);

			ExporterHelper helper = new ExporterHelper(pw);

			DiagramDocument dia = helper.getVisDoc();
			MimBioType mb = dia.getDiagram().getMimBio();

			// File target = new File(f.getAbsoluteFile() + ".mimml");
			// helper.export(target);

			assertNotNull("MIM-Vis doc is null", dia);

			assertTrue("No creators", mb.getCreatorList().size() > 0);

			// assertTrue("No date", ds.getDataset().isSetDate());
			assertTrue("No description", mb.isSetDescription());
			assertTrue("No title", mb.isSetTitle());
			assertTrue("No rights", mb.isSetRights());

			assertTrue("No SPEs", dia.getDiagram().sizeOfEntityGlyphArray() > 0);
			// assertTrue("No COEs", dia.getDiagram()
			// .sizeOfConceptualEntityGlyphArray() > 0);
			// assertTrue("No MODs", dia.getDiagram()
			// .sizeOfModifierEntityGlyphArray() > 0);
			// assertTrue("No EFEs", dia.getDiagram()
			// .sizeOfEntityFeatureEntityGlyphArray() > 0);
			// assertTrue("No SSEs", dia.getDiagram()
			// .sizeOfSourceSinkEntityGlyphArray() > 0);
			// assertTrue("No RCEs", dia.getDiagram()
			// .sizeOfRestrictedCopyEntityGlyphArray() > 0);
			// assertTrue("No branches",
			// dia.getDiagram().sizeOfBranchGlyphArray() > 0);
			// assertTrue("No interactions", dia.getDiagram()
			// .sizeOfInteractionGlyphArray() > 0);
			//
			// assertTrue("No groups", dia.getDiagram().sizeOfGroupArray() > 0);

		}
	}

	/**
	 * Test import.
	 * 
	 * @throws ConverterException
	 *             the converter exception
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 */
	@Ignore
	@Test
	public void testImport() throws ConverterException, IOException,
			XmlException {
		// Test if files can be exported without exceptions
		for (File f : IMPORT_FILES) {
			ImporterHelper importer = new ImporterHelper(f);

			importer.parseDiagramXml(f);

			DiagramDocument visDoc = importer.getVisDoc();
			String elemId = "ca53d";

			XmlObject xmlObj = importer.getVisXmlObjectById(visDoc, elemId);

			EntityGlyphType ent = (EntityGlyphType) xmlObj;

			try {
				System.out.println("Display name: " + ent.getDisplayName());
			} catch (Exception e) {
				System.out.println("Display name error: " + elemId);
				e.printStackTrace();
			}
		}
	}

	/**
	 * Test get vis xml object by id.
	 */
	@Ignore
	@Test
	public void testGetVisXmlObjectById() throws IOException, XmlException,
			ConverterException {
		// Test if files can be exported without exceptions
		for (File f : IMPORT_FILES) {
			ImporterHelper importer = new ImporterHelper(f);

			importer.parseDiagramXml(f);

			DiagramDocument visDoc = importer.getVisDoc();
			String elemId = "ca53d";

			XmlObject xmlObj = importer.getVisXmlObjectById(visDoc, elemId);

			EntityGlyphType entGlyph = (EntityGlyphType) xmlObj;
			assertEquals("Incorrect XML node retrieved", "CAMK",
					entGlyph.getDisplayName());
		}
	}

	/**
	 * Test jdom export.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws JDOMException
	 *             the jDOM exception
	 */
	@Ignore
	@Test
	public void testJDOMExport() throws IOException, JDOMException,
			XmlException, ConverterException {
		for (File f : IMPORT_FILES) {
			ImporterHelper importer = new ImporterHelper(f);
			importer.parseDiagramXml(f);

			DiagramDocument visDoc = importer.getVisDoc();

			SAXBuilder builder = new SAXBuilder();
			Document jdomDoc = builder
					.build(new StringReader(visDoc.xmlText()));

			System.out.println("\n\nJDOMExport:");

			XMLOutputter outputter = new XMLOutputter();
			outputter.output(jdomDoc, System.out);
		}
	}

	@Ignore
	@Test
	public void testInfoBoxExport() throws ConverterException {

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

		Pathway pw = new Pathway();
		pw.readFromXml(INFOBOX_FILE, true);

		ExporterHelper helper = new ExporterHelper(pw);

		DiagramDocument visDoc = helper.getVisDoc();

		assertEquals(0.0, visDoc.getDiagram().getWidth(), 0);
		assertEquals(0.0, visDoc.getDiagram().getHeight(), 0);

		assertEquals("Title", visDoc.getDiagram().getMimBio().getTitle());
		assertEquals("Identifier", visDoc.getDiagram().getMimBio()
				.getIdentifier());

		String[] creators = new String[1];
		creators[0] = "Creator";

		assertEquals(creators, visDoc.getDiagram().getMimBio().getCreatorList()
				.toArray());

		String[] contributors = new String[1];
		contributors[0] = "Contributor";

		assertEquals(contributors, visDoc.getDiagram().getMimBio()
				.getContributorList().toArray());
		assertEquals("Rights", visDoc.getDiagram().getMimBio().getRights());
		assertEquals("Source", visDoc.getDiagram().getMimBio().getSource());

		try {
			DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
			Date date = df.parse("2001-01-01");

			Calendar calDate = Calendar.getInstance();
			calDate.setTime(date);

			assertEquals(calDate, visDoc.getDiagram().getMimBio().getModified());
		} catch (ParseException e) {
			System.out.println(e.getMessage());
		}
	}

	/**
	 * Test using JDom XPath.
	 * 
	 * @throws IOException
	 *             Signals that an I/O exception has occurred.
	 * @throws JDOMException
	 *             the jDOM exception
	 * @throws XmlException
	 *             the xml exception
	 * @throws ConverterException
	 *             the converter exception
	 */
	@Ignore
	@Test
	public void testJDOMXPath() throws IOException, JDOMException,
			XmlException, ConverterException {
		for (File f : IMPORT_FILES) {
			ImporterHelper importer = new ImporterHelper(f);
			importer.parseDiagramXml(f);

			DiagramDocument visDoc = importer.getVisDoc();
			// EntityGlyphType sp =
			// importer.getVisDoc().getDiagram().getEntityGlyphList().get(0);
			// System.out.println("HERE: " + sp.xmlText());

			SAXBuilder builder = new SAXBuilder();
			Document jdomDoc = builder
					.build(new StringReader(visDoc.xmlText()));

			String elemId = "ca53d";

			// String queryExpression = "//mimVis:Diagram/*[@mimVis:visId='"
			// + elemId + "']";

			String queryExpression = "//mimVis:Diagram/mimVis:EntityGlyph[@mimVis:visId]";

			System.out.println("XPath expression: " + queryExpression);

			XPath xpath = XPath.newInstance(queryExpression);

			Namespace mimVisNS = Namespace.getNamespace("mimVis", jdomDoc
					.getRootElement().getNamespaceURI());

			xpath.addNamespace(mimVisNS);

			System.out.println(mimVisNS.toString());

			@SuppressWarnings("unchecked")
			List<Element> xmlElems = (List<Element>) xpath.selectNodes(jdomDoc);

			System.out.println("\n\nJDOMXPath:");
			System.out.println("Node number:" + xmlElems.size());

			XMLOutputter outputter = new XMLOutputter();
			String elemStr = null;

			for (Element elem : xmlElems) {
				System.out.println("\n\nElem Outputter: ");
				outputter.output(elem, System.out);

				System.out.println("\n\nElem Text: ");
				elemStr = outputter.outputString(elem);
				System.out.println(elemStr);
			}

			/**
			 * Check to make sure you can convert from the JDOM XPath text back
			 * to an XMLBeans object
			 */
			XmlOptions validateOptions = new XmlOptions();
			ArrayList<XmlError> errorList = new ArrayList<XmlError>();
			validateOptions.setErrorListener(errorList);

			EntityGlyphType ent = null;

			// Pattern/matcher
			Pattern mimStartElemTag = Pattern
					.compile("mim(Vis|Bio):[A-Z][A-Za-z]+");
			Matcher matcher = mimStartElemTag.matcher(elemStr);

			String match = null;

			// Find all matches
			while (matcher.find()) {
				// Get the matching string
				match = matcher.group();
				System.out.println("Match: " + match);
			}

			matcher.replaceAll("xml-fragment");

			String uri = "http://lmp.nci.nih.gov/mim/mimVisLevel1";
			String localPart = match.substring(7) + "Type";

			// Match: mimVis:EntityGlyph
			// SPE URI QName: http://lmp.nci.nih.gov/mim/mimVisLevel1
			// SPE Local QName: EntityGlyphType

			QName objQName = new QName(uri, localPart);

			System.out.println("SPE URI QName: "
					+ EntityGlyphType.type.getName().getNamespaceURI());
			System.out.println("SPE Local QName: "
					+ EntityGlyphType.type.getName().getLocalPart());

			for (Element elem : xmlElems) {

				/**
				 * Test string in the correct format to be parsed.
				 * 
				 * String s = "<xml-fragment mimVis:visId='ca53d'
				 * mimVis:displayName='CAMK' centerX='166.0' centerY='167.0'
				 * mimVis:width='80.0' mimVis:height='20.0' xmlns:mimVis=
				 * 'http://lmp.nci.nih.gov/mim/mimVisLevel1'><mimVis:mimBioRef>
				 * b9044</mimVis:mimBioRef></xml-fragment>";
				 */

				elemStr = outputter.outputString(elem);

				// This makes the assumption that element tags are written in
				// CamelCase
				String xmlFrag = elemStr.replaceAll(
						"mim(Vis|Bio):[A-Z][A-Za-z]+", "xml-fragment");

				System.out.println(xmlFrag);

				ent = EntityGlyphType.Factory.parse(xmlFrag);
				System.out.println("ent.validate() = "
						+ ent.validate(validateOptions));

				System.out.println("Display name: " + ent.getDisplayName());
				System.out.println("Center X: " + ent.getCenterX());
				System.out.println("Center Y: " + ent.getCenterY());
				System.out.println("Width: " + ent.getWidth());
				System.out.println("Height: " + ent.getHeight());

				SchemaType schemaType = ent.schemaType();
				System.out.println("SchemaType: "
						+ schemaType.getShortJavaName());
			}

			for (XmlError error : errorList) {
				System.out.println("\n");
				System.out.println("Message: " + error.getMessage() + "\n");
				System.out.println("Location of invalid XML: "
						+ error.getCursorLocation().xmlText() + "\n");
			}

			ArrayList<SchemaType> entitySchemaTypeList = new ArrayList<SchemaType>();

			entitySchemaTypeList.add(EntityGlyphType.type);
			assertTrue("entitySchemaTypeList does not contain EntityGlyphType",
					entitySchemaTypeList.contains(EntityGlyphType.type));
		}
	}
}
