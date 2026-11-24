package com.javaarrays;

import java.util.Arrays;

public class Reverseofelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int arr[]={11,12,13,14,15,16}; 
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 int n= arr[i];
			 int rev=0;
			 int r=0;
			 
			 while(n>0) {
				 r=n%10;
				 n=n/10;
				 rev=rev*10+r;			
			 }
			 arr[i]=rev;
			 System.out.print(arr[i]+" ");
		 }
		
	}

}
