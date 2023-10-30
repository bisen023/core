package com.rays.arrays;


public class Testreversename {
public static void main(String[] args) {
	String name = "satyam bisen "; 
	// agar is type paragraph me ho to to spce kimhelp se apn break kar sakte hai
	String[] names = name.split(" ");
//	String[]names = {"satyam","bisen"};
	for (int i = 0; i < names.length; i++) {
		for (int j = names[i].length()-1; j >=0; j--) {
			System.out.print(names[i].charAt(j));
			
		}
		System.out.print("  ");
	}
	
	
}
}
