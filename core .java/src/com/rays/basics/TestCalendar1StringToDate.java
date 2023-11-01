package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar1StringToDate {//1 for string to date then calendar add
public static void main(String[] args) throws ParseException {
	 String s = "23-10-2001";
     SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
      Date d = sdf.parse(s);
      Calendar cal = Calendar.getInstance();
      cal.setTime(d);
     cal.add(Calendar.DATE,5);
     System.out.println(cal.getTime());
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
}
