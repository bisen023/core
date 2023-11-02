package com.rays.exercise;

public class javabookexercise1 {
public static void main(String[] args) {
//	Q1-write a program to find max of two number.
//	 int a = 1000; 
//	 int b = 300;
	 
//	if (a>b) {
//		System.out.println("max no is a ="+a);
//		
//	}
//	else {
//	}
//		System.out.println("max no is b="+b);
//	System.out.println(Math.max(a,b));
//	System.out.println(Math.min(a,b));
//	
	
	
//	Q2 - fint the smallest of two mno. using conditional operation
//	 int a = 1; 
//	 int b = 3000;
//	 
//	if (a<b) {
//		System.out.println("smalest no is a ="+a);
//	}
//		
//		else {
//		System.out.println(" smallest no is b="+b);
//		}


//	Q3 - ramdom no . between 1 to 100.
	
//	int max=10;
//	int min=1;
//	int range=max-min;
//	
//	for (int i = 1; i <=5 ; i++) {
//		
//		int rd=(int)(Math.random()*range);
//		
//		System.out.println(rd);
//		
//	}
	
	
//	Q4  -  write a program to find factorail of a given no.
	
//	int x =5;
//	int fac =1;
//	 for (int i = x; i >=1; i--) {
//		fac= fac*i;
//	}
//	System.out.println(fac);
//	
	
//	Q 5 - write a program to reserve digit of a given number.

//	int x =45367;
//	 int num;
//	 while(x>0) {
//		 num =x%10;
//			x = x/10;	
//			System.out.print(num);
//	}
//	
	
	
//	Q 6 -write a program to find fibonacci series of a given number
	
//	int x = 0;
//	int y = 1;
//	System.out.println(x+ "\n"+y);
//	for (int i = 1; i <=5; i++) {
//		 int z = x+y;
//		x=y;
//		y= z;
//		System.out.println(z);
//	}
//	
	
	//Q 7 - Write a program to find sum of all integer grether than
//	100 and less than 200 that are divisible by 7.
	
//    int sum = 0;
//	for (int i =101; i <=200; i++) {
//		if (i%7==0) {
//			sum = sum +i;
//			System.out.println(i);	
//		}
//	}
//	System.out.println(sum);
	

//	Q8--write a program to create and display 2 dimensional
// array  that contain tables from 2 to 10 (9 rows and 10 columns)
//	
//   int[][] arr = new int [9][10];
//	for (int i = 0; i < arr.length+1; i++) {
//	for (int j =1 ; j < arr.length+1; j++) {
//		arr[i][j] =(i+1)*(j+1);
//		
//		System.out.print(arr[i][j]+"  ");
//		
//	}System.out.println(" ");	
//	}  
//	
   
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	Q 9--write a program to generate a triangle
	
//	1
//	2  2
//	3  3  3
//	4  4  4  4
//	
//	for (int i = 1; i <5 ; i++) {
//		for (int j = 1; j <=i ; j++) {
//			System.out.print(i +" ");
//		}System.out.println(" ");
//	}
	
	
	
//	Q 10 --write a program to finjhd tghe giveb number is armstrong number
	
// 	
//	int number = 153;
//	int r=0 ;
//	int n = number;
//	  int sum = 0;
//	 while(n >0) {
//		 r=n%10;	
//		 sum = sum+(r*r*r);
//		 n= n/10;
//	 }
//	if (sum==number) {System.out.println("arm hai")
//	}
//	else {System.out.println( "armstrong nahi hai")
//	}

	
//	Q 11-- write a program to find a given no is prime are not..
//	
//	int no = 11;
//	int temp = 0 ;
//	 for (int i = 2; i <= no-1; i++) {
//		if (no%i==0) {
//			temp = temp +1;
//		}}
//		
//		if (temp>0) {
//			System.out.println("not prime");
//		}  
//		else {System.out.println("prime");
//		}
	
	
//	Q 12-- write a program to find a given no is palindrome are not.
	
//	  int number =121;
//		int r = 0;
//		int n =number;
//		int sum =0;
//		
//		 while(n>0 ) {
//			r=n%10;
//			sum= (sum*10)+(r );
//			n=n/10;		 
//	
//		 }if (sum ==number) {
//			System.out.println("palidrome hai");
//		}
//		 else {
//			System.out.println("not paloidromee");
//		}
	
//	Q 13-- write a program to find  hormonic no.	 
		 
//	Q14--write a program to find average of consecutive 
//	N Odd number and Even numbers.
	
//	int n=10;
//	int sum=0;
//	int count=0;
//	int avg;
//	
//	for (int i = 1; i <=n; i++) {
//		
//		if (i%2 ==1) {
//			
//			
//			sum=sum+i;
//			count++;
//			
//		}
//		
//	}
//	avg=sum/count;
//	System.out.println(avg);
//	
	
	
//	Q 15-Write a method that takes an integer
//	array as a parameter and finds the  largest of the array.
//	
	  
//	int [] arr = {12,20,3,6,8,10};	
//	int r = arr[0];
//	 for (int i = 1; i < arr.length; i++) {
//		if (r<arr[i]) {  //r>arr[i]
//		r = arr[i];
//		}
//		
//		 
//		 
//	} System.out.println("largest no "+r);
// //	System.out.println("smallest no."+r);   for only small
	
	
//	Q 16-Write a method that takes an integer
//	array as a parameter and finds the  second  largest of the array.
//	
/*	
	int[] arr = {10,1000,3,4,9,30,2,200,1100,100,300,900};
	int min = 0;
	int max = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[ i]>max) {
			min = max; 
	max = arr[i];}
	
if(mi**-+n<arr[i]&&max>arr[i]) {
	min = arr[i];
}}
	System.out.println("second largest" +"=" + min);
	*/
	
	
	//Q 17 --Two integer arrays A and B Have n element respectively .A has all 
//	 the element that are in B ,But   B has one missing element .
//	write a function that takes an array A and B as 
//	  as Input and find the missing element in the most optimize manner
	
	
	
	
	
	
	
	
	
	
}}
