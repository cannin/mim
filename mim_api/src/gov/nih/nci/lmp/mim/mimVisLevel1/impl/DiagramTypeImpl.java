/*
 * XML Type:  DiagramType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML DiagramType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class DiagramTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType
{
    private static final long serialVersionUID = 1L;
    
    public DiagramTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Comment");
    private static final javax.xml.namespace.QName GENERICPROPERTY$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "GenericProperty");
    private static final javax.xml.namespace.QName MIMBIOREF$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "mimBioRef");
    private static final javax.xml.namespace.QName ENTITYGLYPH$6 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "EntityGlyph");
    private static final javax.xml.namespace.QName INTERACTIONGLYPH$8 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "InteractionGlyph");
    private static final javax.xml.namespace.QName GROUP$10 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Group");
    private static final javax.xml.namespace.QName ANCHOR$12 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Anchor");
    private static final javax.xml.namespace.QName MIMBIO$14 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "MimBio");
    private static final javax.xml.namespace.QName WIDTH$16 = 
        new javax.xml.namespace.QName("", "width");
    private static final javax.xml.namespace.QName HEIGHT$18 = 
        new javax.xml.namespace.QName("", "height");
    
    
    /**
     * Gets a List of "Comment" elements
     */
    public java.util.List<java.lang.String> getCommentList()
    {
        final class CommentList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return DiagramTypeImpl.this.getCommentArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = DiagramTypeImpl.this.getCommentArray(i);
                DiagramTypeImpl.this.setCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { DiagramTypeImpl.this.insertComment(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = DiagramTypeImpl.this.getCommentArray(i);
                DiagramTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfCommentArray(); }
            
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
                { return DiagramTypeImpl.this.xgetCommentArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = DiagramTypeImpl.this.xgetCommentArray(i);
                DiagramTypeImpl.this.xsetCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { DiagramTypeImpl.this.insertNewComment(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = DiagramTypeImpl.this.xgetCommentArray(i);
                DiagramTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfCommentArray(); }
            
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
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty> getGenericPropertyList()
    {
        final class GenericPropertyList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty get(int i)
                { return DiagramTypeImpl.this.getGenericPropertyArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty old = DiagramTypeImpl.this.getGenericPropertyArray(i);
                DiagramTypeImpl.this.setGenericPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty o)
                { DiagramTypeImpl.this.insertNewGenericProperty(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty old = DiagramTypeImpl.this.getGenericPropertyArray(i);
                DiagramTypeImpl.this.removeGenericProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfGenericPropertyArray(); }
            
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[] getGenericPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty>();
            get_store().find_all_element_users(GENERICPROPERTY$2, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty getGenericPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty[] genericPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(genericPropertyArray, GENERICPROPERTY$2);
    }
    
    /**
     * Sets ith "GenericProperty" element
     */
    public void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty genericProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty insertNewGenericProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty)get_store().insert_element_user(GENERICPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty addNewGenericProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty)get_store().add_element_user(GENERICPROPERTY$2);
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
                { return DiagramTypeImpl.this.getMimBioRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = DiagramTypeImpl.this.getMimBioRefArray(i);
                DiagramTypeImpl.this.setMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { DiagramTypeImpl.this.insertMimBioRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = DiagramTypeImpl.this.getMimBioRefArray(i);
                DiagramTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
                { return DiagramTypeImpl.this.xgetMimBioRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = DiagramTypeImpl.this.xgetMimBioRefArray(i);
                DiagramTypeImpl.this.xsetMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { DiagramTypeImpl.this.insertNewMimBioRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = DiagramTypeImpl.this.xgetMimBioRefArray(i);
                DiagramTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
     * Gets a List of "EntityGlyph" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType> getEntityGlyphList()
    {
        final class EntityGlyphList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType get(int i)
                { return DiagramTypeImpl.this.getEntityGlyphArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType old = DiagramTypeImpl.this.getEntityGlyphArray(i);
                DiagramTypeImpl.this.setEntityGlyphArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType o)
                { DiagramTypeImpl.this.insertNewEntityGlyph(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType old = DiagramTypeImpl.this.getEntityGlyphArray(i);
                DiagramTypeImpl.this.removeEntityGlyph(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfEntityGlyphArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new EntityGlyphList();
        }
    }
    
    /**
     * Gets array of all "EntityGlyph" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[] getEntityGlyphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType>();
            get_store().find_all_element_users(ENTITYGLYPH$6, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "EntityGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType getEntityGlyphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType)get_store().find_element_user(ENTITYGLYPH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "EntityGlyph" element
     */
    public int sizeOfEntityGlyphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ENTITYGLYPH$6);
        }
    }
    
    /**
     * Sets array of all "EntityGlyph" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setEntityGlyphArray(gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType[] entityGlyphArray)
    {
        check_orphaned();
        arraySetterHelper(entityGlyphArray, ENTITYGLYPH$6);
    }
    
    /**
     * Sets ith "EntityGlyph" element
     */
    public void setEntityGlyphArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType entityGlyph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType)get_store().find_element_user(ENTITYGLYPH$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(entityGlyph);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "EntityGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType insertNewEntityGlyph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType)get_store().insert_element_user(ENTITYGLYPH$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "EntityGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType addNewEntityGlyph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityGlyphType)get_store().add_element_user(ENTITYGLYPH$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "EntityGlyph" element
     */
    public void removeEntityGlyph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ENTITYGLYPH$6, i);
        }
    }
    
    /**
     * Gets a List of "InteractionGlyph" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType> getInteractionGlyphList()
    {
        final class InteractionGlyphList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType get(int i)
                { return DiagramTypeImpl.this.getInteractionGlyphArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType old = DiagramTypeImpl.this.getInteractionGlyphArray(i);
                DiagramTypeImpl.this.setInteractionGlyphArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType o)
                { DiagramTypeImpl.this.insertNewInteractionGlyph(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType old = DiagramTypeImpl.this.getInteractionGlyphArray(i);
                DiagramTypeImpl.this.removeInteractionGlyph(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfInteractionGlyphArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new InteractionGlyphList();
        }
    }
    
    /**
     * Gets array of all "InteractionGlyph" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[] getInteractionGlyphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType>();
            get_store().find_all_element_users(INTERACTIONGLYPH$8, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "InteractionGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType getInteractionGlyphArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType)get_store().find_element_user(INTERACTIONGLYPH$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "InteractionGlyph" element
     */
    public int sizeOfInteractionGlyphArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(INTERACTIONGLYPH$8);
        }
    }
    
    /**
     * Sets array of all "InteractionGlyph" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setInteractionGlyphArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType[] interactionGlyphArray)
    {
        check_orphaned();
        arraySetterHelper(interactionGlyphArray, INTERACTIONGLYPH$8);
    }
    
    /**
     * Sets ith "InteractionGlyph" element
     */
    public void setInteractionGlyphArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType interactionGlyph)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType)get_store().find_element_user(INTERACTIONGLYPH$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(interactionGlyph);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "InteractionGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType insertNewInteractionGlyph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType)get_store().insert_element_user(INTERACTIONGLYPH$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "InteractionGlyph" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType addNewInteractionGlyph()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType)get_store().add_element_user(INTERACTIONGLYPH$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "InteractionGlyph" element
     */
    public void removeInteractionGlyph(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(INTERACTIONGLYPH$8, i);
        }
    }
    
    /**
     * Gets a List of "Group" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType> getGroupList()
    {
        final class GroupList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType get(int i)
                { return DiagramTypeImpl.this.getGroupArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.GroupType old = DiagramTypeImpl.this.getGroupArray(i);
                DiagramTypeImpl.this.setGroupArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType o)
                { DiagramTypeImpl.this.insertNewGroup(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.GroupType old = DiagramTypeImpl.this.getGroupArray(i);
                DiagramTypeImpl.this.removeGroup(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfGroupArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new GroupList();
        }
    }
    
    /**
     * Gets array of all "Group" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[] getGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.GroupType>();
            get_store().find_all_element_users(GROUP$10, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Group" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType getGroupArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType)get_store().find_element_user(GROUP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Group" element
     */
    public int sizeOfGroupArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(GROUP$10);
        }
    }
    
    /**
     * Sets array of all "Group" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setGroupArray(gov.nih.nci.lmp.mim.mimVisLevel1.GroupType[] groupArray)
    {
        check_orphaned();
        arraySetterHelper(groupArray, GROUP$10);
    }
    
    /**
     * Sets ith "Group" element
     */
    public void setGroupArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.GroupType group)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType)get_store().find_element_user(GROUP$10, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(group);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Group" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType insertNewGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType)get_store().insert_element_user(GROUP$10, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Group" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.GroupType addNewGroup()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.GroupType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.GroupType)get_store().add_element_user(GROUP$10);
            return target;
        }
    }
    
    /**
     * Removes the ith "Group" element
     */
    public void removeGroup(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(GROUP$10, i);
        }
    }
    
    /**
     * Gets a List of "Anchor" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType> getAnchorList()
    {
        final class AnchorList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType get(int i)
                { return DiagramTypeImpl.this.getAnchorArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType old = DiagramTypeImpl.this.getAnchorArray(i);
                DiagramTypeImpl.this.setAnchorArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType o)
                { DiagramTypeImpl.this.insertNewAnchor(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType old = DiagramTypeImpl.this.getAnchorArray(i);
                DiagramTypeImpl.this.removeAnchor(i);
                return old;
            }
            
            @Override
            public int size()
                { return DiagramTypeImpl.this.sizeOfAnchorArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnchorList();
        }
    }
    
    /**
     * Gets array of all "Anchor" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[] getAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType>();
            get_store().find_all_element_users(ANCHOR$12, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Anchor" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType getAnchorArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType)get_store().find_element_user(ANCHOR$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Anchor" element
     */
    public int sizeOfAnchorArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHOR$12);
        }
    }
    
    /**
     * Sets array of all "Anchor" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setAnchorArray(gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType[] anchorArray)
    {
        check_orphaned();
        arraySetterHelper(anchorArray, ANCHOR$12);
    }
    
    /**
     * Sets ith "Anchor" element
     */
    public void setAnchorArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType anchor)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType)get_store().find_element_user(ANCHOR$12, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anchor);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Anchor" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType insertNewAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType)get_store().insert_element_user(ANCHOR$12, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Anchor" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType addNewAnchor()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType)get_store().add_element_user(ANCHOR$12);
            return target;
        }
    }
    
    /**
     * Removes the ith "Anchor" element
     */
    public void removeAnchor(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHOR$12, i);
        }
    }
    
    /**
     * Gets the "MimBio" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType getMimBio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType)get_store().find_element_user(MIMBIO$14, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * True if has "MimBio" element
     */
    public boolean isSetMimBio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(MIMBIO$14) != 0;
        }
    }
    
    /**
     * Sets the "MimBio" element
     */
    public void setMimBio(gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType mimBio)
    {
        generatedSetterHelperImpl(mimBio, MIMBIO$14, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "MimBio" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType addNewMimBio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.MimBioType)get_store().add_element_user(MIMBIO$14);
            return target;
        }
    }
    
    /**
     * Unsets the "MimBio" element
     */
    public void unsetMimBio()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(MIMBIO$14, 0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$16);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(WIDTH$16);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(WIDTH$16);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(WIDTH$16);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(WIDTH$16);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().add_attribute_user(WIDTH$16);
            }
            target.set(width);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$18);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(HEIGHT$18);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(HEIGHT$18);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(HEIGHT$18);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().find_attribute_user(HEIGHT$18);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.DimensionType)get_store().add_attribute_user(HEIGHT$18);
            }
            target.set(height);
        }
    }
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public static class GenericPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType.GenericProperty
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
