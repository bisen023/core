package com.rays.OOPs;

public class TestAccount {
public static void main(String[] args) {
	
	Account a = new Account();
	
	a.setNum("satyam");
	a.setAccount("saving account");
	a.setBalance(234);
	
	
	System.out.println(a.getNum());
	System.out.println(a.getAccount());
	System.out.println(a.getBalance());
	
}
}
