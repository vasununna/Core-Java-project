package com.javaarrays;

public class Sumandavg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] marks= {98,99,96,100,97,95};
		int sum=0;
		int avg=0;
		
		for(int m: marks) {
			sum +=m;
		}
		avg=sum/marks.length;
		
		System.out.println("Sum of all the marks :"+sum);
		System.out.println("Avg of all the marks :"+avg);
	}

}
