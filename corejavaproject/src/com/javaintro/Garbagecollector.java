package com.javaintro;

public class Garbagecollector {
	
	class A{
		B b;
	@Override
	protected void finalize() throws Throwable {
System.out.println("finalize method of A");
	}
	}
	
	class B{
		A a;
		@Override
		protected void finalize() throws Throwable {
	System.out.println("finalize method of B");
		}
	}

	@Override
	protected void finalize() throws Throwable {
	System.out.println("finalize method");
	}
	
	void hello(){
		System.out.println("anonymous object");
		Garbagecollector G4=new Garbagecollector();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("main method started");
		Garbagecollector G=new Garbagecollector();
		Garbagecollector G1=new Garbagecollector();
		Garbagecollector G2=new Garbagecollector();
		
		System.out.println(G);
		System.out.println(G1);
		System.out.println(G2);
		
	//  nullifying the object 
		
		 G=null;
		
	
			System.out.println(G);
			System.out.println(G1);
			System.out.println(G2);
		
		//resigning the object	
			
		Garbagecollector G3=new Garbagecollector();
		
		G3=G2;
		System.out.println(G3);
		
	
			System.out.println(G);
			System.out.println(G1);
			System.out.println(G2);
			System.out.println(G3);
			
	//	anonymous object
			
			new Garbagecollector().hello();
			
			 
	// out of scope or object inside method
			 
			 G2.hello();
			 System.gc();	 
			 
		// Island of isolation 
			  Garbagecollector A = new  Garbagecollector();
			  Garbagecollector B = new  Garbagecollector();
		 
		System.out.println("main method ended");

		
	}

}
