package com.javaarrays;

public class Evenandoddarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] number = {1,2,3,4,5,6,7};
		
		int evencount=0;
		int oddcount=0;
		
		for(int i=0;i<number.length;i++) {
		
		if(i%2==0) {
			evencount++;
		}
		else {
			oddcount++;
		}
		
		}
		System.out.println("Even numbers "+evencount);
		System.out.println("Odd numbers "+oddcount);
		
	}

}
