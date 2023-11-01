package com.rays.strings;

public class stngbuffer {
public static void main(String[] args) {
	 StringBuffer sb = new StringBuffer("vijay ");
	 sb.append("dinanath Chauhan");
	System.out.println(sb);
	
	System.out.println("length-"+sb.length());
	System.out.println("capacity-"+sb.capacity());
	System.out.println("Char at-"+sb.charAt(1));
	System.out.println("Index Of-"+sb.indexOf("Dinanath"));
	System.out.println("replace-"+sb.replace(0,4,"jay"));
	System.out.println("reverse-"+sb.reverse());
	
	
	
	
	
	
	
	
}
}
