package com.javaintro;

import java.util.Scanner;

public class Multiplicationtable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number which table you want to print : ");
		int n = sc.nextInt();
		
		System.out.println("Enter how many times you want to print the table");
		int n1 = sc.nextInt();
		
		for (int i=1;i<=n1;i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
	}

}
