package com.javaintro;

public class Bankaccount {
	
	static long accountNumbergenerator=12001;
	
	long accountNumber=accountNumbergenerator;
	String accountHolderName;
	long balance;
	
	{
		accountNumbergenerator++;
	}
	
	
	//System.out.println("Account Number:"+ B.accountNumber);

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bankaccount B=new Bankaccount();
		Bankaccount B1=new Bankaccount();
		Bankaccount B2=new Bankaccount();
		
		//B.accountNumber=12001;
		B.accountHolderName="vasu";
		B.balance=1000000;
		
		System.out.println("Account Number:"+ B.accountNumber);
		System.out.println("Account Holder Name:"+ B.accountHolderName);
		System.out.println("Account Balance:"+ B.balance);
		
		B1.accountHolderName="hemanth";
		B1.balance=100000;
		
		System.out.println("Account Number:"+ B1.accountNumber);
		System.out.println("Account Holder Name:"+ B1.accountHolderName);
		System.out.println("Account Balance:"+ B1.balance);
		

		B2.accountHolderName="vignan";
		B2.balance=100000;
		
		System.out.println("Account Number:"+ B2.accountNumber);
		System.out.println("Account Holder Name:"+ B2.accountHolderName);
		System.out.println("Account Balance:"+ B2.balance);
			 
	}

}
