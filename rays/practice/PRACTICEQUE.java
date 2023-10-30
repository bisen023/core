package com.rays.practice;

public class PRACTICEQUE {
public static void main(String[] args) {
	
//	Q1
//	print the pattern
	
//	*****
//	*****
//	*****
//	*****
//
//	
	
//	for(int i=1;i<=4;i++) {
//	for(int j=1;j<=5;j++) {
//	System.out.print("*");
//	
//	}
//	System.out.println();
//	}
////	
//	
//	Q2
//	print the pattren
//	
//	*****
//	*   *
//	*   *
//	*****
	
//	for (int i = 1; i <=4; i++) {
//		for (int j = 1; j <=5; j++) {
//			
//		if(i==1||j==1||i==4||j==5)	
//			{System.out.print("*");}
//		
//		else {System.out.print(" ");}
//		
//		
//	}
//	System.out.println();
//	
//	}
//	
//	
	
//table	
//	 for (int i = 1; i <=10; i++) {
//		for (int j = 1; j <=10; j++) {
//			System.out.print(i+"*"+j+"="+i*j+"\t");
//		}
//		System.out.println();
//	}
//	
	 
//int n =4;
//	for (int i = 1; i <=n; i++) {
////		first inner loop
//		for (int j =1; j <=n-i; j++) {
//			System.out.print(" ");}
////		second inner loop
//			for (int j = 1; j <=i; j++) {
//				System.out.print("*");
//			}
//		
//	System.out.println();
//	}
	
//	Q5
	


//
//for (int i = 1; i <=5; i++) {
//	for (int j = 1; j <=i; j++) {
//		System.out.print(j);
//	}
//	System.out.println();
//}
//


//q6
//
//for (int i = 1; i <=5; i++) {
//	for (int j = 5; j >=i; j--) {
//		System.out.print(j);
//		
//	}
//	
//	System.out.println();
//}

//Q7

//	12345
//	1234
//	123
//	12
//	1
//	for (int i = 5; i>=1; i--) {
//		for (int j =1; j<=i; j++) {
//			System.out.print(j);
//		}System.out.println();
//	}
	
//	
//	Q8
//	int n =5;
//	int number =1;
//	for (int i = 1; i <=n; i++) {
//		for (int j = 1; j <=i; j++) {
//		System.out.print(number +" ");
//		number++;
//		}System.out.println();
//	}
//	
	
//	Q9 0 1 triangle
//	 for (int i = 1; i <=5; i++) {
//		for (int j = 1; j <=i; j++) {
//			int sum =i+j;
//			if (sum%2==0) {System.out.print("1");
//				
//			}
//			else {System.out.print("0");
//				
//			}
//		}System.out.println();
//	}
//	
//	
//	
//	
//	 Q10 advance patteern
//	int n = 4;
//	for (int i = 1; i <=n; i++)
////	first part
//	{
//		for (int j =1; j <=i;j++){System.out.print("*");
//			
//		} 
////		spCE*
//		int spaces= 2*(n-i);
//		for (int j = 1; j <=spaces;j++) {System.out.print(" ");
//		} 
////		2 part star
//		for (int j = 1; j <=i; j++) {
//			System.out.print("*");
//			
//		}
//		System.out.println();
//	}
//	
////	lower part
//	 for (int i = 4; i >=1; i--) {
////	 1 part{
//		for (int j = 1; j <=i; j++) {
//			System.out.print("*");
//		}
////		space
//		int spaces = 2*(n-i);
//		for (int j = 1; j <=spaces; j++) {
//			System.out.print(" ");
//		}
////		2 part
//		for (int j = 1; j <=i; j++) {
//			System.out.print("*");
//		}
//		System.out.println();
//	}
//	 
	
//	Q  10 
//    *****
//   *****
//  *****
// *****
//*****
//int n = 5;
//for (int i = 1; i <=n; i++) {
//	for (int j =1; j <=n-i; j++) {
//		System.out.print(" ");
//	}
//	for (int j =1; j <=n; j++) {
//		System.out.print("*");
//	}
//	System.out.println();
//}
	
//	  Q11
//	
//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5
//		
//	 int n =5;
//	    for (int i=1; i <=n; i++) {
//	    	
////    		space
//	    	for (int j =1; j <=n-i; j++) {
//	    System.out.print(" ");}
//// for no.
//				
//			for (int j = 1; j <=i; j++) {
//				System.out.print(i+" ");}
//			 
//			
//			System.out.println();
//		}
	
//	Q12
//	palindromic pattern
//	    1
//	   212
//	  32123
//	 4321234
//	543212345
//	int n = 5;
//	for (int i = 1; i <=5; i++) {
////		space
//		for (int j = 1; j <=n-i; j++) {
//			System.out.print(" ");}
//		  
//// for no.		
//		for (int j =i; j >=1; j--) {
//			System.out.print(j);
//		}
//	for  no. of staring 2 part
//for (int j =2; j <=i; j++) {
//	System.out.print(j);
//} 
//		
//		
//		
//		System.out.println();
//	}
//	
	
//	Q13
//	diamand
//	    *
//	   ***
//	  *****
//	 *******
//	 *******
//	  *****
//	   ***
//	    *
//	int n;i++) {
////	 space
//	for (int j n=4;
//	for(int i=1;i<== 1; j <=n-i; j++) {
//		System.out.print(" ");
//	}
////	for * 1 part
//	for (int j = 1; j <=i; j++) {
//		System.out.print("*");
//	} 
////	for * 2 part	
//	for (int j = 2; j <=i; j++) {
//		System.out.print("*");
//	}
//	
//	System.out.println();
//	}
////	 lower part
//	for(int i=n;i>=1;i--) {
////		 space
//		for (int j = 1; j <=n-i; j++) {
//			System.out.print(" ");
//		}
////		for * 1 part
//		for (int j = 1; j <=i; j++) {
//			System.out.print("*");
//		} 
////		for * 2 part	
//		for (int j = 2; j <=i; j++) {
//			System.out.print("*");
//		}
//		
//		System.out.println();
//		}
//		
//}

