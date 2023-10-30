package com.rays.exercise;

public class stngpractice2 {
public static void main(String[] args) {
//	StringBuilder sb = new StringBuilder("h");
//	sb.append("e");
//	sb.append("l");
//	sb.append("l");
//	sb.append("o");
//	System.out.println(sb);
//	
	
//	if we have to change any letter the use this---- setchar
//	StringBuilder sb = new StringBuilder("tony");
//	sb.setCharAt(0, 's');
//	System.out.println(sb);
//	
	
//	 IF WE HAVE ADD OR INSERT ANY NEW WORD THEN ANT CH THENN USE --isert method
//	StringBuilder sb = new StringBuilder("tony");
//	sb.insert(0,'S');
//	System.out.println(sb);

	
//	 same as above 
//	StringBuilder sb = new StringBuilder("tony");
//	sb.insert(2,'n');
//	System.out.println(sb);
	
	
//	if we have too delete any letter  then use ---sb.delete
//	StringBuilder sb = new StringBuilder("satyam");
//	sb.delete(5,6);
////	sb.delete(2,4);
//	System.out.println(sb);
	
	
	
	
	
//	reverse the letter
	StringBuilder sb = new StringBuilder("HELLO satyam");
	for (int i =0;i<sb.length()/2; i++) {
	 int front = i;
	int back  = sb.length()-1-i;
	 
	 char frontChar = sb.charAt(front);
	 char backChar = sb.charAt(back);
	 
	 sb.setCharAt(front,backChar);
	sb.setCharAt(back,frontChar);
	}

	System.out.println(sb);
	
	
	
	
	
	
	
	
	
}
}
