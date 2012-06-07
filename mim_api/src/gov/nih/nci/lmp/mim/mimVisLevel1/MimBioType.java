/*
 * XML Type:  MimBioType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML MimBioType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface MimBioType extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(MimBioType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s9A8540D1A1572E107109C11FF48E20A6").resolveHandle("mimbiotype1781type");
    
    /**
     * Gets the "title" element
     */
    java.lang.String getTitle();
    
    /**
     * Gets (as xml) the "title" element
     */
    org.apache.xmlbeans.XmlString xgetTitle();
    
    /**
     * True if has "title" element
     */
    boolean isSetTitle();
    
    /**
     * Sets the "title" element
     */
    void setTitle(java.lang.String title);
    
    /**
     * Sets (as xml) the "title" element
     */
    void xsetTitle(org.apache.xmlbeans.XmlString title);
    
    /**
     * Unsets the "title" element
     */
    void unsetTitle();
    
    /**
     * Gets the "identifier" element
     */
    java.lang.String getIdentifier();
    
    /**
     * Gets (as xml) the "identifier" element
     */
    org.apache.xmlbeans.XmlString xgetIdentifier();
    
    /**
     * True if has "identifier" element
     */
    boolean isSetIdentifier();
    
    /**
     * Sets the "identifier" element
     */
    void setIdentifier(java.lang.String identifier);
    
    /**
     * Sets (as xml) the "identifier" element
     */
    void xsetIdentifier(org.apache.xmlbeans.XmlString identifier);
    
    /**
     * Unsets the "identifier" element
     */
    void unsetIdentifier();
    
    /**
     * Gets a List of "creator" elements
     */
    java.util.List<java.lang.String> getCreatorList();
    
    /**
     * Gets array of all "creator" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getCreatorArray();
    
    /**
     * Gets ith "creator" element
     */
    java.lang.String getCreatorArray(int i);
    
    /**
     * Gets (as xml) a List of "creator" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetCreatorList();
    
    /**
     * Gets (as xml) array of all "creator" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetCreatorArray();
    
    /**
     * Gets (as xml) ith "creator" element
     */
    org.apache.xmlbeans.XmlString xgetCreatorArray(int i);
    
    /**
     * Returns number of "creator" element
     */
    int sizeOfCreatorArray();
    
    /**
     * Sets array of all "creator" element
     */
    void setCreatorArray(java.lang.String[] creatorArray);
    
    /**
     * Sets ith "creator" element
     */
    void setCreatorArray(int i, java.lang.String creator);
    
    /**
     * Sets (as xml) array of all "creator" element
     */
    void xsetCreatorArray(org.apache.xmlbeans.XmlString[] creatorArray);
    
    /**
     * Sets (as xml) ith "creator" element
     */
    void xsetCreatorArray(int i, org.apache.xmlbeans.XmlString creator);
    
    /**
     * Inserts the value as the ith "creator" element
     */
    void insertCreator(int i, java.lang.String creator);
    
    /**
     * Appends the value as the last "creator" element
     */
    void addCreator(java.lang.String creator);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "creator" element
     */
    org.apache.xmlbeans.XmlString insertNewCreator(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "creator" element
     */
    org.apache.xmlbeans.XmlString addNewCreator();
    
    /**
     * Removes the ith "creator" element
     */
    void removeCreator(int i);
    
    /**
     * Gets a List of "contributor" elements
     */
    java.util.List<java.lang.String> getContributorList();
    
    /**
     * Gets array of all "contributor" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getContributorArray();
    
    /**
     * Gets ith "contributor" element
     */
    java.lang.String getContributorArray(int i);
    
    /**
     * Gets (as xml) a List of "contributor" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetContributorList();
    
    /**
     * Gets (as xml) array of all "contributor" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetContributorArray();
    
    /**
     * Gets (as xml) ith "contributor" element
     */
    org.apache.xmlbeans.XmlString xgetContributorArray(int i);
    
    /**
     * Returns number of "contributor" element
     */
    int sizeOfContributorArray();
    
    /**
     * Sets array of all "contributor" element
     */
    void setContributorArray(java.lang.String[] contributorArray);
    
    /**
     * Sets ith "contributor" element
     */
    void setContributorArray(int i, java.lang.String contributor);
    
    /**
     * Sets (as xml) array of all "contributor" element
     */
    void xsetContributorArray(org.apache.xmlbeans.XmlString[] contributorArray);
    
    /**
     * Sets (as xml) ith "contributor" element
     */
    void xsetContributorArray(int i, org.apache.xmlbeans.XmlString contributor);
    
    /**
     * Inserts the value as the ith "contributor" element
     */
    void insertContributor(int i, java.lang.String contributor);
    
    /**
     * Appends the value as the last "contributor" element
     */
    void addContributor(java.lang.String contributor);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    org.apache.xmlbeans.XmlString insertNewContributor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    org.apache.xmlbeans.XmlString addNewContributor();
    
    /**
     * Removes the ith "contributor" element
     */
    void removeContributor(int i);
    
    /**
     * Gets the "description" element
     */
    java.lang.String getDescription();
    
    /**
     * Gets (as xml) the "description" element
     */
    org.apache.xmlbeans.XmlString xgetDescription();
    
    /**
     * True if has "description" element
     */
    boolean isSetDescription();
    
    /**
     * Sets the "description" element
     */
    void setDescription(java.lang.String description);
    
    /**
     * Sets (as xml) the "description" element
     */
    void xsetDescription(org.apache.xmlbeans.XmlString description);
    
    /**
     * Unsets the "description" element
     */
    void unsetDescription();
    
    /**
     * Gets the "rights" element
     */
    java.lang.String getRights();
    
    /**
     * Gets (as xml) the "rights" element
     */
    org.apache.xmlbeans.XmlString xgetRights();
    
    /**
     * True if has "rights" element
     */
    boolean isSetRights();
    
    /**
     * Sets the "rights" element
     */
    void setRights(java.lang.String rights);
    
    /**
     * Sets (as xml) the "rights" element
     */
    void xsetRights(org.apache.xmlbeans.XmlString rights);
    
    /**
     * Unsets the "rights" element
     */
    void unsetRights();
    
    /**
     * Gets the "source" element
     */
    java.lang.String getSource();
    
    /**
     * Gets (as xml) the "source" element
     */
    org.apache.xmlbeans.XmlString xgetSource();
    
    /**
     * True if has "source" element
     */
    boolean isSetSource();
    
    /**
     * Sets the "source" element
     */
    void setSource(java.lang.String source);
    
    /**
     * Sets (as xml) the "source" element
     */
    void xsetSource(org.apache.xmlbeans.XmlString source);
    
    /**
     * Unsets the "source" element
     */
    void unsetSource();
    
    /**
     * Gets the "modified" element
     */
    java.util.Calendar getModified();
    
    /**
     * Gets (as xml) the "modified" element
     */
    org.apache.xmlbeans.XmlDate xgetModified();
    
    /**
     * True if has "modified" element
     */
    boolean isSetModified();
    
    /**
     * Sets the "modified" element
     */
    void setModified(java.util.Calendar modified);
    
    /**
     * Sets (as xml) the "modified" element
     */
    void xsetModified(org.apache.xmlbeans.XmlDate modified);
    
    /**
     * Unsets the "modified" element
     */
    void unsetModified();
    
    /**
     * Gets a List of "PublicationXRef" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType> getPublicationXRefList();
    
    /**
     * Gets array of all "PublicationXRef" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[] getPublicationXRefArray();
    
    /**
     * Gets ith "PublicationXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType getPublicationXRefArray(int i);
    
    /**
     * Returns number of "PublicationXRef" element
     */
    int sizeOfPublicationXRefArray();
    
    /**
     * Sets array of all "PublicationXRef" element
     */
    void setPublicationXRefArray(gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[] publicationXRefArray);
    
    /**
     * Sets ith "PublicationXRef" element
     */
    void setPublicationXRefArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType publicationXRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublicationXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType insertNewPublicationXRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublicationXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType addNewPublicationXRef();
    
    /**
     * Removes the ith "PublicationXRef" element
     */
    void removePublicationXRef(int i);
    
    /**
     * Gets a List of "RelationshipXRef" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType> getRelationshipXRefList();
    
    /**
     * Gets array of all "RelationshipXRef" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[] getRelationshipXRefArray();
    
    /**
     * Gets ith "RelationshipXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType getRelationshipXRefArray(int i);
    
    /**
     * Returns number of "RelationshipXRef" element
     */
    int sizeOfRelationshipXRefArray();
    
    /**
     * Sets array of all "RelationshipXRef" element
     */
    void setRelationshipXRefArray(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[] relationshipXRefArray);
    
    /**
     * Sets ith "RelationshipXRef" element
     */
    void setRelationshipXRefArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType relationshipXRef);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType insertNewRelationshipXRef(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipXRef" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType addNewRelationshipXRef();
    
    /**
     * Removes the ith "RelationshipXRef" element
     */
    void removeRelationshipXRef(int i);
    
    /**
     * Gets a List of "EntityControlledVocabulary" elements
     */
    java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType> getEntityControlledVocabularyList();
    
    /**
     * Gets array of all "EntityControlledVocabulary" elements
     * @deprecated
     */
    @Deprecated
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[] getEntityControlledVocabularyArray();
    
    /**
     * Gets ith "EntityControlledVocabulary" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType getEntityControlledVocabularyArray(int i);
    
    /**
     * Returns number of "EntityControlledVocabulary" element
     */
    int sizeOfEntityControlledVocabularyArray();
    
    /**
     * Sets array of all "EntityControlledVocabulary" element
     */
    void setEntityControlledVocabularyArray(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[] entityControlledVocabularyArray);
    
    /**
     * Sets ith "EntityControlledVocabulary" element
     */
    void setEntityControlledVocabularyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType entityControlledVocabulary);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityControlledVocabulary" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType insertNewEntityControlledVocabulary(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityControlledVocabulary" element
     */
    gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType addNewEntityControlledVocabulary();
    
    /**
     * Removes the ith "EntityControlledVocabulary" element
     */
    void removeEntityControlledVocabulary(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
