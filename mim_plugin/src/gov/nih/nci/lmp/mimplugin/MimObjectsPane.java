package gov.nih.nci.lmp.mimplugin;

import java.awt.geom.GeneralPath;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.awt.Color;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.swing.Action;

import org.pathvisio.gui.swing.ObjectsPane;
import org.pathvisio.gui.swing.PvDesktop;
import org.pathvisio.gui.swing.CommonActions;
import org.pathvisio.Engine;
import org.pathvisio.debug.Logger;
import org.pathvisio.model.DataNodeType;
import org.pathvisio.model.IShape;
import org.pathvisio.model.AbstractShape;
import org.pathvisio.model.ShapeType;
import org.pathvisio.model.LineType;
import org.pathvisio.model.LineStyle;
import org.pathvisio.model.ConnectorType;
import org.pathvisio.model.PathwayElement;
import org.pathvisio.model.Pathway;
import org.pathvisio.model.ObjectType;
import org.pathvisio.view.DefaultTemplates.LineTemplate;
import org.pathvisio.view.DefaultTemplates.ShapeTemplate;
import org.pathvisio.view.DefaultTemplates.LabelTemplate;
import org.pathvisio.view.ShapeRegistry;
import org.pathvisio.view.ArrowShape;
import org.pathvisio.view.MIMShapes;
import org.pathvisio.view.Template;
import org.pathvisio.view.VPathwayElement;
import org.pathvisio.view.VPathway;

/**
 * Created by IntelliJ IDEA.
 * User: margots
 * Date: Feb 11, 2011
 * Time: 10:18:06 AM
 * To change this template use File | Settings | File Templates.
 */
public class MimObjectsPane extends ObjectsPane {
    private static final LineType MIM_FIRST_FEATURE = LineType.create ("mim-first-feature", "Arrow");
    private static final LineType MIM_NEXT_FEATURE = LineType.create ("mim-next-feature", "Arrow");    
    private static DataNodeType ENTITY_FEATURE;
    private static DataNodeType SIMPLE_ENTITY;
    private static final int TBARHEIGHT = 15;
    private static final int ARROW_NECESSARY_CROSSBAR = 6;
    private static final int TBARWIDTH = 1;
	private static final int TBAR_GAP = 6;
    private static final int ARROWHEIGHT = 4;
    private static final int ARROWWIDTH = 9;

    public MimObjectsPane(PvDesktop desktop, Engine e) {
        super(desktop.getSwingEngine());
        final int COLNUM = 10;
        addButtons(getMimEntities(e), "MIM element glyphs", COLNUM);
        addButtons(getMimReactions(e), "MIM reactions", COLNUM);
        addButtons(getMimContingencies(e), "MIM contingencies", COLNUM);
        addButtons(getMimCatalyticInteractions(e), "MIM catalytic interactions", COLNUM);
        addButtons(getFeatureConnectors(e), "MIM feature connectors", COLNUM);
        addButtons(getBasicLines(e), "Basic lines", COLNUM);
        addButtons(new Action[] {
                new CommonActions.NewElementAction(e, entityWithFeatureTemplate),
            }, "Template", COLNUM);
        addButtons(new Action[] {
                new CommonActions.NewElementAction(e, new LabelTemplate()),
            }, "Label", COLNUM);
    }

    private Action[] getMimEntities(Engine e) {
        DataNodeType MODIFIER = DataNodeType.create("Modifier");
        DataNodeType CONCEPTUAL_ENTITY_DATANODE = DataNodeType.create("ConceptualEntity");
        DataNodeType RESTRICTED_COPY_DATANODE = DataNodeType.create("RestrictedCopy");
        DataNodeType SOURCE_SINK_DATANODE = DataNodeType.create("SourceSink");
        SIMPLE_ENTITY = DataNodeType.create("SimplePhysicalEntity");
        ENTITY_FEATURE = DataNodeType.create("EntityFeature");
        GeneralPath p = new GeneralPath(new Ellipse2D.Double (-6, -6, 12, 12));
        p.moveTo(7, -7);
		p.lineTo(-7, 7);
        IShape SOURCE_SINK = new AbstractShape(p, "SourceSink", "SourceSink", false, false);
        IShape RESTRICTED_COPY = new AbstractShape (new Ellipse2D.Double (0, 0, 10, 10), "RestrictedCopy", "RestrictedCopy", false, false);
        IShape CONCEPTUAL_ENTITY = new AbstractShape (new Rectangle2D.Double (0, 0, 70, 20), "ConceptualEntity", "ConceptualEntity", true, false);
        MIMEntityTemplate speTemplate = new MIMEntityTemplate(ShapeType.ROUNDED_RECTANGLE, "Simple physical entity", SIMPLE_ENTITY, 60.0, 20.0, "SPE");
        speTemplate.addDynamicProperty("NumberOfAnchors","3");
        MIMEntityTemplate conceptualEntity = new MIMEntityTemplate(CONCEPTUAL_ENTITY, "Conceptual entity", CONCEPTUAL_ENTITY_DATANODE, 70.0, 20.0, "CE");
        conceptualEntity.addDynamicProperty("NumberOfAnchors","3");
        MIMEntityTemplate featureTemplate = new MIMEntityTemplate(ShapeType.ROUNDED_RECTANGLE, "Feature", ENTITY_FEATURE, 60.0, 20.0, "Feature");
        speTemplate.addDynamicProperty("NumberOfAnchors","3");
        MIMEntityTemplate modifierTemplate = new MIMEntityTemplate(ShapeType.NONE, "Modifier", MODIFIER, 60.0, 20.0, "Modifier");
// todo: feature for network analysis and file parsing
//        modifierTemplate.addDynamicProperty("ModificationPosition","nnn");
//        modifierTemplate.addDynamicProperty("Source","sourceId");
//        modifierTemplate.addDynamicProperty("Target","targetId");
        MIMEntityTemplate restrictedCopy = new MIMEntityTemplate(RESTRICTED_COPY, "Restricted copy", RESTRICTED_COPY_DATANODE, 10.0, 10.0, "");
        restrictedCopy.setFillColor(Color.BLACK);
        MIMEntityTemplate degradationTemplate = new MIMEntityTemplate(SOURCE_SINK, "Source/sink", SOURCE_SINK_DATANODE, 15.0, 15.0, "");
        return new Action[] {
                new CommonActions.NewElementAction(e, speTemplate),
                new CommonActions.NewElementAction(e, conceptualEntity),
                new CommonActions.NewElementAction(e, featureTemplate),
                new CommonActions.NewElementAction(e, modifierTemplate),
                new CommonActions.NewElementAction(e, restrictedCopy),
                new CommonActions.NewElementAction(e, degradationTemplate)
        };
    }

    private Action[] getMimReactions(Engine e) {
        LineType MIM_PRODUCTION_WO_LOSS = LineType.create ("mim-production-wo-loss", "Arrow");
        ShapeRegistry.registerArrow (MIM_PRODUCTION_WO_LOSS.getName(), getMIMStimulation(), ArrowShape.FillType.OPEN, ARROWWIDTH);
        return new Action[] {
				 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Non-covalent reversible binding", "mim-binding", MIMShapes.MIM_BINDING, MIMShapes.MIM_BINDING)
				 ),
				 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Covalent modification", "mim-modification", LineType.LINE, MIMShapes.MIM_MODIFICATION)
				 ),
				 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Covalent irreversible binding", "mim-covalent-bond", MIMShapes.MIM_COVALENT_BOND, MIMShapes.MIM_COVALENT_BOND)
				 ),
				 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Stochiometric conversion", "mim-conversion", LineType.LINE, MIMShapes.MIM_CONVERSION)
				 ),
                 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Production without loss", "mim-production-wo-loss", LineType.LINE, MIM_PRODUCTION_WO_LOSS)
				 ),
                 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Template reaction (transcription-translation)", "mim-binding", LineType.LINE, MIMShapes.MIM_TRANSLATION)
				 )
		 };
    }

    private Action[] getMimContingencies(Engine e) {
        LineType MIM_ABSOLUTE_INHIBITION = LineType.create ("mim-absolute-inhibition", "Arrow");
        ShapeRegistry.registerArrow (MIM_ABSOLUTE_INHIBITION.getName(), getMIMAbsoluteInhibition(),  ArrowShape.FillType.OPEN, TBARWIDTH + TBAR_GAP);
        return new Action[] {
				 new CommonActions.NewElementAction(e, new LineTemplate(
						 "Stimulation", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_STIMULATION, ConnectorType.ELBOW)
				 ),
  				 new CommonActions.NewElementAction(e, new LineTemplate(
						 "Necessary stimulation", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_NECESSARY_STIMULATION, ConnectorType.ELBOW)
				 ),
                 new CommonActions.NewElementAction(e, new LineTemplate(
						 "Inhibition", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_INHIBITION, ConnectorType.ELBOW)
				 ),
                 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Absolute inhibition", "mim-absolute-inhibition", LineType.LINE, MIM_ABSOLUTE_INHIBITION)
				 ),
		 };
    }

    private Action[] getMimCatalyticInteractions(Engine e) {
        return new Action[] {
 				 new CommonActions.NewElementAction(e, new LineTemplate(
						 "Cleavage", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_CLEAVAGE, ConnectorType.STRAIGHT)
				 ),
                 new CommonActions.NewElementAction(e, new LineTemplate(
						 "Catalysis", LineStyle.SOLID, LineType.LINE, MIMShapes.MIM_CATALYSIS, ConnectorType.ELBOW)
				 ),
		 };
    }

    private Action[] getFeatureConnectors(Engine e) {
        ShapeRegistry.registerArrow (MIM_FIRST_FEATURE.getName(), getMIMCovalentBond(), ArrowShape.FillType.OPEN);
        ShapeRegistry.registerArrow (MIM_NEXT_FEATURE.getName(), getLine(), ArrowShape.FillType.OPEN);
        return new Action[] {
                new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "First feature", "mim-covalent-bond", MIM_FIRST_FEATURE, MIM_NEXT_FEATURE)
				),
                new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "Next feature", "mim-next-feature", MIM_NEXT_FEATURE, MIM_NEXT_FEATURE)
				),
        };
    }

    private Action[] getMimAdditional(Engine e) {
        return new Action[] {
 				 new CommonActions.NewElementAction(e, new LabelTemplate()),
                 new CommonActions.NewElementAction(e, new MimConnectorTemplate(
						 "State combination", "mim-state-combination", LineType.LINE, LineType.LINE)
				 ),
		 };
    }

    private static class MimConnectorTemplate extends LineTemplate {
        private String desc;
        private String image;

        MimConnectorTemplate (String desc, String image, LineType startType, LineType endType)
        {
            super (desc, LineStyle.SOLID, startType, endType, ConnectorType.ELBOW);
            this.image = image;
            this.desc = desc;
        }

        @Override
        public String getDescription()
        {
            return "Draw new " + desc;
        }

        @Override
        public String getName()
        {
            return desc;
        }

        public URL getIconLocation()
        {
            String resName = "build/images/" + image + ".gif";
            URL url = MimPlugin.class.getClassLoader().getResource(resName);
            if (url == null) Logger.log.error ("Couldn't load resource '" + resName + "'");
            return  url;
        }
    }


    private Action[] getBasicLines(Engine e) {
        return new Action[] {
                 new CommonActions.NewElementAction(e, new LineTemplate(
						 "elbow", LineStyle.SOLID, LineType.LINE, LineType.LINE, ConnectorType.ELBOW)
				 ),
                 new CommonActions.NewElementAction(e, new LineTemplate(
						 "line", LineStyle.SOLID, LineType.LINE, LineType.LINE, ConnectorType.STRAIGHT)
				 ),
				 new CommonActions.NewElementAction(e, new LineTemplate(
						 "dashedline", LineStyle.DASHED, LineType.LINE, LineType.LINE, ConnectorType.STRAIGHT)
				 )
		 };
    }


	private static class MIMEntityTemplate extends ShapeTemplate {
        HashMap<String, String> dynamicProperties;
        private String desc;
		protected IShape shType;
        DataNodeType dnType;
        double width;
        double height;
        String label;
        Color fillColor;

        MIMEntityTemplate (IShape shType, String desc, DataNodeType dnType, double width, double height, String label)
		{
			super (shType);
			this.shType = shType;
			this.desc = desc;
            this.dnType = dnType;
            Logger.log.info("datanode type " + dnType);
            this.width = width;
            this.height = height;
            this.label = label;
            dynamicProperties = new HashMap<String, String>();
        }

		@Override
		public String getDescription()
		{
			return "Draw new " + desc;
		}

		@Override
		public String getName()
		{
			return desc;
		}

		@Override
		public PathwayElement[] addElements(Pathway p, double mx, double my) {
			PathwayElement e = PathwayElement.createPathwayElement(ObjectType.DATANODE);
			e.setShapeType(shType);
			e.setMCenterX(mx);
			e.setMCenterY(my);
			e.setMWidth(width);
			e.setMHeight(height);
			e.setRotation(0);
            e.setTextLabel(label);
            e.setDataNodeType(dnType);
            if (fillColor != null) {
                e.setFillColor(fillColor);
            }
            for (String key:dynamicProperties.keySet()) {
                e.setDynamicProperty(key, dynamicProperties.get(key));
            }
            e.setGraphId(p.getUniqueGraphId());
			addElement(e, p);

			return new PathwayElement[] { e };
		}

		public URL getIconLocation()
		{
			Logger.log.info("datanode type " + dnType);
            String image = "ConceptualEntity";
            if (dnType != null) {
                image = dnType.getName();
            }
            String resName = "build/images/" + image + ".gif";
            Logger.log.info("image location " + resName);
            URL url = MimPlugin.class.getClassLoader().getResource(resName);
            Logger.log.info("url " + url);
            if (url == null) Logger.log.error ("Couldn't load resource '" + resName + "'");
			return  url;
		}

        public Map<String, String> addDynamicProperty(String propertyName, String defaultValue) {
            dynamicProperties.put(propertyName, defaultValue);
            return dynamicProperties;
        }

        public void setFillColor(Color theColor) {
             fillColor = theColor;
        }
    }

    static Template entityWithFeatureTemplate = new Template()
	{

		public PathwayElement[] addElements(Pathway p, double mx, double my)
		{

            PathwayElement g = PathwayElement.createPathwayElement(ObjectType.GROUP);
            g.setGroupStyle(MimPlugin.SIMPLE_ENTITY_GROUP);
            String ref = p.getUniqueGroupId();
            g.setGroupId(ref);
            p.add(g);
            System.out.println("groupRef " + ref);
            String nextFeatureId = p.getUniqueGraphId();
            PathwayElement d = drawEntity(mx, my, p.getUniqueGraphId(), ref, nextFeatureId);
            p.add(d);
            PathwayElement l = drawFeatureLine(p, mx, my, ref, true);
            p.add(l);
            PathwayElement e = drawFeature(mx, my, ref, nextFeatureId);
            l.getMStart().linkTo(d,1,0);
            l.getMEnd().linkTo(e,-1,0);
            p.add(e);

            return new PathwayElement[] { g, d, e, l };
		}

		public String getName()
		{
			return "SimplePhysicalEntityWithFeature";
		}

		public String getDescription()
		{
			return "Draw new Simple physical entity with feature";
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

		private final String IMG_SPE_W_FEATURE = "images/SPE_w_feature.gif";

        public URL getIconLocation()
        {
            return MimPlugin.class.getClassLoader().getResource(IMG_SPE_W_FEATURE);
        }

        public void postInsert(PathwayElement[] newElements) {

        }
    };

    private static GeneralPath getArrowShapedPath() {
        GeneralPath path = new GeneralPath();
        path.moveTo (0, -ARROWHEIGHT);
        path.lineTo (ARROWWIDTH, 0);
        path.lineTo (0, ARROWHEIGHT);
        path.closePath();
        return path;
    }

    static private java.awt.Shape getMIMStimulation () {
        return getArrowShapedPath();
    }

    private static java.awt.Shape getMIMAbsoluteInhibition() {
        GeneralPath path = new GeneralPath();
        path.moveTo (0, -TBARHEIGHT/2);
        path.lineTo (0, TBARHEIGHT/2);
        path.moveTo (-ARROW_NECESSARY_CROSSBAR, -TBARHEIGHT/2);
        path.lineTo (-ARROW_NECESSARY_CROSSBAR, TBARHEIGHT/2);
        return path;
    }

    private static PathwayElement drawEntity(double mx, double my, String graphId, String groupRef, String nextFeatureId) {
 //todo:
        PathwayElement d = PathwayElement.createPathwayElement(ObjectType.DATANODE);
        d.setShapeType(ShapeType.ROUNDED_RECTANGLE);
        d.setMCenterX(mx);
        d.setMCenterY(my);
        d.setMWidth(60.0);
        d.setMHeight(20.0);
        d.setTransparent(false);
        d.setDataNodeType(SIMPLE_ENTITY);
        d.setDynamicProperty("NumberOfAnchors", "3");
        d.setTextLabel("SPE");
        d.setRotation(0);
        if (groupRef != null) {
            d.setGroupRef(groupRef);
        }
        d.setGraphId(graphId);
        if (nextFeatureId != null) {
            d.setDynamicProperty("NextFeature", nextFeatureId);
        }
        return d;
    }

    private static GeneralPath getLine() {
        GeneralPath path = new GeneralPath();
        path.moveTo (0, 0);
        path.lineTo (5, 0);
        path.closePath();
        return path;
    }

    static private java.awt.Shape getMIMCovalentBond ()
    {
        int BOND_SIZE = 8;
        return new Rectangle2D.Double(
            -BOND_SIZE + 1, -BOND_SIZE/2,
            BOND_SIZE, BOND_SIZE
        );
    }

    public static PathwayElement drawFeature(double mx, double my, String groupRef, String nextFeatureId) {
        PathwayElement e = PathwayElement.createPathwayElement(ObjectType.DATANODE);
        e.setShapeType(ShapeType.ROUNDED_RECTANGLE);
        e.setMCenterX(mx + 76.0);
        e.setMCenterY(my);
        e.setMWidth(60.0);
        e.setMHeight(20.0);
        e.setTransparent(false);
        e.setDataNodeType(ENTITY_FEATURE);
        e.setDynamicProperty("NumberOfAnchors", "3");
        e.setTextLabel("Feature");
        e.setRotation(0);
        e.setGraphId(nextFeatureId);
        e.setGroupRef(groupRef);
        return e;
    }

    public static PathwayElement drawFeatureLine(Pathway p, double mx, double my, String groupRef, boolean isFirstFeature) {
        PathwayElement l = PathwayElement.createPathwayElement(ObjectType.LINE);
        l.setLineStyle(LineStyle.SOLID);
        if (isFirstFeature) {
            l.setStartLineType(MIM_FIRST_FEATURE);
        } else {
            l.setStartLineType(LineType.fromName("Line"));
        }
        l.setEndLineType(LineType.fromName("Line"));
        l.setMStartX(mx + 30.0);
        l.setMStartY(my);
        l.setMEndX(mx + 46.0);
        l.setMEndY(my);
        l.setLineThickness(1.0);
        l.setGraphId(p.getUniqueGraphId());
        l.setGroupRef(groupRef);
        return l;
    }

}
