package com.javaintro;

import java.util.Scanner;

public class Logicalstatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome to Marriage Matrimonial Site");
		System.out.println();
		
		System.out.println("Enter your full name");
		String name=sc.nextLine();
		System.out.println("Nice to meet you Mr.:"+ name);
		System.out.println("");
		
		System.out.println("Enter the age");
		int age = sc.nextInt();
		if (age >= 25 && age <= 29) {
			System.out.println("ok , that matches to our expectation we will continue our next steps");
			System.out.println("");
		
		System.out.println("Enter your salary");
		double salary=sc.nextDouble();	
		 if (salary >= 2500000) {
			System.out.println("ok good to know,we will continue next steps");
			System.out.println("");
		
		System.out.println("Enter the assets");
		double assets = sc.nextDouble();
		if (assets >= 50000000) {
			System.out.println("ok, we will continue the next steps");
			System.out.println("");
	
		System.out.println("Enter your height and weight");
		double height = sc.nextDouble();   
		double weight = sc.nextDouble();
		if ((height >= 5.6 && height <= 6.1) && (weight >= 60 && weight <=85)) {
			System.out.println("ok, we will continue the next steps");
			System.out.println("");

		System.out.println("Do you have slibings ?");
		boolean slibings = sc.nextBoolean();
		if (!slibings) {
			System.out.println("ok, we will continue");
			System.out.println("");
		}
		else  {
			System.out.println("Sorry your profile does'nt match");	
		}
		}
		else  {
			System.out.println("Sorry your profile does'nt match");	
		}
		}
		else  {
			System.out.println("Sorry your profile does'nt match");	
		}
			}
			else  {
				System.out.println("Sorry your profile does'nt match");	
			}
		}
		else  {
			System.out.println("Sorry your profile does'nt match");	
		}
		
}

}
	


