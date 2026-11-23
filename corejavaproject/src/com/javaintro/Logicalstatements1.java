package com.javaintro;

import java.util.Scanner;

public class Logicalstatements1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your full name:");
		String name = sc.nextLine();
		
		System.out.println("Enter your highest education:");
		String education = sc.nextLine();
		if (education.equalsIgnoreCase("B.Tech")) {
			System.out.println("ok, your are eligiable");
		
		System.out.println("Enter your department:");
		String dept = sc.nextLine();
		String CSE = null;
		String ECE = null;
		if (dept == CSE || dept == ECE) {
			System.out.println("ok, your are eligiable");

		System.out.println("Enter your percentage:");
		float percentage = sc.nextFloat();
		if (percentage >= 70 ) {
			System.out.println("ok, your are eligiable");
	
		System.out.println("Do you have any backlogs:");
		boolean backlogs = sc.nextBoolean();
		if (!backlogs) {
			System.out.println("ok, your are eligiable");
		}
	else {
		System.out.println("Your profile does'nt matched to the role");
		}
		
		}else {
			System.out.println("Your profile does'nt matched to the role");
			}
		}else {
			System.out.println("Your profile does'nt matched to the role");
			}
		}else {
			System.out.println("Your profile does'nt matched to the role");
			}

		
	sc.close();
	}
}
