package com.javaarrays;

import java.util.Scanner;

public class Findelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] numbers = {1,2,3,4,5,6,7,8,9};
		
		System.out.println("Enter the element to search : ");
		int key = sc.nextInt();
		
		boolean status=false;
		
		for(int i=0;i<numbers.length;i++) {
			if(numbers[i]==key) {
				status=true;
				System.out.println("The given element is found in the array :"+numbers[i]);
				break;
			}
		}
		if(!status) {
			System.out.println("The given element is not found in the array ");
		}
		
	}

}
