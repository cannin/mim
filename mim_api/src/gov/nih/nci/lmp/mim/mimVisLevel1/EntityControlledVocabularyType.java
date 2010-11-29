/*
 * XML Type:  EntityControlledVocabularyType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML EntityControlledVocabularyType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface EntityControlledVocabularyType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(EntityControlledVocabularyType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("entitycontrolledvocabularytype77a1type");
    
    /**
     * Gets the "type" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type.Enum getType();
    
    /**
     * Gets (as xml) the "type" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type xgetType();
    
    /**
     * True if has "type" element
     */
    boolean isSetType();
    
    /**
     * Sets the "type" element
     */
    void setType(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type.Enum type);
    
    /**
     * Sets (as xml) the "type" element
     */
    void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type type);
    
    /**
     * Unsets the "type" element
     */
    void unsetType();
    
    /**
     * Gets the "visId" attribute
     */
    java.lang.String getVisId();
    
    /**
     * Gets (as xml) the "visId" attribute
     */
    org.apache.xmlbeans.XmlString xgetVisId();
    
    /**
     * Sets the "visId" attribute
     */
    void setVisId(java.lang.String visId);
    
    /**
     * Sets (as xml) the "visId" attribute
     */
    void xsetVisId(org.apache.xmlbeans.XmlString visId);
    
    /**
     * An XML type(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is an atomic type that is a restriction of gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType$Type.
     */
    public interface Type extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Type.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("type8c8belemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum COMPLEX = Enum.forString("Complex");
        static final Enum RNA = Enum.forString("RNA");
        static final Enum RNA_REGION = Enum.forString("RNARegion");
        static final Enum DNA = Enum.forString("DNA");
        static final Enum DNA_REGION = Enum.forString("DNARegion");
        static final Enum PROTEIN = Enum.forString("Protein");
        static final Enum SMALL_MOLECULE = Enum.forString("SmallMolecule");
        
        static final int INT_COMPLEX = Enum.INT_COMPLEX;
        static final int INT_RNA = Enum.INT_RNA;
        static final int INT_RNA_REGION = Enum.INT_RNA_REGION;
        static final int INT_DNA = Enum.INT_DNA;
        static final int INT_DNA_REGION = Enum.INT_DNA_REGION;
        static final int INT_PROTEIN = Enum.INT_PROTEIN;
        static final int INT_SMALL_MOLECULE = Enum.INT_SMALL_MOLECULE;
        
        /**
         * Enumeration value class for gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType$Type.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_COMPLEX
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
            
            static final int INT_COMPLEX = 1;
            static final int INT_RNA = 2;
            static final int INT_RNA_REGION = 3;
            static final int INT_DNA = 4;
            static final int INT_DNA_REGION = 5;
            static final int INT_PROTEIN = 6;
            static final int INT_SMALL_MOLECULE = 7;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("Complex", INT_COMPLEX),
                    new Enum("RNA", INT_RNA),
                    new Enum("RNARegion", INT_RNA_REGION),
                    new Enum("DNA", INT_DNA),
                    new Enum("DNARegion", INT_DNA_REGION),
                    new Enum("Protein", INT_PROTEIN),
                    new Enum("SmallMolecule", INT_SMALL_MOLECULE),
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
            public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type newValue(java.lang.Object obj) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type) type.newValue( obj ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
