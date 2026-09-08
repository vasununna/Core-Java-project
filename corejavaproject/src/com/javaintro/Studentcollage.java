package com.javaintro;

public class Studentcollage {
	
	static String collage="Vnr vjiet";
	
	
	String name;
	int age;
	
	void display(){
		System.out.println("College Name:"+ collage);
		System.out.println("Student Name:"+name);
		System.out.println("Student Age:"+age);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Studentcollage S= new Studentcollage();
		
		S.name="Vasu";
		S.age=21;

		S.display();
		
		S.name="Vignan";
		S.age=21;

		S.display();
		
		S.name="Karthik";
		S.age=21;

		S.display();
	}

}
