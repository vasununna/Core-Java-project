package com.javaintro;

public class Methods {
	static {
	Methods M =new Methods();
		
		M.method4();
	}
	
	
	static void method1() {
		
		System.out.println("Method1 called");
		
	}
	static void method2() {
		method1();
		System.out.println("Method2 called");
		
	}

	void method3() {
		method2();
		System.out.println("Method3 called");
		
	}
	void method4() {
		method3();
		System.out.println("Method4 called");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	Methods M =new Methods();
		
		//M.method4();
	}

}
