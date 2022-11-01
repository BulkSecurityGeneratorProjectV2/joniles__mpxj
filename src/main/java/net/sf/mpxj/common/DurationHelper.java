package net.sf.mpxj.common;

import java.util.Date;
import java.util.List;

import net.sf.mpxj.DateRange;
import net.sf.mpxj.Duration;
import net.sf.mpxj.TimeUnit;
import net.sf.mpxj.TimeUnitDefaultsContainer;

public final class DurationHelper
{
   /**
    * Retrieves the amount of time represented by
    * a list of DateRange instances.
    *
    * @param ranges calendar exception
    * @return length of time in milliseconds
    */
   public static long getTotalTime(List<DateRange> ranges)
   {
      return ranges.stream().mapToLong(r -> getTotalTime(r.getStart(), r.getEnd())).sum();
   }

   /**
    * Retrieves the amount of time between two date time values. Note that
    * these values are converted into canonical values to remove the
    * date component.
    *
    * @param start start time
    * @param end end time
    * @return length of time
    */
   public static long getTotalTime(Date start, Date end)
   {
      long total = 0;
      if (start != null && end != null)
      {
         Date startTime = DateHelper.getCanonicalTime(start);
         Date endTime = DateHelper.getCanonicalTime(end);

         Date startDay = DateHelper.getDayStartDate(start);
         Date finishDay = DateHelper.getDayStartDate(end);

         //
         // Handle the case where the end of the range is at midnight -
         // this will show up as the start and end days not matching
         //
         if (startDay.getTime() != finishDay.getTime())
         {
            endTime = DateHelper.addDays(endTime, 1);
         }

         total = (endTime.getTime() - startTime.getTime());
      }
      return total;
   }


   public static Duration convertFormat(TimeUnitDefaultsContainer defaults, long totalTime, TimeUnit format)
   {
      double duration = totalTime;

      switch (format)
      {
         case MINUTES:
         case ELAPSED_MINUTES:
         {
            duration /= (60 * 1000);
            break;
         }

         case HOURS:
         case ELAPSED_HOURS:
         {
            duration /= (60 * 60 * 1000);
            break;
         }

         case DAYS:
         {
            double minutesPerDay = NumberHelper.getDouble(defaults.getMinutesPerDay());
            if (minutesPerDay != 0)
            {
               duration /= (minutesPerDay * 60 * 1000);
            }
            else
            {
               duration = 0;
            }
            break;
         }

         case WEEKS:
         {
            double minutesPerWeek = NumberHelper.getDouble(defaults.getMinutesPerWeek());
            if (minutesPerWeek != 0)
            {
               duration /= (minutesPerWeek * 60 * 1000);
            }
            else
            {
               duration = 0;
            }
            break;
         }

         case MONTHS:
         {
            double daysPerMonth = defaults.getDaysPerMonth().doubleValue();
            double minutesPerDay = NumberHelper.getDouble(defaults.getMinutesPerDay());
            if (daysPerMonth != 0 && minutesPerDay != 0)
            {
               duration /= (daysPerMonth * minutesPerDay * 60 * 1000);
            }
            else
            {
               duration = 0;
            }
            break;
         }

         case ELAPSED_DAYS:
         {
            duration /= (24 * 60 * 60 * 1000);
            break;
         }

         case ELAPSED_WEEKS:
         {
            duration /= (7 * 24 * 60 * 60 * 1000);
            break;
         }

         case ELAPSED_MONTHS:
         {
            duration /= (30.0 * 24.0 * 60.0 * 60.0 * 1000.0);
            break;
         }

         default:
         {
            throw new IllegalArgumentException("TimeUnit " + format + " not supported");
         }
      }

      return Duration.getInstance(duration, format);
   }
}
