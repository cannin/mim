/*
 * XML Type:  ArrowHeadEnumType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML ArrowHeadEnumType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is an atomic type that is a restriction of gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType.
 */
public interface ArrowHeadEnumType extends org.apache.xmlbeans.XmlString
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(ArrowHeadEnumType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("arrowheadenumtype2382type");
    
    org.apache.xmlbeans.StringEnumAbstractBase enumValue();
    void set(org.apache.xmlbeans.StringEnumAbstractBase e);
    
    static final Enum COVALENT_MODIFICATION = Enum.forString("CovalentModification");
    static final Enum NON_COVALENT_REVERSIBLE_BINDING = Enum.forString("NonCovalentReversibleBinding");
    static final Enum COVALENT_IRREVERSIBLE_BINDING = Enum.forString("CovalentIrreversibleBinding");
    static final Enum CATALYSIS = Enum.forString("Catalysis");
    static final Enum STIMULATION = Enum.forString("Stimulation");
    static final Enum NECESSARY_STIMULATION = Enum.forString("NecessaryStimulation");
    static final Enum PRODUCTION_WITHOUT_LOSS = Enum.forString("ProductionWithoutLoss");
    static final Enum STOCHIOMETRIC_CONVERSION = Enum.forString("StochiometricConversion");
    static final Enum TEMPLATE_REACTION = Enum.forString("TemplateReaction");
    static final Enum COVALENT_BOND_CLEAVAGE = Enum.forString("CovalentBondCleavage");
    static final Enum INHIBITION = Enum.forString("Inhibition");
    static final Enum ABSOLUTE_INHIBITION = Enum.forString("AbsoluteInhibition");
    static final Enum STATE_COMBINATION = Enum.forString("StateCombination");
    static final Enum NEXT_FEATURE = Enum.forString("NextFeature");
    static final Enum FIRST_FEATURE = Enum.forString("FirstFeature");
    static final Enum BRANCHING_LEFT = Enum.forString("BranchingLeft");
    static final Enum BRANCHING_RIGHT = Enum.forString("BranchingRight");
    static final Enum LINE = Enum.forString("Line");
    
    static final int INT_COVALENT_MODIFICATION = Enum.INT_COVALENT_MODIFICATION;
    static final int INT_NON_COVALENT_REVERSIBLE_BINDING = Enum.INT_NON_COVALENT_REVERSIBLE_BINDING;
    static final int INT_COVALENT_IRREVERSIBLE_BINDING = Enum.INT_COVALENT_IRREVERSIBLE_BINDING;
    static final int INT_CATALYSIS = Enum.INT_CATALYSIS;
    static final int INT_STIMULATION = Enum.INT_STIMULATION;
    static final int INT_NECESSARY_STIMULATION = Enum.INT_NECESSARY_STIMULATION;
    static final int INT_PRODUCTION_WITHOUT_LOSS = Enum.INT_PRODUCTION_WITHOUT_LOSS;
    static final int INT_STOCHIOMETRIC_CONVERSION = Enum.INT_STOCHIOMETRIC_CONVERSION;
    static final int INT_TEMPLATE_REACTION = Enum.INT_TEMPLATE_REACTION;
    static final int INT_COVALENT_BOND_CLEAVAGE = Enum.INT_COVALENT_BOND_CLEAVAGE;
    static final int INT_INHIBITION = Enum.INT_INHIBITION;
    static final int INT_ABSOLUTE_INHIBITION = Enum.INT_ABSOLUTE_INHIBITION;
    static final int INT_STATE_COMBINATION = Enum.INT_STATE_COMBINATION;
    static final int INT_NEXT_FEATURE = Enum.INT_NEXT_FEATURE;
    static final int INT_FIRST_FEATURE = Enum.INT_FIRST_FEATURE;
    static final int INT_BRANCHING_LEFT = Enum.INT_BRANCHING_LEFT;
    static final int INT_BRANCHING_RIGHT = Enum.INT_BRANCHING_RIGHT;
    static final int INT_LINE = Enum.INT_LINE;
    
    /**
     * Enumeration value class for gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType.
     * These enum values can be used as follows:
     * <pre>
     * enum.toString(); // returns the string value of the enum
     * enum.intValue(); // returns an int value, useful for switches
     * // e.g., case Enum.INT_COVALENT_MODIFICATION
     * Enum.forString(s); // returns the enum value for a string
     * Enum.forInt(i); // returns the enum value for an int
     * </pre>
     * Enumeration objects are immutable singleton objects that
     * can be compared using == object equality. They have no
     * public constructor. See the constants defined within this
     * class for all the valid values.
     */
    static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
    {
        /**
         * Returns the enum value for a string, or null if none.
         */
        public static Enum forString(java.lang.String s)
            { return (Enum)table.forString(s); }
        /**
         * Returns the enum value corresponding to an int, or null if none.
         */
        public static Enum forInt(int i)
            { return (Enum)table.forInt(i); }
        
        private Enum(java.lang.String s, int i)
            { super(s, i); }
        
        static final int INT_COVALENT_MODIFICATION = 1;
        static final int INT_NON_COVALENT_REVERSIBLE_BINDING = 2;
        static final int INT_COVALENT_IRREVERSIBLE_BINDING = 3;
        static final int INT_CATALYSIS = 4;
        static final int INT_STIMULATION = 5;
        static final int INT_NECESSARY_STIMULATION = 6;
        static final int INT_PRODUCTION_WITHOUT_LOSS = 7;
        static final int INT_STOCHIOMETRIC_CONVERSION = 8;
        static final int INT_TEMPLATE_REACTION = 9;
        static final int INT_COVALENT_BOND_CLEAVAGE = 10;
        static final int INT_INHIBITION = 11;
        static final int INT_ABSOLUTE_INHIBITION = 12;
        static final int INT_STATE_COMBINATION = 13;
        static final int INT_NEXT_FEATURE = 14;
        static final int INT_FIRST_FEATURE = 15;
        static final int INT_BRANCHING_LEFT = 16;
        static final int INT_BRANCHING_RIGHT = 17;
        static final int INT_LINE = 18;
        
        public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
            new org.apache.xmlbeans.StringEnumAbstractBase.Table
        (
            new Enum[]
            {
                new Enum("CovalentModification", INT_COVALENT_MODIFICATION),
                new Enum("NonCovalentReversibleBinding", INT_NON_COVALENT_REVERSIBLE_BINDING),
                new Enum("CovalentIrreversibleBinding", INT_COVALENT_IRREVERSIBLE_BINDING),
                new Enum("Catalysis", INT_CATALYSIS),
                new Enum("Stimulation", INT_STIMULATION),
                new Enum("NecessaryStimulation", INT_NECESSARY_STIMULATION),
                new Enum("ProductionWithoutLoss", INT_PRODUCTION_WITHOUT_LOSS),
                new Enum("StochiometricConversion", INT_STOCHIOMETRIC_CONVERSION),
                new Enum("TemplateReaction", INT_TEMPLATE_REACTION),
                new Enum("CovalentBondCleavage", INT_COVALENT_BOND_CLEAVAGE),
                new Enum("Inhibition", INT_INHIBITION),
                new Enum("AbsoluteInhibition", INT_ABSOLUTE_INHIBITION),
                new Enum("StateCombination", INT_STATE_COMBINATION),
                new Enum("NextFeature", INT_NEXT_FEATURE),
                new Enum("FirstFeature", INT_FIRST_FEATURE),
                new Enum("BranchingLeft", INT_BRANCHING_LEFT),
                new Enum("BranchingRight", INT_BRANCHING_RIGHT),
                new Enum("Line", INT_LINE),
            }
        );
        private static final long serialVersionUID = 1L;
        private java.lang.Object readResolve() { return forInt(intValue()); } 
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType newValue(java.lang.Object obj) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) type.newValue( obj ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
