package com.javaintro;

public class Forloop3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=50;i++) {
			if(i%3==0 && i%5==0) {
				System.out.println(i+"Numbers divisible by 3&5 : Fizz & Buzz");
				System.out.println("");
			}
			else if (i%3==0) {
				System.out.println(i+"Numbers divisible by 3 : Buzz ");
				System.out.println("");
			}
			else if (i%5==0){
				System.out.println(i+"Numbers divisible by 5 : Fizz");
				System.out.println("");
			}
			else {
				System.out.println(i+"Numbers not divisible by 3 & 5");
			}
		}
	}

}
