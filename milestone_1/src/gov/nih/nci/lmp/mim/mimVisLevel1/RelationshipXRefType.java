/*
 * XML Type:  RelationshipXRefType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML RelationshipXRefType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface RelationshipXRefType extends gov.nih.nci.lmp.mim.mimVisLevel1.XRefType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(RelationshipXRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("relationshipxreftypee09dtype");
    
    /**
     * Gets the "type" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type type);
    
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("typef403attrtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum IS = Enum.forString("is");
        static final Enum IS_PART_OF = Enum.forString("isPartOf");
        static final Enum HAS_PART = Enum.forString("hasPart");
        static final Enum IS_ISOMER_OF = Enum.forString("isIsomerOf");
        static final Enum IS_HOMOLOG_TO = Enum.forString("isHomologTo");
        static final Enum ENCODES = Enum.forString("encodes");
        static final Enum IS_ENCODED_BY = Enum.forString("isEncodedBy");
        static final Enum HAS_VERSION = Enum.forString("hasVersion");
        static final Enum IS_VERSION_OF = Enum.forString("isVersionOf");
        static final Enum OCCURS_IN = Enum.forString("occursIn");
        static final Enum IS_DESCRIBED_BY = Enum.forString("isDescribedBy");
        static final Enum OTHER = Enum.forString("other");
        
        static final int INT_IS = Enum.INT_IS;
        static final int INT_IS_PART_OF = Enum.INT_IS_PART_OF;
        static final int INT_HAS_PART = Enum.INT_HAS_PART;
        static final int INT_IS_ISOMER_OF = Enum.INT_IS_ISOMER_OF;
        static final int INT_IS_HOMOLOG_TO = Enum.INT_IS_HOMOLOG_TO;
        static final int INT_ENCODES = Enum.INT_ENCODES;
        static final int INT_IS_ENCODED_BY = Enum.INT_IS_ENCODED_BY;
        static final int INT_HAS_VERSION = Enum.INT_HAS_VERSION;
        static final int INT_IS_VERSION_OF = Enum.INT_IS_VERSION_OF;
        static final int INT_OCCURS_IN = Enum.INT_OCCURS_IN;
        static final int INT_IS_DESCRIBED_BY = Enum.INT_IS_DESCRIBED_BY;
        static final int INT_OTHER = Enum.INT_OTHER;
        
        /**
         * Enumeration value class for gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_IS
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
            
            static final int INT_IS = 1;
            static final int INT_IS_PART_OF = 2;
            static final int INT_HAS_PART = 3;
            static final int INT_IS_ISOMER_OF = 4;
            static final int INT_IS_HOMOLOG_TO = 5;
            static final int INT_ENCODES = 6;
            static final int INT_IS_ENCODED_BY = 7;
            static final int INT_HAS_VERSION = 8;
            static final int INT_IS_VERSION_OF = 9;
            static final int INT_OCCURS_IN = 10;
            static final int INT_IS_DESCRIBED_BY = 11;
            static final int INT_OTHER = 12;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("is", INT_IS),
                    new Enum("isPartOf", INT_IS_PART_OF),
                    new Enum("hasPart", INT_HAS_PART),
                    new Enum("isIsomerOf", INT_IS_ISOMER_OF),
                    new Enum("isHomologTo", INT_IS_HOMOLOG_TO),
                    new Enum("encodes", INT_ENCODES),
                    new Enum("isEncodedBy", INT_IS_ENCODED_BY),
                    new Enum("hasVersion", INT_HAS_VERSION),
                    new Enum("isVersionOf", INT_IS_VERSION_OF),
                    new Enum("occursIn", INT_OCCURS_IN),
                    new Enum("isDescribedBy", INT_IS_DESCRIBED_BY),
                    new Enum("other", INT_OTHER),
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
            public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type newValue(java.lang.Object obj) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type) type.newValue( obj ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
