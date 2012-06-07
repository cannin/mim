/*
 * XML Type:  InteractionGlyphType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML InteractionGlyphType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class InteractionGlyphTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType
{
    private static final long serialVersionUID = 1L;
    
    public InteractionGlyphTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName COMMENT$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Comment");
    private static final javax.xml.namespace.QName GENERICPROPERTY$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "GenericProperty");
    private static final javax.xml.namespace.QName POINT$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Point");
    private static final javax.xml.namespace.QName ANCHORREF$6 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "anchorRef");
    private static final javax.xml.namespace.QName MIMBIOREF$8 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "mimBioRef");
    private static final javax.xml.namespace.QName VISID$10 = 
        new javax.xml.namespace.QName("", "visId");
    private static final javax.xml.namespace.QName COLOR$12 = 
        new javax.xml.namespace.QName("", "color");
    private static final javax.xml.namespace.QName GROUPREF$14 = 
        new javax.xml.namespace.QName("", "groupRef");
    
    
    /**
     * Gets a List of "Comment" elements
     */
    public java.util.List<java.lang.String> getCommentList()
    {
        final class CommentList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return InteractionGlyphTypeImpl.this.getCommentArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getCommentArray(i);
                InteractionGlyphTypeImpl.this.setCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { InteractionGlyphTypeImpl.this.insertComment(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getCommentArray(i);
                InteractionGlyphTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfCommentArray(); }
            
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
                { return InteractionGlyphTypeImpl.this.xgetCommentArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetCommentArray(i);
                InteractionGlyphTypeImpl.this.xsetCommentArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { InteractionGlyphTypeImpl.this.insertNewComment(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetCommentArray(i);
                InteractionGlyphTypeImpl.this.removeComment(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfCommentArray(); }
            
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
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty> getGenericPropertyList()
    {
        final class GenericPropertyList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty get(int i)
                { return InteractionGlyphTypeImpl.this.getGenericPropertyArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty old = InteractionGlyphTypeImpl.this.getGenericPropertyArray(i);
                InteractionGlyphTypeImpl.this.setGenericPropertyArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty o)
                { InteractionGlyphTypeImpl.this.insertNewGenericProperty(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty old = InteractionGlyphTypeImpl.this.getGenericPropertyArray(i);
                InteractionGlyphTypeImpl.this.removeGenericProperty(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfGenericPropertyArray(); }
            
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[] getGenericPropertyArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty>();
            get_store().find_all_element_users(GENERICPROPERTY$2, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty getGenericPropertyArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public void setGenericPropertyArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty[] genericPropertyArray)
    {
        check_orphaned();
        arraySetterHelper(genericPropertyArray, GENERICPROPERTY$2);
    }
    
    /**
     * Sets ith "GenericProperty" element
     */
    public void setGenericPropertyArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty genericProperty)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty)get_store().find_element_user(GENERICPROPERTY$2, i);
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
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty insertNewGenericProperty(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty)get_store().insert_element_user(GENERICPROPERTY$2, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "GenericProperty" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty addNewGenericProperty()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty)get_store().add_element_user(GENERICPROPERTY$2);
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
     * Gets a List of "Point" elements
     */
    public java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point> getPointList()
    {
        final class PointList extends java.util.AbstractList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point>
        {
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point get(int i)
                { return InteractionGlyphTypeImpl.this.getPointArray(i); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point set(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point o)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point old = InteractionGlyphTypeImpl.this.getPointArray(i);
                InteractionGlyphTypeImpl.this.setPointArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point o)
                { InteractionGlyphTypeImpl.this.insertNewPoint(i).set(o); }
            
            @Override
            public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point remove(int i)
            {
                gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point old = InteractionGlyphTypeImpl.this.getPointArray(i);
                InteractionGlyphTypeImpl.this.removePoint(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfPointArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new PointList();
        }
    }
    
    /**
     * Gets array of all "Point" elements
     * @deprecated
     */
    @Deprecated
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[] getPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point> targetList = new java.util.ArrayList<gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point>();
            get_store().find_all_element_users(POINT$4, targetList);
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[] result = new gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "Point" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point getPointArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point)get_store().find_element_user(POINT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "Point" element
     */
    public int sizeOfPointArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(POINT$4);
        }
    }
    
    /**
     * Sets array of all "Point" element  WARNING: This method is not atomicaly synchronized.
     */
    public void setPointArray(gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point[] pointArray)
    {
        check_orphaned();
        arraySetterHelper(pointArray, POINT$4);
    }
    
    /**
     * Sets ith "Point" element
     */
    public void setPointArray(int i, gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point point)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point)get_store().find_element_user(POINT$4, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(point);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "Point" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point insertNewPoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point)get_store().insert_element_user(POINT$4, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "Point" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point addNewPoint()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point)get_store().add_element_user(POINT$4);
            return target;
        }
    }
    
    /**
     * Removes the ith "Point" element
     */
    public void removePoint(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(POINT$4, i);
        }
    }
    
    /**
     * Gets a List of "anchorRef" elements
     */
    public java.util.List<java.lang.String> getAnchorRefList()
    {
        final class AnchorRefList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return InteractionGlyphTypeImpl.this.getAnchorRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getAnchorRefArray(i);
                InteractionGlyphTypeImpl.this.setAnchorRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { InteractionGlyphTypeImpl.this.insertAnchorRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getAnchorRefArray(i);
                InteractionGlyphTypeImpl.this.removeAnchorRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfAnchorRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnchorRefList();
        }
    }
    
    /**
     * Gets array of all "anchorRef" elements
     * @deprecated
     */
    @Deprecated
    public java.lang.String[] getAnchorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ANCHORREF$6, targetList);
            java.lang.String[] result = new java.lang.String[targetList.size()];
            for (int i = 0, len = targetList.size() ; i < len ; i++)
                result[i] = ((org.apache.xmlbeans.SimpleValue)targetList.get(i)).getStringValue();
            return result;
        }
    }
    
    /**
     * Gets ith "anchorRef" element
     */
    public java.lang.String getAnchorRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHORREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) a List of "anchorRef" elements
     */
    public java.util.List<org.apache.xmlbeans.XmlString> xgetAnchorRefList()
    {
        final class AnchorRefList extends java.util.AbstractList<org.apache.xmlbeans.XmlString>
        {
            @Override
            public org.apache.xmlbeans.XmlString get(int i)
                { return InteractionGlyphTypeImpl.this.xgetAnchorRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetAnchorRefArray(i);
                InteractionGlyphTypeImpl.this.xsetAnchorRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { InteractionGlyphTypeImpl.this.insertNewAnchorRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetAnchorRefArray(i);
                InteractionGlyphTypeImpl.this.removeAnchorRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfAnchorRefArray(); }
            
        }
        
        synchronized (monitor())
        {
            check_orphaned();
            return new AnchorRefList();
        }
    }
    
    /**
     * Gets array of all "anchorRef" elements
     * @deprecated
     */
    @Deprecated
    public org.apache.xmlbeans.XmlString[] xgetAnchorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List<org.apache.xmlbeans.XmlString> targetList = new java.util.ArrayList<org.apache.xmlbeans.XmlString>();
            get_store().find_all_element_users(ANCHORREF$6, targetList);
            org.apache.xmlbeans.XmlString[] result = new org.apache.xmlbeans.XmlString[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets (as xml) ith "anchorRef" element
     */
    public org.apache.xmlbeans.XmlString xgetAnchorRefArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANCHORREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "anchorRef" element
     */
    public int sizeOfAnchorRefArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ANCHORREF$6);
        }
    }
    
    /**
     * Sets array of all "anchorRef" element
     */
    public void setAnchorRefArray(java.lang.String[] anchorRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anchorRefArray, ANCHORREF$6);
        }
    }
    
    /**
     * Sets ith "anchorRef" element
     */
    public void setAnchorRefArray(int i, java.lang.String anchorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ANCHORREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.setStringValue(anchorRef);
        }
    }
    
    /**
     * Sets (as xml) array of all "anchorRef" element
     */
    public void xsetAnchorRefArray(org.apache.xmlbeans.XmlString[]anchorRefArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(anchorRefArray, ANCHORREF$6);
        }
    }
    
    /**
     * Sets (as xml) ith "anchorRef" element
     */
    public void xsetAnchorRefArray(int i, org.apache.xmlbeans.XmlString anchorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ANCHORREF$6, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(anchorRef);
        }
    }
    
    /**
     * Inserts the value as the ith "anchorRef" element
     */
    public void insertAnchorRef(int i, java.lang.String anchorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = 
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(ANCHORREF$6, i);
            target.setStringValue(anchorRef);
        }
    }
    
    /**
     * Appends the value as the last "anchorRef" element
     */
    public void addAnchorRef(java.lang.String anchorRef)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ANCHORREF$6);
            target.setStringValue(anchorRef);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "anchorRef" element
     */
    public org.apache.xmlbeans.XmlString insertNewAnchorRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(ANCHORREF$6, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "anchorRef" element
     */
    public org.apache.xmlbeans.XmlString addNewAnchorRef()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ANCHORREF$6);
            return target;
        }
    }
    
    /**
     * Removes the ith "anchorRef" element
     */
    public void removeAnchorRef(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ANCHORREF$6, i);
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
                { return InteractionGlyphTypeImpl.this.getMimBioRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getMimBioRefArray(i);
                InteractionGlyphTypeImpl.this.setMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { InteractionGlyphTypeImpl.this.insertMimBioRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = InteractionGlyphTypeImpl.this.getMimBioRefArray(i);
                InteractionGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
            get_store().find_all_element_users(MIMBIOREF$8, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$8, i);
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
                { return InteractionGlyphTypeImpl.this.xgetMimBioRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetMimBioRefArray(i);
                InteractionGlyphTypeImpl.this.xsetMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { InteractionGlyphTypeImpl.this.insertNewMimBioRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = InteractionGlyphTypeImpl.this.xgetMimBioRefArray(i);
                InteractionGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return InteractionGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
            get_store().find_all_element_users(MIMBIOREF$8, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$8, i);
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
            return get_store().count_elements(MIMBIOREF$8);
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
            arraySetterHelper(mimBioRefArray, MIMBIOREF$8);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$8, i);
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
            arraySetterHelper(mimBioRefArray, MIMBIOREF$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$8, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MIMBIOREF$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMBIOREF$8);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MIMBIOREF$8, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMBIOREF$8);
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
            get_store().remove_element(MIMBIOREF$8, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISID$10);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$10);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISID$10);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(COLOR$12);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().find_attribute_user(COLOR$12);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_default_attribute_value(COLOR$12);
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
            return get_store().find_attribute_user(COLOR$12) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(COLOR$12);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(COLOR$12);
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
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().find_attribute_user(COLOR$12);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.ColorType)get_store().add_attribute_user(COLOR$12);
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
            get_store().remove_attribute(COLOR$12);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPREF$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPREF$14);
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
            return get_store().find_attribute_user(GROUPREF$14) != null;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(GROUPREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(GROUPREF$14);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(GROUPREF$14);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(GROUPREF$14);
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
            get_store().remove_attribute(GROUPREF$14);
        }
    }
    /**
     * An XML GenericProperty(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public static class GenericPropertyImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.GenericProperty
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
    /**
     * An XML Point(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is a complex type.
     */
    public static class PointImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.InteractionGlyphType.Point
    {
        private static final long serialVersionUID = 1L;
        
        public PointImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName X$0 = 
            new javax.xml.namespace.QName("", "x");
        private static final javax.xml.namespace.QName Y$2 = 
            new javax.xml.namespace.QName("", "y");
        private static final javax.xml.namespace.QName RELX$4 = 
            new javax.xml.namespace.QName("", "relX");
        private static final javax.xml.namespace.QName RELY$6 = 
            new javax.xml.namespace.QName("", "relY");
        private static final javax.xml.namespace.QName ARROWHEAD$8 = 
            new javax.xml.namespace.QName("", "arrowHead");
        private static final javax.xml.namespace.QName VISREF$10 = 
            new javax.xml.namespace.QName("", "visRef");
        
        
        /**
         * Gets the "x" attribute
         */
        public double getX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "x" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(X$0);
                return target;
            }
        }
        
        /**
         * Sets the "x" attribute
         */
        public void setX(double x)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(X$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(X$0);
                }
                target.setDoubleValue(x);
            }
        }
        
        /**
         * Sets (as xml) the "x" attribute
         */
        public void xsetX(org.apache.xmlbeans.XmlDouble x)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(X$0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(X$0);
                }
                target.set(x);
            }
        }
        
        /**
         * Gets the "y" attribute
         */
        public double getY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "y" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(Y$2);
                return target;
            }
        }
        
        /**
         * Sets the "y" attribute
         */
        public void setY(double y)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(Y$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(Y$2);
                }
                target.setDoubleValue(y);
            }
        }
        
        /**
         * Sets (as xml) the "y" attribute
         */
        public void xsetY(org.apache.xmlbeans.XmlDouble y)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(Y$2);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(Y$2);
                }
                target.set(y);
            }
        }
        
        /**
         * Gets the "relX" attribute
         */
        public double getRelX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELX$4);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "relX" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRelX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELX$4);
                return target;
            }
        }
        
        /**
         * True if has "relX" attribute
         */
        public boolean isSetRelX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELX$4) != null;
            }
        }
        
        /**
         * Sets the "relX" attribute
         */
        public void setRelX(double relX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELX$4);
                }
                target.setDoubleValue(relX);
            }
        }
        
        /**
         * Sets (as xml) the "relX" attribute
         */
        public void xsetRelX(org.apache.xmlbeans.XmlDouble relX)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELX$4);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RELX$4);
                }
                target.set(relX);
            }
        }
        
        /**
         * Unsets the "relX" attribute
         */
        public void unsetRelX()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELX$4);
            }
        }
        
        /**
         * Gets the "relY" attribute
         */
        public double getRelY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELY$6);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "relY" attribute
         */
        public org.apache.xmlbeans.XmlDouble xgetRelY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELY$6);
                return target;
            }
        }
        
        /**
         * True if has "relY" attribute
         */
        public boolean isSetRelY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(RELY$6) != null;
            }
        }
        
        /**
         * Sets the "relY" attribute
         */
        public void setRelY(double relY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(RELY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(RELY$6);
                }
                target.setDoubleValue(relY);
            }
        }
        
        /**
         * Sets (as xml) the "relY" attribute
         */
        public void xsetRelY(org.apache.xmlbeans.XmlDouble relY)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(RELY$6);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(RELY$6);
                }
                target.set(relY);
            }
        }
        
        /**
         * Unsets the "relY" attribute
         */
        public void unsetRelY()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(RELY$6);
            }
        }
        
        /**
         * Gets the "arrowHead" attribute
         */
        public java.lang.String getArrowHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARROWHEAD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_default_attribute_value(ARROWHEAD$8);
                }
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "arrowHead" attribute
         */
        public org.apache.xmlbeans.XmlString xgetArrowHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARROWHEAD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_default_attribute_value(ARROWHEAD$8);
                }
                return target;
            }
        }
        
        /**
         * True if has "arrowHead" attribute
         */
        public boolean isSetArrowHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(ARROWHEAD$8) != null;
            }
        }
        
        /**
         * Sets the "arrowHead" attribute
         */
        public void setArrowHead(java.lang.String arrowHead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(ARROWHEAD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(ARROWHEAD$8);
                }
                target.setStringValue(arrowHead);
            }
        }
        
        /**
         * Sets (as xml) the "arrowHead" attribute
         */
        public void xsetArrowHead(org.apache.xmlbeans.XmlString arrowHead)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(ARROWHEAD$8);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(ARROWHEAD$8);
                }
                target.set(arrowHead);
            }
        }
        
        /**
         * Unsets the "arrowHead" attribute
         */
        public void unsetArrowHead()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(ARROWHEAD$8);
            }
        }
        
        /**
         * Gets the "visRef" attribute
         */
        public java.lang.String getVisRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISREF$10);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "visRef" attribute
         */
        public org.apache.xmlbeans.XmlString xgetVisRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISREF$10);
                return target;
            }
        }
        
        /**
         * True if has "visRef" attribute
         */
        public boolean isSetVisRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                return get_store().find_attribute_user(VISREF$10) != null;
            }
        }
        
        /**
         * Sets the "visRef" attribute
         */
        public void setVisRef(java.lang.String visRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISREF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISREF$10);
                }
                target.setStringValue(visRef);
            }
        }
        
        /**
         * Sets (as xml) the "visRef" attribute
         */
        public void xsetVisRef(org.apache.xmlbeans.XmlString visRef)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISREF$10);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISREF$10);
                }
                target.set(visRef);
            }
        }
        
        /**
         * Unsets the "visRef" attribute
         */
        public void unsetVisRef()
        {
            synchronized (monitor())
            {
                check_orphaned();
                get_store().remove_attribute(VISREF$10);
            }
        }
    }
}
