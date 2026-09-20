package com.javaintro;

public class Testmethods {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method called");
		System.out.println("");
		
		  Testmethods T =new Testmethods();
		  
			T.display();
			info();
			method();
			actor();
			T.add(7,8);
			T.add(2,5,7);
			sub(3,8);
			multiply(3,2);
			division(9,8);
			modules(4,6);
			
		System.out.println("");			
		System.out.println("Main method ended");

	}
	  void display() {
		 System.out.println("Display method called");
		
	}
	  static void info() {
		  System.out.println("info method called");
	  }
	  static void method() {
		  System.out.println("method called");
	  }
	  static void actor() {
		  System.out.println("prabhas is a indias biggest super star");
	  }
	void add(int a, int b) {
		System.out.println("addition called");
		System.out.println(a+b);
	}
		
	void add(int a,int b,int c) {
		System.out.println("addition called");
		System.out.println(a+b+c);
	}
	static void sub(int a,int b) {
		System.out.println("Substraction called");
		System.out.println(a-b);
	}
	static void multiply(int a,int b) {
		System.out.println("Multiplication called");
		System.out.println(a*b);
	}
	static void division(int a,int b) {
		System.out.println("Division called");
		System.out.println(a/b);
	}
	static void modules(int a,int b) {
		System.out.println("Modules called");
		System.out.println(a%b);
	}
}
