//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.08.10 at 09:43:45 pm EAT 
//


package com.in28minutes.students;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StudentDetails" type="{http://in28minutes.com/students}StudentDetails"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "studentDetails"
})
@XmlRootElement(name = "GetStudentDetailsResponse")
public class GetStudentDetailsResponse {

    @XmlElement(name = "StudentDetails", required = true)
    protected StudentDetails studentDetails;

    /**
     * Gets the value of the studentDetails property.
     * 
     * @return
     *     possible object is
     *     {@link StudentDetails }
     *     
     */
    public StudentDetails getStudentDetails() {
        return studentDetails;
    }

    /**
     * Sets the value of the studentDetails property.
     * 
     * @param value
     *     allowed object is
     *     {@link StudentDetails }
     *     
     */
    public void setStudentDetails(StudentDetails value) {
        this.studentDetails = value;
    }

}
