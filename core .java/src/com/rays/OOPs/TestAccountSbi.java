package com.rays.OOPs;

public class TestAccountSbi {
public static void main(String[] args) {
	 
	AccountSbi a = new  AccountSbi();
	
	a.setBalance(1000);
	a.setAccountType("saving");
	a.setDiposite(100);
	a.setWithdrawal(500);
	
	System.out.println(  "account balance"+":"+ a.getBalance());
	System.out.println("AccountType"+":"+a.getAccountType());
	System.out.println("Diposite amount"+":"+a.getDiposite());
	System.out.println("Withdrawal ammount"+":"+a.getWithdrawal());
	
}
}
