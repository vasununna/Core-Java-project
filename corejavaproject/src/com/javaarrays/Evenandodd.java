package com.javaarrays;

import java.util.Arrays;

public class Evenandodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,35,43,8,60,74,11,23};
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2==0) {
				System.out.println("Even numbers :"+arr[i]);

			}
			else if(arr[i] % 2==1) {
				System.out.println("Odd numbers :"+arr[i]);
			}
		}

	}

}
