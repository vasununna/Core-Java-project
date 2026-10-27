package com.javaintro;

import java.util.Scanner;

public class Gradesofstudents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		double marks = sc.nextDouble();
		
		if (marks < 0 && marks  > 100) {
			
		}
		else if (marks >= 90 && marks <= 100) {
			System.out.println("Grade A");
		}
		else if (marks >= 80 && marks <=90) {
			System.out.println("Grade B");
		}
		else if (marks >= 70 && marks <=80) {
			System.out.println("Grade C");
		}
		else if (marks >= 60 && marks <=70) {
			System.out.println("Grade D");
		}
		else if (marks >= 50 && marks <=60) {
			System.out.println("Grade E");
		}
		else if (marks >= 35 && marks <=50) {
			System.out.println("passed");
		}
		else if (marks < 35) {
			System.out.println("Failed");
		}
		else {
			System.out.println("Invalid marks , Enter correct marks");
		}
		
	}

}
