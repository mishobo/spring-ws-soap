//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.10.15 at 04:27:06 pm EAT 
//


package com.husseinabdallah.jubileeclaim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceFrom complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceFrom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActisureId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceFrom", propOrder = {
    "actisureId"
})
public class InvoiceFrom {

    @XmlElement(name = "ActisureId", required = true)
    protected String actisureId;

    /**
     * Gets the value of the actisureId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getActisureId() {
        return actisureId;
    }

    /**
     * Sets the value of the actisureId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setActisureId(String value) {
        this.actisureId = value;
    }

}
