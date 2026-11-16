package com.javaintro;

import java.util.Scanner;

public class Sumofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number :");
		int n =sc.nextInt();
		
		int sum = sumofdigits(n);
		
		System.out.println("Sum of the digits : "+sum);
	}

	private static int sumofdigits(int n) {
		// TODO Auto-generated method stub
		int r=0;
		int sum=0;
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		return sum;
	}

}
