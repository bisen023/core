package com.rays.basics;



public class Testycopy {
	public static void main(String[] args) {
//	  char [] copyfrom = {'a','b', 'c','d','e','f','g'};
//	
//	  char[]copyto = new char[8];
//	   System.arraycopy(copyfrom,0,copyto,1,copyfrom.length);
//	  System.out.println(new String(copyto)) ;
//	  

		int[] copyfrom = { 10, 11, 12, 13, 14, 15, 16, 17 };
		int[] copyto = new int[8];
		System.arraycopy(copyfrom, 1, copyto, 0, 7);

		for (int i = 0; i <=7; i++) {

			System.out.println( copyfrom[i]);
			

		}

	}
}