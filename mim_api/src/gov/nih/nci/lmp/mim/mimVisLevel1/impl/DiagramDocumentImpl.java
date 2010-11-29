/*
 * An XML document type.
 * Localname: Diagram
 * Namespace: http://lmp.nci.nih.gov/mim/mimVisLevel1
 * Java type: gov.nih.nci.lmp.mim.mimVisLevel1.DiagramDocument
 *
 * Automatically generated - do not modify.
 */
package gov.nih.nci.lmp.mim.mimVisLevel1.impl;
/**
 * A document containing one Diagram(@http://lmp.nci.nih.gov/mim/mimVisLevel1) element.
 *
 * This is a complex type.
 */
public class DiagramDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements gov.nih.nci.lmp.mim.mimVisLevel1.DiagramDocument
{
    private static final long serialVersionUID = 1L;
    
    public DiagramDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName DIAGRAM$0 = 
        new javax.xml.namespace.QName("http://lmp.nci.nih.gov/mim/mimVisLevel1", "Diagram");
    
    
    /**
     * Gets the "Diagram" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType getDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType)get_store().find_element_user(DIAGRAM$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "Diagram" element
     */
    public void setDiagram(gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType diagram)
    {
        generatedSetterHelperImpl(diagram, DIAGRAM$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "Diagram" element
     */
    public gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType addNewDiagram()
    {
        synchronized (monitor())
        {
            check_orphaned();
            gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType target = null;
            target = (gov.nih.nci.lmp.mim.mimVisLevel1.DiagramType)get_store().add_element_user(DIAGRAM$0);
            return target;
        }
    }
}
