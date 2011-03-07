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

import org.apache.commons.collections.MultiMap;
import org.apache.commons.collections.map.MultiValueMap;

import org.pathvisio.biopax.BiopaxElementManager;
import org.pathvisio.biopax.reflect.BiopaxElement;
import org.pathvisio.model.PathwayElement.Comment;
import org.pathvisio.debug.Logger;
import org.pathvisio.model.ObjectType;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayElement;

/**
 * Exports annotations
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 */
public class AnnotationExporterHelper {

	/** The Pathvisio pathway. */
	private final Pathway pw;

	/** The Pathvisio annotations. */
	private String annotations;

	/** The Pathvisio infobox information. */
	private ArrayList<String> infobox;
	
	/** The Pathvisio commentMap. */
	private MultiMap commentsMap;
	
	/** The Pathvisio dataSourceMap. */
	private MultiMap dataSourcesMap;
	
	/**
	 * Instantiates a new exporter helper.
	 * 
	 * @param pw
	 *            the pathway
	 */
	@SuppressWarnings("unchecked")
	AnnotationExporterHelper(Pathway pw) {
		this.pw = pw;
		System.out.println("Exporting Annotations");
		
		commentsMap = new MultiValueMap();
		dataSourcesMap = new MultiValueMap();
		infobox = new ArrayList<String>();
		
		for (PathwayElement pwElem : pw.getDataObjects()) {
			if (pwElem.getObjectType() == ObjectType.LINE) {
				commentsMap.putAll(generateCommentMap(pwElem));
			}
			
			if (pwElem.getObjectType() == ObjectType.DATANODE) {
				dataSourcesMap.putAll(generateDataSourceMap(pwElem));
			}		
			
			if (pwElem.getObjectType() == ObjectType.MAPPINFO) {
				if (isNotBlank(pwElem.getMapInfoName())) {
					infobox.add(pwElem.getMapInfoName());
				}
				
				if (isNotBlank(pwElem.getVersion())) {
					infobox.add(pwElem.getVersion());
				}
			}				
		}
		
		formatAnnotations(); 
	}
	
	/**
	 * Format annotations.
	 */
	@SuppressWarnings("unchecked")
	private void formatAnnotations() {
		annotations = "--- # Annotations\n";
		
		if (infobox.size() > 0) {
			annotations += "title: " + infobox.get(0) + "\n";
			annotations += "version: " + infobox.get(1) + "\n";		
		}
	
		annotations += "lines:\n";
		
		Iterator commentsItr = commentsMap.keySet().iterator();
		
		// Looks for PMID at the end of comments
		while (commentsItr.hasNext()) {
			String graphId = (String) commentsItr.next(); 
			
			ArrayList<String> tmpList = (ArrayList<String>) commentsMap.get(graphId);

			annotations += "  - graphid: " + graphId + "\n";
			annotations += "    comments: \n";
			
			for (String comment : tmpList) {
				String pattern = "\\[\\[(\\d+)\\]\\]";
	
				// Create a Pattern object
				Pattern r = Pattern.compile(pattern);
	
				// Now create matcher object.
				Matcher m = r.matcher(comment);
				if (m.find()) {
					annotations += "      - pmid: " + m.group(1) + "\n";
					annotations += "        comment: " + comment + "\n";
				} else {
					annotations += "      - comment: " + comment + "\n";
				}
			}
		}
		
		annotations += "datanodes:\n";
		
		Iterator dataSourcesItr = dataSourcesMap.keySet().iterator();
		
		// Looks for PMID at the end of comments
		while (dataSourcesItr.hasNext()) {
			String graphId = (String) dataSourcesItr.next(); 
			
			ArrayList<String> tmpList = (ArrayList<String>) dataSourcesMap.get(graphId);
			String db = tmpList.get(0);
			String id = tmpList.get(1);
			
			annotations += "  - graphid: " + graphId + "\n";
			annotations += "    db: " + db + "\n";
			annotations += "    id: " + id + "\n";
	
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
			out.print(annotations);
			out.close();
		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			output.close();
		}
	}

	/**
	 * Generate comment map.
	 *
	 * @param pwElem the pw elem
	 * @return the string
	 */
	private MultiMap generateCommentMap(PathwayElement pwElem) {		
		MultiMap commentMap = new MultiValueMap();
		
		// Map comments
		for (Comment comment : pwElem.getComments()) {
			commentMap.put(pwElem.getGraphId(), comment.toString());
		}

		return commentMap; 
	}
	
	/**
	 * Generate DataSource map.
	 *
	 * @param pwElem the pw elem
	 * @return the string
	 */
	private MultiMap generateDataSourceMap(PathwayElement pwElem) {
		MultiMap dataSourceMap = new MultiValueMap();
		
		if (isNotBlank(pwElem.getDataSource().getFullName())) {
			dataSourceMap.put(pwElem.getGraphId(), pwElem.getDataSource().getFullName());
			dataSourceMap.put(pwElem.getGraphId(), pwElem.getGeneID());
		}
		
		return dataSourceMap; 
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
}
