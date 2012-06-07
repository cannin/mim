/*
 * XML Type:  MimBioType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML MimBioType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class MimBioTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType
{
    private static final long serialVersionUID = 1L;
    
    public MimBioTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TITLE$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "title");
    private static final javax.xml.namespace.QName IDENTIFIER$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "identifier");
    private static final javax.xml.namespace.QName CREATOR$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "creator");
    private static final javax.xml.namespace.QName CONTRIBUTOR$6 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "contributor");
    private static final javax.xml.namespace.QName DESCRIPTION$8 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "description");
    private static final javax.xml.namespace.QName RIGHTS$10 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "rights");
    private static final javax.xml.namespace.QName SOURCE$12 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "source");
    private static final javax.xml.namespace.QName MODIFIED$14 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "modified");
    private static final javax.xml.namespace.QName PUBLICATIONXREF$16 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "PublicationXRef");
    private static final javax.xml.namespace.QName RELATIONSHIPXREF$18 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "RelationshipXRef");
    private static final javax.xml.namespace.QName ENTITYCONTROLLEDVOCABULARY$20 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "EntityControlledVocabulary");
    
    
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
     * Gets the "identifier" element
     */
    public java.lang.String getIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "identifier" element
     */
    public org.apache.xmlbeans.XmlString xgetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "identifier" element
     */
    public boolean isSetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDENTIFIER$2) != 0;
        }
    }
    
    /**
     * Sets the "identifier" element
     */
    public void setIdentifier(java.lang.String identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDENTIFIER$2);
            }
            target.setStringValue(identifier);
        }
    }
    
    /**
     * Sets (as xml) the "identifier" element
     */
    public void xsetIdentifier(org.apache.xmlbeans.XmlString identifier)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDENTIFIER$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDENTIFIER$2);
            }
            target.set(identifier);
        }
    }
    
    /**
     * Unsets the "identifier" element
     */
    public void unsetIdentifier()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDENTIFIER$2, 0);
        }
    }
    
    /**
     * Gets a List of "creator" elements
     */
    public java.util.List<java.lang.String> getCreatorList()
    {
        final class CreatorList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return MimBioTypeImpl.this.getCreatorArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = MimBioTypeImpl.this.getCreatorArray(i);
                MimBioTypeImpl.this.setCreatorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { MimBioTypeImpl.this.insertCreator(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = MimBioTypeImpl.this.getCreatorArray(i);
                MimBioTypeImpl.this.removeCreator(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfCreatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CreatorList();
        }
    }
    
    /**
     * Gets array of all "creator" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getCreatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CREATOR$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "creator" element
     */
    public java.lang.String getCreatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "creator" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetCreatorList()
    {
        final class CreatorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return MimBioTypeImpl.this.xgetCreatorArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = MimBioTypeImpl.this.xgetCreatorArray(i);
                MimBioTypeImpl.this.xsetCreatorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { MimBioTypeImpl.this.insertNewCreator(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = MimBioTypeImpl.this.xgetCreatorArray(i);
                MimBioTypeImpl.this.removeCreator(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfCreatorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CreatorList();
        }
    }
    
    /**
     * Gets array of all "creator" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetCreatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CREATOR$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "creator" element
     */
    public org.apache.xmlbeans.XmlString xgetCreatorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "creator" element
     */
    public int sizeOfCreatorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CREATOR$4);
        }
    }
    
    /**
     * Sets array of all "creator" element
     */
    public void setCreatorArray(java.lang.String[] creatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(creatorArray, CREATOR$4);
        }
    }
    
    /**
     * Sets ith "creator" element
     */
    public void setCreatorArray(int i, java.lang.String creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CREATOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(creator);
        }
    }
    
    /**
     * Sets (as xml) array of all "creator" element
     */
    public void xsetCreatorArray(org.apache.xmlbeans.XmlString[]creatorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(creatorArray, CREATOR$4);
        }
    }
    
    /**
     * Sets (as xml) ith "creator" element
     */
    public void xsetCreatorArray(int i, org.apache.xmlbeans.XmlString creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CREATOR$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(creator);
        }
    }
    
    /**
     * Inserts the value as the ith "creator" element
     */
    public void insertCreator(int i, java.lang.String creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CREATOR$4, i);
            target.setStringValue(creator);
        }
    }
    
    /**
     * Appends the value as the last "creator" element
     */
    public void addCreator(java.lang.String creator)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CREATOR$4);
            target.setStringValue(creator);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "creator" element
     */
    public org.apache.xmlbeans.XmlString insertNewCreator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CREATOR$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "creator" element
     */
    public org.apache.xmlbeans.XmlString addNewCreator()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CREATOR$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "creator" element
     */
    public void removeCreator(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CREATOR$4, i);
        }
    }
    
    /**
     * Gets a List of "contributor" elements
     */
    public java.util.List<java.lang.String> getContributorList()
    {
        final class ContributorList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return MimBioTypeImpl.this.getContributorArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = MimBioTypeImpl.this.getContributorArray(i);
                MimBioTypeImpl.this.setContributorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { MimBioTypeImpl.this.insertContributor(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = MimBioTypeImpl.this.getContributorArray(i);
                MimBioTypeImpl.this.removeContributor(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfContributorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContributorList();
        }
    }
    
    /**
     * Gets array of all "contributor" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getContributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CONTRIBUTOR$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "contributor" element
     */
    public java.lang.String getContributorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "contributor" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetContributorList()
    {
        final class ContributorList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return MimBioTypeImpl.this.xgetContributorArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = MimBioTypeImpl.this.xgetContributorArray(i);
                MimBioTypeImpl.this.xsetContributorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { MimBioTypeImpl.this.insertNewContributor(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = MimBioTypeImpl.this.xgetContributorArray(i);
                MimBioTypeImpl.this.removeContributor(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfContributorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new ContributorList();
        }
    }
    
    /**
     * Gets array of all "contributor" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetContributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(CONTRIBUTOR$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "contributor" element
     */
    public org.apache.xmlbeans.XmlString xgetContributorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "contributor" element
     */
    public int sizeOfContributorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(CONTRIBUTOR$6);
        }
    }
    
    /**
     * Sets array of all "contributor" element
     */
    public void setContributorArray(java.lang.String[] contributorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contributorArray, CONTRIBUTOR$6);
        }
    }
    
    /**
     * Sets ith "contributor" element
     */
    public void setContributorArray(int i, java.lang.String contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(contributor);
        }
    }
    
    /**
     * Sets (as xml) array of all "contributor" element
     */
    public void xsetContributorArray(org.apache.xmlbeans.XmlString[]contributorArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(contributorArray, CONTRIBUTOR$6);
        }
    }
    
    /**
     * Sets (as xml) ith "contributor" element
     */
    public void xsetContributorArray(int i, org.apache.xmlbeans.XmlString contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CONTRIBUTOR$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(contributor);
        }
    }
    
    /**
     * Inserts the value as the ith "contributor" element
     */
    public void insertContributor(int i, java.lang.String contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(CONTRIBUTOR$6, i);
            target.setStringValue(contributor);
        }
    }
    
    /**
     * Appends the value as the last "contributor" element
     */
    public void addContributor(java.lang.String contributor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CONTRIBUTOR$6);
            target.setStringValue(contributor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "contributor" element
     */
    public org.apache.xmlbeans.XmlString insertNewContributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(CONTRIBUTOR$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "contributor" element
     */
    public org.apache.xmlbeans.XmlString addNewContributor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CONTRIBUTOR$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "contributor" element
     */
    public void removeContributor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(CONTRIBUTOR$6, i);
        }
    }
    
    /**
     * Gets the "description" element
     */
    public java.lang.String getDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "description" element
     */
    public org.apache.xmlbeans.XmlString xgetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            return target;
        }
    }
    
    /**
     * True if has "description" element
     */
    public boolean isSetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPTION$8) != 0;
        }
    }
    
    /**
     * Sets the "description" element
     */
    public void setDescription(java.lang.String description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPTION$8);
            }
            target.setStringValue(description);
        }
    }
    
    /**
     * Sets (as xml) the "description" element
     */
    public void xsetDescription(org.apache.xmlbeans.XmlString description)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPTION$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPTION$8);
            }
            target.set(description);
        }
    }
    
    /**
     * Unsets the "description" element
     */
    public void unsetDescription()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPTION$8, 0);
        }
    }
    
    /**
     * Gets the "rights" element
     */
    public java.lang.String getRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTS$10, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "rights" element
     */
    public org.apache.xmlbeans.XmlString xgetRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTS$10, 0);
            return target;
        }
    }
    
    /**
     * True if has "rights" element
     */
    public boolean isSetRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RIGHTS$10) != 0;
        }
    }
    
    /**
     * Sets the "rights" element
     */
    public void setRights(java.lang.String rights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(RIGHTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(RIGHTS$10);
            }
            target.setStringValue(rights);
        }
    }
    
    /**
     * Sets (as xml) the "rights" element
     */
    public void xsetRights(org.apache.xmlbeans.XmlString rights)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(RIGHTS$10, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(RIGHTS$10);
            }
            target.set(rights);
        }
    }
    
    /**
     * Unsets the "rights" element
     */
    public void unsetRights()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RIGHTS$10, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$12, 0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$12, 0);
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
            return get_store().count_elements(SOURCE$12) != 0;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SOURCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SOURCE$12);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SOURCE$12, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SOURCE$12);
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
            get_store().remove_element(SOURCE$12, 0);
        }
    }
    
    /**
     * Gets the "modified" element
     */
    public java.util.Calendar getModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$14, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "modified" element
     */
    public org.apache.xmlbeans.XmlDate xgetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(MODIFIED$14, 0);
            return target;
        }
    }
    
    /**
     * True if has "modified" element
     */
    public boolean isSetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MODIFIED$14) != 0;
        }
    }
    
    /**
     * Sets the "modified" element
     */
    public void setModified(java.util.Calendar modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MODIFIED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MODIFIED$14);
            }
            target.setCalendarValue(modified);
        }
    }
    
    /**
     * Sets (as xml) the "modified" element
     */
    public void xsetModified(org.apache.xmlbeans.XmlDate modified)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDate target = null;
            target = (org.apache.xmlbeans.XmlDate)get_store().find_element_user(MODIFIED$14, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDate)get_store().add_element_user(MODIFIED$14);
            }
            target.set(modified);
        }
    }
    
    /**
     * Unsets the "modified" element
     */
    public void unsetModified()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MODIFIED$14, 0);
        }
    }
    
    /**
     * Gets a List of "PublicationXRef" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType> getPublicationXRefList()
    {
        final class PublicationXRefList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType get(int i)
                { return MimBioTypeImpl.this.getPublicationXRefArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType old = MimBioTypeImpl.this.getPublicationXRefArray(i);
                MimBioTypeImpl.this.setPublicationXRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType o)
                { MimBioTypeImpl.this.insertNewPublicationXRef(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType old = MimBioTypeImpl.this.getPublicationXRefArray(i);
                MimBioTypeImpl.this.removePublicationXRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfPublicationXRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PublicationXRefList();
        }
    }
    
    /**
     * Gets array of all "PublicationXRef" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[] getPublicationXRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType>();
            get_store().find_all_element_users(PUBLICATIONXREF$16, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "PublicationXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType getPublicationXRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType)get_store().find_element_user(PUBLICATIONXREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "PublicationXRef" element
     */
    public int sizeOfPublicationXRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PUBLICATIONXREF$16);
        }
    }
    
    /**
     * Sets array of all "PublicationXRef" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPublicationXRefArray(gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType[] publicationXRefArray)
    {
        check_orphaned();
        arraySetterHelper(publicationXRefArray, PUBLICATIONXREF$16);
    }
    
    /**
     * Sets ith "PublicationXRef" element
     */
    public void setPublicationXRefArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType publicationXRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType)get_store().find_element_user(PUBLICATIONXREF$16, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(publicationXRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "PublicationXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType insertNewPublicationXRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType)get_store().insert_element_user(PUBLICATIONXREF$16, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "PublicationXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType addNewPublicationXRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.PublicationXRefType)get_store().add_element_user(PUBLICATIONXREF$16);
            return target;
        }
    }
    
    /**
     * Removes the ith "PublicationXRef" element
     */
    public void removePublicationXRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PUBLICATIONXREF$16, i);
        }
    }
    
    /**
     * Gets a List of "RelationshipXRef" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType> getRelationshipXRefList()
    {
        final class RelationshipXRefList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType get(int i)
                { return MimBioTypeImpl.this.getRelationshipXRefArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType old = MimBioTypeImpl.this.getRelationshipXRefArray(i);
                MimBioTypeImpl.this.setRelationshipXRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType o)
                { MimBioTypeImpl.this.insertNewRelationshipXRef(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType old = MimBioTypeImpl.this.getRelationshipXRefArray(i);
                MimBioTypeImpl.this.removeRelationshipXRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfRelationshipXRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new RelationshipXRefList();
        }
    }
    
    /**
     * Gets array of all "RelationshipXRef" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[] getRelationshipXRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType>();
            get_store().find_all_element_users(RELATIONSHIPXREF$18, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "RelationshipXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType getRelationshipXRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType)get_store().find_element_user(RELATIONSHIPXREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "RelationshipXRef" element
     */
    public int sizeOfRelationshipXRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(RELATIONSHIPXREF$18);
        }
    }
    
    /**
     * Sets array of all "RelationshipXRef" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setRelationshipXRefArray(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType[] relationshipXRefArray)
    {
        check_orphaned();
        arraySetterHelper(relationshipXRefArray, RELATIONSHIPXREF$18);
    }
    
    /**
     * Sets ith "RelationshipXRef" element
     */
    public void setRelationshipXRefArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType relationshipXRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType)get_store().find_element_user(RELATIONSHIPXREF$18, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(relationshipXRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "RelationshipXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType insertNewRelationshipXRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType)get_store().insert_element_user(RELATIONSHIPXREF$18, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "RelationshipXRef" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType addNewRelationshipXRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType)get_store().add_element_user(RELATIONSHIPXREF$18);
            return target;
        }
    }
    
    /**
     * Removes the ith "RelationshipXRef" element
     */
    public void removeRelationshipXRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(RELATIONSHIPXREF$18, i);
        }
    }
    
    /**
     * Gets a List of "EntityControlledVocabulary" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType> getEntityControlledVocabularyList()
    {
        final class EntityControlledVocabularyList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType get(int i)
                { return MimBioTypeImpl.this.getEntityControlledVocabularyArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType old = MimBioTypeImpl.this.getEntityControlledVocabularyArray(i);
                MimBioTypeImpl.this.setEntityControlledVocabularyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType o)
                { MimBioTypeImpl.this.insertNewEntityControlledVocabulary(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType old = MimBioTypeImpl.this.getEntityControlledVocabularyArray(i);
                MimBioTypeImpl.this.removeEntityControlledVocabulary(i);
                return old;
            }
            
            @Override
            public int size()
                { return MimBioTypeImpl.this.sizeOfEntityControlledVocabularyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntityControlledVocabularyList();
        }
    }
    
    /**
     * Gets array of all "EntityControlledVocabulary" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[] getEntityControlledVocabularyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType>();
            get_store().find_all_element_users(ENTITYCONTROLLEDVOCABULARY$20, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EntityControlledVocabulary" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType getEntityControlledVocabularyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType)get_store().find_element_user(ENTITYCONTROLLEDVOCABULARY$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EntityControlledVocabulary" element
     */
    public int sizeOfEntityControlledVocabularyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYCONTROLLEDVOCABULARY$20);
        }
    }
    
    /**
     * Sets array of all "EntityControlledVocabulary" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityControlledVocabularyArray(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType[] entityControlledVocabularyArray)
    {
        check_orphaned();
        arraySetterHelper(entityControlledVocabularyArray, ENTITYCONTROLLEDVOCABULARY$20);
    }
    
    /**
     * Sets ith "EntityControlledVocabulary" element
     */
    public void setEntityControlledVocabularyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType entityControlledVocabulary)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType)get_store().find_element_user(ENTITYCONTROLLEDVOCABULARY$20, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityControlledVocabulary);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityControlledVocabulary" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType insertNewEntityControlledVocabulary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType)get_store().insert_element_user(ENTITYCONTROLLEDVOCABULARY$20, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityControlledVocabulary" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType addNewEntityControlledVocabulary()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType)get_store().add_element_user(ENTITYCONTROLLEDVOCABULARY$20);
            return target;
        }
    }
    
    /**
     * Removes the ith "EntityControlledVocabulary" element
     */
    public void removeEntityControlledVocabulary(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYCONTROLLEDVOCABULARY$20, i);
        }
    }
}
