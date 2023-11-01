package com.rays.arrays;

public class Testsecondlargest {
public static void main(String[] args) {
	int[] arr = {10,3,4,9,30,2,200,1100,100,300,900};
	int min = 0;
	int max = 0;
	for (int i = 0; i < arr.length; i++) {
		if(arr[ i]>max) {
			min = max; 
	max = arr[i];}
	
if(min<arr[i]&&max>arr[i]) {
	min = arr[i];
}}
	System.out.println("second largest" +"=" + min);
}
}
