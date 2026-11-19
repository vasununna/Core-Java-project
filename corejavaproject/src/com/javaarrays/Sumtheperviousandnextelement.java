package com.javaarrays;

public class Sumtheperviousandnextelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number[]={10,20,30,40,50,60};
		
		
		int sum[] = new int[number.length];
		
		for (int i=0;i<number.length;i++) {
			
		if(sum[i]>0) {
			sum[i]=sum[i]+sum[i+1];		
			}
		else if(sum[i]>0) {
			sum[i]=sum[i+1]+sum[i-1];
		}
		else {
			sum[i]=sum[i]+sum[i+1];
		}
		for(int j=0;j<number.length-1;j++) {
			System.out.print(i);
		}
			
		}
	}

}
