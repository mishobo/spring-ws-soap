//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.26 at 10:24:17 pm EAT 
//


package com.husseinabdallah.jubileeclaim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLines complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLines">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceLine" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLines", propOrder = {
    "invoiceLine"
})
public class InvoiceLines {

    @XmlElement(name = "InvoiceLine", required = true)
    protected InvoiceLine invoiceLine;

    /**
     * Gets the value of the invoiceLine property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getInvoiceLine() {
        return invoiceLine;
    }

    /**
     * Sets the value of the invoiceLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setInvoiceLine(InvoiceLine value) {
        this.invoiceLine = value;
    }

}
