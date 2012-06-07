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
package gov.nih.nci.lmp.mim.mimExample;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.HashMap;

import org.apache.xmlbeans.XmlOptions;

import gov.nih.nci.lmp.mim.mimVisLevel1.*;

/**
 * An class that shows an toy example for the usage of the MIM API.
 * 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 */
public class CaCamExample {

	/** The MIM-Vis doc. */
	public DiagramDocument visDoc;

	/**
	 * Creates a DiagramDocument from scratch for the binding of the simple
	 * physical entity (SPE), Ca++, through a non-covalent, reversible binding 
	 * interaction to another SPE, CaM.
	 */
	public void createCaCam() {
		visDoc = DiagramDocument.Factory.newInstance();

		// Create a new diagram to go with the document and set its properties.
		DiagramType dia = visDoc.addNewDiagram();
		dia.setWidth(84.7);
		dia.setHeight(146.3);

		// Create a new entity and add it to the diagram.
		EntityGlyphType ca = dia.addNewEntityGlyph();
		ca.setVisId("b4357");
		ca.setCenterX(47.0);
		ca.setCenterY(38.0);
		ca.setWidth(60.0);
		ca.setHeight(20.0);
		ca.setColor("000000");
		// This shows the way to access enumerated sets from the schema.
		ca.setType("SimplePhysicalEntity");
		ca.setDisplayName("Ca++");

		EntityGlyphType cam = dia.addNewEntityGlyph();
		cam.setVisId("a6fc4");
		cam.setCenterX(47.0);
		cam.setCenterY(123.0);
		cam.setWidth(60.0);
		cam.setHeight(20.0);
		cam.setColor("000000");
		cam.setType("SimplePhysicalEntity");
		cam.setDisplayName("CaM");

		InteractionGlyphType binding = dia.addNewInteractionGlyph();
		binding.setVisId("id4f7e9fd7");
		binding.setColor("000000");
		// Points are used to connect entities to interactions
		// and dictate the connection point on entities
		InteractionGlyphType.Point pt1 = binding.addNewPoint();
		pt1.setX(47.0);
		pt1.setY(48.0);
		pt1.setArrowHead("NonCovalentReversibleBinding");
		pt1.setVisRef("b4357");
		//
		pt1.setRelX(0.0);
		pt1.setRelY(1.0);

		InteractionGlyphType.Point pt2 = binding.addNewPoint();
		pt2.setX(47.0);
		pt2.setY(113.0);
		pt2.setArrowHead("NonCovalentReversibleBinding");
		pt2.setVisRef("a6fc4");
		pt2.setRelX(0.0);
		pt2.setRelY(-1.0);
	}

	/**
	 * Export to XML file from the DiagramDocument visDoc provided by the MIM API.
	 * 
	 * @param file
	 */
	public void exportFile(File file) {
		try {
			OutputStream output = new FileOutputStream(file);
		
			visDoc.save(output);

			output.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Import file into the DiagramDocument visDoc provided by the MIM API.
	 * 
	 * @param file
	 */
	public void importFile(File file) {
		try {
			visDoc = DiagramDocument.Factory.parse(file);
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("Number of Entities: "
				+ visDoc.getDiagram().sizeOfEntityGlyphArray());
		System.out.println("Number of Interactions: "
				+ visDoc.getDiagram().sizeOfInteractionGlyphArray());
		System.out.println(visDoc.xmlText());
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		CaCamExample c = new CaCamExample();
		File f = new File(args[1]);

		if (args[0].equals("-e")) {
			c.createCaCam();
			c.exportFile(f);
		} else if (args[0].equals("-i")) {
			c.importFile(f);
		}
	}
}
