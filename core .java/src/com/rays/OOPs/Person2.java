package com.rays.OOPs;

import java.util.Date;

public class Person2 {

	private  String name;
	private Date dob;
	  private  String address;
	//setter,argumebnt ,no return
	//name
	public void setName(String n) {
	name = n;	
	}
	public String getName() {
	return name;
	}
	
//	date
	public void setDate(Date d) {
		dob = d;
	}
	public Date getDate() {
		return dob;
	}
	
	//address
	public void setAdd(String n) {
		address = n;
	}
	
	public String getAdd() {
		return  address;
	}
	
	
	
}