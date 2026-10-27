package com.javaintro;


 class Vehicle {
	
	String model;
	
	Vehicle(){
		//System.out.println("no org constructor");
		//super("XEV 9e");
	}
	Vehicle(String model){
		//super(model);
	}
}

 class Car extends  Vehicle {
	
	String brand;
	double price;
	
	Car(){
		//super("Mahindra");
	}
	Car(String model,String brand){
		//super(model,brand,3000000);
	}
	Car(String model,String brand,double price){
		//super(model,brand,price);
	}
}
public class ElectricCar extends Car {
	
	int batteryCapacity;

	ElectricCar(){
		//super(540);
	}
	ElectricCar(String model,String brand,double price,int batteryCapacity){
		//super(model,brand,price,batteryCapacity);
		super.model=model;
		super.brand=brand;
		super.price=price;
		this.batteryCapacity=batteryCapacity;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Electic car details");
		
		System.out.println("");
		
		ElectricCar E = new ElectricCar("XEV 9E","Mahindra",3000000,59);
		E.display();
		
		System.out.println("");
		ElectricCar E1 =new ElectricCar("Harrier","Tata",2600000,58);
		E1.display();

	}
	void display() {
		System.out.println("Model of the car:"+model);
		System.out.println("Brand of the car:"+brand);
		System.out.println("Price of the car:"+price);
		System.out.println("Battery Capacity of the car:"+batteryCapacity + " " + "KWH");
	}
}
