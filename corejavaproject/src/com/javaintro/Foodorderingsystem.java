package com.javaintro;

import java.util.Scanner;

public class Foodorderingsystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Food Ordering System");
		System.out.println("");
		System.out.println("Order Your Food");
		System.out.println("");
		double price=0;
		String yn="";
		
		do {
		System.out.println("Enter the item:");
		String item = sc.next();
		
		switch(item) {
		
		case "pizza" ->{
			System.out.println("Pizza :-> price-180");
			double pizza_price=180;
			price +=pizza_price;
		}
		case "burger" ->{
			System.out.println("Burger :-> price-200");
			double burger_price=200;
			price +=burger_price;
		}
		case "biryani" ->{
			System.out.println("Biryani :-> price-220");
			double biryani_price=220;
			price +=biryani_price;
		}
		case "noodles" ->{
			System.out.println("Noodles :-> price-90");
			double noodles_price=90;
			price +=noodles_price;
		}
		
		default ->{
			System.out.println("You enter item is not available ");
		}
		
		}
	
		System.out.println("To add another item click Y for yes and click N for no");
	
		yn=sc.next();
		
	
	}while(yn.equalsIgnoreCase("y"));
		double total_price = price;
		System.out.println("Total price:"+ total_price);
		
		System.out.println("");
		System.out.println("Visit Again");
	}

}
