package com.rays.practice;

public class armstrong {
public static void main(String[] args) {
	
	int number = 153;
	int r=0;
	int sum =0;
	int n = number;
	
while( n>0) {
	r= n%10;
	sum= sum +(r*r*r);
	n=n/10;
}
	
			
			
if(  sum==number ) {System.out.println(" aremstrong hai");
}
else {System.out.println( "armstrong nahi hai");


}
			
			
			
			
			
			
			
}
}
