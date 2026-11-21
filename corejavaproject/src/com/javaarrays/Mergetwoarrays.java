package com.javaarrays;

import java.util.Arrays;

public class Mergetwoarrays {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num1 = {1,2,3,4};
		int[] num2 = {5,6,7,8,9};
		
		int[] num3 = new int [num1.length + num2.length];
		
		for(int i=0;i<num1.length;i++) {
			num3[i] = num1[i];
		}
		for(int i=0; i<num2.length;i++) {
			num3[num1.length+i] = num2[i];
		}
		System.out.println(Arrays.toString(num3));
	}

}
