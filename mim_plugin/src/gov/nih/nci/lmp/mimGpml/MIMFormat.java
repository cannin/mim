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

import java.io.File;
import java.io.IOException;

import org.apache.xmlbeans.*;

import org.pathvisio.debug.Logger;

import org.pathvisio.model.ConverterException;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.PathwayExporter;
import org.pathvisio.model.PathwayImporter;

/**
 * Initiate the MIMML format within Pathvisio 
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * @author Margot Sunshine 
 * 
 * @version 1.0
 * @since 1.0
 * 
 */
public class MIMFormat implements PathwayExporter, PathwayImporter {

	/** The extensions to add to the Pathvisio interface. */
	private final String[] EXTENSIONS = new String[] { "mimml" };

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pathvisio.model.PathwayExporter#getExtensions()
	 */
	public String[] getExtensions() {
		return EXTENSIONS;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pathvisio.model.PathwayExporter#getName()
	 */
	public String getName() {
		return "MIM Markup Language";
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see org.pathvisio.model.PathwayExporter#doExport(java.io.File,
	 * org.pathvisio.model.Pathway)
	 */
	public void doExport(File file, Pathway pathway) throws ConverterException {
		try {
			ExporterHelper helper = new ExporterHelper(pathway);
			helper.mapPathway(); 
			helper.export(file);
		} catch (IOException e) {
			throw new ConverterException(e);
		}
	}

	/* (non-Javadoc)
	 * @see org.pathvisio.model.PathwayImporter#doImport(java.io.File)
	 */
	public Pathway doImport(File file) throws ConverterException {
		Pathway result = null;

		ImporterHelper helper = new ImporterHelper(file);
		result = helper.getPw();
		
		return result;
	}
}
