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
 * &lt;p&gt;Java class for ScheduleOptionsType complex type.
 *
 * &lt;p&gt;The following schema fragment specifies the expected content contained within this class.
 *
 * &lt;pre&gt;
 * &amp;lt;complexType name="ScheduleOptionsType"&amp;gt;
 *   &amp;lt;complexContent&amp;gt;
 *     &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&amp;gt;
 *       &amp;lt;sequence&amp;gt;
 *         &amp;lt;element name="CalculateFloatBasedOnFinishDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ComputeTotalFloatType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Start Float = Late Start - Early Start"/&amp;gt;
 *               &amp;lt;enumeration value="Finish Float = Late Finish - Early Finish"/&amp;gt;
 *               &amp;lt;enumeration value="Smallest of Start Float and Finish Float"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CreateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="CriticalActivityFloatThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="CriticalActivityPathType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Critical Float"/&amp;gt;
 *               &amp;lt;enumeration value="Longest Path"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ExternalProjectPriorityLimit" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IgnoreOtherProjectRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="IncludeExternalResAss" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LastUpdateUser" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="LevelAllResources" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="LevelWithinFloat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MakeOpenEndedActivitiesCritical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MaximumMultipleFloatPaths" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&amp;gt;
 *               &amp;lt;minInclusive value="0"/&amp;gt;
 *               &amp;lt;maxInclusive value="1000"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="MinFloatToPreserve" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MultipleFloatPathsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MultipleFloatPathsEndingActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MultipleFloatPathsEndingActivityShortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="MultipleFloatPathsUseTotalFloat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="OutOfSequenceScheduleType" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value=""/&amp;gt;
 *               &amp;lt;enumeration value="Retained Logic"/&amp;gt;
 *               &amp;lt;enumeration value="Progress Override"/&amp;gt;
 *               &amp;lt;enumeration value="Actual Dates"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="OverAllocationPercentage" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PreserveScheduledEarlyAndLateDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="PriorityList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="ProjectId" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="40"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="RelationshipLagCalendar" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;enumeration value="Predecessor Activity Calendar"/&amp;gt;
 *               &amp;lt;enumeration value="Successor Activity Calendar"/&amp;gt;
 *               &amp;lt;enumeration value="24 Hour Calendar"/&amp;gt;
 *               &amp;lt;enumeration value="Project Default Calendar"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="ResourceList" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="StartToStartLagCalculationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UseExpectedFinishDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&amp;gt;
 *         &amp;lt;element name="UserName" minOccurs="0"&amp;gt;
 *           &amp;lt;simpleType&amp;gt;
 *             &amp;lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&amp;gt;
 *               &amp;lt;maxLength value="255"/&amp;gt;
 *             &amp;lt;/restriction&amp;gt;
 *           &amp;lt;/simpleType&amp;gt;
 *         &amp;lt;/element&amp;gt;
 *         &amp;lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&amp;gt;
 *       &amp;lt;/sequence&amp;gt;
 *     &amp;lt;/restriction&amp;gt;
 *   &amp;lt;/complexContent&amp;gt;
 * &amp;lt;/complexType&amp;gt;
 * &lt;/pre&gt;
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ScheduleOptionsType", propOrder =
{
   "calculateFloatBasedOnFinishDate",
   "computeTotalFloatType",
   "createDate",
   "createUser",
   "criticalActivityFloatThreshold",
   "criticalActivityPathType",
   "externalProjectPriorityLimit",
   "ignoreOtherProjectRelationships",
   "includeExternalResAss",
   "lastUpdateDate",
   "lastUpdateUser",
   "levelAllResources",
   "levelWithinFloat",
   "makeOpenEndedActivitiesCritical",
   "maximumMultipleFloatPaths",
   "minFloatToPreserve",
   "multipleFloatPathsEnabled",
   "multipleFloatPathsEndingActivityObjectId",
   "multipleFloatPathsEndingActivityShortName",
   "multipleFloatPathsUseTotalFloat",
   "outOfSequenceScheduleType",
   "overAllocationPercentage",
   "preserveScheduledEarlyAndLateDates",
   "priorityList",
   "projectId",
   "projectObjectId",
   "relationshipLagCalendar",
   "resourceList",
   "startToStartLagCalculationType",
   "useExpectedFinishDates",
   "userName",
   "userObjectId"
}) public class ScheduleOptionsType
{

   @XmlElement(name = "CalculateFloatBasedOnFinishDate", nillable = true) protected Boolean calculateFloatBasedOnFinishDate;
   @XmlElement(name = "ComputeTotalFloatType") protected String computeTotalFloatType;
   @XmlElement(name = "CreateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "CriticalActivityFloatThreshold", nillable = true) protected Double criticalActivityFloatThreshold;
   @XmlElement(name = "CriticalActivityPathType") protected String criticalActivityPathType;
   @XmlElement(name = "ExternalProjectPriorityLimit", nillable = true) protected Integer externalProjectPriorityLimit;
   @XmlElement(name = "IgnoreOtherProjectRelationships", nillable = true) protected Boolean ignoreOtherProjectRelationships;
   @XmlElement(name = "IncludeExternalResAss", nillable = true) protected Boolean includeExternalResAss;
   @XmlElement(name = "LastUpdateDate", type = String.class, nillable = true) @XmlJavaTypeAdapter(Adapter1.class) @XmlSchemaType(name = "dateTime") protected Date lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "LevelAllResources", nillable = true) protected Boolean levelAllResources;
   @XmlElement(name = "LevelWithinFloat", nillable = true) protected Boolean levelWithinFloat;
   @XmlElement(name = "MakeOpenEndedActivitiesCritical", nillable = true) protected Boolean makeOpenEndedActivitiesCritical;
   @XmlElement(name = "MaximumMultipleFloatPaths", nillable = true) protected Integer maximumMultipleFloatPaths;
   @XmlElement(name = "MinFloatToPreserve", nillable = true) protected Integer minFloatToPreserve;
   @XmlElement(name = "MultipleFloatPathsEnabled", nillable = true) protected Boolean multipleFloatPathsEnabled;
   @XmlElement(name = "MultipleFloatPathsEndingActivityObjectId", nillable = true) protected Integer multipleFloatPathsEndingActivityObjectId;
   @XmlElement(name = "MultipleFloatPathsEndingActivityShortName") protected String multipleFloatPathsEndingActivityShortName;
   @XmlElement(name = "MultipleFloatPathsUseTotalFloat", nillable = true) protected Boolean multipleFloatPathsUseTotalFloat;
   @XmlElement(name = "OutOfSequenceScheduleType") protected String outOfSequenceScheduleType;
   @XmlElement(name = "OverAllocationPercentage", nillable = true) protected Double overAllocationPercentage;
   @XmlElement(name = "PreserveScheduledEarlyAndLateDates", nillable = true) protected Boolean preserveScheduledEarlyAndLateDates;
   @XmlElement(name = "PriorityList", nillable = true) protected String priorityList;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId", nillable = true) protected Integer projectObjectId;
   @XmlElement(name = "RelationshipLagCalendar") protected String relationshipLagCalendar;
   @XmlElement(name = "ResourceList", nillable = true) protected String resourceList;
   @XmlElement(name = "StartToStartLagCalculationType", nillable = true) protected Boolean startToStartLagCalculationType;
   @XmlElement(name = "UseExpectedFinishDates", nillable = true) protected Boolean useExpectedFinishDates;
   @XmlElement(name = "UserName") protected String userName;
   @XmlElement(name = "UserObjectId", nillable = true) protected Integer userObjectId;

   /**
    * Gets the value of the calculateFloatBasedOnFinishDate property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isCalculateFloatBasedOnFinishDate()
   {
      return calculateFloatBasedOnFinishDate;
   }

   /**
    * Sets the value of the calculateFloatBasedOnFinishDate property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setCalculateFloatBasedOnFinishDate(Boolean value)
   {
      this.calculateFloatBasedOnFinishDate = value;
   }

   /**
    * Gets the value of the computeTotalFloatType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getComputeTotalFloatType()
   {
      return computeTotalFloatType;
   }

   /**
    * Sets the value of the computeTotalFloatType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setComputeTotalFloatType(String value)
   {
      this.computeTotalFloatType = value;
   }

   /**
    * Gets the value of the createDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateDate(Date value)
   {
      this.createDate = value;
   }

   /**
    * Gets the value of the createUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the criticalActivityFloatThreshold property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getCriticalActivityFloatThreshold()
   {
      return criticalActivityFloatThreshold;
   }

   /**
    * Sets the value of the criticalActivityFloatThreshold property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setCriticalActivityFloatThreshold(Double value)
   {
      this.criticalActivityFloatThreshold = value;
   }

   /**
    * Gets the value of the criticalActivityPathType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getCriticalActivityPathType()
   {
      return criticalActivityPathType;
   }

   /**
    * Sets the value of the criticalActivityPathType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setCriticalActivityPathType(String value)
   {
      this.criticalActivityPathType = value;
   }

   /**
    * Gets the value of the externalProjectPriorityLimit property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getExternalProjectPriorityLimit()
   {
      return externalProjectPriorityLimit;
   }

   /**
    * Sets the value of the externalProjectPriorityLimit property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setExternalProjectPriorityLimit(Integer value)
   {
      this.externalProjectPriorityLimit = value;
   }

   /**
    * Gets the value of the ignoreOtherProjectRelationships property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIgnoreOtherProjectRelationships()
   {
      return ignoreOtherProjectRelationships;
   }

   /**
    * Sets the value of the ignoreOtherProjectRelationships property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIgnoreOtherProjectRelationships(Boolean value)
   {
      this.ignoreOtherProjectRelationships = value;
   }

   /**
    * Gets the value of the includeExternalResAss property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isIncludeExternalResAss()
   {
      return includeExternalResAss;
   }

   /**
    * Sets the value of the includeExternalResAss property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setIncludeExternalResAss(Boolean value)
   {
      this.includeExternalResAss = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public Date getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateDate(Date value)
   {
      this.lastUpdateDate = value;
   }

   /**
    * Gets the value of the lastUpdateUser property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the levelAllResources property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isLevelAllResources()
   {
      return levelAllResources;
   }

   /**
    * Sets the value of the levelAllResources property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setLevelAllResources(Boolean value)
   {
      this.levelAllResources = value;
   }

   /**
    * Gets the value of the levelWithinFloat property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isLevelWithinFloat()
   {
      return levelWithinFloat;
   }

   /**
    * Sets the value of the levelWithinFloat property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setLevelWithinFloat(Boolean value)
   {
      this.levelWithinFloat = value;
   }

   /**
    * Gets the value of the makeOpenEndedActivitiesCritical property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isMakeOpenEndedActivitiesCritical()
   {
      return makeOpenEndedActivitiesCritical;
   }

   /**
    * Sets the value of the makeOpenEndedActivitiesCritical property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setMakeOpenEndedActivitiesCritical(Boolean value)
   {
      this.makeOpenEndedActivitiesCritical = value;
   }

   /**
    * Gets the value of the maximumMultipleFloatPaths property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getMaximumMultipleFloatPaths()
   {
      return maximumMultipleFloatPaths;
   }

   /**
    * Sets the value of the maximumMultipleFloatPaths property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setMaximumMultipleFloatPaths(Integer value)
   {
      this.maximumMultipleFloatPaths = value;
   }

   /**
    * Gets the value of the minFloatToPreserve property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getMinFloatToPreserve()
   {
      return minFloatToPreserve;
   }

   /**
    * Sets the value of the minFloatToPreserve property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setMinFloatToPreserve(Integer value)
   {
      this.minFloatToPreserve = value;
   }

   /**
    * Gets the value of the multipleFloatPathsEnabled property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isMultipleFloatPathsEnabled()
   {
      return multipleFloatPathsEnabled;
   }

   /**
    * Sets the value of the multipleFloatPathsEnabled property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setMultipleFloatPathsEnabled(Boolean value)
   {
      this.multipleFloatPathsEnabled = value;
   }

   /**
    * Gets the value of the multipleFloatPathsEndingActivityObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getMultipleFloatPathsEndingActivityObjectId()
   {
      return multipleFloatPathsEndingActivityObjectId;
   }

   /**
    * Sets the value of the multipleFloatPathsEndingActivityObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setMultipleFloatPathsEndingActivityObjectId(Integer value)
   {
      this.multipleFloatPathsEndingActivityObjectId = value;
   }

   /**
    * Gets the value of the multipleFloatPathsEndingActivityShortName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getMultipleFloatPathsEndingActivityShortName()
   {
      return multipleFloatPathsEndingActivityShortName;
   }

   /**
    * Sets the value of the multipleFloatPathsEndingActivityShortName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setMultipleFloatPathsEndingActivityShortName(String value)
   {
      this.multipleFloatPathsEndingActivityShortName = value;
   }

   /**
    * Gets the value of the multipleFloatPathsUseTotalFloat property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isMultipleFloatPathsUseTotalFloat()
   {
      return multipleFloatPathsUseTotalFloat;
   }

   /**
    * Sets the value of the multipleFloatPathsUseTotalFloat property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setMultipleFloatPathsUseTotalFloat(Boolean value)
   {
      this.multipleFloatPathsUseTotalFloat = value;
   }

   /**
    * Gets the value of the outOfSequenceScheduleType property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getOutOfSequenceScheduleType()
   {
      return outOfSequenceScheduleType;
   }

   /**
    * Sets the value of the outOfSequenceScheduleType property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setOutOfSequenceScheduleType(String value)
   {
      this.outOfSequenceScheduleType = value;
   }

   /**
    * Gets the value of the overAllocationPercentage property.
    *
    * @return
    *     possible object is
    *     {@link Double }
    *
    */
   public Double getOverAllocationPercentage()
   {
      return overAllocationPercentage;
   }

   /**
    * Sets the value of the overAllocationPercentage property.
    *
    * @param value
    *     allowed object is
    *     {@link Double }
    *
    */
   public void setOverAllocationPercentage(Double value)
   {
      this.overAllocationPercentage = value;
   }

   /**
    * Gets the value of the preserveScheduledEarlyAndLateDates property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isPreserveScheduledEarlyAndLateDates()
   {
      return preserveScheduledEarlyAndLateDates;
   }

   /**
    * Sets the value of the preserveScheduledEarlyAndLateDates property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setPreserveScheduledEarlyAndLateDates(Boolean value)
   {
      this.preserveScheduledEarlyAndLateDates = value;
   }

   /**
    * Gets the value of the priorityList property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getPriorityList()
   {
      return priorityList;
   }

   /**
    * Sets the value of the priorityList property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setPriorityList(String value)
   {
      this.priorityList = value;
   }

   /**
    * Gets the value of the projectId property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
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
    * Gets the value of the relationshipLagCalendar property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getRelationshipLagCalendar()
   {
      return relationshipLagCalendar;
   }

   /**
    * Sets the value of the relationshipLagCalendar property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setRelationshipLagCalendar(String value)
   {
      this.relationshipLagCalendar = value;
   }

   /**
    * Gets the value of the resourceList property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getResourceList()
   {
      return resourceList;
   }

   /**
    * Sets the value of the resourceList property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setResourceList(String value)
   {
      this.resourceList = value;
   }

   /**
    * Gets the value of the startToStartLagCalculationType property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isStartToStartLagCalculationType()
   {
      return startToStartLagCalculationType;
   }

   /**
    * Sets the value of the startToStartLagCalculationType property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setStartToStartLagCalculationType(Boolean value)
   {
      this.startToStartLagCalculationType = value;
   }

   /**
    * Gets the value of the useExpectedFinishDates property.
    *
    * @return
    *     possible object is
    *     {@link Boolean }
    *
    */
   public Boolean isUseExpectedFinishDates()
   {
      return useExpectedFinishDates;
   }

   /**
    * Sets the value of the useExpectedFinishDates property.
    *
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *
    */
   public void setUseExpectedFinishDates(Boolean value)
   {
      this.useExpectedFinishDates = value;
   }

   /**
    * Gets the value of the userName property.
    *
    * @return
    *     possible object is
    *     {@link String }
    *
    */
   public String getUserName()
   {
      return userName;
   }

   /**
    * Sets the value of the userName property.
    *
    * @param value
    *     allowed object is
    *     {@link String }
    *
    */
   public void setUserName(String value)
   {
      this.userName = value;
   }

   /**
    * Gets the value of the userObjectId property.
    *
    * @return
    *     possible object is
    *     {@link Integer }
    *
    */
   public Integer getUserObjectId()
   {
      return userObjectId;
   }

   /**
    * Sets the value of the userObjectId property.
    *
    * @param value
    *     allowed object is
    *     {@link Integer }
    *
    */
   public void setUserObjectId(Integer value)
   {
      this.userObjectId = value;
   }

}
