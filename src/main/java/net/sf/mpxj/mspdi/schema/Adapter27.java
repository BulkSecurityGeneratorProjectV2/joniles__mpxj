//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.05.03 at 03:06:19 PM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;

@SuppressWarnings("all") public class Adapter27 extends XmlAdapter<String, Number>
{

   public Number unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parsePercentComplete(value));
   }

   public String marshal(Number value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printPercentComplete(value));
   }

}
