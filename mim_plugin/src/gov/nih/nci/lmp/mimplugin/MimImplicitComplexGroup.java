package gov.nih.nci.lmp.mimplugin;

import java.awt.Toolkit;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Rectangle2D;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JPopupMenu;
import javax.swing.KeyStroke;
import javax.swing.AbstractAction;
import javax.swing.Action;

import org.pathvisio.gui.swing.PathwayElementMenuListener;
import org.pathvisio.gui.swing.PvDesktop;
import org.pathvisio.view.VPathway;
import org.pathvisio.view.Group;
import org.pathvisio.view.VPathwayElement;
import org.pathvisio.view.SelectionBox;
import org.pathvisio.view.Graphics;
import org.pathvisio.view.GroupPainter;
import org.pathvisio.view.GroupPainterRegistry;
import org.pathvisio.model.GroupStyle;

/**
 * Part of MIM plugin supporting the Implicit Complex Group option
 *
 * @author Margot Sunshine
 * @author Augustin Luna <augustin@mail.nih.gov>
 *
 * @version 1.0
 * @since 1.0
 */
public class MimImplicitComplexGroup implements PathwayElementMenuListener.PathwayElementMenuHook {
    VPathway vPathway;
    Group group;
    PvDesktop desktop;
    public static final GroupStyle IMPLICIT_COMPLEX = GroupStyle.create("ImplicitComplex");
    
    public MimImplicitComplexGroup(PvDesktop desktop) {
        this.desktop = desktop;
    }

    public static void registerGroup()
        {
            GroupPainterRegistry.registerPainter(IMPLICIT_COMPLEX.toString(), implicitPainter);
        }
    /**
    * This method is called whenever the user right-clicks
    * on an element in the Pathway.
    * VPathwayElement contains the object that was clicked on.
    */
    public void pathwayElementMenuHook(VPathwayElement e, JPopupMenu menu)
    {
        if (e instanceof SelectionBox) {
            ComplexAction showImplicitComplexAction = new ComplexAction();
            menu.add (showImplicitComplexAction);
        }

    }

     private class ComplexAction extends GroupActionBase {
          public ComplexAction() {
              super(
                  "Create implicit complex", "Break implicit complex",
                  "Create an implicit complex from selected elements",
                  "Break selected implicit complex",
                  IMPLICIT_COMPLEX,
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
}
