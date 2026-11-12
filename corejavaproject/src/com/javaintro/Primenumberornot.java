package com.javaintro;

import java.util.Scanner;

public class Primenumberornot {
	
	static boolean isprime(int n) {
		boolean status = true;
		if(n==0 ||n==1) {
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
		System.out.println("Enter the number to check prime number or not :");
		int n= sc.nextInt();
		
			boolean prime = isprime(n);
				if(prime ) {
					System.out.println("The given number is prime number");
				}
				else {
					System.out.println("The given number is not a prime number");
				}
			
			
		}
	}


