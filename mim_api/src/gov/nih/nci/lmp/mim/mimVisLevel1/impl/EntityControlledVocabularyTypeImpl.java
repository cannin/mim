/*
 * XML Type:  EntityControlledVocabularyType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML EntityControlledVocabularyType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class EntityControlledVocabularyTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType
{
    private static final long serialVersionUID = 1L;
    
    public EntityControlledVocabularyTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "type");
    private static final javax.xml.namespace.QName VISID$2 = 
        new javax.xml.namespace.QName("", "visId");
    
    
    /**
     * Gets the "type" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type)get_store().find_element_user(TYPE$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "type" element
     */
    public boolean isSetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(TYPE$0) != 0;
        }
    }
    
    /**
     * Sets the "type" element
     */
    public void setType(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" element
     */
    public void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type)get_store().find_element_user(TYPE$0, 0);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type)get_store().add_element_user(TYPE$0);
            }
            target.set(type);
        }
    }
    
    /**
     * Unsets the "type" element
     */
    public void unsetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(TYPE$0, 0);
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
     * An XML type(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
     *
     * This is an atomic type that is a restriction of gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nci.lmp.mim.mimVisLevel1.EntityControlledVocabularyType.Type
    {
        private static final long serialVersionUID = 1L;
        
        public TypeImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TypeImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
