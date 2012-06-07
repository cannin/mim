/*
 * XML Type:  EntityGlyphType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML EntityGlyphType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class EntityGlyphTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType
{
    private static final long serialVersionUID = 1L;
    
    public EntityGlyphTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Comment");
    private static final javax.xml.namespace.QName GENERICPROPERTY$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "GenericProperty");
    private static final javax.xml.namespace.QName MIMBIOREF$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "mimBioRef");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    private static final javax.xml.namespace.QName VISID$8 = 
        new javax.xml.namespace.QName("", "visId");
    private static final javax.xml.namespace.QName COLOR$10 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName WIDTH$12 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$14 = 
        new javax.xml.namespace.QName("", "height");
    private static final javax.xml.namespace.QName POSITION$16 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName DISPLAYNAME$18 = 
        new javax.xml.namespace.QName("", "displayName");
    private static final javax.xml.namespace.QName GROUPREF$20 = 
        new javax.xml.namespace.QName("", "groupRef");
    private static final javax.xml.namespace.QName CENTERX$22 = 
        new javax.xml.namespace.QName("", "centerX");
    private static final javax.xml.namespace.QName CENTERY$24 = 
        new javax.xml.namespace.QName("", "centerY");
    private static final javax.xml.namespace.QName STARTLOCATIONLABEL$26 = 
        new javax.xml.namespace.QName("", "startLocationLabel");
    private static final javax.xml.namespace.QName ENDLOCATIONLABEL$28 = 
        new javax.xml.namespace.QName("", "endLocationLabel");
    private static final javax.xml.namespace.QName LOCATIONLABEL$30 = 
        new javax.xml.namespace.QName("", "locationLabel");
    
    
    /**
     * Gets a List of "Comment" elements
     */
    public java.util.List<java.lang.String> getCommentList()
    {
        final class CommentList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return EntityGlyphTypeImpl.this.getCommentArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = EntityGlyphTypeImpl.this.getCommentArray(i);
                EntityGlyphTypeImpl.this.setCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { EntityGlyphTypeImpl.this.insertComment(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = EntityGlyphTypeImpl.this.getCommentArray(i);
                EntityGlyphTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return EntityGlyphTypeImpl.this.sizeOfCommentArray(); }
            
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
                { return EntityGlyphTypeImpl.this.xgetCommentArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = EntityGlyphTypeImpl.this.xgetCommentArray(i);
                EntityGlyphTypeImpl.this.xsetCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { EntityGlyphTypeImpl.this.insertNewComment(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = EntityGlyphTypeImpl.this.xgetCommentArray(i);
                EntityGlyphTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return EntityGlyphTypeImpl.this.sizeOfCommentArray(); }
            
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
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty> getGenericPropertyList()
    {
        final class GenericPropertyList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty get(int i)
                { return EntityGlyphTypeImpl.this.getGenericPropertyArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty old = EntityGlyphTypeImpl.this.getGenericPropertyArray(i);
                EntityGlyphTypeImpl.this.setGenericPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty o)
                { EntityGlyphTypeImpl.this.insertNewGenericProperty(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty old = EntityGlyphTypeImpl.this.getGenericPropertyArray(i);
                EntityGlyphTypeImpl.this.removeGenericProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return EntityGlyphTypeImpl.this.sizeOfGenericPropertyArray(); }
            
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty[] getGenericPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty>();
            get_store().find_all_element_users(GENERICPROPERTY$2, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty getGenericPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty[] genericPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(genericPropertyArray, GENERICPROPERTY$2);
    }
    
    /**
     * Sets ith "GenericProperty" element
     */
    public void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty genericProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty insertNewGenericProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty)get_store().insert_element_user(GENERICPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty addNewGenericProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty)get_store().add_element_user(GENERICPROPERTY$2);
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
                { return EntityGlyphTypeImpl.this.getMimBioRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = EntityGlyphTypeImpl.this.getMimBioRefArray(i);
                EntityGlyphTypeImpl.this.setMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { EntityGlyphTypeImpl.this.insertMimBioRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = EntityGlyphTypeImpl.this.getMimBioRefArray(i);
                EntityGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return EntityGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
                { return EntityGlyphTypeImpl.this.xgetMimBioRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = EntityGlyphTypeImpl.this.xgetMimBioRefArray(i);
                EntityGlyphTypeImpl.this.xsetMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { EntityGlyphTypeImpl.this.insertNewMimBioRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = EntityGlyphTypeImpl.this.xgetMimBioRefArray(i);
                EntityGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return EntityGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
     * Gets the "type" attribute
     */
    public java.lang.String getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public org.apache.xmlbeans.XmlString xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(java.lang.String type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$6);
            }
            target.setStringValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(org.apache.xmlbeans.XmlString type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(TYPE$6);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(TYPE$6);
            }
            target.set(type);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISID$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$8);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISID$8);
            }
            target.set(visId);
        }
    }
    
    /**
     * Gets the "color" attribute
     */
    public java.lang.String getColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLOR$10);
            }
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "color" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.ColorType xgetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.ColorType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().find_attribute_user(COLOR$10);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_default_attribute_value(COLOR$10);
            }
            return target;
        }
    }
    
    /**
     * True if has "color" attribute
     */
    public boolean isSetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(COLOR$10) != null;
        }
    }
    
    /**
     * Sets the "color" attribute
     */
    public void setColor(java.lang.String color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$10);
            }
            target.setStringValue(color);
        }
    }
    
    /**
     * Sets (as xml) the "color" attribute
     */
    public void xsetColor(gov.nih.nci.lmp.mim.mimVisLevel1.ColorType color)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.ColorType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().find_attribute_user(COLOR$10);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().add_attribute_user(COLOR$10);
            }
            target.set(color);
        }
    }
    
    /**
     * Unsets the "color" attribute
     */
    public void unsetColor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(COLOR$10);
        }
    }
    
    /**
     * Gets the "width" attribute
     */
    public double getWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$12);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "width" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType xgetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(WIDTH$12);
            return target;
        }
    }
    
    /**
     * True if has "width" attribute
     */
    public boolean isSetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(WIDTH$12) != null;
        }
    }
    
    /**
     * Sets the "width" attribute
     */
    public void setWidth(double width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$12);
            }
            target.setDoubleValue(width);
        }
    }
    
    /**
     * Sets (as xml) the "width" attribute
     */
    public void xsetWidth(gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType width)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(WIDTH$12);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().add_attribute_user(WIDTH$12);
            }
            target.set(width);
        }
    }
    
    /**
     * Unsets the "width" attribute
     */
    public void unsetWidth()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(WIDTH$12);
        }
    }
    
    /**
     * Gets the "height" attribute
     */
    public double getHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$14);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "height" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType xgetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(HEIGHT$14);
            return target;
        }
    }
    
    /**
     * True if has "height" attribute
     */
    public boolean isSetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(HEIGHT$14) != null;
        }
    }
    
    /**
     * Sets the "height" attribute
     */
    public void setHeight(double height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$14);
            }
            target.setDoubleValue(height);
        }
    }
    
    /**
     * Sets (as xml) the "height" attribute
     */
    public void xsetHeight(gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType height)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(HEIGHT$14);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().add_attribute_user(HEIGHT$14);
            }
            target.set(height);
        }
    }
    
    /**
     * Unsets the "height" attribute
     */
    public void unsetHeight()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(HEIGHT$14);
        }
    }
    
    /**
     * Gets the "position" attribute
     */
    public double getPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$16);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "position" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITION$16);
            return target;
        }
    }
    
    /**
     * True if has "position" attribute
     */
    public boolean isSetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(POSITION$16) != null;
        }
    }
    
    /**
     * Sets the "position" attribute
     */
    public void setPosition(double position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$16);
            }
            target.setDoubleValue(position);
        }
    }
    
    /**
     * Sets (as xml) the "position" attribute
     */
    public void xsetPosition(org.apache.xmlbeans.XmlDouble position)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITION$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POSITION$16);
            }
            target.set(position);
        }
    }
    
    /**
     * Unsets the "position" attribute
     */
    public void unsetPosition()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(POSITION$16);
        }
    }
    
    /**
     * Gets the "displayName" attribute
     */
    public java.lang.String getDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$18);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "displayName" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType xgetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType)get_store().find_attribute_user(DISPLAYNAME$18);
            return target;
        }
    }
    
    /**
     * True if has "displayName" attribute
     */
    public boolean isSetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(DISPLAYNAME$18) != null;
        }
    }
    
    /**
     * Sets the "displayName" attribute
     */
    public void setDisplayName(java.lang.String displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(DISPLAYNAME$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(DISPLAYNAME$18);
            }
            target.setStringValue(displayName);
        }
    }
    
    /**
     * Sets (as xml) the "displayName" attribute
     */
    public void xsetDisplayName(gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType displayName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType)get_store().find_attribute_user(DISPLAYNAME$18);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.DisplayNameType)get_store().add_attribute_user(DISPLAYNAME$18);
            }
            target.set(displayName);
        }
    }
    
    /**
     * Unsets the "displayName" attribute
     */
    public void unsetDisplayName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(DISPLAYNAME$18);
        }
    }
    
    /**
     * Gets the "groupRef" attribute
     */
    public java.lang.String getGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPREF$20);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "groupRef" attribute
     */
    public org.apache.xmlbeans.XmlString xgetGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPREF$20);
            return target;
        }
    }
    
    /**
     * True if has "groupRef" attribute
     */
    public boolean isSetGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(GROUPREF$20) != null;
        }
    }
    
    /**
     * Sets the "groupRef" attribute
     */
    public void setGroupRef(java.lang.String groupRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPREF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPREF$20);
            }
            target.setStringValue(groupRef);
        }
    }
    
    /**
     * Sets (as xml) the "groupRef" attribute
     */
    public void xsetGroupRef(org.apache.xmlbeans.XmlString groupRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPREF$20);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUPREF$20);
            }
            target.set(groupRef);
        }
    }
    
    /**
     * Unsets the "groupRef" attribute
     */
    public void unsetGroupRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(GROUPREF$20);
        }
    }
    
    /**
     * Gets the "centerX" attribute
     */
    public double getCenterX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTERX$22);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "centerX" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetCenterX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTERX$22);
            return target;
        }
    }
    
    /**
     * True if has "centerX" attribute
     */
    public boolean isSetCenterX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CENTERX$22) != null;
        }
    }
    
    /**
     * Sets the "centerX" attribute
     */
    public void setCenterX(double centerX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTERX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CENTERX$22);
            }
            target.setDoubleValue(centerX);
        }
    }
    
    /**
     * Sets (as xml) the "centerX" attribute
     */
    public void xsetCenterX(org.apache.xmlbeans.XmlDouble centerX)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTERX$22);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CENTERX$22);
            }
            target.set(centerX);
        }
    }
    
    /**
     * Unsets the "centerX" attribute
     */
    public void unsetCenterX()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CENTERX$22);
        }
    }
    
    /**
     * Gets the "centerY" attribute
     */
    public double getCenterY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTERY$24);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "centerY" attribute
     */
    public org.apache.xmlbeans.XmlDouble xgetCenterY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTERY$24);
            return target;
        }
    }
    
    /**
     * True if has "centerY" attribute
     */
    public boolean isSetCenterY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(CENTERY$24) != null;
        }
    }
    
    /**
     * Sets the "centerY" attribute
     */
    public void setCenterY(double centerY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(CENTERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(CENTERY$24);
            }
            target.setDoubleValue(centerY);
        }
    }
    
    /**
     * Sets (as xml) the "centerY" attribute
     */
    public void xsetCenterY(org.apache.xmlbeans.XmlDouble centerY)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(CENTERY$24);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(CENTERY$24);
            }
            target.set(centerY);
        }
    }
    
    /**
     * Unsets the "centerY" attribute
     */
    public void unsetCenterY()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(CENTERY$24);
        }
    }
    
    /**
     * Gets the "startLocationLabel" attribute
     */
    public int getStartLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTLOCATIONLABEL$26);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "startLocationLabel" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetStartLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(STARTLOCATIONLABEL$26);
            return target;
        }
    }
    
    /**
     * True if has "startLocationLabel" attribute
     */
    public boolean isSetStartLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(STARTLOCATIONLABEL$26) != null;
        }
    }
    
    /**
     * Sets the "startLocationLabel" attribute
     */
    public void setStartLocationLabel(int startLocationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(STARTLOCATIONLABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(STARTLOCATIONLABEL$26);
            }
            target.setIntValue(startLocationLabel);
        }
    }
    
    /**
     * Sets (as xml) the "startLocationLabel" attribute
     */
    public void xsetStartLocationLabel(org.apache.xmlbeans.XmlInt startLocationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(STARTLOCATIONLABEL$26);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(STARTLOCATIONLABEL$26);
            }
            target.set(startLocationLabel);
        }
    }
    
    /**
     * Unsets the "startLocationLabel" attribute
     */
    public void unsetStartLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(STARTLOCATIONLABEL$26);
        }
    }
    
    /**
     * Gets the "endLocationLabel" attribute
     */
    public int getEndLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDLOCATIONLABEL$28);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "endLocationLabel" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetEndLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ENDLOCATIONLABEL$28);
            return target;
        }
    }
    
    /**
     * True if has "endLocationLabel" attribute
     */
    public boolean isSetEndLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(ENDLOCATIONLABEL$28) != null;
        }
    }
    
    /**
     * Sets the "endLocationLabel" attribute
     */
    public void setEndLocationLabel(int endLocationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ENDLOCATIONLABEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ENDLOCATIONLABEL$28);
            }
            target.setIntValue(endLocationLabel);
        }
    }
    
    /**
     * Sets (as xml) the "endLocationLabel" attribute
     */
    public void xsetEndLocationLabel(org.apache.xmlbeans.XmlInt endLocationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(ENDLOCATIONLABEL$28);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(ENDLOCATIONLABEL$28);
            }
            target.set(endLocationLabel);
        }
    }
    
    /**
     * Unsets the "endLocationLabel" attribute
     */
    public void unsetEndLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(ENDLOCATIONLABEL$28);
        }
    }
    
    /**
     * Gets the "locationLabel" attribute
     */
    public int getLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONLABEL$30);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "locationLabel" attribute
     */
    public org.apache.xmlbeans.XmlInt xgetLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LOCATIONLABEL$30);
            return target;
        }
    }
    
    /**
     * True if has "locationLabel" attribute
     */
    public boolean isSetLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().find_attribute_user(LOCATIONLABEL$30) != null;
        }
    }
    
    /**
     * Sets the "locationLabel" attribute
     */
    public void setLocationLabel(int locationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(LOCATIONLABEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(LOCATIONLABEL$30);
            }
            target.setIntValue(locationLabel);
        }
    }
    
    /**
     * Sets (as xml) the "locationLabel" attribute
     */
    public void xsetLocationLabel(org.apache.xmlbeans.XmlInt locationLabel)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_attribute_user(LOCATIONLABEL$30);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_attribute_user(LOCATIONLABEL$30);
            }
            target.set(locationLabel);
        }
    }
    
    /**
     * Unsets the "locationLabel" attribute
     */
    public void unsetLocationLabel()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_attribute(LOCATIONLABEL$30);
        }
    }
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public static class GenericPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType.GenericProperty
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
