package com.javaintro;

import java.util.Scanner;

public class Forloop2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				//System.out.println(i);
				sum+=i;
				System.out.println(sum);
			}
		}
	}

}
