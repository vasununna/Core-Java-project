package com.javaintro;

public class Methodswithparameters {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodswithparameters M=new Methodswithparameters();
		
		M.addition(4,6);
	
	}


	void addition(int a,int b) {
		 
		System.out.println(a+b);
		int c=a+b;
		substraction(c,7);
	}
	
	void substraction(int a ,int b) {
		System.out.println(a-b);
		int c=a-b;
		multiplication(c,8);
	}
	
	void multiplication(int a,int b) {
		System.out.println(a*b);
		int c=a*b;
		division(c,9);
	}
	
	void division(int a,int b) {
		System.out.println(a/b);
		
	}
	
	
	

}


