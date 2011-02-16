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
import org.pathvisio.gui.swing.ObjectsPane;
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
    public static final GroupStyle SIMPLE_ENTITY_GROUP = GroupStyle.create("EntityWithFeatures", true);
    public static final GroupStyle IMPLICIT_COMPLEX = GroupStyle.create("ImplicitComplex");
    private static MimObjectsPane mimObjectsPane;

    public void init(PvDesktop desktop)
	{
		// save the desktop reference so we can use it later
		this.desktop = desktop;
        MIMShapes.registerShapes();
        Engine e = desktop.getSwingEngine().getEngine();
        
        // add new anchor;
		INTRANS_ANCHOR = AnchorType.create("Intermolecular", true);
        ShapeRegistry.registerAnchor(INTRANS_ANCHOR.getName(), getIntranAnchorShape());

        GroupPainterRegistry.registerPainter(SIMPLE_ENTITY_GROUP.toString(), featurePainter);
        GroupPainterRegistry.registerPainter(IMPLICIT_COMPLEX.toString(), implicitPainter);

        PropertyDisplayManager.setVisible(StaticProperty.HEIGHT, false);
        PropertyDisplayManager.setVisible(StaticProperty.WIDTH, false);

        // register a hook so we can modify the right-click menu
        desktop.addPathwayElementMenuHook(new InTransOption());
        desktop.addPathwayElementMenuHook(new NewFeatureOption());
        desktop.addPathwayElementMenuHook(new ImplicitComplexOption());
        // get rid of existing object panel
        ObjectsPane objectsPane = desktop.getSwingEngine().getApplicationPanel().getObjectsPane();
        desktop.getSideBarTabbedPane().remove(objectsPane);

        mimObjectsPane = new MimObjectsPane(desktop, e);
		desktop.getSideBarTabbedPane().add("MIM", mimObjectsPane);
        /* show mim pane to top*/
        if (!PreferenceManager.getCurrent().get(MIMPreference.PREFERRED_PANEL).equals("MIM")) {
            int panelId = desktop.getSideBarTabbedPane().indexOfTab(PreferenceManager.getCurrent().get(MIMPreference.PREFERRED_PANEL));
            desktop.getSideBarTabbedPane().setSelectedComponent(desktop.getSideBarTabbedPane().getComponentAt(panelId));
        } else {
            desktop.getSideBarTabbedPane().setSelectedComponent(mimObjectsPane);
        }

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
        PreferenceManager.getCurrent().get(MIMPreference.SHOW_COMMENT_LABELS);
        PreferenceManager.getCurrent().get(MIMPreference.COMMENT_REFERENCE);
        PreferenceManager.getCurrent().get(MIMPreference.PREFERRED_PANEL);
//        PreferenceManager.getCurrent().set(MIMPreference.SHOW_COMMENT_LABELS, "true");
//        PreferenceManager.getCurrent().set(MIMPreference.COMMENT_REFERENCE, "true");
//        PreferenceManager.getCurrent().set(MIMPreference.PREFERRED_PANEL, "MIM");
        dlg.addPanel("MIM Plugin",
                        dlg.builder().booleanField(MIMPreference.SHOW_COMMENT_LABELS, "Show Comment Labels")
                                .booleanField(MIMPreference.COMMENT_REFERENCE, "Attach References to Comments").
                stringField(MIMPreference.PREFERRED_PANEL, "Select pane to appear on top").build());
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

   /**
     * Add new Feature to group menu
     */
    public class ImplicitComplexOption implements PathwayElementMenuListener.PathwayElementMenuHook {
        VPathway vPathway;
        Group group;
       /**
        * This method is called whenever the user right-clicks
        * on an element in the Pathway.
        * VPathwayElement contains the object that was clicked on.
        */
       public void pathwayElementMenuHook(VPathwayElement e, JPopupMenu menu)
       {
           if (e instanceof SelectionBox) {
                ComplexAction showImplicitComplexAction = new ComplexAction();

                   // pass the clicked element to the action object
//                   showImplicitComplexAction.setElement(e);
                   // Insert action into the menu.
                   // NB: this is optional, we can choose e.g.
                   // to insert only when the clicked element is a certain type.

                   menu.add (showImplicitComplexAction);
           }

       }

    private class ComplexAction extends GroupActionBase {
		public ComplexAction() {
			super(
				"Create implicit complex", "Break implicit complex",
				"Create an implicit complex from selected elements",
				"Break selected implicit complex",
				MimPlugin.IMPLICIT_COMPLEX,
				KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P,
						Toolkit.getDefaultToolkit().getMenuShortcutKeyMask())
				);
		}
	}

	private class GroupActionBase extends AbstractAction implements SelectionBox.SelectionListener {
		private String groupLbl, ungroupLbl, groupTt, ungroupTt;
		private GroupStyle groupStyle;
        protected VPathway vPathway;

        public GroupActionBase(String groupLbl, String ungroupLbl,
				String groupTt, String ungroupTt,
				GroupStyle style, KeyStroke keyStroke) {
			super();
			this.groupStyle = style;
			this.groupLbl = groupLbl;
			this.ungroupLbl = ungroupLbl;
			this.groupTt = groupTt;
			this.ungroupTt = ungroupTt;
            vPathway = desktop.getSwingEngine().getEngine().getActiveVPathway();
            vPathway.addSelectionListener(this);
			putValue(NAME, groupLbl);
			putValue(SHORT_DESCRIPTION, groupTt);
			putValue(ACCELERATOR_KEY, keyStroke);
			setLabel();
		}

		public void actionPerformed(ActionEvent e) {
			if(!isEnabled()) return; //Don't perform action if not enabled
			Group g = vPathway.toggleGroup(vPathway.getSelectedGraphics());
			if(g != null) {
				g.getPathwayElement().setGroupStyle(groupStyle);
			}
		}

		public void selectionEvent(SelectionBox.SelectionEvent e) {
			switch(e.type) {
			case SelectionBox.SelectionEvent.OBJECT_ADDED:
			case SelectionBox.SelectionEvent.OBJECT_REMOVED:
			case SelectionBox.SelectionEvent.SELECTION_CLEARED:
				setLabel();
			}
		}

		private void setLabel() {
			int unGrouped = 0;
			List<Graphics> selection = vPathway.getSelectedGraphics();
			for(Graphics g : selection) {
				if(g.getPathwayElement().getGroupRef() == null) {
					unGrouped++;
				}
			}
			setEnabled(true);
			if(unGrouped >= 2) {
				putValue(Action.NAME, groupLbl);
				putValue(SHORT_DESCRIPTION, groupTt);
			} else {
				putValue(Action.NAME, ungroupLbl);
				putValue(SHORT_DESCRIPTION, ungroupTt);
			}
		}
	}
    }

    
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

    public enum MIMPreference implements Preference
    {
        SHOW_COMMENT_LABELS(Boolean.toString(true)),
        COMMENT_REFERENCE(Boolean.toString(true)),
        PREFERRED_PANEL("MIM");

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

}
