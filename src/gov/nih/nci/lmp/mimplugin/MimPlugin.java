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
package gov.nih.nci.lmp.mimplugin;

import java.awt.event.ActionEvent;
import java.awt.*;
import java.awt.Shape;
import java.awt.geom.GeneralPath;
import java.awt.geom.Rectangle2D;
import java.net.URL;
import java.util.List;
import java.util.ArrayList;
import java.util.EnumSet;
import java.io.File;

import javax.swing.*;

import org.pathvisio.ApplicationEvent;
import org.pathvisio.gui.swing.PvDesktop;
import org.pathvisio.gui.swing.PathwayElementMenuListener;
import org.pathvisio.gui.swing.PreferencesDlg;
import org.pathvisio.gui.swing.propertypanel.PropertyDisplayManager;
import org.pathvisio.plugin.Plugin;
import org.pathvisio.Engine;
import org.pathvisio.preferences.Preference;
import org.pathvisio.preferences.PreferenceManager;
import org.pathvisio.model.*;
import org.pathvisio.view.*;
import org.pathvisio.view.Graphics;
import org.pathvisio.view.MIMShapes;

/**
 * A MIM plugin supporting the 
 * 
 * @author Margot Sunshine 
 * @author Augustin Luna <augustin@mail.nih.gov>
 * 
 * @version 1.0
 * @since 1.0
 */
public class MimPlugin implements Plugin, Engine.ApplicationEventListener
{
	private PvDesktop desktop;
    private static AnchorType INTRANS_ANCHOR;
//    public static final LineType MIM_FIRST_FEATURE = LineType.create ("mim-first-feature", "Arrow");
//    public static final LineType MIM_NEXT_FEATURE = LineType.create ("mim-next-feature", "Arrow");
//    private static DataNodeType ENTITY_FEATURE;
//    private static DataNodeType SIMPLE_ENTITY;
    public static final GroupStyle SIMPLE_ENTITY_GROUP = GroupStyle.create("EntityWithFeatures", true);
    public static final GroupStyle IMPLICIT_COMPLEX = GroupStyle.create("ImplicitComplex");
//    private static final int TBARHEIGHT = 15;
//    private static final int ARROW_NECESSARY_CROSSBAR = 6;
//    private static final int TBARWIDTH = 1;
//	private static final int TBAR_GAP = 6;
//    private static final int ARROWHEIGHT = 4;
//    private static final int ARROWWIDTH = 9;
    private static MimObjectsPane mimObjectsPane;

    public void init(PvDesktop desktop)
	{
		// save the desktop reference so we can use it later
		this.desktop = desktop;
        MIMShapes.registerShapes();
        Engine e = desktop.getSwingEngine().getEngine();
        GroupPainterRegistry.registerPainter(SIMPLE_ENTITY_GROUP.toString(), featurePainter);
        mimObjectsPane = new MimObjectsPane(desktop, e);
		desktop.getSideBarTabbedPane().add("MIM", mimObjectsPane);
        
        // add new anchor;
		INTRANS_ANCHOR = AnchorType.create("Intermolecular", true);
        ShapeRegistry.registerAnchor(INTRANS_ANCHOR.getName(), getIntranAnchorShape());

//        ShapeRegistry.registerArrow (MIM_PRODUCTION_WO_LOSS.getName(), getMIMStimulation(), ArrowShape.FillType.OPEN, ARROWWIDTH);
//        ShapeRegistry.registerArrow (MIM_FIRST_FEATURE.getName(), getMIMCovalentBond(), ArrowShape.FillType.OPEN);
//        ShapeRegistry.registerArrow (MIM_NEXT_FEATURE.getName(), getLine(), ArrowShape.FillType.OPEN);
////        ShapeRegistry.registerArrow (MIM_STATE_COMBINATION.getName(), getLine(), ArrowShape.FillType.OPEN);
        GroupPainterRegistry.registerPainter(SIMPLE_ENTITY_GROUP.toString(), featurePainter);
        GroupPainterRegistry.registerPainter(IMPLICIT_COMPLEX.toString(), implicitPainter);

        PropertyDisplayManager.setVisible(StaticProperty.HEIGHT, false);
        PropertyDisplayManager.setVisible(StaticProperty.WIDTH, false);

        // register a hook so we can modify the right-click menu
        desktop.addPathwayElementMenuHook(new InTransOption());
        desktop.addPathwayElementMenuHook(new NewFeatureOption());
        desktop.addPathwayElementMenuHook(new NewFeatureOption());

        // register a lister so we get notified when a pathway is opened
        desktop.getSwingEngine().getEngine().addApplicationEventListener(this);

        // set the initial enabled / disabled state of the action
        updateState();
        createMimPreferenceDlg();
        
        // add dynamic property to allow the user to identify the start of 
        // of an interaction 
        PropertyManager.registerProperty(MIM_INTERACTION_START);
        PropertyDisplayManager.registerProperty(MIM_INTERACTION_START);
        PropertyDisplayManager.setPropertyScope(
        		MIM_INTERACTION_START, 
                EnumSet.of(ObjectType.LINE)
        );
        
        // add dynamic property necessary for validation 
        PropertyManager.registerProperty(MIM_DATABASE_RELATIONSHIP);
        PropertyDisplayManager.registerProperty(MIM_DATABASE_RELATIONSHIP);
        PropertyDisplayManager.setPropertyScope(
        		MIM_DATABASE_RELATIONSHIP, 
                EnumSet.of(ObjectType.DATANODE)
        );
        
        // add dynamic property necessary for validation 
        PropertyManager.registerProperty(MIM_ENTITY_CONTROLLED_VOCABULARY);
        PropertyDisplayManager.registerProperty(MIM_ENTITY_CONTROLLED_VOCABULARY);
        PropertyDisplayManager.setPropertyScope(
        		MIM_ENTITY_CONTROLLED_VOCABULARY, 
                EnumSet.of(ObjectType.DATANODE)
        );
	}

//    private ObjectsPane createMimObjectsPane(PvDesktop desktop, Engine e) {
//        ObjectsPane	mimObjectsPane = new ObjectsPane(desktop.getSwingEngine());
//        final int COLNUM = 10;
//        mimObjectsPane.addButtons(getMimEntities(e), "MIM element glyphs", COLNUM);
//        mimObjectsPane.addButtons(getMimReactions(e), "MIM reactions", COLNUM);
//        mimObjectsPane.addButtons(getMimContingencies(e), "MIM contingencies", COLNUM);
//        mimObjectsPane.addButtons(getMimCatalyticInteractions(e), "MIM catalytic interactions", COLNUM);
//        mimObjectsPane.addButtons(getBasicLines(e), "Basic lines", COLNUM);
//        mimObjectsPane.addButtons(new Action[] {
//                new NewElementAction(e, entityWithFeatureTemplate),
//            }, "Template", COLNUM);
//        mimObjectsPane.addButtons(new Action[] {
//                new NewElementAction(e, new DefaultTemplates.LabelTemplate()),
//            }, "Label", COLNUM);
//        return mimObjectsPane;
//    }

    public void done() {}

    /**
     * Checks if a pathway is open or not. If there is no open pathway,
     * the toolbar button is greyed out.
     */
    public void updateState()
    {
//        toolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
//        restrictedCopyToolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
//        degradationToolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
//        modifierToolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
//        entityToolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
//        entityWithFeatureToolbarAction.setEnabled(desktop.getSwingEngine().getEngine().hasVPathway());
    }

//    private Action[] getMimEntities(Engine e) {
//        DataNodeType MODIFIER = DataNodeType.create("Modifier");
//        DataNodeType CONCEPTUAL_ENTITY_DATANODE = DataNodeType.create("ConceptualEntity");
//        DataNodeType RESTRICTED_COPY_DATANODE = DataNodeType.create("RestrictedCopy");
//        DataNodeType SOURCE_SINK_DATANODE = DataNodeType.create("SourceSink");
//        SIMPLE_ENTITY = DataNodeType.create("SimplePhysicalEntity");
//        ENTITY_FEATURE = DataNodeType.create("EntityFeature");
//        GeneralPath p = new GeneralPath(new Ellipse2D.Double (-6, -6, 12, 12));
//        p.moveTo(7, -7);
//		p.lineTo(-7, 7);
//        IShape SOURCE_SINK = new AbstractShape (p, "SourceSink", "SourceSink", false, false);
//        IShape RESTRICTED_COPY = new AbstractShape (new Ellipse2D.Double (0, 0, 10, 10), "RestrictedCopy", "RestrictedCopy", false, false);
//        IShape CONCEPTUAL_ENTITY = new AbstractShape (new Rectangle2D.Double (0, 0, 70, 20), "ConceptualEntity", "ConceptualEntity", true, false);
//        MIMEntityTemplate speTemplate = new MIMEntityTemplate(ShapeType.ROUNDED_RECTANGLE, "Simple physical entity", SIMPLE_ENTITY, 60.0, 20.0, "SPE");
//        speTemplate.addDynamicProperty("NumberOfAnchors","3");
//        MIMEntityTemplate conceptualEntity = new MIMEntityTemplate(CONCEPTUAL_ENTITY, "Conceptual entity", CONCEPTUAL_ENTITY_DATANODE, 70.0, 20.0, "CE");
//        conceptualEntity.addDynamicProperty("NumberOfAnchors","3");
//        MIMEntityTemplate featureTemplate = new MIMEntityTemplate(ShapeType.ROUNDED_RECTANGLE, "Feature", ENTITY_FEATURE, 60.0, 20.0, "Feature");
//        speTemplate.addDynamicProperty("NumberOfAnchors","3");
//        MIMEntityTemplate modifierTemplate = new MIMEntityTemplate(ShapeType.NONE, "Modifier", MODIFIER, 60.0, 20.0, "Modifier");
//// todo: feature for network analysis and file parsing
////        modifierTemplate.addDynamicProperty("ModificationPosition","nnn");
////        modifierTemplate.addDynamicProperty("Source","sourceId");
////        modifierTemplate.addDynamicProperty("Target","targetId");
//        MIMEntityTemplate restrictedCopy = new MIMEntityTemplate(RESTRICTED_COPY, "Restricted copy", RESTRICTED_COPY_DATANODE, 10.0, 10.0, "");
//        restrictedCopy.setFillColor(Color.BLACK);
//        MIMEntityTemplate degradationTemplate = new MIMEntityTemplate(SOURCE_SINK, "Source/sink", SOURCE_SINK_DATANODE, 15.0, 15.0, "");
//        Action[] newMIMEntityActions = new Action[] {
//                new NewElementAction(e, speTemplate),
//                new NewElementAction(e, conceptualEntity),
//                new NewElementAction(e, featureTemplate),
//                new NewElementAction(e, modifierTemplate),
//                new NewElementAction(e, restrictedCopy),
//                new NewElementAction(e, degradationTemplate)
//        };
//        return newMIMEntityActions;
//    }
//
//    private Action[] getMimReactions(Engine e) {
//        LineType MIM_PRODUCTION_WO_LOSS = LineType.create ("mim-production-wo-loss", "Arrow");
//        ShapeRegistry.registerArrow (MIM_PRODUCTION_WO_LOSS.getName(), getMIMStimulation(), ArrowShape.FillType.OPEN, ARROWWIDTH);
//        Action[] newMIMInteractionActions = new Action[] {
//				 new NewElementAction(e, new MimConnectorTemplate(
//						 "Non-covalent reversible binding", "mim-binding", MIMShapes.MIM_BINDING, MIMShapes.MIM_BINDING)
//				 ),
//				 new NewElementAction(e, new MimConnectorTemplate(
//						 "Covalent modification", "mim-modification", LineType.LINE, MIMShapes.MIM_MODIFICATION)
//				 ),
//				 new NewElementAction(e, new MimConnectorTemplate(
//						 "Covalent irreversible binding", "mim-covalent-bond", MIMShapes.MIM_COVALENT_BOND, MIMShapes.MIM_COVALENT_BOND)
//				 ),
//				 new NewElementAction(e, new MimConnectorTemplate(
//						 "Stochiometric conversion", "mim-conversion", LineType.LINE, MIMShapes.MIM_CONVERSION)
//				 ),
//                 new NewElementAction(e, new MimConnectorTemplate(
//						 "Production without loss", "mim-production-wo-loss", LineType.LINE, MIM_PRODUCTION_WO_LOSS)
//				 ),
//                 new NewElementAction(e, new MimConnectorTemplate(
//						 "Template reaction (transcription-translation)", "mim-binding", LineType.LINE, MIMShapes.MIM_TRANSLATION)
//				 )
//		 };
//                         return newMIMInteractionActions;
//    }
//
//    private Action[] getMimContingencies(Engine e) {
//        LineType MIM_ABSOLUTE_INHIBITION = LineType.create ("mim-absolute-inhibition", "Arrow");
//        ShapeRegistry.registerArrow (MIM_ABSOLUTE_INHIBITION.getName(), getMIMAbsoluteInhibition(),  ArrowShape.FillType.OPEN, TBARWIDTH + TBAR_GAP);
//        Action[] newMIMInteractionActions = new Action[] {
//				 new NewElementAction(e, new LineTemplate(
//						 "Necessary stimulation", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_NECESSARY_STIMULATION, ConnectorType.ELBOW)
//				 ),
//				 new NewElementAction(e, new LineTemplate(
//						 "Stimulation", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_STIMULATION, ConnectorType.ELBOW)
//				 ),
//				 new NewElementAction(e, new LineTemplate(
//						 "Inhibition", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_INHIBITION, ConnectorType.ELBOW)
//				 ),
//                 new NewElementAction(e, new MimConnectorTemplate(
//						 "Absolute inhibition", "mim-absolute-inhibition", LineType.LINE, MIM_ABSOLUTE_INHIBITION)
//				 ),
//		 };
//                         return newMIMInteractionActions;
//    }
//
//    private Action[] getMimCatalyticInteractions(Engine e) {
//        LineType MIM_ABSOLUTE_INHIBITION = LineType.create ("mim-absolute-inhibition", "Arrow");
//        ShapeRegistry.registerArrow (MIM_ABSOLUTE_INHIBITION.getName(), getMIMAbsoluteInhibition(),  ArrowShape.FillType.OPEN, TBARWIDTH + TBAR_GAP);
//        Action[] newMIMInteractionActions = new Action[] {
// 				 new NewElementAction(e, new DefaultTemplates.LineTemplate(
//						 "Cleavage", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_CLEAVAGE, ConnectorType.STRAIGHT)
//				 ),
//                 new NewElementAction(e, new LineTemplate(
//						 "Catalysis", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_CATALYSIS, ConnectorType.ELBOW)
//				 ),
//		 };
//                         return newMIMInteractionActions;
//    }
//
//    private static class MimConnectorTemplate extends LineTemplate
//    {
//        private String desc;
//        private String image;
//
//        MimConnectorTemplate (String desc, String image, LineType startType, LineType endType)
//        {
//            super (desc, LineStyle.SOLID, startType, endType, ConnectorType.ELBOW);
//            this.image = image;
//            this.desc = desc;
//        }
//
//        @Override
//        public String getDescription()
//        {
//            return "Draw new " + desc;
//        }
//
//        @Override
//        public String getName()
//        {
//            return desc;
//        }
//
//        public URL getIconLocation()
//        {
//            String resName = "build/images/" + image + ".gif";
//            URL url = MimPlugin.class.getClassLoader().getResource(resName);
//            if (url == null) Logger.log.error ("Couldn't load resource '" + resName + "'");
//            return  url;
//        }
//    }
//
//
//    private Action[] getBasicLines(Engine e) {
//        Action[] newInteractionActions = new Action[] {
//                 new NewElementAction(e, new DefaultTemplates.LineTemplate(
//						 "elbow", LineStyle.SOLID, LineType.LINE, LineType.LINE, ConnectorType.ELBOW)
//				 ),
//                 new NewElementAction(e, new DefaultTemplates.LineTemplate(
//						 "line", LineStyle.SOLID, LineType.LINE, LineType.LINE, ConnectorType.STRAIGHT)
//				 ),
//				 new NewElementAction(e, new DefaultTemplates.LineTemplate(
//						 "dashedline", LineStyle.DASHED, LineType.LINE, LineType.LINE, ConnectorType.STRAIGHT)
//				 )
//		 };
//		 return newInteractionActions;
//    }
//
//
//	private static class MIMEntityTemplate extends ShapeTemplate {
//        HashMap<String, String> dynamicProperties;
//        private String desc;
//		protected IShape shType;
//        DataNodeType dnType;
//        double width;
//        double height;
//        String label;
//        Color fillColor;
//
//        MIMEntityTemplate (IShape shType, String desc, DataNodeType dnType, double width, double height, String label)
//		{
//			super (shType);
//			this.shType = shType;
//			this.desc = desc;
//            this.dnType = dnType;
//            Logger.log.info("datanode type " + dnType);
//            this.width = width;
//            this.height = height;
//            this.label = label;
//            dynamicProperties = new HashMap<String, String>();
//        }
//
//		@Override
//		public String getDescription()
//		{
//			return "Draw new " + desc;
//		}
//
//		@Override
//		public String getName()
//		{
//			return desc;
//		}
//
//		@Override
//		public PathwayElement[] addElements(Pathway p, double mx, double my) {
//			PathwayElement e = PathwayElement.createPathwayElement(ObjectType.DATANODE);
//			e.setShapeType(shType);
//			e.setMCenterX(mx);
//			e.setMCenterY(my);
//			e.setMWidth(width);
//			e.setMHeight(height);
//			e.setRotation(0);
//            e.setTextLabel(label);
//            e.setDataNodeType(dnType);
//            if (fillColor != null) {
//                e.setFillColor(fillColor);
//            }
//            for (String key:dynamicProperties.keySet()) {
//                e.setDynamicProperty(key, dynamicProperties.get(key));
//            }
//            e.setGraphId(p.getUniqueGraphId());
//			addElement(e, p);
//
//			return new PathwayElement[] { e };
//		}
//
//		public URL getIconLocation()
//		{
//			Logger.log.info("datanode type " + dnType);
//            String image = "ConceptualEntity";
//            if (dnType != null) {
//                image = dnType.getName();
//            }
//            String resName = "build/images/" + image + ".gif";
//            Logger.log.info("image location " + resName);
//            URL url = MimPlugin.class.getClassLoader().getResource(resName);
//            Logger.log.info("url " + url);
//            if (url == null) Logger.log.error ("Couldn't load resource '" + resName + "'");
//			return  url;
//		}
//
//        public Map<String, String> addDynamicProperty(String propertyName, String defaultValue) {
//            dynamicProperties.put(propertyName, defaultValue);
//            return dynamicProperties;
//        }
//
//        public void setFillColor(Color theColor) {
//             fillColor = theColor;
//        }
//    }


    /**
    * This is called when a Pathway is opened or closed.
    */
    public void applicationEvent(ApplicationEvent e)
    {
         updateState();
    }

    /**
     * Add in trans to line menu
     */
    public class InTransOption implements PathwayElementMenuListener.PathwayElementMenuHook {
        VPathway vPathway;
       /**
        * This method is called whenever the user right-clicks
        * on an element in the Pathway.
        * VPathwayElement contains the object that was clicked on.
        */
       public void pathwayElementMenuHook(VPathwayElement e, JPopupMenu menu)
       {
           if (e instanceof Line) {
               vPathway = e.getDrawing();
                // We instantiate an Action
                   ShowInfoAction showInfoAction = new ShowInfoAction();

                   // pass the clicked element to the action object
                   showInfoAction.setElement(e);

                   // Insert action into the menu.
                   // NB: this is optional, we can choose e.g.
                   // to insert only when the clicked element is a certain type.
                   menu.add (showInfoAction);
           }
       }

        class ShowInfoAction extends AbstractAction
        {
                private VPathwayElement elt;

                public ShowInfoAction()
                {
                        // This will be the label of the pop up menu item.
                        putValue (NAME, "Add Intermolecular symbol");
                }

                /**
                 * This should be called before the action is triggered
                 */
                public void setElement (VPathwayElement anElt)
                {
                        elt = anElt;
                }

                public void actionPerformed(ActionEvent arg0)
                {
                    List<Graphics> selection = vPathway.getSelectedGraphics();
                    PathwayElement.MAnchor anchor;
                    
                    if(selection.size() > 0) {
                        vPathway.getUndoManager().newAction("Add Intermolecular symbol");
                        for(Graphics g : selection) {
                            if(g instanceof Line) {
                                anchor = g.getPathwayElement().addMAnchor(0.4);
                                
                                String graphId = anchor.getParent().getParent().getUniqueGraphId();
                                
                                anchor.setGraphId(graphId);   
                                anchor.setShape(INTRANS_ANCHOR);
                            }
                        }
                        vPathway.redrawDirtyRect();
                    }
                    
                }
        }
    }

    final static int SEGMENT_SIZE = 5;
    final static int DISTANCE_FROM_CENTER = 4;
    
    private static Shape getIntranAnchorShape() {
        int[] xpoints = {-2,0,2,0};
        int[] ypoints = {0,2,0,-2};
        GeneralPath rec = new GeneralPath(new Polygon(xpoints, ypoints, 4));
		rec.moveTo(-(SEGMENT_SIZE * 2), SEGMENT_SIZE);
		rec.lineTo(SEGMENT_SIZE, -SEGMENT_SIZE * 2);
		rec.moveTo(-(SEGMENT_SIZE), SEGMENT_SIZE * 2);
        rec.lineTo(SEGMENT_SIZE * 2, -SEGMENT_SIZE);
        return rec;
    }


    /*
     * Code for handeling MIM preferences
     */
    private void createMimPreferenceDlg() {
        PreferencesDlg dlg = desktop.getPreferencesDlg();
        PreferenceManager.getCurrent().set(MIMPreference.SHOW_COMMENT_LABELS, "true");
        PreferenceManager.getCurrent().set(MIMPreference.COMMENT_REFERENCE, "true");
        dlg.addPanel("MIM Plugin",
                        dlg.builder().booleanField(MIMPreference.SHOW_COMMENT_LABELS, "Show Comment Labels")
                                .booleanField(MIMPreference.COMMENT_REFERENCE, "Attach References to Comments").build());
    }


    /**
     * Add new Feature to group menu
     */
    public class NewFeatureOption implements PathwayElementMenuListener.PathwayElementMenuHook {
        VPathway vPathway;
        Group group;
       /**
        * This method is called whenever the user right-clicks
        * on an element in the Pathway.
        * VPathwayElement contains the object that was clicked on.
        */
       public void pathwayElementMenuHook(VPathwayElement e, JPopupMenu menu)
       {
           if (e instanceof Group) {
               group = (Group)e;
               vPathway = e.getDrawing();
                // We instantiate an Action
               if (group.getPathwayElement().getGroupStyle().equals(SIMPLE_ENTITY_GROUP)) {
                   ShowAddFeatureAction showAddFeatureAction = new ShowAddFeatureAction();

                   // pass the clicked element to the action object
                   showAddFeatureAction.setElement(e);
                   // Insert action into the menu.
                   // NB: this is optional, we can choose e.g.
                   // to insert only when the clicked element is a certain type.

                   menu.add (showAddFeatureAction);
               }
           }
       }

        class ShowAddFeatureAction extends AbstractAction implements SelectionBox.SelectionListener {
            private VPathwayElement elt;

            public ShowAddFeatureAction()
            {
//                group.getPathwayElement().addListener();
                vPathway.addSelectionListener(this);
                // This will be the label of the pop up menu item.
                    putValue (NAME, "Add New Feature");
            }

            /**
             * This should be called before the action is triggered
             */
            public void setElement (VPathwayElement anElt)
            {
                    elt = anElt;
            }


            public void selectionEvent(SelectionBox.SelectionEvent e) {
                System.out.println("MimPlugin add feature selection event");
                for (VPathwayElement ve:e.selection) {
                    if (ve instanceof Group) {
                        addFeature((Group)ve);
                    }
                }
                 setEnabled(true);
            }

            public void addFeature(Group group) {
                group.getPathwayElement();
                String groupRef = group.getPathwayElement().getGroupId();
                System.out.println("addFeature " + groupRef);
            }

            public void actionPerformed(ActionEvent arg0)
            {
                System.out.println("MimPlugin add feature action performed");
                if (elt instanceof Group) {
                    Group group = ((Group)elt);
                    String groupRef = group.getPathwayElement().getGroupId();
                    PathwayElement lastFeature = null;
                    for (Graphics gg:group.getGroupGraphics()) {
                        if (gg.getPathwayElement().getDynamicProperty("NextFeature") == null) {
                            lastFeature = gg.getPathwayElement();
                        }
                    }
                    if (lastFeature == null) {
                        System.out.println("!!!!! Problem - last Feature not found !!!!! " + groupRef);
                        return;
                    }
                    double mx = lastFeature.getMCenterX();
                    double my = lastFeature.getMCenterY();
                    FeatureTemplate newFeature = new FeatureTemplate(groupRef, mx, my, lastFeature);
                    System.out.println("Adding new feature " + groupRef + " mx " + mx + " my " + my );
                    ArrayList<PathwayElement> elems = new ArrayList<PathwayElement>();
                    elems.toArray(newFeature.addElements(vPathway.getPathwayModel(), mx, my));
                    vPathway.paste(elems);
                    vPathway.redrawDirtyRect();
                }

            }
        }
    }

    public static class FeatureTemplate implements Template {
//    static Template featureTemplate = new Template() {
        double fmx;
        double fmy;
        String ref;
        PathwayElement lastFeature;

        public FeatureTemplate(String groupRef, double fmx, double fmy, PathwayElement lastFeature) {
            this.fmx = fmx;
            this.fmy = fmy;
            ref = groupRef;
            this.lastFeature = lastFeature;

        }

        public PathwayElement[] addElements(Pathway p, double mx, double my) {
            PathwayElement l = mimObjectsPane.drawFeatureLine(p, fmx, fmy, ref, false);
            p.add(l);
            String nextFeatureId = p.getUniqueGraphId();
            lastFeature.setDynamicProperty("NextFeature", nextFeatureId);
            PathwayElement e = mimObjectsPane.drawFeature(fmx, fmy, ref, nextFeatureId);
            p.add(e);
            l.getMStart().linkTo(lastFeature, 1, 0);
            l.getMEnd().linkTo(e,-1,0);

            return new PathwayElement[] { e, l };
        }
        		public String getName()
		{
			return "EntityFeature";
		}

		public String getDescription()
		{
			return "Draw new Entity feature";
		}

        public VPathwayElement getDragElement(VPathway vp)
		{
			// normally we would return a Handle of the newly
			// created VPathwayElement here.
			//
			// by returning null, we prevent the user from
			// dragging the handle and customizing the
			// size of the new object
			return null;
		}
        
        private final String IMG_EF = "build/images/SPE.gif";
               
        public URL getIconLocation()
        {
            return MimPlugin.class.getClassLoader().getResource(IMG_EF);
        }

        public void postInsert(PathwayElement[] newElements) {

        }
    }

//    static Template entityWithFeatureTemplate = new Template()
//	{
//
//		public PathwayElement[] addElements(Pathway p, double mx, double my)
//		{
//
//            PathwayElement g = PathwayElement.createPathwayElement(ObjectType.GROUP);
//            g.setGroupStyle(SIMPLE_ENTITY_GROUP);
//            String ref = p.getUniqueGroupId();
//            g.setGroupId(ref);
//            p.add(g);
//            System.out.println("groupRef " + ref);
//            String nextFeatureId = p.getUniqueGraphId();
//            PathwayElement d = drawEntity(mx, my, p.getUniqueGraphId(), ref, nextFeatureId);
//            p.add(d);
//            PathwayElement l = drawFeatureLine(p, mx, my, ref, true);
//            p.add(l);
//            PathwayElement e = drawFeature(mx, my, ref, nextFeatureId);
//            l.getMStart().linkTo(d,1,0);
//            l.getMEnd().linkTo(e,-1,0);
//            p.add(e);
//
//            return new PathwayElement[] { g, d, e, l };
//		}
//
//		public String getName()
//		{
//			return "SimplePhysicalEntityWithFeature";
//		}
//
//		public String getDescription()
//		{
//			return "Draw new Simple physical entity with feature";
//		}
//
//		public VPathwayElement getDragElement(VPathway vp)
//		{
//			// normally we would return a Handle of the newly
//			// created VPathwayElement here.
//			//
//			// by returning null, we prevent the user from
//			// dragging the handle and customizing the
//			// size of the new object
//			return null;
//		}
//
//		private final String IMG_SPE_W_FEATURE = "images/SPE_w_feature.gif";
//
//        public URL getIconLocation()
//        {
//            return MimPlugin.class.getClassLoader().getResource(IMG_SPE_W_FEATURE);
//        }
//
//        public void postInsert(PathwayElement[] newElements) {
//
//        }
//    };
    
    static final Property MIM_INTERACTION_START = new Property () {
        //A unique id for the property
        public String getId() {
                return "InteractionStart";
        }
        //The description, will be used as tooltip in the property panel
        public String getDescription() {
                return "ID of the entity at the start of an interaction.";
        }
        //The name the user sees in the property panel
        public String getName() {
                return "Interaction Start";
        }
        //The data type of the property
        public PropertyType getType() {
                return StaticPropertyType.STRING;
        }
        public boolean isCollection() {
                return false;
        }
    };
    
    static final Property MIM_DATABASE_RELATIONSHIP = new Property () {
        //A unique id for the property
        public String getId() {
                return "DatabaseRelationship";
        }
        //The description, will be used as tooltip in the property panel
        public String getDescription() {
                return "Relationship of the database and database identifier to the attached entity.";
        }
        //The name the user sees in the property panel
        public String getName() {
                return "Database Relationship";
        }
        //The data type of the property
        public PropertyType getType() {
                return StaticPropertyType.STRING;
        }
        public boolean isCollection() {
                return false;
        }
    };    

    static final Property MIM_ENTITY_CONTROLLED_VOCABULARY = new Property () {
        //A unique id for the property
        public String getId() {
                return "EntityControlledVocabulary";
        }
        //The description, will be used as tooltip in the property panel
        public String getDescription() {
                return "An attribute to relate MIM entities to BioPAX entities.";
        }
        //The name the user sees in the property panel
        public String getName() {
                return "Entity Controlled Vocabulary";
        }
        //The data type of the property
        public PropertyType getType() {
                return StaticPropertyType.STRING;
        }
        public boolean isCollection() {
                return false;
        }
    }; 
    
    private static GroupPainter implicitPainter = new GroupPainter() {
         public void drawGroup(Graphics2D g, Group group, int flags) {
             boolean mouseover = (flags & Group.FLAG_MOUSEOVER) != 0;
             boolean anchors = (flags & Group.FLAG_ANCHORSVISIBLE) != 0;
             boolean selected = (flags & Group.FLAG_SELECTED) != 0;
             Rectangle2D rect = group.getVBounds();

             int sw = 1;
             int arc = (int)rect.getWidth()/8;
             if (rect.getHeight() > rect.getWidth()) {
                 arc = (int)rect.getHeight()/8;
             }
             //fill
             g.setColor(Color.WHITE);
             g.fillRoundRect((int) rect.getX(), (int) rect.getY(),
                     (int) rect.getWidth(), (int) rect.getHeight(), arc, arc);
             //border
             g.setColor(Color.GRAY);
//            g.setStroke(new BasicStroke(sw, BasicStroke.CAP_SQUARE,
//                    BasicStroke.JOIN_MITER, 1, new float[] { 4, 2 }, 0));
             g.drawRoundRect((int) rect.getX() , (int) rect.getY() ,
                     (int) rect.getWidth() - sw, (int) rect.getHeight() - sw, arc, arc);

             //User hint is drawn on mouseover, if it fits within the group bounds
             if(mouseover && !anchors) {
                 //Draw a hint to tell the user that click selects group
                 String hint = selected ? "Drag to move group" : "Click to select group";

                 Rectangle2D tb = g.getFontMetrics().getStringBounds(hint, g);

                 if(tb.getWidth() <= rect.getWidth()) {
                     int yoffset = (int)rect.getY();
                     int xoffset = (int)rect.getX() + (int)(rect.getWidth() / 2) - (int)(tb.getWidth() / 2);
                     yoffset += (int)(rect.getHeight() / 2) + (int)(tb.getHeight() / 2);
                     g.drawString(hint, xoffset, yoffset);
                 }
             }
         }
     };

       private static GroupPainter featurePainter = new GroupPainter() {
         public void drawGroup(Graphics2D g, Group group, int flags) {
             boolean mouseover = (flags & Group.FLAG_MOUSEOVER) != 0;
             boolean anchors = false;
             boolean selected = (flags & Group.FLAG_SELECTED) != 0;
             Rectangle2D rect = group.getVBounds();

             int arc = (int)rect.getWidth()/8;
             if (rect.getHeight() > rect.getWidth()) {
                 arc = (int)rect.getHeight()/8;
             }
             //fill
             g.setColor(Color.WHITE);
             g.fillRoundRect((int) rect.getX(), (int) rect.getY(),
                     (int) rect.getWidth(), (int) rect.getHeight(), arc, arc);
             //border
             g.setColor(Color.GRAY);

             //User hint is drawn on mouseover, if it fits within the group bounds
             if(mouseover && !anchors) {
                 //Draw a hint to tell the user that click selects group
                 String hint = selected ? "Drag to move group" : "Click to select group";

                 Rectangle2D tb = g.getFontMetrics().getStringBounds(hint, g);

                 if(tb.getWidth() <= rect.getWidth()) {
                     int yoffset = (int)rect.getY();
                     int xoffset = (int)rect.getX() + (int)(rect.getWidth() / 2) - (int)(tb.getWidth() / 2);
                     yoffset += (int)(rect.getHeight() / 2) + (int)(tb.getHeight() / 2);
                     g.drawString(hint, xoffset, yoffset);
                 }
             }
         }
     };

//    private static PathwayElement drawEntity(double mx, double my, String graphId, String groupRef, String nextFeatureId) {
// //todo:
//        PathwayElement d = PathwayElement.createPathwayElement(ObjectType.DATANODE);
//        d.setShapeType(ShapeType.ROUNDED_RECTANGLE);
//        d.setMCenterX(mx);
//        d.setMCenterY(my);
//        d.setMWidth(60.0);
//        d.setMHeight(20.0);
//        d.setTransparent(false);
//        d.setDataNodeType(SIMPLE_ENTITY);
//        d.setDynamicProperty("NumberOfAnchors", "3");
//        d.setTextLabel("SPE");
//        d.setRotation(0);
//        if (groupRef != null) {
//            d.setGroupRef(groupRef);
//        }
//        d.setGraphId(graphId);
//        if (nextFeatureId != null) {
//            d.setDynamicProperty("NextFeature", nextFeatureId);
//        }
//        return d;
//    }
//
//    private static PathwayElement drawFeature(double mx, double my, String groupRef, String nextFeatureId) {
//        PathwayElement e = PathwayElement.createPathwayElement(ObjectType.DATANODE);
//        e.setShapeType(ShapeType.ROUNDED_RECTANGLE);
//        e.setMCenterX(mx + 76.0);
//        e.setMCenterY(my);
//        e.setMWidth(60.0);
//        e.setMHeight(20.0);
//        e.setTransparent(false);
//        e.setDataNodeType(ENTITY_FEATURE);
//        e.setDynamicProperty("NumberOfAnchors", "3");
//        e.setTextLabel("Feature");
//        e.setRotation(0);
//        e.setGraphId(nextFeatureId);
//        e.setGroupRef(groupRef);
//        return e;
//    }

//	private static GeneralPath getArrowShapedPath() {
//		GeneralPath path = new GeneralPath();
//		path.moveTo (0, -ARROWHEIGHT);
//		path.lineTo (ARROWWIDTH, 0);
//		path.lineTo (0, ARROWHEIGHT);
//		path.closePath();
//		return path;
//	}
//
//	static private java.awt.Shape getMIMStimulation () {
//		return getArrowShapedPath();
//	}
//
//    private static java.awt.Shape getMIMAbsoluteInhibition() {
//		GeneralPath path = new GeneralPath();
//		path.moveTo (0, -TBARHEIGHT/2);
//		path.lineTo (0, TBARHEIGHT/2);
//		path.moveTo (-ARROW_NECESSARY_CROSSBAR, -TBARHEIGHT/2);
//		path.lineTo (-ARROW_NECESSARY_CROSSBAR, TBARHEIGHT/2);
//		return path;
//	}

//    private static GeneralPath getLine() {
//        GeneralPath path = new GeneralPath();
//        path.moveTo (0, 0);
//        path.lineTo (5, 0);
//        path.closePath();
//        return path;
//    }
//
//    static private java.awt.Shape getMIMCovalentBond ()
//    {
//        int BOND_SIZE = 8;
//        return new Rectangle2D.Double(
//            -BOND_SIZE + 1, -BOND_SIZE/2,
//            BOND_SIZE, BOND_SIZE
//        );
//    }
    

//    private static PathwayElement drawFeatureLine(Pathway p, double mx, double my, String groupRef, boolean isFirstFeature) {
//        PathwayElement l = PathwayElement.createPathwayElement(ObjectType.LINE);
//        l.setLineStyle(LineStyle.SOLID);
//        if (isFirstFeature) {
//            l.setStartLineType(MIM_FIRST_FEATURE);
//        } else {
//            l.setStartLineType(LineType.fromName("Line"));
//        }
//        l.setEndLineType(LineType.fromName("Line"));
//        l.setMStartX(mx + 30.0);
//        l.setMStartY(my);
//        l.setMEndX(mx + 46.0);
//        l.setMEndY(my);
//        l.setLineThickness(1.0);
//        l.setGraphId(p.getUniqueGraphId());
//        l.setGroupRef(groupRef);
//        return l;
//    }

    public enum MIMPreference implements Preference
    {
        SHOW_COMMENT_LABELS(Boolean.toString(true)),
        COMMENT_REFERENCE(Boolean.toString(true));

        MIMPreference(String defaultValue) {
            this.defaultValue = defaultValue;
        }

        MIMPreference(File defaultValue)
        {
            this.defaultValue = "" + defaultValue;
        }

        private String defaultValue = Boolean.toString(false);

        public String getDefault() {
            return defaultValue;
        }

    }

//    private class ComplexAction extends GroupActionBase {
//		public ComplexAction() {
//			super(
//				"Create complex", "Break complex",
//				"Create a complex from selected elements",
//				"Break selected complex",
//				GroupStyle.COMPLEX,
//				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P,
//						Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())
//				);
//		}
//	}

//	private class GroupActionBase extends AbstractAction implements SelectionBox.SelectionListener {
//		private String groupLbl, ungroupLbl, groupTt, ungroupTt;
//		private GroupStyle groupStyle;
//
//		public GroupActionBase(String groupLbl, String ungroupLbl,
//				String groupTt, String ungroupTt,
//				GroupStyle style, KeyStroke keyStroke) {
//			super();
//			this.groupStyle = style;
//			this.groupLbl = groupLbl;
//			this.ungroupLbl = ungroupLbl;
//			this.groupTt = groupTt;
//			this.ungroupTt = ungroupTt;
//			vPathway.addSelectionListener(this);
//			putValue(NAME, groupLbl);
//			putValue(SHORT_DESCRIPTION, groupTt);
//			putValue(ACCELERATOR_KEY, keyStroke);
//			setLabel();
//		}
//
//		public void actionPerformed(ActionEvent e) {
//			if(!isEnabled()) return; //Don't perform action if not enabled
//			Group g = vPathway.toggleGroup(vPathway.getSelectedGraphics());
//			if(g != null) {
//				g.getPathwayElement().setGroupStyle(groupStyle);
//			}
//		}
//
//		public void selectionEvent(SelectionBox.SelectionEvent e) {
//			switch(e.type) {
//			case SelectionBox.SelectionEvent.OBJECT_ADDED:
//			case SelectionBox.SelectionEvent.OBJECT_REMOVED:
//			case SelectionBox.SelectionEvent.SELECTION_CLEARED:
//				setLabel();
//			}
//		}
//
//		private void setLabel() {
//			int unGrouped = 0;
//			List<Graphics> selection = vPathway.getSelectedGraphics();
//			for(Graphics g : selection) {
//				if(g.getPathwayElement().getGroupRef() == null) {
//					unGrouped++;
//				}
//			}
//			setEnabled(true);
//			if(unGrouped >= 2) {
//				putValue(Action.NAME, groupLbl);
//				putValue(SHORT_DESCRIPTION, groupTt);
//			} else {
//				putValue(Action.NAME, ungroupLbl);
//				putValue(SHORT_DESCRIPTION, ungroupTt);
//			}
//		}
//	}    
}
