package net.sf.mpxj.common;

import java.util.Date;

import net.sf.mpxj.DateRange;
import net.sf.mpxj.Duration;
import net.sf.mpxj.ProjectCalendar;
import net.sf.mpxj.ProjectCalendarHours;
import net.sf.mpxj.TimeUnit;
import net.sf.mpxj.WorkCalendar;

public class CombinedCalendar implements WorkCalendar
{
   @Override public boolean isWorkingDate(Date date)
   {
      return !getHours(date).isEmpty();
   }

   @Override public Date getStartTime(Date date)
   {
      ProjectCalendarHours hours = getHours(date);
      return hours.isEmpty() ? null : hours.get(0).getStart();
   }

   @Override public Date getFinishTime(Date date)
   {
      ProjectCalendarHours hours = getHours(date);
      return hours.isEmpty() ? null : hours.get(hours.size() - 1).getEnd();
   }

   @Override public Date getNextWorkStart(Date date)
   {
      return null;
   }

   @Override public Duration getWork(Date date, TimeUnit format)
   {
      return DurationHelper.convertFormat(m_calendar1.getParentFile().getProjectProperties(), DurationHelper.getTotalTime(getHours(date)), format);
   }

   @Override public Duration getWork(Date startDate, Date endDate, TimeUnit format)
   {
      return null;
   }

   private ProjectCalendarHours getHours(Date date)
   {
      ProjectCalendarHours result = new ProjectCalendarHours();
      ProjectCalendarHours hours1 = m_calendar1.getHours(date);
      ProjectCalendarHours hours2 = m_calendar2.getHours(date);

      for (DateRange range1 : hours1)
      {
         for (DateRange range2 : hours2)
         {
            if (DateHelper.compare(range1.getEnd(), range2.getStart()) <= 0)
            {
               // range1 finishes before range2 starts so there is no overlap, get the next range1
               break;
            }

            if (DateHelper.compare(range1.getStart(), range2.getEnd()) >= 0)
            {
               // range1 starts after range2 so there is no overlap, get the next range2
               continue;
            }

            Date start = DateHelper.max(range1.getStart(), range2.getStart());
            Date end = DateHelper.min(range1.getEnd(), range2.getEnd());
            result.add(new DateRange(start, end));
         }
      }

      return result;
   }

   private ProjectCalendar m_calendar1;
   private ProjectCalendar m_calendar2;
}
