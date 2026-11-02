package com.javaintro;

import java.util.Scanner;

public class Electricitybillsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Electricity Bill System");
		System.out.println("");
		
		System.out.println("Enter Electric connection type Domestic or Commercial:");
		String connectiontype = sc.nextLine();
		double electricbill=0;
		
		switch (connectiontype) {
		case "domestic connection"->{
			System.out.println("Enter the number of units consumed in Domestic:");
			int units = sc.nextInt();
			
			if (units <= 100) {
				System.out.println("Units less than or equal 100 units per month , units :"+units);
				System.out.println("Charge per unit is 2 RS upto 100 units");
				 electricbill = units*2;
			
			}
			else {
				System.out.println("Units greater than 100 , units:"+units);
				System.out.println("Charge per unit is 3 RS above 100 units");
				electricbill=units*3;
			}
		}
		case "commercial connection" ->{
			System.out.println("Enter the number of units consumed in Commercial connection:");
			int units = sc.nextInt();
			
			if (units <= 100) {
				System.out.println("Units less than or equal 100 units per month , units:"+units);
				System.out.println("Charge per unit is 4 RS upto 100 units");
				electricbill=units*4;
			}
			else if(units >= 100 && units <=300) {
				System.out.println("units greater than 100 to 300 units per month , units:"+units);
				System.out.println("Charge per unit is 6 RS above 100 upto 300 units");
				electricbill= units*6;
			}
			else {
				System.out.println("Units greater than 300 units per month , units:"+units);
				System.out.println("Charge per unit is 8 RS above 300 units");
				electricbill = units*8;
			}
		}
		default ->{
			System.out.println("You enter units are not coorect");
		}
		
		}
		System.out.println("");
		System.out.println("Electricity bill per month:"+electricbill);
	}

}
