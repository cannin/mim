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
package gov.nih.nci.lmp.refExport;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

import org.pathvisio.biopax.BiopaxElementManager;
import org.pathvisio.biopax.reflect.BiopaxElement;
import org.pathvisio.debug.Logger;
import org.pathvisio.model.ObjectType;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;

/**
 * Exports BibTeX format
 *  
 * @author Augustin Luna <augustin@mail.nih.gov>
 */
public class BibtexExporterHelper {

	/** The Pathvisio pathway. */
	private final Pathway pw;

	/** The Pathvisio pathway. */
	private String bibtex;

	/**
	 * Instantiates a new exporter helper.
	 * 
	 * @param pw
	 *            the pathway
	 */
	BibtexExporterHelper(Pathway pw) {
		this.pw = pw;
		System.out.println("Exporting to BibTeX");

		for (PathwayElement pwElem : pw.getDataObjects()) {
			if (pwElem.getObjectType() == ObjectType.BIOPAX) {
				bibtex = generateBibtex(pwElem);
			}
		}
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

		OutputStream output = new FileOutputStream(file);

		try {
			PrintWriter out = new PrintWriter(new FileWriter(file));
			out.print(bibtex);
			out.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			output.close();
		}
	}

	/**
	 * Generate BibTeX.
	 * 
	 * @param pwElem
	 *            the pw elem
	 * @return the string
	 */
	private String generateBibtex(PathwayElement pwElem) {
		BiopaxElementManager refMgr = pw.getBiopaxElementManager();

		Collection<BiopaxElement> bpElemColl = refMgr.getElements();

		List<String> bibtexList = new ArrayList<String>();

		for (org.pathvisio.biopax.reflect.BiopaxElement bpElem : bpElemColl) {

			String bibtexInst = "";

			org.pathvisio.biopax.reflect.PublicationXref gpmlPubXRef = (org.pathvisio.biopax.reflect.PublicationXref) bpElem;

			bibtexInst = "% " + gpmlPubXRef.getId() + "\n";
			bibtexInst += "@Article{pmid" + gpmlPubXRef.getPubmedId() + ",\n";

			bibtexInst += "\tauthor = {";

			String authorsList = join(gpmlPubXRef.getAuthors(), " and ", true);
			bibtexInst += authorsList + "},\n";

			bibtexInst += "\tjournal = {" + gpmlPubXRef.getSource() + "},\n";
			bibtexInst += "\tpmid = {" + gpmlPubXRef.getPubmedId() + "},\n";
			bibtexInst += "\ttitle = {" + gpmlPubXRef.getTitle() + "},\n";
			bibtexInst += "\tyear = {" + gpmlPubXRef.getYear() + "}\n";

			bibtexInst += "}";

			bibtexList.add(bibtexInst);

			Logger.log.debug("BibTeX Instance: " + bibtexInst);
		}

		Set<String> set = new HashSet<String>(bibtexList);
		List<String> uniqBibtexList = new ArrayList<String>(set);

		String bibtex = join(uniqBibtexList, ",\n", false);

		Logger.log.debug("BibTeX: " + bibtex);

		return bibtex;
	}

	/**
	 * String join method
	 * 
	 * @param s list of strings to be joined
	 * @param delimiter delimiter for string joining 
	 * @param isAuthor author flag; author undergo additional processing
	 * 
	 * @return the joined string
	 */
	static String join(List<String> s, String delimiter, boolean isAuthor) {
		StringBuilder builder = new StringBuilder();
		Iterator<String> iter = s.iterator();
		while (iter.hasNext()) {
			String str = iter.next();

			if (isAuthor) {	
				// author pattern; split on the last space
				String pattern = "(.*)\\s([A-Z]+)$";

				Pattern r = Pattern.compile(pattern);

				Matcher m = r.matcher(str);
				
				if (m.find()) {
					String lastNameStr = m.group(1);
					String firstNameStr = m.group(2);

					Logger.log.debug("FN: " + firstNameStr + " LN: " + lastNameStr);
					
					String[] firstNameArr = firstNameStr.split("");
					List<String> firstNameList = Arrays.asList(firstNameArr);
					
					String firstName = join(firstNameList, " ", false);

					String author = lastNameStr + "," + firstName; 
					
					Logger.log.debug("Author: " + str);

					builder.append(author);

				} else {
					Logger.log.debug("No authors");
				}				
			} else {
				builder.append(str);
			}

			if (!iter.hasNext()) {
				break;
			}
			builder.append(delimiter);
		}
		return builder.toString();
	}
}
