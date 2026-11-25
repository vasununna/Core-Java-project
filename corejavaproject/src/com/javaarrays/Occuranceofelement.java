package com.javaarrays;

import java.util.Scanner;

public class Occuranceofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = {9,2,3,5,5,3,8,9,6,};
		int count=0;
		
		System.out.println("Enter the element :");
		int element = sc.nextInt();
		
		for(int i=0;i<num.length;i++) {
			if(num[i] == element) {
				count++;
			}
		}
		System.out.println("The given element occurance is :"+ count);

	}

}
