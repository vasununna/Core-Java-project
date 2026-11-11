package com.javaintro;

import java.util.Scanner;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		
		boolean status = perfectnumber(n);
		
		if (status = true) {
			System.out.println("The given number is perfect number");
		}
		else {
			System.out.println("THe given number is not a perfect number ");
		}
	}

	private static boolean perfectnumber(int n) {
		boolean status =false;
		int sum=0;
		
		for(int i=1;i<=n/2;i++) {
			if(n%i==0) {		
			sum=sum+1;
			System.out.println(i);
			status =true; 
			}
			}
		return status;
		
	
	}
}
