/*
 * XML Type:  RelationshipXRefType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML RelationshipXRefType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class RelationshipXRefTypeImpl extends gov.nih.nci.lmp.mim.mimVisLevel1.impl.XRefTypeImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType
{
    private static final long serialVersionUID = 1L;
    
    public RelationshipXRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName TYPE$0 = 
        new javax.xml.namespace.QName("", "type");
    
    
    /**
     * Gets the "type" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type.Enum getType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                return null;
            }
            return (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "type" attribute
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type xgetType()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type)get_store().find_attribute_user(TYPE$0);
            return target;
        }
    }
    
    /**
     * Sets the "type" attribute
     */
    public void setType(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type.Enum type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_attribute_user(TYPE$0);
            }
            target.setEnumValue(type);
        }
    }
    
    /**
     * Sets (as xml) the "type" attribute
     */
    public void xsetType(gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type type)
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type)get_store().find_attribute_user(TYPE$0);
            if (target == null)
            {
                target = (gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type)get_store().add_attribute_user(TYPE$0);
            }
            target.set(type);
        }
    }
    /**
     * An XML type(@).
     *
     * This is an atomic type that is a restriction of gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType$Type.
     */
    public static class TypeImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements gov.nih.nci.lmp.mim.mimVisLevel1.RelationshipXRefType.Type
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
