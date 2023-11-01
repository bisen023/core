package com.rays.practice;

public class reverse {
public static void main(String[] args) {
	   
	
	
	
	
	int num =7348;
			
	int r =0;
	int sum =0;
	int n =num;
	
	while(n>0) {
		r=n%10;
		sum = (sum*10)+r;
		n = n/ 10;
		
		
	}
	System.out.println(sum);
	
	
}
}
