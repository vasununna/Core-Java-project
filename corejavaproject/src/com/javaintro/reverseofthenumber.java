package com.javaintro;

import java.util.Scanner;

public class reverseofthenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
	
		int rev=reverseofnumber( n);
			
		if (rev == n) {
			System.out.println("The given number is palamdrome");
		}
		else {
			System.out.println("The given number is not a palamdrome");
		}
		System.out.println("Reverse of the number is :"+rev);
	}

	private static int reverseofnumber(int n) {
		// TODO Auto-generated method stub
		int r=0;
		int reverse=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			reverse = reverse * 10 + r;
		}
		return reverse;
	}

}
