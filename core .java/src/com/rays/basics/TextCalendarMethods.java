package com.rays.basics;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class TextCalendarMethods {
@SuppressWarnings("static-access")
public static void main(String[] args) {
	
	
	Calendar cal= Calendar.getInstance();
	
	System.out.println(cal.getTime());
	System.out.println(cal.get(Calendar.DATE));
	System.out.println(cal.get(Calendar.HOUR));
	System.out.println(cal.get(Calendar.MINUTE));
	System.out.println(cal.get(Calendar.SECOND));
	System.out.println(cal.get(Calendar.HOUR_OF_DAY)+":"+cal.get(Calendar.MINUTE)+":"+cal.get(Calendar.SECOND));
	System.out.println(cal.get(Calendar.YEAR));
	System.out.println(cal.getTimeZone().getID());
	System.out.println(cal.getAvailableCalendarTypes());
	System.out.println(cal.getInstance());
	
	// it a method of gregorain calendar
    GregorianCalendar cal1 = new GregorianCalendar(); 
	System.out.println(cal1.isLeapYear(2015));
	for (int i = 0; i <100; i++) {
		System.out.println(TimeZone.getAvailableIDs()[i]);	
	}
	System.out.println(cal1.getTimeZone().getID());
	System.out.println(TimeZone.getAvailableIDs()[0]);
	System.out.println(TimeZone.getAvailableIDs()[1]);
	System.out.println(TimeZone.getAvailableIDs()[2]);
	
	
	
	
	
	
	
	
	
	
	
	
}
}
