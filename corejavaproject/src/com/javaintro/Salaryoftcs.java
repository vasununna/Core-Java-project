package com.javaintro;

import java.util.Scanner;

public class Salaryoftcs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the salary");
		double salary = sc.nextDouble();
		
		if (salary >= 9.6) {
			System.out.println("The role is prime ");
		}
		else if (salary >= 7.6) {
			System.out.println("The role is digital");
		}
		else if (salary >= 3.6) {
			System.out.println("The role is ninja");
		}
		else {
			System.out.println("Enter the valid salary");
	}

}
	
}	
	
