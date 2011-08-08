/*
 * XML Type:  GroupType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.GroupType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML GroupType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class GroupTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.GroupType
{
    private static final long serialVersionUID = 1L;
    
    public GroupTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Comment");
    private static final javax.xml.namespace.QName GENERICPROPERTY$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "GenericProperty");
    private static final javax.xml.namespace.QName MIMBIOREF$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "mimBioRef");
    private static final javax.xml.namespace.QName VISID$6 = 
        new javax.xml.namespace.QName("", "visId");
    private static final javax.xml.namespace.QName TYPE$8 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets a List of "Comment" elements
     */
    public java.util.List<java.lang.String> getCommentList()
    {
        final class CommentList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return GroupTypeImpl.this.getCommentArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = GroupTypeImpl.this.getCommentArray(i);
                GroupTypeImpl.this.setCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { GroupTypeImpl.this.insertComment(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = GroupTypeImpl.this.getCommentArray(i);
                GroupTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return GroupTypeImpl.this.sizeOfCommentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentList();
        }
    }
    
    /**
     * Gets array of all "Comment" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(COMMENT$0, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "Comment" element
     */
    public java.lang.String getCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "Comment" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetCommentList()
    {
        final class CommentList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return GroupTypeImpl.this.xgetCommentArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = GroupTypeImpl.this.xgetCommentArray(i);
                GroupTypeImpl.this.xsetCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { GroupTypeImpl.this.insertNewComment(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = GroupTypeImpl.this.xgetCommentArray(i);
                GroupTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return GroupTypeImpl.this.sizeOfCommentArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new CommentList();
        }
    }
    
    /**
     * Gets array of all "Comment" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(COMMENT$0, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "Comment" element
     */
    public org.apache.xmlbeans.XmlString xgetCommentArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Comment" element
     */
    public int sizeOfCommentArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(COMMENT$0);
        }
    }
    
    /**
     * Sets array of all "Comment" element
     */
    public void setCommentArray(java.lang.String[] commentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$0);
        }
    }
    
    /**
     * Sets ith "Comment" element
     */
    public void setCommentArray(int i, java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(comment);
        }
    }
    
    /**
     * Sets (as xml) array of all "Comment" element
     */
    public void xsetCommentArray(org.apache.xmlbeans.XmlString[]commentArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(commentArray, COMMENT$0);
        }
    }
    
    /**
     * Sets (as xml) ith "Comment" element
     */
    public void xsetCommentArray(int i, org.apache.xmlbeans.XmlString comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(COMMENT$0, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(comment);
        }
    }
    
    /**
     * Inserts the value as the ith "Comment" element
     */
    public void insertComment(int i, java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(COMMENT$0, i);
            target.setStringValue(comment);
        }
    }
    
    /**
     * Appends the value as the last "Comment" element
     */
    public void addComment(java.lang.String comment)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(COMMENT$0);
            target.setStringValue(comment);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Comment" element
     */
    public org.apache.xmlbeans.XmlString insertNewComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(COMMENT$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Comment" element
     */
    public org.apache.xmlbeans.XmlString addNewComment()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(COMMENT$0);
            return target;
        }
    }
    
    /**
     * Removes the ith "Comment" element
     */
    public void removeComment(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(COMMENT$0, i);
        }
    }
    
    /**
     * Gets a List of "GenericProperty" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty> getGenericPropertyList()
    {
        final class GenericPropertyList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty get(int i)
                { return GroupTypeImpl.this.getGenericPropertyArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty old = GroupTypeImpl.this.getGenericPropertyArray(i);
                GroupTypeImpl.this.setGenericPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty o)
                { GroupTypeImpl.this.insertNewGenericProperty(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty old = GroupTypeImpl.this.getGenericPropertyArray(i);
                GroupTypeImpl.this.removeGenericProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return GroupTypeImpl.this.sizeOfGenericPropertyArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GenericPropertyList();
        }
    }
    
    /**
     * Gets array of all "GenericProperty" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[] getGenericPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty>();
            get_store().find_all_element_users(GENERICPROPERTY$2, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty getGenericPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "GenericProperty" element
     */
    public int sizeOfGenericPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GENERICPROPERTY$2);
        }
    }
    
    /**
     * Sets array of all "GenericProperty" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty[] genericPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(genericPropertyArray, GENERICPROPERTY$2);
    }
    
    /**
     * Sets ith "GenericProperty" element
     */
    public void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty genericProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(genericProperty);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty insertNewGenericProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty)get_store().insert_element_user(GENERICPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty addNewGenericProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty)get_store().add_element_user(GENERICPROPERTY$2);
            return target;
        }
    }
    
    /**
     * Removes the ith "GenericProperty" element
     */
    public void removeGenericProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GENERICPROPERTY$2, i);
        }
    }
    
    /**
     * Gets a List of "mimBioRef" elements
     */
    public java.util.List<java.lang.String> getMimBioRefList()
    {
        final class MimBioRefList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return GroupTypeImpl.this.getMimBioRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = GroupTypeImpl.this.getMimBioRefArray(i);
                GroupTypeImpl.this.setMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { GroupTypeImpl.this.insertMimBioRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = GroupTypeImpl.this.getMimBioRefArray(i);
                GroupTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return GroupTypeImpl.this.sizeOfMimBioRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MimBioRefList();
        }
    }
    
    /**
     * Gets array of all "mimBioRef" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getMimBioRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(MIMBIOREF$4, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "mimBioRef" element
     */
    public java.lang.String getMimBioRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "mimBioRef" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetMimBioRefList()
    {
        final class MimBioRefList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return GroupTypeImpl.this.xgetMimBioRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = GroupTypeImpl.this.xgetMimBioRefArray(i);
                GroupTypeImpl.this.xsetMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { GroupTypeImpl.this.insertNewMimBioRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = GroupTypeImpl.this.xgetMimBioRefArray(i);
                GroupTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return GroupTypeImpl.this.sizeOfMimBioRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new MimBioRefList();
        }
    }
    
    /**
     * Gets array of all "mimBioRef" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetMimBioRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(MIMBIOREF$4, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "mimBioRef" element
     */
    public org.apache.xmlbeans.XmlString xgetMimBioRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "mimBioRef" element
     */
    public int sizeOfMimBioRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMBIOREF$4);
        }
    }
    
    /**
     * Sets array of all "mimBioRef" element
     */
    public void setMimBioRefArray(java.lang.String[] mimBioRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mimBioRefArray, MIMBIOREF$4);
        }
    }
    
    /**
     * Sets ith "mimBioRef" element
     */
    public void setMimBioRefArray(int i, java.lang.String mimBioRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(mimBioRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "mimBioRef" element
     */
    public void xsetMimBioRefArray(org.apache.xmlbeans.XmlString[]mimBioRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(mimBioRefArray, MIMBIOREF$4);
        }
    }
    
    /**
     * Sets (as xml) ith "mimBioRef" element
     */
    public void xsetMimBioRefArray(int i, org.apache.xmlbeans.XmlString mimBioRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(mimBioRef);
        }
    }
    
    /**
     * Inserts the value as the ith "mimBioRef" element
     */
    public void insertMimBioRef(int i, java.lang.String mimBioRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MIMBIOREF$4, i);
            target.setStringValue(mimBioRef);
        }
    }
    
    /**
     * Appends the value as the last "mimBioRef" element
     */
    public void addMimBioRef(java.lang.String mimBioRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMBIOREF$4);
            target.setStringValue(mimBioRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "mimBioRef" element
     */
    public org.apache.xmlbeans.XmlString insertNewMimBioRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MIMBIOREF$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "mimBioRef" element
     */
    public org.apache.xmlbeans.XmlString addNewMimBioRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMBIOREF$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "mimBioRef" element
     */
    public void removeMimBioRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMBIOREF$4, i);
        }
    }
    
    /**
     * Gets the "visId" attribute
     */
    public java.lang.String getVisId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "visId" attribute
     */
    public org.apache.xmlbeans.XmlString xgetVisId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$6);
            return target;
        }
    }
    
    /**
     * Sets the "visId" attribute
     */
    public void setVisId(java.lang.String visId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISID$6);
            }
            target.setStringValue(visId);
        }
    }
    
    /**
     * Sets (as xml) the "visId" attribute
     */
    public void xsetVisId(org.apache.xmlbeans.XmlString visId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISID$6);
            }
            target.set(visId);
        }
    }
    
    /**
     * Gets the "type" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(TYPE$8);
            }
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType)get_default_attribute_value(TYPE$8);
            }
            return target;
        }
    }
    
    /**
     * True if has "type" attribute
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(TYPE$8) != null;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$8);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType)get_store().find_attribute_user(TYPE$8);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupEnumType)get_store().add_attribute_user(TYPE$8);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" attribute
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(TYPE$8);
        }
    }
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public static class GenericPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.GroupType.GenericProperty
    {
        private static final long serialVersionUID = 1L;
        
        public GenericPropertyImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName KEY$0 = 
            new javax.xml.namespace.QName("", "key");
        private static final javax.xml.namespace.QName VALUE$2 = 
            new javax.xml.namespace.QName("", "value");
        
        
        /**
         * Gets the "key" attribute
         */
        public java.lang.String getKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "key" attribute
         */
        public org.apache.xmlbeans.XmlString xgetKey()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                return target;
            }
        }
        
        /**
         * Sets the "key" attribute
         */
        public void setKey(java.lang.String key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(KEY$0);
                }
                target.setStringValue(key);
            }
        }
        
        /**
         * Sets (as xml) the "key" attribute
         */
        public void xsetKey(org.apache.xmlbeans.XmlString key)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(KEY$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(KEY$0);
                }
                target.set(key);
            }
        }
        
        /**
         * Gets the "value" attribute
         */
        public java.lang.String getValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "value" attribute
         */
        public org.apache.xmlbeans.XmlString xgetValue()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                return target;
            }
        }
        
        /**
         * Sets the "value" attribute
         */
        public void setValue(java.lang.String value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VALUE$2);
                }
                target.setStringValue(value);
            }
        }
        
        /**
         * Sets (as xml) the "value" attribute
         */
        public void xsetValue(org.apache.xmlbeans.XmlString value)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VALUE$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VALUE$2);
                }
                target.set(value);
            }
        }
    }
}
