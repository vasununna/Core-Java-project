package com.javaarrays;

public class Positiveandnegativeelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] elements= {1,2,3,-4,-5,-6};
		
		int positivecount=0;
		int negativecount=0;
		
		for(int i=0;i<elements.length;i++) {
			if(i==0) {
				positivecount++;
			}
			else {
				negativecount++;
			}
		}
		
		System.out.println("Positive numbers "+positivecount);
		System.out.println("Negative numbers "+negativecount);
		
	}

}
