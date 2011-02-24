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

import java.awt.Color;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.xml.namespace.QName;

import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.apache.commons.collections.BidiMap;
import org.apache.commons.collections.bidimap.DualHashBidiMap;
import org.apache.xmlbeans.*;

import org.pathvisio.debug.Logger;

/**
 * A utility class of helper methods and variables used in both import and export.
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * @author Margot Sunshine 
 * 
 * @version 1.0
 * @since 1.0
 */
public abstract class CommonHelper {

	/** Namespace for MIM-Vis. */
	public static final String MIM_VIS_NS = "http://lmp.nci.nih.gov/mim/mimVisLevel1";

	/**
	 * Initialize the interaction types. This is the mapping from the GPML to
	 * MIM-Vis interactions; not the MIM-Vis to MIM-Bio mapping.
	 * 
	 * @return the mapping of GPML to MIMVis arrowheads
	 */
	public static BidiMap getGpmlToMimVisArrowHeadMap() {
		BidiMap arrowHash = new DualHashBidiMap();

		arrowHash.put("mim-necessary-stimulation",
				ArrowHeadEnumType.NECESSARY_STIMULATION);
		arrowHash.put("mim-stimulation", ArrowHeadEnumType.STIMULATION);
		arrowHash.put("mim-inhibition", ArrowHeadEnumType.INHIBITION);
		arrowHash.put("mim-absolute-inhibition", ArrowHeadEnumType.ABSOLUTE_INHIBITION);		
		arrowHash.put("mim-catalysis", ArrowHeadEnumType.CATALYSIS);
		arrowHash.put("mim-cleavage", ArrowHeadEnumType.COVALENT_BOND_CLEAVAGE);
		arrowHash.put("mim-binding",
				ArrowHeadEnumType.NON_COVALENT_REVERSIBLE_BINDING);
		arrowHash.put("mim-covalent-bond",
				ArrowHeadEnumType.COVALENT_IRREVERSIBLE_BINDING);
		arrowHash.put("mim-modification",
				ArrowHeadEnumType.COVALENT_MODIFICATION);
		arrowHash.put("mim-production-wo-loss",
				ArrowHeadEnumType.PRODUCTION_WITHOUT_LOSS);
		arrowHash.put("mim-conversion",
				ArrowHeadEnumType.STOCHIOMETRIC_CONVERSION);
		arrowHash.put("mim-transcription-translation",
				ArrowHeadEnumType.TEMPLATE_REACTION);
		arrowHash.put("Line", ArrowHeadEnumType.LINE);
		arrowHash.put("mim-next-feature", ArrowHeadEnumType.NEXT_FEATURE);
		arrowHash.put("mim-first-feature", ArrowHeadEnumType.FIRST_FEATURE);
		arrowHash.put("mim-branching-right", ArrowHeadEnumType.BRANCHING_RIGHT);
		arrowHash.put("mim-branching-left", ArrowHeadEnumType.BRANCHING_LEFT);
		arrowHash.put("mim-state-combination",
				ArrowHeadEnumType.STATE_COMBINATION);
		
		//TODO: To be added in a future MIM specification
		//arrowHash.put("mim-gap", ArrowHeadEnumType.GAP);
		return arrowHash;
	}

	/**
	 * Gets the XML printing options.
	 * 
	 * @return the XML options
	 */
	public static XmlOptions getXmlOptions() {

		// Set some default export parameters
		XmlOptions xmlOptions = new XmlOptions();

		final int indentSize = 4;

		// xmlOptions.setSaveAggressiveNamespaces();
		HashMap<String, String> ns = new HashMap<String, String>();
		ns.put(MIM_VIS_NS, "mimVis");

		xmlOptions.setSaveSuggestedPrefixes(ns);

		// Needed so that no namespace prefixes are appended to elements
		// this.xmlOptions.setUseDefaultNamespace();

		xmlOptions.setSavePrettyPrint();
		xmlOptions.setSavePrettyPrintIndent(indentSize);

		return xmlOptions;
	}

	/**
	 * Gets the MIM-Vis XML object by ID.
	 * 
	 * TODO: It does not appear possible to use the Saxon engine to process
	 * XPath queries within Pathvisio; the plugin fails to load. The approach
	 * taken instead relies on JDOM/Jaxen to process XPath.
	 * 
	 * @param doc
	 *            the doc
	 * @param elemId
	 *            the element id
	 * @return the vis xml object by id
	 */
	public static XmlObject getVisXmlObjectById(DiagramDocument doc,
			String elemId) {

		// TODO: Account for bioId
		// String queryExpression =
		// "/mimVis:Diagram/mimVis:InteractionGlyph[@visId='" + elemId + "']";
		String queryExpression = "//*[@visId='" + elemId + "']";

		Logger.log.debug("elemId:" + elemId);
		Logger.log.debug("queryExpression:" + queryExpression);

		try {
			org.w3c.dom.Document wDoc = (org.w3c.dom.Document) doc.getDomNode();
			javax.xml.xpath.XPathFactory factory = XPathFactory.newInstance();
			javax.xml.xpath.XPath wXpath = factory.newXPath();
			javax.xml.xpath.XPathExpression expr = wXpath
					.compile(queryExpression);

			Object result = expr.evaluate(wDoc,
					javax.xml.xpath.XPathConstants.NODESET);
			org.w3c.dom.NodeList nodes = (org.w3c.dom.NodeList) result;

			Logger.log.debug("NodeList size: " + nodes.getLength());

			/**
			 * If the size is not one, then there is a duplicate key issue that
			 * needs to be dealt with. Treat it as an error and return null.
			 */
			if (nodes.getLength() == 1) {
				XmlObject xmlObj = XmlObject.Factory.parse(nodes.item(0));
				Logger.log.debug("glyph.xmlText: "
						+ xmlObj.xmlText(getXmlOptions()));

				// Logger.log.debug("doc.xmlText: " +
				// doc.xmlText(getXmlOptions()));

				String elemStr = xmlObj.xmlText(getXmlOptions());

				Logger.log.debug("getVisXmlObjectById XML String:" + elemStr);

				/**
				 * Sample of the way an XML fragment is represented with
				 * <xml-fragment> tags. This necessitates a modification from
				 * the nodes returned by selectNodes.
				 * 
				 * <xml-fragment mimVis:visId="ca53d" mimVis:displayName="CAMK"
				 * centerX="166.0" centerY="167.0" mimVis:width="80.0"
				 * mimVis:height="20.0"
				 * xmlns:mimVis="http://lmp.nci.nih.gov/mim/mimVisLevel1">
				 * <mimVis:mimBioRef>b9044</mimVis:mimBioRef></xml-fragment>
				 */
				// Pattern/matcher
				Pattern mimStartElemTag = Pattern
						.compile("mimVis:[A-Z][A-Za-z]+");
				Matcher matcherStart = mimStartElemTag.matcher(elemStr);

				// System.out.println("matcherStart count: "
				// + matcherStart.groupCount());

				String match = null;

				// Find all matches
				while (matcherStart.find()) {
					// Get the matching string
					match = matcherStart.group();
					// System.out.println("matcherStart.group(): "
					// + matcherStart.group());
				}

				final int prefixLength = "mimVis:".length();

				// String localPart = xmlFrag + "Type";
				String localPart = match.substring(prefixLength) + "Type";

				// Match: mimVis:SimplePhysicalEntityGlyph
				// SPE URI QName: http://lmp.nci.nih.gov/mim/mimVisLevel1
				// SPE Local QName: SimplePhysicalEntityGlyphType

				QName objQName = new QName(MIM_VIS_NS, localPart);

				SchemaTypeLoader schemaTypeLoader = XmlBeans
						.getContextTypeLoader();
				SchemaType objType = schemaTypeLoader.findType(objQName);

				XmlOptions opts = new XmlOptions();
				opts.setLoadReplaceDocumentElement(null);

				/**
				 * Taken from the XMLBeans autogenerated code of a XSD complex
				 * type. For parsing a XML fragment given the SchemaType.
				 */
				xmlObj = XmlBeans.getContextTypeLoader().parse(elemStr,
						objType, opts);

				return xmlObj;
			} else {
				Logger.log.info("ERROR: Most likely a duplicate ID.");
			}
		} catch (XmlException e) {
			e.printStackTrace();
		} catch (XPathExpressionException e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * Gets the MIM-Vis namespace.
	 * 
	 * @return the MIM-Vis namespace
	 */
	public static String getMimVisNs() {
		return MIM_VIS_NS;
	}

	/**
	 * Checks if is not blank.
	 * 
	 * @param str
	 *            the str
	 * @return true, if is not blank
	 */
	public static boolean isNotBlank(String str) {
		if (str != null && !str.equals("")) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Validate XML doc.
	 * 
	 * @param xml
	 *            the xml
	 * @return true, if successful
	 */
	public static boolean validateXml(XmlObject xml) {
		boolean isXmlValid = false;

		// Set up the validation error listener to hold error messages
		ArrayList<XmlError> validationMessages = new ArrayList<XmlError>();

		// Validate the XML, collecting messages.
		isXmlValid = xml.validate(new XmlOptions()
				.setErrorListener(validationMessages));

		// If the XML isn't valid, print the messages.
		if (!isXmlValid) {
			printErrors(validationMessages);
		}
		return isXmlValid;
	}
	
	/**
	 * Receives the collection containing errors found during validation and
	 * print the errors to the console.
	 * 
	 * @param validationErrors
	 *            The validation errors.
	 */
	public static void printErrors(ArrayList<XmlError> validationErrors) {
		Iterator<XmlError> iter = validationErrors.iterator();
		while (iter.hasNext()) {
			Logger.log.error(">> " + iter.next().toString() + "\n");
		}
	}

	/**
	 * Convert color to hex string.
	 * 
	 * @param color
	 *            the color
	 * @return the string
	 */
	public static String convertColorToHex(Color color) {

		String rgbColorStr = Integer.toHexString(color.getRGB());
		String hexColorStr = rgbColorStr.substring(2, rgbColorStr.length());

		Logger.log.debug("RGB color: " + rgbColorStr);
		Logger.log.debug("Hex color: " + hexColorStr);

		return hexColorStr.toUpperCase();
	}
	
	/**
	 * Convert hex string to color.
	 * 
	 * @param hexStr
	 *            the hex string for a color
	 * @return the color object
	 */
	public static Color convertHexToColor(String hexStr) {
		
		Color color = null; 
		
		// Color.decode() only works if there is a '#' at the start
		if(hexStr.charAt(0) == '#') {
			Logger.log.debug("Not appending '#'");
			color = Color.decode(hexStr);
		} else {
			Logger.log.debug("Appending '#'");
			color = Color.decode("#" + hexStr);
		}

		return color;
	}
	

	// TODO: Get by Id, Get GenericProperty by Key
}
