/*
 * XML Type:  AnchorGlyphType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML AnchorGlyphType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface AnchorGlyphType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(AnchorGlyphType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A8540D1A1572E107109C11FF48E20A6").resolveHandle("anchorglyphtype0f0ftype");
    
    /**
     * Gets a List of "mimBioRef" elements
     */
    java.util.List<java.lang.String> getMimBioRefList();
    
    /**
     * Gets array of all "mimBioRef" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getMimBioRefArray();
    
    /**
     * Gets ith "mimBioRef" element
     */
    java.lang.String getMimBioRefArray(int i);
    
    /**
     * Gets (as xml) a List of "mimBioRef" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetMimBioRefList();
    
    /**
     * Gets (as xml) array of all "mimBioRef" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetMimBioRefArray();
    
    /**
     * Gets (as xml) ith "mimBioRef" element
     */
    org.apache.xmlbeans.XmlString xgetMimBioRefArray(int i);
    
    /**
     * Returns number of "mimBioRef" element
     */
    int sizeOfMimBioRefArray();
    
    /**
     * Sets array of all "mimBioRef" element
     */
    void setMimBioRefArray(java.lang.String[] mimBioRefArray);
    
    /**
     * Sets ith "mimBioRef" element
     */
    void setMimBioRefArray(int i, java.lang.String mimBioRef);
    
    /**
     * Sets (as xml) array of all "mimBioRef" element
     */
    void xsetMimBioRefArray(org.apache.xmlbeans.XmlString[] mimBioRefArray);
    
    /**
     * Sets (as xml) ith "mimBioRef" element
     */
    void xsetMimBioRefArray(int i, org.apache.xmlbeans.XmlString mimBioRef);
    
    /**
     * Inserts the value as the ith "mimBioRef" element
     */
    void insertMimBioRef(int i, java.lang.String mimBioRef);
    
    /**
     * Appends the value as the last "mimBioRef" element
     */
    void addMimBioRef(java.lang.String mimBioRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mimBioRef" element
     */
    org.apache.xmlbeans.XmlString insertNewMimBioRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mimBioRef" element
     */
    org.apache.xmlbeans.XmlString addNewMimBioRef();
    
    /**
     * Removes the ith "mimBioRef" element
     */
    void removeMimBioRef(int i);
    
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
     * Gets the "position" attribute
     */
    double getPosition();
    
    /**
     * Gets (as xml) the "position" attribute
     */
    org.apache.xmlbeans.XmlDouble xgetPosition();
    
    /**
     * Sets the "position" attribute
     */
    void setPosition(double position);
    
    /**
     * Sets (as xml) the "position" attribute
     */
    void xsetPosition(org.apache.xmlbeans.XmlDouble position);
    
    /**
     * Gets the "type" attribute
     */
    java.lang.String getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    org.apache.xmlbeans.XmlString xgetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(java.lang.String type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(org.apache.xmlbeans.XmlString type);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
