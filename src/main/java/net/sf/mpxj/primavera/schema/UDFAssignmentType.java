//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.12.29 at 11:06:27 AM GMT
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
 * &lt;p&gt;Java class for UDFAssignmentType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="UDFAssignmentType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="TypeObjectId" type="{http://www.w3.org/2001/XMLSchema}int"/&amp;gt;
 *         &amp;lt;element name="CodeObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CostValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IntegerValue" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IndicatorValue" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="None"/&amp;gt;
 *               &amp;lt;enumeration value="Red"/&amp;gt;
 *               &amp;lt;enumeration value="Yellow"/&amp;gt;
 *               &amp;lt;enumeration value="Green"/&amp;gt;
 *               &amp;lt;enumeration value="Blue"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="DoubleValue" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="TextValue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartDateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="FinishDateValue" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "UDFAssignmentType", propOrder =
{
   "typeObjectId",
   "codeObjectId",
   "costValue",
   "integerValue",
   "indicatorValue",
   "doubleValue",
   "textValue",
   "startDateValue",
   "finishDateValue"
}) public class UDFAssignmentType
{

   @XmlElement(name = "TypeObjectId") protected int typeObjectId;
   @XmlElement(name = "CodeObjectId") protected Integer codeObjectId;
   @XmlElement(name = "CostValue") protected Double costValue;
   @XmlElement(name = "IntegerValue") protected Integer integerValue;
   @XmlElement(name = "IndicatorValue") protected String indicatorValue;
   @XmlElement(name = "DoubleValue") protected Double doubleValue;
   @XmlElement(name = "TextValue") protected String textValue;
   @XmlElement(name = "StartDateValue", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date startDateValue;
   @XmlElement(name = "FinishDateValue", type = String.class) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date finishDateValue;

   /**
    * Gets the value of the typeObjectId property.
    *
    */
   public int getTypeObjectId()
   {
      return typeObjectId;
   }

   /**
    * Sets the value of the typeObjectId property.
    *
    */
   public void setTypeObjectId(int value)
   {
      this.typeObjectId = value;
   }

   /**
    * Gets the value of the codeObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getCodeObjectId()
   {
      return codeObjectId;
   }

   /**
    * Sets the value of the codeObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setCodeObjectId(Integer value)
   {
      this.codeObjectId = value;
   }

   /**
    * Gets the value of the costValue property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getCostValue()
   {
      return costValue;
   }

   /**
    * Sets the value of the costValue property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setCostValue(Double value)
   {
      this.costValue = value;
   }

   /**
    * Gets the value of the integerValue property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getIntegerValue()
   {
      return integerValue;
   }

   /**
    * Sets the value of the integerValue property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setIntegerValue(Integer value)
   {
      this.integerValue = value;
   }

   /**
    * Gets the value of the indicatorValue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getIndicatorValue()
   {
      return indicatorValue;
   }

   /**
    * Sets the value of the indicatorValue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setIndicatorValue(String value)
   {
      this.indicatorValue = value;
   }

   /**
    * Gets the value of the doubleValue property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getDoubleValue()
   {
      return doubleValue;
   }

   /**
    * Sets the value of the doubleValue property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setDoubleValue(Double value)
   {
      this.doubleValue = value;
   }

   /**
    * Gets the value of the textValue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getTextValue()
   {
      return textValue;
   }

   /**
    * Sets the value of the textValue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setTextValue(String value)
   {
      this.textValue = value;
   }

   /**
    * Gets the value of the startDateValue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getStartDateValue()
   {
      return startDateValue;
   }

   /**
    * Sets the value of the startDateValue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setStartDateValue(Date value)
   {
      this.startDateValue = value;
   }

   /**
    * Gets the value of the finishDateValue property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getFinishDateValue()
   {
      return finishDateValue;
   }

   /**
    * Sets the value of the finishDateValue property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setFinishDateValue(Date value)
   {
      this.finishDateValue = value;
   }

}
