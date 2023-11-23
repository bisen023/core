package com.rays.basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;



public class TestCalendar2DatetoString {
public static void main(String[] args) {

	Date d = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	         String s =sdf.format(d);
	System.out.println(s);
	Calendar cal = Calendar.getInstance();
	cal.setTime(d);
	
	cal.add(Calendar.DATE, 5);
	System.out.println(cal.getTime());
	
	
}
}
