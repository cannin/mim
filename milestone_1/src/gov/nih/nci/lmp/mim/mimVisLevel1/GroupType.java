/*
 * XML Type:  GroupType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.GroupType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML GroupType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface GroupType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GroupType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("grouptype8f57type");
    
    /**
     * Gets a List of "Comment" elements
     */
    java.util.List<java.lang.String> getCommentList();
    
    /**
     * Gets array of all "Comment" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getCommentArray();
    
    /**
     * Gets ith "Comment" element
     */
    java.lang.String getCommentArray(int i);
    
    /**
     * Gets (as xml) a List of "Comment" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetCommentList();
    
    /**
     * Gets (as xml) array of all "Comment" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetCommentArray();
    
    /**
     * Gets (as xml) ith "Comment" element
     */
    org.apache.xmlbeans.XmlString xgetCommentArray(int i);
    
    /**
     * Returns number of "Comment" element
     */
    int sizeOfCommentArray();
    
    /**
     * Sets array of all "Comment" element
     */
    void setCommentArray(java.lang.String[] commentArray);
    
    /**
     * Sets ith "Comment" element
     */
    void setCommentArray(int i, java.lang.String comment);
    
    /**
     * Sets (as xml) array of all "Comment" element
     */
    void xsetCommentArray(org.apache.xmlbeans.XmlString[] commentArray);
    
    /**
     * Sets (as xml) ith "Comment" element
     */
    void xsetCommentArray(int i, org.apache.xmlbeans.XmlString comment);
    
    /**
     * Inserts the value as the ith "Comment" element
     */
    void insertComment(int i, java.lang.String comment);
    
    /**
     * Appends the value as the last "Comment" element
     */
    void addComment(java.lang.String comment);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comment" element
     */
    org.apache.xmlbeans.XmlString insertNewComment(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Comment" element
     */
    org.apache.xmlbeans.XmlString addNewComment();
    
    /**
     * Removes the ith "Comment" element
     */
    void removeComment(int i);
    
    /**
     * Gets a List of "GenericProperty" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty> getGenericPropertyList();
    
    /**
     * Gets array of all "GenericProperty" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[] getGenericPropertyArray();
    
    /**
     * Gets ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty getGenericPropertyArray(int i);
    
    /**
     * Returns number of "GenericProperty" element
     */
    int sizeOfGenericPropertyArray();
    
    /**
     * Sets array of all "GenericProperty" element
     */
    void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[] genericPropertyArray);
    
    /**
     * Sets ith "GenericProperty" element
     */
    void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty genericProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty insertNewGenericProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty addNewGenericProperty();
    
    /**
     * Removes the ith "GenericProperty" element
     */
    void removeGenericProperty(int i);
    
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
     * Gets the "type" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType.Enum getType();
    
    /**
     * Gets (as xml) the "type" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType xgetType();
    
    /**
     * True if has "type" attribute
     */
    boolean isSetType();
    
    /**
     * Sets the "type" attribute
     */
    void setType(gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType.Enum type);
    
    /**
     * Sets (as xml) the "type" attribute
     */
    void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType type);
    
    /**
     * Unsets the "type" attribute
     */
    void unsetType();
    
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public interface GenericProperty extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenericProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("genericpropertya46felemtype");
        
        /**
         * Gets the "key" attribute
         */
        java.lang.String getKey();
        
        /**
         * Gets (as xml) the "key" attribute
         */
        org.apache.xmlbeans.XmlString xgetKey();
        
        /**
         * Sets the "key" attribute
         */
        void setKey(java.lang.String key);
        
        /**
         * Sets (as xml) the "key" attribute
         */
        void xsetKey(org.apache.xmlbeans.XmlString key);
        
        /**
         * Gets the "value" attribute
         */
        java.lang.String getValue();
        
        /**
         * Gets (as xml) the "value" attribute
         */
        org.apache.xmlbeans.XmlString xgetValue();
        
        /**
         * Sets the "value" attribute
         */
        void setValue(java.lang.String value);
        
        /**
         * Sets (as xml) the "value" attribute
         */
        void xsetValue(org.apache.xmlbeans.XmlString value);
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.GroupType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
