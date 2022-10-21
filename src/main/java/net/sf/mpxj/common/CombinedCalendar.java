package net.sf.mpxj.common;

import java.util.Date;

import net.sf.mpxj.Duration;
import net.sf.mpxj.TimeUnit;
import net.sf.mpxj.WorkCalendar;

public class CombinedCalendar implements WorkCalendar
{
   @Override public boolean isWorkingDate(Date date)
   {
      return false;
   }

   @Override public Date getStartTime(Date date)
   {
      return null;
   }

   @Override public Date getFinishTime(Date date)
   {
      return null;
   }

   @Override public Date getNextWorkStart(Date date)
   {
      return null;
   }

   @Override public Duration getWork(Date date, TimeUnit format)
   {
      return null;
   }

   @Override public Duration getWork(Date startDate, Date endDate, TimeUnit format)
   {
      return null;
   }
}
