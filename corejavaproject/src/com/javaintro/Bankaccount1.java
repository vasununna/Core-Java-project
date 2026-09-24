package com.javaintro;

public class Bankaccount1 {
	
	long accountNumber;
	String customerName;
	String accountType;
	double balance;
	
	Bankaccount1(long accountNumber,String customerName,String accountType,double balance){
		
		this.accountNumber=accountNumber;
		this.customerName=customerName;
		this.accountType=accountType;
		this.balance=balance;
		
		System.out.println("Parameterized constructor called");
		System.out.println("");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bankaccount1 B =new Bankaccount1(1234567898L,"Vasu","Savingsaccount",2000000);
		Bankaccount1 B1=new Bankaccount1(1234543212,"Deva","Savingsaccount",1000000);
		B.info();
		System.out.println("");
		B1.info();

	}
	void info() {
		System.out.println("Account Number:"+accountNumber);
		System.out.println("Account Holder Name:"+customerName);
		System.out.println("Account Type:"+accountType);
		System.out.println("Balance Amount:"+balance);
	}
}
