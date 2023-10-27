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
 * <p>Java class for Claim complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Claim">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PolicyId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="PolicyEffectiveDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ClaimDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Beneficiary" type="{http://husseinabdallah.com/jubileeClaim}Beneficiary"/>
 *         &lt;element name="PrimaryDiagnosisICD10Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreatedByUsername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="CreatedDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="FirstConsultationDate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ConditionStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Treatments" type="{http://husseinabdallah.com/jubileeClaim}Treatments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Claim", propOrder = {
    "policyId",
    "policyEffectiveDate",
    "claimDate",
    "beneficiary",
    "primaryDiagnosisICD10Code",
    "createdByUsername",
    "createdDate",
    "firstConsultationDate",
    "conditionStatus",
    "treatments"
})
public class Claim {

    @XmlElement(name = "PolicyId")
    protected int policyId;
    @XmlElement(name = "PolicyEffectiveDate", required = true)
    protected String policyEffectiveDate;
    @XmlElement(name = "ClaimDate", required = true)
    protected String claimDate;
    @XmlElement(name = "Beneficiary", required = true)
    protected Beneficiary beneficiary;
    @XmlElement(name = "PrimaryDiagnosisICD10Code", required = true)
    protected String primaryDiagnosisICD10Code;
    @XmlElement(name = "CreatedByUsername", required = true)
    protected String createdByUsername;
    @XmlElement(name = "CreatedDate", required = true)
    protected String createdDate;
    @XmlElement(name = "FirstConsultationDate", required = true)
    protected String firstConsultationDate;
    @XmlElement(name = "ConditionStatus", required = true)
    protected String conditionStatus;
    @XmlElement(name = "Treatments", required = true)
    protected Treatments treatments;

    /**
     * Gets the value of the policyId property.
     * 
     */
    public int getPolicyId() {
        return policyId;
    }

    /**
     * Sets the value of the policyId property.
     * 
     */
    public void setPolicyId(int value) {
        this.policyId = value;
    }

    /**
     * Gets the value of the policyEffectiveDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyEffectiveDate() {
        return policyEffectiveDate;
    }

    /**
     * Sets the value of the policyEffectiveDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyEffectiveDate(String value) {
        this.policyEffectiveDate = value;
    }

    /**
     * Gets the value of the claimDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClaimDate() {
        return claimDate;
    }

    /**
     * Sets the value of the claimDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClaimDate(String value) {
        this.claimDate = value;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link Beneficiary }
     *     
     */
    public Beneficiary getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link Beneficiary }
     *     
     */
    public void setBeneficiary(Beneficiary value) {
        this.beneficiary = value;
    }

    /**
     * Gets the value of the primaryDiagnosisICD10Code property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrimaryDiagnosisICD10Code() {
        return primaryDiagnosisICD10Code;
    }

    /**
     * Sets the value of the primaryDiagnosisICD10Code property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrimaryDiagnosisICD10Code(String value) {
        this.primaryDiagnosisICD10Code = value;
    }

    /**
     * Gets the value of the createdByUsername property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedByUsername() {
        return createdByUsername;
    }

    /**
     * Sets the value of the createdByUsername property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedByUsername(String value) {
        this.createdByUsername = value;
    }

    /**
     * Gets the value of the createdDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatedDate() {
        return createdDate;
    }

    /**
     * Sets the value of the createdDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatedDate(String value) {
        this.createdDate = value;
    }

    /**
     * Gets the value of the firstConsultationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstConsultationDate() {
        return firstConsultationDate;
    }

    /**
     * Sets the value of the firstConsultationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstConsultationDate(String value) {
        this.firstConsultationDate = value;
    }

    /**
     * Gets the value of the conditionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConditionStatus() {
        return conditionStatus;
    }

    /**
     * Sets the value of the conditionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConditionStatus(String value) {
        this.conditionStatus = value;
    }

    /**
     * Gets the value of the treatments property.
     * 
     * @return
     *     possible object is
     *     {@link Treatments }
     *     
     */
    public Treatments getTreatments() {
        return treatments;
    }

    /**
     * Sets the value of the treatments property.
     * 
     * @param value
     *     allowed object is
     *     {@link Treatments }
     *     
     */
    public void setTreatments(Treatments value) {
        this.treatments = value;
    }

}
