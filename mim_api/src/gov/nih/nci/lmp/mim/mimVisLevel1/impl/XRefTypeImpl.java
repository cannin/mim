/*
 * XML Type:  XRefType
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.XRefType
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * An XML XRefType(@http://lmp.nci.nih.gov/mim/mimVisLevel1).
 *
 * This is a complex type.
 */
public class XRefTypeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.XRefType
{
    private static final long serialVersionUID = 1L;
    
    public XRefTypeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DB$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "db");
    private static final javax.xml.namespace.QName DBVERSION$2 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "dbVersion");
    private static final javax.xml.namespace.QName ID$4 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "id");
    private static final javax.xml.namespace.QName IDVERSION$6 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "idVersion");
    private static final javax.xml.namespace.QName VISID$8 = 
        new javax.xml.namespace.QName("", "visId");
    
    
    /**
     * Gets the "db" element
     */
    public java.lang.String getDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "db" element
     */
    public org.apache.xmlbeans.XmlString xgetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
            return target;
        }
    }
    
    /**
     * True if has "db" element
     */
    public boolean isSetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DB$0) != 0;
        }
    }
    
    /**
     * Sets the "db" element
     */
    public void setDb(java.lang.String db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DB$0);
            }
            target.setStringValue(db);
        }
    }
    
    /**
     * Sets (as xml) the "db" element
     */
    public void xsetDb(org.apache.xmlbeans.XmlString db)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DB$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DB$0);
            }
            target.set(db);
        }
    }
    
    /**
     * Unsets the "db" element
     */
    public void unsetDb()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DB$0, 0);
        }
    }
    
    /**
     * Gets the "dbVersion" element
     */
    public java.lang.String getDbVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBVERSION$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "dbVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetDbVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBVERSION$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "dbVersion" element
     */
    public boolean isSetDbVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DBVERSION$2) != 0;
        }
    }
    
    /**
     * Sets the "dbVersion" element
     */
    public void setDbVersion(java.lang.String dbVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DBVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DBVERSION$2);
            }
            target.setStringValue(dbVersion);
        }
    }
    
    /**
     * Sets (as xml) the "dbVersion" element
     */
    public void xsetDbVersion(org.apache.xmlbeans.XmlString dbVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DBVERSION$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DBVERSION$2);
            }
            target.set(dbVersion);
        }
    }
    
    /**
     * Unsets the "dbVersion" element
     */
    public void unsetDbVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DBVERSION$2, 0);
        }
    }
    
    /**
     * Gets the "id" element
     */
    public java.lang.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "id" element
     */
    public org.apache.xmlbeans.XmlString xgetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "id" element
     */
    public boolean isSetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(ID$4) != 0;
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(java.lang.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ID$4);
            }
            target.setStringValue(id);
        }
    }
    
    /**
     * Sets (as xml) the "id" element
     */
    public void xsetId(org.apache.xmlbeans.XmlString id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(ID$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(ID$4);
            }
            target.set(id);
        }
    }
    
    /**
     * Unsets the "id" element
     */
    public void unsetId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(ID$4, 0);
        }
    }
    
    /**
     * Gets the "idVersion" element
     */
    public java.lang.String getIdVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDVERSION$6, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "idVersion" element
     */
    public org.apache.xmlbeans.XmlString xgetIdVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDVERSION$6, 0);
            return target;
        }
    }
    
    /**
     * True if has "idVersion" element
     */
    public boolean isSetIdVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(IDVERSION$6) != 0;
        }
    }
    
    /**
     * Sets the "idVersion" element
     */
    public void setIdVersion(java.lang.String idVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IDVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IDVERSION$6);
            }
            target.setStringValue(idVersion);
        }
    }
    
    /**
     * Sets (as xml) the "idVersion" element
     */
    public void xsetIdVersion(org.apache.xmlbeans.XmlString idVersion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IDVERSION$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IDVERSION$6);
            }
            target.set(idVersion);
        }
    }
    
    /**
     * Unsets the "idVersion" element
     */
    public void unsetIdVersion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(IDVERSION$6, 0);
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
}
