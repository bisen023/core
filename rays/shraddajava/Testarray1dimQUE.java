package com.rays.shraddajava;
import java.util.*;
public class Testarray1dimQUE {
public static void main(String[] args) {
//QUE--1
// 	take an array as input from the user .
//	search for a given number x and print the index at which it occurs
/*	 Scanner sc = new Scanner(System.in);
	  int size = sc.nextInt();
	
	int[] num = new int[size];
	   for (int i = 0; i < num.length; i++) {
		num[i]=sc.nextInt();
	}
	 int x = sc.nextInt();
	
	for (int i = 0; i < num.length; i++) {
		if (x==num[i]) {System.out.println("index="i
				);
			
		}
	}
	*/
	
//	QUE 2
	
	/*Scanner sc = new Scanner (System.in);
	 int size = sc.nextInt();
	
	String[] name = new String[size];
	 
//	input
	for (int i = 0; i <size; i++) {
		name[i]=sc.next();
		
	}
	
//	output
	for (int i = 0; i < name.length; i++) {
		System.out.println("name"+(i)+"=is="+name[i]);
	}
	
	*/
	
	
	//QUE 3
	
	Scanner sc = new Scanner(System.in);
	int size = sc.nextInt();
	
	int[] arr = new int[size];
	
	
	for (int i = 0; i <size; i++) {
		arr[i]=sc.nextInt();
	}
	 int min = Integer.MIN_VALUE;
	int max = Integer.MAX_VALUE;
	
	 for (int i = 0; i < arr.length; i++) {
		 if (arr[i]<min) {
			
			 min = arr[i];
		}
		 if(arr[i]>max) {
			 max=arr[i];
	}}
	
	System.out.println("largest no. is" + max);
	System.out.println("samallest no is "+ min);
	
	
	
	
	
	
}
}
