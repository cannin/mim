/*
 * XML Type:  PublicationXRefType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML PublicationXRefType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class PublicationXRefTypeImpl extends gov.nih.nci.lmp.mim.mimVisLevel1.impl.XRefTypeImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType
{
    private static final long serialVersionUID = 1L;
    
    public PublicationXRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "title");
    private static final javax.xml.namespace.QName AUTHOR$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "author");
    private static final javax.xml.namespace.QName YEAR$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "year");
    private static final javax.xml.namespace.QName URL$6 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "url");
    private static final javax.xml.namespace.QName PAGES$8 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "pages");
    private static final javax.xml.namespace.QName JOURNAL$10 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "journal");
    private static final javax.xml.namespace.QName VOLUME$12 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "volume");
    private static final javax.xml.namespace.QName SOURCE$14 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "source");
    
    
    /**
     * Gets the "title" element
     */
    public java.lang.String getTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "title" element
     */
    public org.apache.xmlbeans.XmlString xgetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "title" element
     */
    public boolean isSetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TITLE$0) != 0;
        }
    }
    
    /**
     * Sets the "title" element
     */
    public void setTitle(java.lang.String title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TITLE$0);
            }
            target.setStringValue(title);
        }
    }
    
    /**
     * Sets (as xml) the "title" element
     */
    public void xsetTitle(org.apache.xmlbeans.XmlString title)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(TITLE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(TITLE$0);
            }
            target.set(title);
        }
    }
    
    /**
     * Unsets the "title" element
     */
    public void unsetTitle()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TITLE$0, 0);
        }
    }
    
    /**
     * Gets a List of "author" elements
     */
    public java.util.List<java.lang.String> getAuthorList()
    {
        final class AuthorList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return PublicationXRefTypeImpl.this.getAuthorArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = PublicationXRefTypeImpl.this.getAuthorArray(i);
                PublicationXRefTypeImpl.this.setAuthorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { PublicationXRefTypeImpl.this.insertAuthor(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = PublicationXRefTypeImpl.this.getAuthorArray(i);
                PublicationXRefTypeImpl.this.removeAuthor(i);
                return old;
            }
            
            @Override
            public int size()
                { return PublicationXRefTypeImpl.this.sizeOfAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AuthorList();
        }
    }
    
    /**
     * Gets array of all "author" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(AUTHOR$2, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "author" element
     */
    public java.lang.String getAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "author" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAuthorList()
    {
        final class AuthorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return PublicationXRefTypeImpl.this.xgetAuthorArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = PublicationXRefTypeImpl.this.xgetAuthorArray(i);
                PublicationXRefTypeImpl.this.xsetAuthorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { PublicationXRefTypeImpl.this.insertNewAuthor(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = PublicationXRefTypeImpl.this.xgetAuthorArray(i);
                PublicationXRefTypeImpl.this.removeAuthor(i);
                return old;
            }
            
            @Override
            public int size()
                { return PublicationXRefTypeImpl.this.sizeOfAuthorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AuthorList();
        }
    }
    
    /**
     * Gets array of all "author" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(AUTHOR$2, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "author" element
     */
    public org.apache.xmlbeans.XmlString xgetAuthorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "author" element
     */
    public int sizeOfAuthorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(AUTHOR$2);
        }
    }
    
    /**
     * Sets array of all "author" element
     */
    public void setAuthorArray(java.lang.String[] authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$2);
        }
    }
    
    /**
     * Sets ith "author" element
     */
    public void setAuthorArray(int i, java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(author);
        }
    }
    
    /**
     * Sets (as xml) array of all "author" element
     */
    public void xsetAuthorArray(org.apache.xmlbeans.XmlString[]authorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(authorArray, AUTHOR$2);
        }
    }
    
    /**
     * Sets (as xml) ith "author" element
     */
    public void xsetAuthorArray(int i, org.apache.xmlbeans.XmlString author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(AUTHOR$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(author);
        }
    }
    
    /**
     * Inserts the value as the ith "author" element
     */
    public void insertAuthor(int i, java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(AUTHOR$2, i);
            target.setStringValue(author);
        }
    }
    
    /**
     * Appends the value as the last "author" element
     */
    public void addAuthor(java.lang.String author)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(AUTHOR$2);
            target.setStringValue(author);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "author" element
     */
    public org.apache.xmlbeans.XmlString insertNewAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(AUTHOR$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "author" element
     */
    public org.apache.xmlbeans.XmlString addNewAuthor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(AUTHOR$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "author" element
     */
    public void removeAuthor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(AUTHOR$2, i);
        }
    }
    
    /**
     * Gets the "year" element
     */
    public java.lang.String getYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "year" element
     */
    public org.apache.xmlbeans.XmlString xgetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEAR$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "year" element
     */
    public boolean isSetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(YEAR$4) != 0;
        }
    }
    
    /**
     * Sets the "year" element
     */
    public void setYear(java.lang.String year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(YEAR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(YEAR$4);
            }
            target.setStringValue(year);
        }
    }
    
    /**
     * Sets (as xml) the "year" element
     */
    public void xsetYear(org.apache.xmlbeans.XmlString year)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(YEAR$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(YEAR$4);
            }
            target.set(year);
        }
    }
    
    /**
     * Unsets the "year" element
     */
    public void unsetYear()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(YEAR$4, 0);
        }
    }
    
    /**
     * Gets the "url" element
     */
    public java.lang.String getUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "url" element
     */
    public org.apache.xmlbeans.XmlString xgetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "url" element
     */
    public boolean isSetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(URL$6) != 0;
        }
    }
    
    /**
     * Sets the "url" element
     */
    public void setUrl(java.lang.String url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(URL$6);
            }
            target.setStringValue(url);
        }
    }
    
    /**
     * Sets (as xml) the "url" element
     */
    public void xsetUrl(org.apache.xmlbeans.XmlString url)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(URL$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(URL$6);
            }
            target.set(url);
        }
    }
    
    /**
     * Unsets the "url" element
     */
    public void unsetUrl()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(URL$6, 0);
        }
    }
    
    /**
     * Gets the "pages" element
     */
    public java.lang.String getPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "pages" element
     */
    public org.apache.xmlbeans.XmlString xgetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "pages" element
     */
    public boolean isSetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PAGES$8) != 0;
        }
    }
    
    /**
     * Sets the "pages" element
     */
    public void setPages(java.lang.String pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PAGES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PAGES$8);
            }
            target.setStringValue(pages);
        }
    }
    
    /**
     * Sets (as xml) the "pages" element
     */
    public void xsetPages(org.apache.xmlbeans.XmlString pages)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(PAGES$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(PAGES$8);
            }
            target.set(pages);
        }
    }
    
    /**
     * Unsets the "pages" element
     */
    public void unsetPages()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PAGES$8, 0);
        }
    }
    
    /**
     * Gets the "journal" element
     */
    public java.lang.String getJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNAL$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "journal" element
     */
    public org.apache.xmlbeans.XmlString xgetJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOURNAL$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "journal" element
     */
    public boolean isSetJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(JOURNAL$10) != 0;
        }
    }
    
    /**
     * Sets the "journal" element
     */
    public void setJournal(java.lang.String journal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(JOURNAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(JOURNAL$10);
            }
            target.setStringValue(journal);
        }
    }
    
    /**
     * Sets (as xml) the "journal" element
     */
    public void xsetJournal(org.apache.xmlbeans.XmlString journal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(JOURNAL$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(JOURNAL$10);
            }
            target.set(journal);
        }
    }
    
    /**
     * Unsets the "journal" element
     */
    public void unsetJournal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(JOURNAL$10, 0);
        }
    }
    
    /**
     * Gets the "volume" element
     */
    public java.lang.String getVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "volume" element
     */
    public org.apache.xmlbeans.XmlString xgetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$12, 0);
            return target;
        }
    }
    
    /**
     * True if has "volume" element
     */
    public boolean isSetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(VOLUME$12) != 0;
        }
    }
    
    /**
     * Sets the "volume" element
     */
    public void setVolume(java.lang.String volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(VOLUME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(VOLUME$12);
            }
            target.setStringValue(volume);
        }
    }
    
    /**
     * Sets (as xml) the "volume" element
     */
    public void xsetVolume(org.apache.xmlbeans.XmlString volume)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(VOLUME$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(VOLUME$12);
            }
            target.set(volume);
        }
    }
    
    /**
     * Unsets the "volume" element
     */
    public void unsetVolume()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(VOLUME$12, 0);
        }
    }
    
    /**
     * Gets the "source" element
     */
    public java.lang.String getSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "source" element
     */
    public org.apache.xmlbeans.XmlString xgetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "source" element
     */
    public boolean isSetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SOURCE$14) != 0;
        }
    }
    
    /**
     * Sets the "source" element
     */
    public void setSource(java.lang.String source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$14);
            }
            target.setStringValue(source);
        }
    }
    
    /**
     * Sets (as xml) the "source" element
     */
    public void xsetSource(org.apache.xmlbeans.XmlString source)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$14);
            }
            target.set(source);
        }
    }
    
    /**
     * Unsets the "source" element
     */
    public void unsetSource()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SOURCE$14, 0);
        }
    }
}
