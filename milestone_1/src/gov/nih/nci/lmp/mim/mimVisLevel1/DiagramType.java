/*
 * XML Type:  DiagramType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML DiagramType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface DiagramType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(DiagramType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("diagramtype11ebtype");
    
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
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty> getGenericPropertyList();
    
    /**
     * Gets array of all "GenericProperty" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[] getGenericPropertyArray();
    
    /**
     * Gets ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty getGenericPropertyArray(int i);
    
    /**
     * Returns number of "GenericProperty" element
     */
    int sizeOfGenericPropertyArray();
    
    /**
     * Sets array of all "GenericProperty" element
     */
    void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[] genericPropertyArray);
    
    /**
     * Sets ith "GenericProperty" element
     */
    void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty genericProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty insertNewGenericProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty addNewGenericProperty();
    
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
     * Gets a List of "EntityGlyph" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType> getEntityGlyphList();
    
    /**
     * Gets array of all "EntityGlyph" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[] getEntityGlyphArray();
    
    /**
     * Gets ith "EntityGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType getEntityGlyphArray(int i);
    
    /**
     * Returns number of "EntityGlyph" element
     */
    int sizeOfEntityGlyphArray();
    
    /**
     * Sets array of all "EntityGlyph" element
     */
    void setEntityGlyphArray(gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[] entityGlyphArray);
    
    /**
     * Sets ith "EntityGlyph" element
     */
    void setEntityGlyphArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType entityGlyph);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType insertNewEntityGlyph(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType addNewEntityGlyph();
    
    /**
     * Removes the ith "EntityGlyph" element
     */
    void removeEntityGlyph(int i);
    
    /**
     * Gets a List of "InteractionGlyph" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType> getInteractionGlyphList();
    
    /**
     * Gets array of all "InteractionGlyph" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[] getInteractionGlyphArray();
    
    /**
     * Gets ith "InteractionGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType getInteractionGlyphArray(int i);
    
    /**
     * Returns number of "InteractionGlyph" element
     */
    int sizeOfInteractionGlyphArray();
    
    /**
     * Sets array of all "InteractionGlyph" element
     */
    void setInteractionGlyphArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[] interactionGlyphArray);
    
    /**
     * Sets ith "InteractionGlyph" element
     */
    void setInteractionGlyphArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType interactionGlyph);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InteractionGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType insertNewInteractionGlyph(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InteractionGlyph" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType addNewInteractionGlyph();
    
    /**
     * Removes the ith "InteractionGlyph" element
     */
    void removeInteractionGlyph(int i);
    
    /**
     * Gets a List of "Group" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType> getGroupList();
    
    /**
     * Gets array of all "Group" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[] getGroupArray();
    
    /**
     * Gets ith "Group" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType getGroupArray(int i);
    
    /**
     * Returns number of "Group" element
     */
    int sizeOfGroupArray();
    
    /**
     * Sets array of all "Group" element
     */
    void setGroupArray(gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[] groupArray);
    
    /**
     * Sets ith "Group" element
     */
    void setGroupArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType group);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType insertNewGroup(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.GroupType addNewGroup();
    
    /**
     * Removes the ith "Group" element
     */
    void removeGroup(int i);
    
    /**
     * Gets a List of "Anchor" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType> getAnchorList();
    
    /**
     * Gets array of all "Anchor" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[] getAnchorArray();
    
    /**
     * Gets ith "Anchor" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType getAnchorArray(int i);
    
    /**
     * Returns number of "Anchor" element
     */
    int sizeOfAnchorArray();
    
    /**
     * Sets array of all "Anchor" element
     */
    void setAnchorArray(gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[] anchorArray);
    
    /**
     * Sets ith "Anchor" element
     */
    void setAnchorArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType anchor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Anchor" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType insertNewAnchor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Anchor" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType addNewAnchor();
    
    /**
     * Removes the ith "Anchor" element
     */
    void removeAnchor(int i);
    
    /**
     * Gets the "MimBio" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType getMimBio();
    
    /**
     * True if has "MimBio" element
     */
    boolean isSetMimBio();
    
    /**
     * Sets the "MimBio" element
     */
    void setMimBio(gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType mimBio);
    
    /**
     * Appends and returns a new empty "MimBio" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType addNewMimBio();
    
    /**
     * Unsets the "MimBio" element
     */
    void unsetMimBio();
    
    /**
     * Gets the "width" attribute
     */
    double getWidth();
    
    /**
     * Gets (as xml) the "width" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType xgetWidth();
    
    /**
     * Sets the "width" attribute
     */
    void setWidth(double width);
    
    /**
     * Sets (as xml) the "width" attribute
     */
    void xsetWidth(gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType width);
    
    /**
     * Gets the "height" attribute
     */
    double getHeight();
    
    /**
     * Gets (as xml) the "height" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType xgetHeight();
    
    /**
     * Sets the "height" attribute
     */
    void setHeight(double height);
    
    /**
     * Sets (as xml) the "height" attribute
     */
    void xsetHeight(gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType height);
    
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public interface GenericProperty extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenericProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("genericproperty4103elemtype");
        
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
            public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
