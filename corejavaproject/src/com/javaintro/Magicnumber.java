package com.javaintro;

import java.util.Scanner;

public class Magicnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		
		boolean flag = ismagicnumber(n);
		
		if(flag) {
			System.out.println("The given number is a magic number ");
		}
		else {
			System.out.println("The given number is not a magic number ");
		}
		//System.out.println("Magic number is :"+flag);

		
	}

	private static boolean ismagicnumber(int n) {
		boolean status =false ;
		int r=0;
		int sum=0;
		
		while (n>9) {
		sum=0;
		
		while(n>0) {
			r=n%10;
			n=n/10;
			sum=sum+r;
		}
		n=sum;
		}
		
		if(sum==1) {
			status=true;
		}
		return status;
	}

}
