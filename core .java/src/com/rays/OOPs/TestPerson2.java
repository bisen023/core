package com.rays.OOPs;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class TestPerson2 {
public static void main(String[] args) throws ParseException {
	
	Date d = new Date(); 
	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
//	       String s =  sdf.format(d);
	
	
	Person2 p = new Person2();
	 p.setName("satyam");
	 System.out.println(p.getName());

//	 p.setDate(new Date());
	p.setDate(new SimpleDateFormat("dd-MM-yyyy").parse("23-10-2001"));
System.out.println((new SimpleDateFormat("dd-MM-yyyy").format(p.getDate()))); 
	p.setDate(sdf.parse("23-10-2001"));
System.out.println(sdf.format(p.getDate()));

	 
p.setAdd("indore");
System.out.println(p.getAdd());
	

}
}
