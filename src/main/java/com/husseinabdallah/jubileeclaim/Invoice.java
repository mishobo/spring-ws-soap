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
 * <p>Java class for Invoice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Invoice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="InvoiceFrom" type="{http://husseinabdallah.com/jubileeClaim}InvoiceFrom"/>
 *         &lt;element name="InvoiceStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceReference" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ReceivedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeRateToProductBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ExchangeRateToAccountingBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Payee" type="{http://husseinabdallah.com/jubileeClaim}Payee"/>
 *         &lt;element name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ProductClaimAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentExchangeRateDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentExchangeRateToProductBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PaymentExchangeRateToAccountingBaseCurrency" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TreatmentCountryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TreatmentDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="InvoiceLines" type="{http://husseinabdallah.com/jubileeClaim}InvoiceLines"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Invoice", propOrder = {
    "invoiceFrom",
    "invoiceStatus",
    "invoiceReference",
    "invoiceDate",
    "receivedDate",
    "invoiceCurrencyCode",
    "exchangeRateDate",
    "exchangeRateToProductBaseCurrency",
    "exchangeRateToAccountingBaseCurrency",
    "payee",
    "paymentMethod",
    "productClaimAccount",
    "paymentCurrencyCode",
    "paymentExchangeRateDate",
    "paymentExchangeRateToProductBaseCurrency",
    "paymentExchangeRateToAccountingBaseCurrency",
    "treatmentCountryName",
    "treatmentDate",
    "invoiceLines"
})
public class Invoice {

    @XmlElement(name = "InvoiceFrom", required = true)
    protected InvoiceFrom invoiceFrom;
    @XmlElement(name = "InvoiceStatus", required = true)
    protected String invoiceStatus;
    @XmlElement(name = "InvoiceReference", required = true)
    protected String invoiceReference;
    @XmlElement(name = "InvoiceDate", required = true)
    protected String invoiceDate;
    @XmlElement(name = "ReceivedDate", required = true)
    protected String receivedDate;
    @XmlElement(name = "InvoiceCurrencyCode", required = true)
    protected String invoiceCurrencyCode;
    @XmlElement(name = "ExchangeRateDate", required = true)
    protected String exchangeRateDate;
    @XmlElement(name = "ExchangeRateToProductBaseCurrency", required = true)
    protected String exchangeRateToProductBaseCurrency;
    @XmlElement(name = "ExchangeRateToAccountingBaseCurrency", required = true)
    protected String exchangeRateToAccountingBaseCurrency;
    @XmlElement(name = "Payee", required = true)
    protected Payee payee;
    @XmlElement(name = "PaymentMethod", required = true)
    protected String paymentMethod;
    @XmlElement(name = "ProductClaimAccount", required = true)
    protected String productClaimAccount;
    @XmlElement(name = "PaymentCurrencyCode", required = true)
    protected String paymentCurrencyCode;
    @XmlElement(name = "PaymentExchangeRateDate", required = true)
    protected String paymentExchangeRateDate;
    @XmlElement(name = "PaymentExchangeRateToProductBaseCurrency", required = true)
    protected String paymentExchangeRateToProductBaseCurrency;
    @XmlElement(name = "PaymentExchangeRateToAccountingBaseCurrency", required = true)
    protected String paymentExchangeRateToAccountingBaseCurrency;
    @XmlElement(name = "TreatmentCountryName", required = true)
    protected String treatmentCountryName;
    @XmlElement(name = "TreatmentDate", required = true)
    protected String treatmentDate;
    @XmlElement(name = "InvoiceLines", required = true)
    protected InvoiceLines invoiceLines;

    /**
     * Gets the value of the invoiceFrom property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceFrom }
     *     
     */
    public InvoiceFrom getInvoiceFrom() {
        return invoiceFrom;
    }

    /**
     * Sets the value of the invoiceFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceFrom }
     *     
     */
    public void setInvoiceFrom(InvoiceFrom value) {
        this.invoiceFrom = value;
    }

    /**
     * Gets the value of the invoiceStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceStatus() {
        return invoiceStatus;
    }

    /**
     * Sets the value of the invoiceStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceStatus(String value) {
        this.invoiceStatus = value;
    }

    /**
     * Gets the value of the invoiceReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceReference() {
        return invoiceReference;
    }

    /**
     * Sets the value of the invoiceReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceReference(String value) {
        this.invoiceReference = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceDate(String value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the receivedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReceivedDate() {
        return receivedDate;
    }

    /**
     * Sets the value of the receivedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReceivedDate(String value) {
        this.receivedDate = value;
    }

    /**
     * Gets the value of the invoiceCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceCurrencyCode() {
        return invoiceCurrencyCode;
    }

    /**
     * Sets the value of the invoiceCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceCurrencyCode(String value) {
        this.invoiceCurrencyCode = value;
    }

    /**
     * Gets the value of the exchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateDate() {
        return exchangeRateDate;
    }

    /**
     * Sets the value of the exchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateDate(String value) {
        this.exchangeRateDate = value;
    }

    /**
     * Gets the value of the exchangeRateToProductBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateToProductBaseCurrency() {
        return exchangeRateToProductBaseCurrency;
    }

    /**
     * Sets the value of the exchangeRateToProductBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateToProductBaseCurrency(String value) {
        this.exchangeRateToProductBaseCurrency = value;
    }

    /**
     * Gets the value of the exchangeRateToAccountingBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExchangeRateToAccountingBaseCurrency() {
        return exchangeRateToAccountingBaseCurrency;
    }

    /**
     * Sets the value of the exchangeRateToAccountingBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExchangeRateToAccountingBaseCurrency(String value) {
        this.exchangeRateToAccountingBaseCurrency = value;
    }

    /**
     * Gets the value of the payee property.
     * 
     * @return
     *     possible object is
     *     {@link Payee }
     *     
     */
    public Payee getPayee() {
        return payee;
    }

    /**
     * Sets the value of the payee property.
     * 
     * @param value
     *     allowed object is
     *     {@link Payee }
     *     
     */
    public void setPayee(Payee value) {
        this.payee = value;
    }

    /**
     * Gets the value of the paymentMethod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * Sets the value of the paymentMethod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentMethod(String value) {
        this.paymentMethod = value;
    }

    /**
     * Gets the value of the productClaimAccount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductClaimAccount() {
        return productClaimAccount;
    }

    /**
     * Sets the value of the productClaimAccount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductClaimAccount(String value) {
        this.productClaimAccount = value;
    }

    /**
     * Gets the value of the paymentCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentCurrencyCode() {
        return paymentCurrencyCode;
    }

    /**
     * Sets the value of the paymentCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentCurrencyCode(String value) {
        this.paymentCurrencyCode = value;
    }

    /**
     * Gets the value of the paymentExchangeRateDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentExchangeRateDate() {
        return paymentExchangeRateDate;
    }

    /**
     * Sets the value of the paymentExchangeRateDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentExchangeRateDate(String value) {
        this.paymentExchangeRateDate = value;
    }

    /**
     * Gets the value of the paymentExchangeRateToProductBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentExchangeRateToProductBaseCurrency() {
        return paymentExchangeRateToProductBaseCurrency;
    }

    /**
     * Sets the value of the paymentExchangeRateToProductBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentExchangeRateToProductBaseCurrency(String value) {
        this.paymentExchangeRateToProductBaseCurrency = value;
    }

    /**
     * Gets the value of the paymentExchangeRateToAccountingBaseCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentExchangeRateToAccountingBaseCurrency() {
        return paymentExchangeRateToAccountingBaseCurrency;
    }

    /**
     * Sets the value of the paymentExchangeRateToAccountingBaseCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentExchangeRateToAccountingBaseCurrency(String value) {
        this.paymentExchangeRateToAccountingBaseCurrency = value;
    }

    /**
     * Gets the value of the treatmentCountryName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentCountryName() {
        return treatmentCountryName;
    }

    /**
     * Sets the value of the treatmentCountryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentCountryName(String value) {
        this.treatmentCountryName = value;
    }

    /**
     * Gets the value of the treatmentDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTreatmentDate() {
        return treatmentDate;
    }

    /**
     * Sets the value of the treatmentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTreatmentDate(String value) {
        this.treatmentDate = value;
    }

    /**
     * Gets the value of the invoiceLines property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceLines }
     *     
     */
    public InvoiceLines getInvoiceLines() {
        return invoiceLines;
    }

    /**
     * Sets the value of the invoiceLines property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceLines }
     *     
     */
    public void setInvoiceLines(InvoiceLines value) {
        this.invoiceLines = value;
    }

}
