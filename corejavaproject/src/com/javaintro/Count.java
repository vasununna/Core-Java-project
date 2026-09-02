package com.javaintro;

public class Count {

	static int count=0;
	
	String name;
	int number;
	
	{
		count++;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Count C=new Count();
		Count C1=new Count();
		Count C2=new Count();
		
		C.name="vasu";
		C.number=9999999;
		
		
		C1.name="kalyan";
		C1.number=9999999;
	
		C2.name="ram";
		C2.number=9999999;
	
		System.out.println("created object:"+ count);

		
	
	}

}
