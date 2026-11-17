package com.javaarrays;

import java.util.Arrays;

public class Arrays1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= {1,0,2,0,0,9,1,0,7,0};
		
		System.out.println("Before swapping "+Arrays.toString(num));
		System.out.println("");
		int index =0;
		for(int i=0;i<num.length;i++) {
			if (num[i]!=0) {
				int temp=num[i];
				num[i]=num[index];
				num[index]=temp;
				index++;
				
			}
		}
		System.out.println("After swapping "+Arrays.toString(num));
		System.out.println("");
	}	

}
