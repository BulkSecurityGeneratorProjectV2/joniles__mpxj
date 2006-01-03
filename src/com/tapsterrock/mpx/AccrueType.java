/*
 * file:       AccrueType.java
 * author:     Jon Iles
 * copyright:  (c) Tapster Rock Limited 2002-2003
 * date:       05/02/2003
 */

/*
 * This library is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation; either version 2.1 of the License, or (at your
 * option) any later version.
 *
 * This library is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this library; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307, USA.
 */

package com.tapsterrock.mpx;

import java.util.Locale;

/**
 * This class is used to represent an accrue type. It provides a mapping
 * between the textual description of a accrue type found in an MPX
 * file, and an enumerated representation that can be more easily manipulated
 * programatically.
 */
public final class AccrueType implements ToStringRequiresFile
{
   /**
    * This constructor takes the numeric enumerated representation of an
    * accrue type and populates the class instance appropriately.
    * Note that unrecognised values are treated as "Prorated".
    *
    * @param type int version of the accrue type
    */
   private AccrueType (int type)
   {
      if (type < START_VALUE || type > PRORATED_VALUE)
      {
         m_type = PRORATED_VALUE;
      }
      else
      {
         m_type = type;
      }
   }

   /**
    * This method takes the textual version of an accrue type name
    * and populates the class instance appropriately. Note that unrecognised
    * values are treated as "Prorated".
    *
    * @param type text version of the accrue type
    * @param locale target locale
    * @return AccrueType class instance
    */
   public static AccrueType getInstance (String type, Locale locale)
   {
      AccrueType result = null;

      String[] typeNames = LocaleData.getStringArray(locale, LocaleData.ACCRUE_TYPES);

      for (int loop=0; loop < typeNames.length; loop++)
      {
         if (typeNames[loop].equalsIgnoreCase(type) == true)
         {
            result = TYPE_VALUES[loop];
            break;
         }
      }

      if (result == null)
      {
         result = TYPE_VALUES[PRORATED_VALUE-1];
      }

      return (result);
   }

   /**
    * This method takes a numeric enumerated accrue type value
    * and populates the class instance appropriately. Note that unrecognised
    * values are treated as "Prorated".
    *
    * @param type numeric enumerated accrue type
    * @return AccrueType class instance
    */
   public static AccrueType getInstance (Number type)
   {
      AccrueType result;

      if (type == null)
      {
         result = TYPE_VALUES[PRORATED_VALUE-1];
      }
      else
      {
         result = getInstance (type.intValue());
      }

      return (result);
   }

   /**
    * This method takes a numeric enumerated accrue type value
    * and populates the class instance appropriately. Note that unrecognised
    * values are treated as "Prorated".
    *
    * @param type numeric enumerated accrue type
    * @return AccrueType class instance
    */
   public static AccrueType getInstance (int type)
   {
      if (type < START_VALUE || type > PRORATED_VALUE)
      {
         type = PRORATED_VALUE;
      }

      return (TYPE_VALUES[type-1]);
   }


   /**
    * Accessor method used to retrieve the numeric representation of the
    * accrue type.
    *
    * @return int representation of the accrue type
    */
   public int getType ()
   {
      return (m_type);
   }

   /**
    * This method generates a string in MPX format representing the
    * contents of this record.
    *
    * @param mpx pareent mpx file
    * @return string containing the data for this record in MPX format.
    */
   public String toString (ProjectFile mpx)
   {
      Locale locale = mpx.getLocale();
      String[] typeNames = LocaleData.getStringArray(locale, LocaleData.ACCRUE_TYPES);
      return (typeNames[m_type-1]);
   }

   public static final int START_VALUE = 1;
   public static final int END_VALUE = 2;
   public static final int PRORATED_VALUE = 3;

   public static final AccrueType START = new AccrueType (START_VALUE);
   public static final AccrueType END = new AccrueType (END_VALUE);
   public static final AccrueType PRORATED = new AccrueType (PRORATED_VALUE);

   /**
    * Array of type values matching the above constants.
    */
   private static final AccrueType[] TYPE_VALUES =
   {
      START,
      END,
      PRORATED,
   };

   /**
    * Internal representation of the accrue type.
    */
   private int m_type;
}
