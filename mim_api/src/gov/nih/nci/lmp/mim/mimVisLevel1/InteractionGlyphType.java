/*
 * XML Type:  InteractionGlyphType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML InteractionGlyphType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface InteractionGlyphType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(InteractionGlyphType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("interactionglyphtype2504type");
    
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
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty> getGenericPropertyList();
    
    /**
     * Gets array of all "GenericProperty" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[] getGenericPropertyArray();
    
    /**
     * Gets ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty getGenericPropertyArray(int i);
    
    /**
     * Returns number of "GenericProperty" element
     */
    int sizeOfGenericPropertyArray();
    
    /**
     * Sets array of all "GenericProperty" element
     */
    void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[] genericPropertyArray);
    
    /**
     * Sets ith "GenericProperty" element
     */
    void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty genericProperty);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty insertNewGenericProperty(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty addNewGenericProperty();
    
    /**
     * Removes the ith "GenericProperty" element
     */
    void removeGenericProperty(int i);
    
    /**
     * Gets a List of "Point" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point> getPointList();
    
    /**
     * Gets array of all "Point" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[] getPointArray();
    
    /**
     * Gets ith "Point" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point getPointArray(int i);
    
    /**
     * Returns number of "Point" element
     */
    int sizeOfPointArray();
    
    /**
     * Sets array of all "Point" element
     */
    void setPointArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[] pointArray);
    
    /**
     * Sets ith "Point" element
     */
    void setPointArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point point);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Point" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point insertNewPoint(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Point" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point addNewPoint();
    
    /**
     * Removes the ith "Point" element
     */
    void removePoint(int i);
    
    /**
     * Gets a List of "anchorRef" elements
     */
    java.util.List<java.lang.String> getAnchorRefList();
    
    /**
     * Gets array of all "anchorRef" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getAnchorRefArray();
    
    /**
     * Gets ith "anchorRef" element
     */
    java.lang.String getAnchorRefArray(int i);
    
    /**
     * Gets (as xml) a List of "anchorRef" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetAnchorRefList();
    
    /**
     * Gets (as xml) array of all "anchorRef" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetAnchorRefArray();
    
    /**
     * Gets (as xml) ith "anchorRef" element
     */
    org.apache.xmlbeans.XmlString xgetAnchorRefArray(int i);
    
    /**
     * Returns number of "anchorRef" element
     */
    int sizeOfAnchorRefArray();
    
    /**
     * Sets array of all "anchorRef" element
     */
    void setAnchorRefArray(java.lang.String[] anchorRefArray);
    
    /**
     * Sets ith "anchorRef" element
     */
    void setAnchorRefArray(int i, java.lang.String anchorRef);
    
    /**
     * Sets (as xml) array of all "anchorRef" element
     */
    void xsetAnchorRefArray(org.apache.xmlbeans.XmlString[] anchorRefArray);
    
    /**
     * Sets (as xml) ith "anchorRef" element
     */
    void xsetAnchorRefArray(int i, org.apache.xmlbeans.XmlString anchorRef);
    
    /**
     * Inserts the value as the ith "anchorRef" element
     */
    void insertAnchorRef(int i, java.lang.String anchorRef);
    
    /**
     * Appends the value as the last "anchorRef" element
     */
    void addAnchorRef(java.lang.String anchorRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchorRef" element
     */
    org.apache.xmlbeans.XmlString insertNewAnchorRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anchorRef" element
     */
    org.apache.xmlbeans.XmlString addNewAnchorRef();
    
    /**
     * Removes the ith "anchorRef" element
     */
    void removeAnchorRef(int i);
    
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
     * Gets the "color" attribute
     */
    java.lang.String getColor();
    
    /**
     * Gets (as xml) the "color" attribute
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.ColorType xgetColor();
    
    /**
     * True if has "color" attribute
     */
    boolean isSetColor();
    
    /**
     * Sets the "color" attribute
     */
    void setColor(java.lang.String color);
    
    /**
     * Sets (as xml) the "color" attribute
     */
    void xsetColor(gov.nih.nci.lmp.mim.mimVisLevel1.ColorType color);
    
    /**
     * Unsets the "color" attribute
     */
    void unsetColor();
    
    /**
     * Gets the "groupRef" attribute
     */
    java.lang.String getGroupRef();
    
    /**
     * Gets (as xml) the "groupRef" attribute
     */
    org.apache.xmlbeans.XmlString xgetGroupRef();
    
    /**
     * True if has "groupRef" attribute
     */
    boolean isSetGroupRef();
    
    /**
     * Sets the "groupRef" attribute
     */
    void setGroupRef(java.lang.String groupRef);
    
    /**
     * Sets (as xml) the "groupRef" attribute
     */
    void xsetGroupRef(org.apache.xmlbeans.XmlString groupRef);
    
    /**
     * Unsets the "groupRef" attribute
     */
    void unsetGroupRef();
    
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public interface GenericProperty extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(GenericProperty.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("genericproperty70ecelemtype");
        
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
            public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * An XML Point(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public interface Point extends org.apache.xmlbeans.XmlObject
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Point.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("point1da8elemtype");
        
        /**
         * Gets the "x" attribute
         */
        double getX();
        
        /**
         * Gets (as xml) the "x" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetX();
        
        /**
         * Sets the "x" attribute
         */
        void setX(double x);
        
        /**
         * Sets (as xml) the "x" attribute
         */
        void xsetX(org.apache.xmlbeans.XmlDouble x);
        
        /**
         * Gets the "y" attribute
         */
        double getY();
        
        /**
         * Gets (as xml) the "y" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetY();
        
        /**
         * Sets the "y" attribute
         */
        void setY(double y);
        
        /**
         * Sets (as xml) the "y" attribute
         */
        void xsetY(org.apache.xmlbeans.XmlDouble y);
        
        /**
         * Gets the "relX" attribute
         */
        double getRelX();
        
        /**
         * Gets (as xml) the "relX" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRelX();
        
        /**
         * True if has "relX" attribute
         */
        boolean isSetRelX();
        
        /**
         * Sets the "relX" attribute
         */
        void setRelX(double relX);
        
        /**
         * Sets (as xml) the "relX" attribute
         */
        void xsetRelX(org.apache.xmlbeans.XmlDouble relX);
        
        /**
         * Unsets the "relX" attribute
         */
        void unsetRelX();
        
        /**
         * Gets the "relY" attribute
         */
        double getRelY();
        
        /**
         * Gets (as xml) the "relY" attribute
         */
        org.apache.xmlbeans.XmlDouble xgetRelY();
        
        /**
         * True if has "relY" attribute
         */
        boolean isSetRelY();
        
        /**
         * Sets the "relY" attribute
         */
        void setRelY(double relY);
        
        /**
         * Sets (as xml) the "relY" attribute
         */
        void xsetRelY(org.apache.xmlbeans.XmlDouble relY);
        
        /**
         * Unsets the "relY" attribute
         */
        void unsetRelY();
        
        /**
         * Gets the "arrowHead" attribute
         */
        gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType.Enum getArrowHead();
        
        /**
         * Gets (as xml) the "arrowHead" attribute
         */
        gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType xgetArrowHead();
        
        /**
         * True if has "arrowHead" attribute
         */
        boolean isSetArrowHead();
        
        /**
         * Sets the "arrowHead" attribute
         */
        void setArrowHead(gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType.Enum arrowHead);
        
        /**
         * Sets (as xml) the "arrowHead" attribute
         */
        void xsetArrowHead(gov.nih.nci.lmp.mim.mimVisLevel1.ArrowHeadEnumType arrowHead);
        
        /**
         * Unsets the "arrowHead" attribute
         */
        void unsetArrowHead();
        
        /**
         * Gets the "visRef" attribute
         */
        java.lang.String getVisRef();
        
        /**
         * Gets (as xml) the "visRef" attribute
         */
        org.apache.xmlbeans.XmlString xgetVisRef();
        
        /**
         * True if has "visRef" attribute
         */
        boolean isSetVisRef();
        
        /**
         * Sets the "visRef" attribute
         */
        void setVisRef(java.lang.String visRef);
        
        /**
         * Sets (as xml) the "visRef" attribute
         */
        void xsetVisRef(org.apache.xmlbeans.XmlString visRef);
        
        /**
         * Unsets the "visRef" attribute
         */
        void unsetVisRef();
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point newInstance() {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
