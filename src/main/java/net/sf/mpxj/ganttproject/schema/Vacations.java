//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2021.04.09 at 11:15:26 AM BST
//

package net.sf.mpxj.ganttproject.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * &lt;p&gt;Java class for vacations complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="vacations"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="vacation" type="{}vacation"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "vacations", propOrder =
{
   "vacation"
}) public class Vacations
{

   @XmlElement(required = true) protected Vacation vacation;

   /**
    * Gets the value of the vacation property.
    *
    * @return
    *     possible object is
    *     {@link Vacation }
    *
    */
   public Vacation getVacation()
   {
      return vacation;
   }

   /**
    * Sets the value of the vacation property.
    *
    * @param value
    *     allowed object is
    *     {@link Vacation }
    *
    */
   public void setVacation(Vacation value)
   {
      this.vacation = value;
   }

}
