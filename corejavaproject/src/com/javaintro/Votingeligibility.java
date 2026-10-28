package com.javaintro;

import java.util.Scanner;

public class Votingeligibility {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		if (age >= 18) {
			System.out.println("Eligible for voting,one vote can change the country ");
			System.out.println("");
			
			System.out.println("Enter your citizenship if indian true or any country false");
		
			boolean  citizenship = sc.nextBoolean();
			boolean indian = true;
			
			if (citizenship == indian) {
				System.out.println("Eligible to vote, choose correct person who can develop the country");
				System.out.println("");
		
			
			System.out.println("Do You have voterid");
			boolean voterid = sc.nextBoolean();
			
			if (voterid == true) {
				System.out.println("Eligible to voting");
			
			}
			
		else {
			System.out.println("Not eligible to vote");
		}
		
			}
		else {
			System.out.println("Not eligible to vote");
		}
		
	}
		else {
			System.out.println("Voterid required for voting ");
		}
	}


}
