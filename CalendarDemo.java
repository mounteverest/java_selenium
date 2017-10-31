package java_demo;

import java.util.Calendar;

public class CalendarDemo {
	
	public CalendarDemo(){
		System.out.println("Its calling all the Calendar funtions..");
	}

	public static void main(String[] args){
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		System.out.println(cal.getWeeksInWeekYear());
		System.out.println(cal.getFirstDayOfWeek());
		System.out.println(cal.get(Calendar.AM_PM));
		System.out.println(cal.getMaximum(Calendar.DAY_OF_WEEK));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		
						
	}
}
