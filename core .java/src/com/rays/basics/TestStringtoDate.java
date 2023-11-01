package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestStringtoDate {
public static void main(String[] args) throws ParseException {
 	
	String s = "23-10-2001";
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
	
	Date d = sdf.parse(s);
	System.out.println(d);
	
	
}
}
