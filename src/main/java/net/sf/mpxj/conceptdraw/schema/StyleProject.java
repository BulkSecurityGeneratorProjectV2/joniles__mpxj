//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2018.07.12 at 04:42:45 PM BST
//

package net.sf.mpxj.conceptdraw.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

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
 *         &lt;element name="RowHeight" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="GridRowStyle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FontName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
{
   "rowHeight",
   "gridRowStyle"
}) @XmlRootElement(name = "StyleProject") public class StyleProject
{

   @XmlElement(name = "RowHeight", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer rowHeight;
   @XmlElement(name = "GridRowStyle", required = true) protected StyleProject.GridRowStyle gridRowStyle;

   /**
    * Gets the value of the rowHeight property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Integer getRowHeight()
   {
      return rowHeight;
   }

   /**
    * Sets the value of the rowHeight property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRowHeight(Integer value)
   {
      this.rowHeight = value;
   }

   /**
    * Gets the value of the gridRowStyle property.
    *
    * @return
    *     possible object is
    *     {@link StyleProject.GridRowStyle }
    *
    */
   public StyleProject.GridRowStyle getGridRowStyle()
   {
      return gridRowStyle;
   }

   /**
    * Sets the value of the gridRowStyle property.
    *
    * @param value
    *     allowed object is
    *     {@link StyleProject.GridRowStyle }
    *
    */
   public void setGridRowStyle(StyleProject.GridRowStyle value)
   {
      this.gridRowStyle = value;
   }

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
    *         &lt;element name="FontName" type="{http://www.w3.org/2001/XMLSchema}string"/>
    *         &lt;element name="FontSize" type="{http://www.w3.org/2001/XMLSchema}int"/>
    *       &lt;/sequence>
    *     &lt;/restriction>
    *   &lt;/complexContent>
    * &lt;/complexType>
    * </pre>
    *
    *
    */
   @XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "", propOrder =
   {
      "fontName",
      "fontSize"
   }) public static class GridRowStyle
   {

      @XmlElement(name = "FontName", required = true) protected String fontName;
      @XmlElement(name = "FontSize", required = true, type = String.class) @XmlJavaTypeAdapter(Adapter5.class) @XmlSchemaType(name = "int") protected Integer fontSize;

      /**
       * Gets the value of the fontName property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public String getFontName()
      {
         return fontName;
      }

      /**
       * Sets the value of the fontName property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setFontName(String value)
      {
         this.fontName = value;
      }

      /**
       * Gets the value of the fontSize property.
       *
       * @return
       *     possible object is
       *     {@link String }
       *
       */
      public Integer getFontSize()
      {
         return fontSize;
      }

      /**
       * Sets the value of the fontSize property.
       *
       * @param value
       *     allowed object is
       *     {@link String }
       *
       */
      public void setFontSize(Integer value)
      {
         this.fontSize = value;
      }

   }

}
