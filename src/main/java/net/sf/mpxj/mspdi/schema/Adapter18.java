//
// This file was generated by the Eclipse Implementation of JAXB, v2.3.3
// See https://eclipse-ee4j.github.io/jaxb-ri
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2022.05.03 at 03:06:19 PM BST
//

package net.sf.mpxj.mspdi.schema;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import net.sf.mpxj.AccrueType;

@SuppressWarnings("all") public class Adapter18 extends XmlAdapter<String, AccrueType>
{

   public AccrueType unmarshal(String value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.parseAccrueType(value));
   }

   public String marshal(AccrueType value)
   {
      return (net.sf.mpxj.mspdi.DatatypeConverter.printAccrueType(value));
   }

}
