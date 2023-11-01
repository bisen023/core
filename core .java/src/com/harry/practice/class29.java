package com.harry.practice;
import java.util.*;
public class class29 {
public static void main(String[] args) {
//	practice problems 1
//	 float sum = 0;
//	float  []  num = { 1.55f,2.5f,3.5f,3.3f,4.7f};
//	 for (int i = 0; i < num.length; i++) {
//		
//		sum = sum+num[i];
//		 
//	}
//	System.out.println("sum of five float no. is = "+sum);
//	
//	
//	
//	
	
// problem no 2	
//	write a program to find out 
//	wheather a given integer is presejnt i  an array or noty
	
	Scanner sc = new Scanner(System.in); 
	int size = sc.nextInt();
	
	int [] arr = new  int [size]; 
	 
	for (int i = 0; i < arr.length; i++) {
		arr[i] =sc.nextInt();
		
	}
	 int x = sc.nextInt();
	
	for (int i = 0; i < arr.length; i++) {
		if (arr[i]==x) {
			System.out.println(" yes given integer is present in it at index  ="+i);
			
		}
	}
	
	
	
	
	
	
}
}
