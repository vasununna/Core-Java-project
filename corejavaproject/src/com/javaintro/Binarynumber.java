package com.javaintro;

import java.util.Scanner;

public class Binarynumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n = sc.nextInt();
		
		int r=0;
		int bin=0;
		while(n>0) {
			r=n%2;
			n=n/2;
			bin=r+bin;
			System.out.println(bin);
		}
	}

}
