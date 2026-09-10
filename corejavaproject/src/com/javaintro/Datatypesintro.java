package com.javaintro;

public class Datatypesintro {

	byte employeeid;
	String employeename;
	short employeeage;
	int employeesalary;
	char employeegrade;
	byte yearofexperience;
	boolean employeeisactive;
	short numberofleaves;
	long phonenumber;
	
	void display(){
		System.out.println("Employee ID:"+ employeeid);
		System.out.println("Employee Name:"+employeename);
		System.out.println("Employee Age:"+ employeeage);
		System.out.println("Employee Salary:"+ employeesalary);
		System.out.println("Employee Grade:"+ employeegrade);
		System.out.println("Year of Experience:"+ yearofexperience);
		System.out.println("Employee is Active:"+ employeeisactive );
		System.out.println("Number of Leaves:"+ numberofleaves);
		System.out.println("Phone Number:"+ phonenumber);
		System.out.println("");

		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Datatypesintro D=new Datatypesintro();
	Datatypesintro D1=new Datatypesintro();
	
	D.employeeid=1;
	D.employeename="Vasu";
	D.employeeage=21;
	D.employeesalary=200000;
	D.employeegrade='A';
	D. yearofexperience=2;
	D. employeeisactive=true;
	D. numberofleaves=5;
	D.phonenumber=9848290890L;
	
	D1.employeeid=2;
	D1.employeename="Ganesh";
	D1.employeeage=21;
	D1.employeesalary=100000;
	D1.employeegrade='B';
	D1. yearofexperience=1;
	D1. employeeisactive=true;
	D1. numberofleaves=5;
	D1.phonenumber=8848290878L;


		
		D.display();
		D1.display();

	}

}
