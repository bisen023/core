package com.rays.constructorcalling;

public class Employee extends Person {
	
	private String designation;
	
	
	
	public Employee() {
		System.out.println("Employee Default Constructor");
	}
	
	
	public Employee( String firstName,String lastName,String designation) {
		
		super(firstName,lastName);
		//super key se just parent class ko call karta hai
		this.designation=designation;
		
		System.out.println(" Employee 1 param constructor");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
	this.designation = designation;
	
	}

}
