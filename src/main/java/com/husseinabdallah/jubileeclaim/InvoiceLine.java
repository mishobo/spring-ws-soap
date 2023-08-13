//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.13 at 04:14:59 pm EAT 
//


package com.husseinabdallah.jubileeclaim;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for InvoiceLine complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="InvoiceLine">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceLineStatus" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="InvoiceLineUserStatus" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="Amount" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="DiscountAmount" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="ServiceDate" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="Quantity" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="AdmissionStatus" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *         &lt;element name="ServiceEndDate" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLine"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvoiceLine", propOrder = {
    "invoiceLineStatus",
    "invoiceLineUserStatus",
    "amount",
    "discountAmount",
    "serviceDate",
    "quantity",
    "admissionStatus",
    "serviceEndDate"
})
public class InvoiceLine {

    @XmlElement(name = "InvoiceLineStatus", required = true)
    protected InvoiceLine invoiceLineStatus;
    @XmlElement(name = "InvoiceLineUserStatus", required = true)
    protected InvoiceLine invoiceLineUserStatus;
    @XmlElement(name = "Amount", required = true)
    protected InvoiceLine amount;
    @XmlElement(name = "DiscountAmount", required = true)
    protected InvoiceLine discountAmount;
    @XmlElement(name = "ServiceDate", required = true)
    protected InvoiceLine serviceDate;
    @XmlElement(name = "Quantity", required = true)
    protected InvoiceLine quantity;
    @XmlElement(name = "AdmissionStatus", required = true)
    protected InvoiceLine admissionStatus;
    @XmlElement(name = "ServiceEndDate", required = true)
    protected InvoiceLine serviceEndDate;

    /**
     * Gets the value of the invoiceLineStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getInvoiceLineStatus() {
        return invoiceLineStatus;
    }

    /**
     * Sets the value of the invoiceLineStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setInvoiceLineStatus(InvoiceLine value) {
        this.invoiceLineStatus = value;
    }

    /**
     * Gets the value of the invoiceLineUserStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getInvoiceLineUserStatus() {
        return invoiceLineUserStatus;
    }

    /**
     * Sets the value of the invoiceLineUserStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setInvoiceLineUserStatus(InvoiceLine value) {
        this.invoiceLineUserStatus = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setAmount(InvoiceLine value) {
        this.amount = value;
    }

    /**
     * Gets the value of the discountAmount property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getDiscountAmount() {
        return discountAmount;
    }

    /**
     * Sets the value of the discountAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setDiscountAmount(InvoiceLine value) {
        this.discountAmount = value;
    }

    /**
     * Gets the value of the serviceDate property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getServiceDate() {
        return serviceDate;
    }

    /**
     * Sets the value of the serviceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setServiceDate(InvoiceLine value) {
        this.serviceDate = value;
    }

    /**
     * Gets the value of the quantity property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setQuantity(InvoiceLine value) {
        this.quantity = value;
    }

    /**
     * Gets the value of the admissionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getAdmissionStatus() {
        return admissionStatus;
    }

    /**
     * Sets the value of the admissionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setAdmissionStatus(InvoiceLine value) {
        this.admissionStatus = value;
    }

    /**
     * Gets the value of the serviceEndDate property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLine }
     *     
     */
    public InvoiceLine getServiceEndDate() {
        return serviceEndDate;
    }

    /**
     * Sets the value of the serviceEndDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLine }
     *     
     */
    public void setServiceEndDate(InvoiceLine value) {
        this.serviceEndDate = value;
    }

}