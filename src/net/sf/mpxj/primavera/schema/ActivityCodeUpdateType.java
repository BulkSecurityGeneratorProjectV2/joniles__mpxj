//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2013.08.02 at 12:16:58 PM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

/**
 * <p>Java class for ActivityCodeUpdateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ActivityCodeUpdateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ActivityCodeType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ActivityCodeTypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ApprovalDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="ApprovalUserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="255"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ApprovalUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ChangeSetObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="HeldDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="OverrideActivityCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="OverrideActivityCodeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="PendingActivityCodeId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="PendingActivityCodeName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RequestUserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="Status" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Pending"/>
 *               &lt;enumeration value="Held"/>
 *               &lt;enumeration value="Approved"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ActivityCodeUpdateType", propOrder =
{
   "activityCodeType",
   "activityCodeTypeObjectId",
   "activityObjectId",
   "approvalDate",
   "approvalUserName",
   "approvalUserObjectId",
   "changeSetObjectId",
   "date",
   "heldDate",
   "overrideActivityCodeId",
   "overrideActivityCodeName",
   "pendingActivityCodeId",
   "pendingActivityCodeName",
   "projectObjectId",
   "requestUserObjectId",
   "status"
}) public class ActivityCodeUpdateType
{

   @XmlElement(name = "ActivityCodeType") protected String activityCodeType;
   @XmlElement(name = "ActivityCodeTypeObjectId") protected Integer activityCodeTypeObjectId;
   @XmlElement(name = "ActivityObjectId") protected Integer activityObjectId;
   @XmlElement(name = "ApprovalDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date approvalDate;
   @XmlElement(name = "ApprovalUserName") protected String approvalUserName;
   @XmlElement(name = "ApprovalUserObjectId", nillable = true) protected Integer approvalUserObjectId;
   @XmlElement(name = "ChangeSetObjectId") protected Integer changeSetObjectId;
   @XmlElement(name = "Date", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date date;
   @XmlElement(name = "HeldDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date heldDate;
   @XmlElement(name = "OverrideActivityCodeId", nillable = true) protected Integer overrideActivityCodeId;
   @XmlElement(name = "OverrideActivityCodeName") protected String overrideActivityCodeName;
   @XmlElement(name = "PendingActivityCodeId", nillable = true) protected Integer pendingActivityCodeId;
   @XmlElement(name = "PendingActivityCodeName") protected String pendingActivityCodeName;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "RequestUserObjectId", nillable = true) protected Integer requestUserObjectId;
   @XmlElement(name = "Status") protected String status;

   /**
    * Gets the value of the activityCodeType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getActivityCodeType()
   {
      return activityCodeType;
   }

   /**
    * Sets the value of the activityCodeType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setActivityCodeType(String value)
   {
      this.activityCodeType = value;
   }

   /**
    * Gets the value of the activityCodeTypeObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getActivityCodeTypeObjectId()
   {
      return activityCodeTypeObjectId;
   }

   /**
    * Sets the value of the activityCodeTypeObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setActivityCodeTypeObjectId(Integer value)
   {
      this.activityCodeTypeObjectId = value;
   }

   /**
    * Gets the value of the activityObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getActivityObjectId()
   {
      return activityObjectId;
   }

   /**
    * Sets the value of the activityObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setActivityObjectId(Integer value)
   {
      this.activityObjectId = value;
   }

   /**
    * Gets the value of the approvalDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getApprovalDate()
   {
      return approvalDate;
   }

   /**
    * Sets the value of the approvalDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setApprovalDate(Date value)
   {
      this.approvalDate = value;
   }

   /**
    * Gets the value of the approvalUserName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getApprovalUserName()
   {
      return approvalUserName;
   }

   /**
    * Sets the value of the approvalUserName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setApprovalUserName(String value)
   {
      this.approvalUserName = value;
   }

   /**
    * Gets the value of the approvalUserObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getApprovalUserObjectId()
   {
      return approvalUserObjectId;
   }

   /**
    * Sets the value of the approvalUserObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setApprovalUserObjectId(Integer value)
   {
      this.approvalUserObjectId = value;
   }

   /**
    * Gets the value of the changeSetObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getChangeSetObjectId()
   {
      return changeSetObjectId;
   }

   /**
    * Sets the value of the changeSetObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setChangeSetObjectId(Integer value)
   {
      this.changeSetObjectId = value;
   }

   /**
    * Gets the value of the date property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDate(Date value)
   {
      this.date = value;
   }

   /**
    * Gets the value of the heldDate property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public Date getHeldDate()
   {
      return heldDate;
   }

   /**
    * Sets the value of the heldDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setHeldDate(Date value)
   {
      this.heldDate = value;
   }

   /**
    * Gets the value of the overrideActivityCodeId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getOverrideActivityCodeId()
   {
      return overrideActivityCodeId;
   }

   /**
    * Sets the value of the overrideActivityCodeId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setOverrideActivityCodeId(Integer value)
   {
      this.overrideActivityCodeId = value;
   }

   /**
    * Gets the value of the overrideActivityCodeName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getOverrideActivityCodeName()
   {
      return overrideActivityCodeName;
   }

   /**
    * Sets the value of the overrideActivityCodeName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setOverrideActivityCodeName(String value)
   {
      this.overrideActivityCodeName = value;
   }

   /**
    * Gets the value of the pendingActivityCodeId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getPendingActivityCodeId()
   {
      return pendingActivityCodeId;
   }

   /**
    * Sets the value of the pendingActivityCodeId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setPendingActivityCodeId(Integer value)
   {
      this.pendingActivityCodeId = value;
   }

   /**
    * Gets the value of the pendingActivityCodeName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getPendingActivityCodeName()
   {
      return pendingActivityCodeName;
   }

   /**
    * Sets the value of the pendingActivityCodeName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setPendingActivityCodeName(String value)
   {
      this.pendingActivityCodeName = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the requestUserObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getRequestUserObjectId()
   {
      return requestUserObjectId;
   }

   /**
    * Sets the value of the requestUserObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setRequestUserObjectId(Integer value)
   {
      this.requestUserObjectId = value;
   }

   /**
    * Gets the value of the status property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getStatus()
   {
      return status;
   }

   /**
    * Sets the value of the status property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setStatus(String value)
   {
      this.status = value;
   }

}