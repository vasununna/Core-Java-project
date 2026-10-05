package com.javaintro;

public class Parameterizedconstructor {
	
	String brand;
	String model;
	String colour;
	double price;
	int year;
	
//	Parameterizedconstructor(){
//		
//	}
	
	Parameterizedconstructor() {
		this("kia");
	}
	Parameterizedconstructor(String brand) {
		this(brand,"seltos");
	}
	Parameterizedconstructor(String brand,String model) {
		this(brand,model,"black");
	}
	Parameterizedconstructor(String brand,String model,String colour) {
		this(brand,model,colour,1500000);
	}
	Parameterizedconstructor(String brand,String model,String colour,double price) {
		this(brand,model,colour,price,2026);
	}
	Parameterizedconstructor(String brand,String model,String colour,double price ,int year) {
		this.brand=brand;
		this.model=model;
		this.colour=colour;
		this.price=price;
		this.year=year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Car details");
		System.out.println("");
		Parameterizedconstructor P=new Parameterizedconstructor();
		P.Display();
		System.out.println("");
		Parameterizedconstructor P1=new Parameterizedconstructor("Mahindra","Thar roxx","Black",2400000,2025);
		P1.Display();
	}

	void Display() {
		System.out.println("Brand of the car:"+ brand);
		System.out.println("Model of the car:"+ model);
		System.out.println("Colour of the car:"+ colour);
		System.out.println("Price of the car:"+ price);
		System.out.println("Year of the car:"+ year);
	}
}
