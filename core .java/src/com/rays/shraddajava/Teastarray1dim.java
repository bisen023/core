package com.rays.shraddajava;
import java.util.*;
public class Teastarray1dim {
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	 int size = sc.nextInt();
	 
	int number[] = new int[size]; 
//	number[0]= 10;
//	number[1]= 20;
//	number[2]= 30;
//	number[3]= 30;
//	number[4]= 40;
//	number[5]= 50;
//	number[6]= 60;
//	number[7]= 70;
	for (int i = 0; i < size; i++) {
		number[i]= sc.nextInt();	
	}
 
	
//	output
	for (int i = 0; i <size; i++) {
		System.out.println(number[i]);
	}}}
	