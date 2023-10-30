package com.rays.practice;

public class palindromeno {
public static void main(String[] args) {
	  int number =1432;
	
	int r = 0;
	int n =number;
	int sum =0;
	
	
	
	 while(n>0 ) {
		 r=n%10;
		 sum= (sum*10)+(r );
		n=n/10;		 
	
	
	
	
	 }if (sum ==number) {
		System.out.println("palidrome hai");
	}
	 else {
		System.out.println("not paloidromee");
	}
}
	
	
	
	
	
}
