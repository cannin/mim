/*
 * XML Type:  PublicationXRefType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1;


/**
 * An XML PublicationXRefType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public interface PublicationXRefType extends gov.nih.nci.lmp.mim.mimVisLevel1.XRefType
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(PublicationXRefType.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s4964F7551A6A586059F075CAABFFF94D").resolveHandle("publicationxreftypee95ftype");
    
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
     * Gets a List of "author" elements
     */
    java.util.List<java.lang.String> getAuthorList();
    
    /**
     * Gets array of all "author" elements
     * @deprecated
     */
    @Deprecated
    java.lang.String[] getAuthorArray();
    
    /**
     * Gets ith "author" element
     */
    java.lang.String getAuthorArray(int i);
    
    /**
     * Gets (as xml) a List of "author" elements
     */
    java.util.List<org.apache.xmlbeans.XmlString> xgetAuthorList();
    
    /**
     * Gets (as xml) array of all "author" elements
     * @deprecated
     */
    @Deprecated
    org.apache.xmlbeans.XmlString[] xgetAuthorArray();
    
    /**
     * Gets (as xml) ith "author" element
     */
    org.apache.xmlbeans.XmlString xgetAuthorArray(int i);
    
    /**
     * Returns number of "author" element
     */
    int sizeOfAuthorArray();
    
    /**
     * Sets array of all "author" element
     */
    void setAuthorArray(java.lang.String[] authorArray);
    
    /**
     * Sets ith "author" element
     */
    void setAuthorArray(int i, java.lang.String author);
    
    /**
     * Sets (as xml) array of all "author" element
     */
    void xsetAuthorArray(org.apache.xmlbeans.XmlString[] authorArray);
    
    /**
     * Sets (as xml) ith "author" element
     */
    void xsetAuthorArray(int i, org.apache.xmlbeans.XmlString author);
    
    /**
     * Inserts the value as the ith "author" element
     */
    void insertAuthor(int i, java.lang.String author);
    
    /**
     * Appends the value as the last "author" element
     */
    void addAuthor(java.lang.String author);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    org.apache.xmlbeans.XmlString insertNewAuthor(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    org.apache.xmlbeans.XmlString addNewAuthor();
    
    /**
     * Removes the ith "author" element
     */
    void removeAuthor(int i);
    
    /**
     * Gets the "year" element
     */
    java.lang.String getYear();
    
    /**
     * Gets (as xml) the "year" element
     */
    org.apache.xmlbeans.XmlString xgetYear();
    
    /**
     * True if has "year" element
     */
    boolean isSetYear();
    
    /**
     * Sets the "year" element
     */
    void setYear(java.lang.String year);
    
    /**
     * Sets (as xml) the "year" element
     */
    void xsetYear(org.apache.xmlbeans.XmlString year);
    
    /**
     * Unsets the "year" element
     */
    void unsetYear();
    
    /**
     * Gets the "url" element
     */
    java.lang.String getUrl();
    
    /**
     * Gets (as xml) the "url" element
     */
    org.apache.xmlbeans.XmlString xgetUrl();
    
    /**
     * True if has "url" element
     */
    boolean isSetUrl();
    
    /**
     * Sets the "url" element
     */
    void setUrl(java.lang.String url);
    
    /**
     * Sets (as xml) the "url" element
     */
    void xsetUrl(org.apache.xmlbeans.XmlString url);
    
    /**
     * Unsets the "url" element
     */
    void unsetUrl();
    
    /**
     * Gets the "pages" element
     */
    java.lang.String getPages();
    
    /**
     * Gets (as xml) the "pages" element
     */
    org.apache.xmlbeans.XmlString xgetPages();
    
    /**
     * True if has "pages" element
     */
    boolean isSetPages();
    
    /**
     * Sets the "pages" element
     */
    void setPages(java.lang.String pages);
    
    /**
     * Sets (as xml) the "pages" element
     */
    void xsetPages(org.apache.xmlbeans.XmlString pages);
    
    /**
     * Unsets the "pages" element
     */
    void unsetPages();
    
    /**
     * Gets the "journal" element
     */
    java.lang.String getJournal();
    
    /**
     * Gets (as xml) the "journal" element
     */
    org.apache.xmlbeans.XmlString xgetJournal();
    
    /**
     * True if has "journal" element
     */
    boolean isSetJournal();
    
    /**
     * Sets the "journal" element
     */
    void setJournal(java.lang.String journal);
    
    /**
     * Sets (as xml) the "journal" element
     */
    void xsetJournal(org.apache.xmlbeans.XmlString journal);
    
    /**
     * Unsets the "journal" element
     */
    void unsetJournal();
    
    /**
     * Gets the "volume" element
     */
    java.lang.String getVolume();
    
    /**
     * Gets (as xml) the "volume" element
     */
    org.apache.xmlbeans.XmlString xgetVolume();
    
    /**
     * True if has "volume" element
     */
    boolean isSetVolume();
    
    /**
     * Sets the "volume" element
     */
    void setVolume(java.lang.String volume);
    
    /**
     * Sets (as xml) the "volume" element
     */
    void xsetVolume(org.apache.xmlbeans.XmlString volume);
    
    /**
     * Unsets the "volume" element
     */
    void unsetVolume();
    
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
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType newInstance() {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        @Deprecated
        public static gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
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
