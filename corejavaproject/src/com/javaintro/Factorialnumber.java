package com.javaintro;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int f = fact(n);
		System.out.println("Factorial of a number :"+f);
	}
	static int fact(int n) {
		if(n==0 || n==1) {
			return 1;
		}
		return n * (fact(n-1));
	}
}
