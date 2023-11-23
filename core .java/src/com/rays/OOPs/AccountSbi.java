package com.rays.OOPs;

public class AccountSbi {
 private int balance;
 private String accountType;
 private double diposite;
 private   double withdrawal;
  
 
 
  public void setBalance(int balance) {
 this.balance =balance;
  }
 
 public int getBalance() {
	return balance;
}
 
 public void setAccountType(String accountType) {
	this.accountType =accountType;
}
 public String getAccountType() {
	return accountType;
	}
 
 public  void  setDiposite (double diposite) {
 this.balance += diposite;
 this.diposite =diposite;

 }
 public double getDiposite() {
 return diposite;
}
 
public void setWithdrawal(double withdrawal) {
	this.balance -=withdrawal;
	this.withdrawal = withdrawal;
//	if(this.balance<=this.withdrawal)
//		this.withdrawal -= withdrawal;	
}

public double getWithdrawal() {
 return withdrawal;
}
 
}
