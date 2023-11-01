package com.rays.arrays;

public class note {
	public static void main(String[] args) {
		 int rupee = 11111;
		 int count = 0;
		int arr[]= { 2000,500,200,100,50,20,10,5,2,1};
		
		for (int i = 0; i < arr.length; i++) {
			 count = rupee/arr[i];
			rupee = rupee%arr[i];
		if(count>0) {	System.out.println(arr[i]+"="+count);	}
		}
		
		
	}

}
