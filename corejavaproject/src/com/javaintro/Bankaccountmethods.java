package com.javaintro;


public class Bankaccountmethods {
	
	static int balance=1000;
	
	
	static void deposit(int amount) {
		balance=balance+amount;
		System.out.println("Total balance amount:"+ balance);
		
		withdraw(300);
	}

	static void withdraw(int amount) {
		balance=balance-amount;
		System.out.println("Withdraw amount:" +balance);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Balance amount:"+balance);
		//System.out.println("created amount:"+balance+amount);
		
		deposit(500);
	
	}

}
