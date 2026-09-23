package com.javaintro;

public class Count1 {
	
	static int count=0;
	
	Count1(){
		count++;
		System.out.println("Constructor called");
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count1 C=new Count1();
		Count1 C1=new Count1();
		Count1 C2=new Count1();
		System.out.println("Number of objects created :"+ count);
	}

}
