package com.javaintro;

public class Methodoverloading {
			
	 void  add(int a,int b)
	{
		int d=a+b;
		System.out.println(d);
			
	}
	
	 void add(int a,int b,int c)
	{
		int d=a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Methodoverloading M= new Methodoverloading();
		
		M.add(4,7);
		M.add(3,8 ,8);
	}

}
