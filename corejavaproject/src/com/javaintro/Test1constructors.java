package com.javaintro;

public class Test1constructors {
	int id;
	String name;
	double sal;
	
	Test1constructors(int id,String name,double sal){
		this.id=id;
		this.name=name;
		this.sal=sal;
		System.out.println("parameterized Constructor called");
	}

	Test1constructors(){
		
		System.out.println("No args constructor called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1constructors T=new Test1constructors(1,"Vasu",100000);
		Test1constructors T1=new Test1constructors();
		T.info();
		
		T1.id=2;
		T1.name="Hemanth";
		T1.sal=10000;
		
		T1.info();
		
	}

	void info(){
		System.out.println("Id:"+id);
		System.out.println("Name:"+name);
		System.out.println("Sal:"+sal);
		}
}
