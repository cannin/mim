/*
 * XML Type:  AnchorGlyphType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML AnchorGlyphType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class AnchorGlyphTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.AnchorGlyphType
{
    private static final long serialVersionUID = 1L;
    
    public AnchorGlyphTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName MIMBIOREF$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "mimBioRef");
    private static final javax.xml.namespace.QName VISID$2 = 
        new javax.xml.namespace.QName("", "visId");
    private static final javax.xml.namespace.QName POSITION$4 = 
        new javax.xml.namespace.QName("", "position");
    private static final javax.xml.namespace.QName TYPE$6 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets a List of "mimBioRef" elements
     */
    public java.util.List<java.lang.String> getMimBioRefList()
    {
        final class MimBioRefList extends java.util.AbstractList<java.lang.String>
        {
            @Override
            public java.lang.String get(int i)
                { return AnchorGlyphTypeImpl.this.getMimBioRefArray(i); }
            
            @Override
            public java.lang.String set(int i, java.lang.String o)
            {
                java.lang.String old = AnchorGlyphTypeImpl.this.getMimBioRefArray(i);
                AnchorGlyphTypeImpl.this.setMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, java.lang.String o)
                { AnchorGlyphTypeImpl.this.insertMimBioRef(i, o); }
            
            @Override
            public java.lang.String remove(int i)
            {
                java.lang.String old = AnchorGlyphTypeImpl.this.getMimBioRefArray(i);
                AnchorGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return AnchorGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
            get_store().find_all_element_users(MIMBIOREF$0, targetList);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$0, i);
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
                { return AnchorGlyphTypeImpl.this.xgetMimBioRefArray(i); }
            
            @Override
            public org.apache.xmlbeans.XmlString set(int i, org.apache.xmlbeans.XmlString o)
            {
                org.apache.xmlbeans.XmlString old = AnchorGlyphTypeImpl.this.xgetMimBioRefArray(i);
                AnchorGlyphTypeImpl.this.xsetMimBioRefArray(i, o);
                return old;
            }
            
            @Override
            public void add(int i, org.apache.xmlbeans.XmlString o)
                { AnchorGlyphTypeImpl.this.insertNewMimBioRef(i).set(o); }
            
            @Override
            public org.apache.xmlbeans.XmlString remove(int i)
            {
                org.apache.xmlbeans.XmlString old = AnchorGlyphTypeImpl.this.xgetMimBioRefArray(i);
                AnchorGlyphTypeImpl.this.removeMimBioRef(i);
                return old;
            }
            
            @Override
            public int size()
                { return AnchorGlyphTypeImpl.this.sizeOfMimBioRefArray(); }
            
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
            get_store().find_all_element_users(MIMBIOREF$0, targetList);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$0, i);
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
            return get_store().count_elements(MIMBIOREF$0);
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
            arraySetterHelper(mimBioRefArray, MIMBIOREF$0);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MIMBIOREF$0, i);
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
            arraySetterHelper(mimBioRefArray, MIMBIOREF$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(MIMBIOREF$0, i);
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
                (org.apache.xmlbeans.SimpleValue)get_store().insert_element_user(MIMBIOREF$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MIMBIOREF$0);
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
            target = (org.apache.xmlbeans.XmlString)get_store().insert_element_user(MIMBIOREF$0, i);
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
            target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(MIMBIOREF$0);
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
            get_store().remove_element(MIMBIOREF$0, i);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$2);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(VISID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(VISID$2);
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
            target = (org.apache.xmlbeans.XmlString)get_store().find_attribute_user(VISID$2);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_attribute_user(VISID$2);
            }
            target.set(visId);
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$4);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITION$4);
            return target;
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
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(POSITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(POSITION$4);
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
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_attribute_user(POSITION$4);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_attribute_user(POSITION$4);
            }
            target.set(position);
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
}
