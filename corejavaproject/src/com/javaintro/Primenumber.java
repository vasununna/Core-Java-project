package com.javaintro;

import java.util.Scanner;

public class Primenumber {

	static boolean isprime(int n) {
		boolean status = true;
		if(n==0 || n==1) {
			return false;
		}
		
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				status = false;
				break;
			}
		}
		return status;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter how many values you want to print :");
		int n = sc.nextInt();
		
		for(int i=0;i<=n;i++){
			if(isprime(i)) {
				System.out.println(i);
			}
		}
	}
	
}
