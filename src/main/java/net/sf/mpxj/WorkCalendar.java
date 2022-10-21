package net.sf.mpxj;
import java.util.Date;

public interface WorkCalendar
{
   public boolean isWorkingDate(Date date);

   public Date getStartTime(Date date);

   public Date getFinishTime(Date date);

   public Date getNextWorkStart(Date date);

   public Duration getWork(Date date, TimeUnit format);

   public Duration getWork(Date startDate, Date endDate, TimeUnit format);
}
