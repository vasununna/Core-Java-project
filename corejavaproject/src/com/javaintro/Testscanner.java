package com.javaintro;

import java.util.Scanner;

public class Testscanner {
	
	//String CricketerHistory;
	int age;
	String fName;
	String lName;
	String country;
	int jerseyno;
	String Team;
	int matches;
	int runs;
	int centuries;
	int catches;
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Cricketer History");
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the first name:");
		String fName=sc.nextLine();
		System.out.println("Enter the last name:");
		String lName=sc.nextLine();
		System.out.println("Enter the country name:");
		String country=sc.nextLine();
		System.out.println("Enter the jersey number:");
		int jerseyno=sc.nextInt();
		System.out.println("Enter how many matches played:");
		int matches=sc.nextInt();
		System.out.println("Enter how many runs scored:");
		int runs=sc.nextInt();
		System.out.println("Enter how many centuries scored:");
		int centuries =sc.nextInt();
		System.out.println("Enter how many catches catched");
		int catches=sc.nextInt();
		
		age(age);
		fullname(fName,lName);
		
	}
	
	static void age(int age) {
		System.out.println("Age:"+age);
	}
	static void fullname(String fName,String lName) {
		System.out.println("Enter the full name:"+fName + " "+lName);
	}
}
