//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2019.02.10 at 09:33:54 PM GMT
//

package net.sf.mpxj.ganttdesigner.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

public class Adapter3 extends XmlAdapter<String, Double>
{

   @Override public Double unmarshal(String value)
   {
      return (net.sf.mpxj.ganttdesigner.DatatypeConverter.parsePercent(value));
   }

   @Override public String marshal(Double value)
   {
      return (net.sf.mpxj.ganttdesigner.DatatypeConverter.printPercent(value));
   }

}
