package com.javaintro;

public class Welcome {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	System.out.println("Welcome to java world");
		
		/*int n;
		switch (n=7) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		case 7:
			System.out.println("sunday");
			break;
			
			default :
				System.out.println("select the correct number");
			
		}*/
		
		
		/*String day="monday";
		
		switch (day) {
		
		case "monday","tuesday" :
		System.out.println("6am");
		break;
		
		case "wednesday","thrusday","friday":
			System.out.println("7am");
		break;
		case "satarday","sunday":
			System.out.println("8am");
		break;
		default :
			System.out.println("enter the correct number");
		}*/
		
		
/*	int i=1;
	while(i<5) {
		System.out.println("while loop"+ " "+i);
		i++;
		int j=0;
		while(j<4) {
			System.out.println("inner loop");
			j++;
		}
	}
	
	i=5;
	do {
		System.out.println("do while loop"+i);
		i++;
	}
	while(i<5);*/
		
		for(int i=0;i<6;i++) {
			
			System.out.println("Day"+i);
			
			for(int j=0;j<8;j++) {
				System.out.println("hours"+ ""+ (j+8));
			}
		}
	}

}
