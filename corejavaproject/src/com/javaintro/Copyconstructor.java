package com.javaintro;

public class Copyconstructor {
	
	String moviename;
	String heroname;
	String heroniename;
	String directorname;
	double moviebudget;
	String productionname;
	int year;
	
	Copyconstructor(){
		
	}
	
	Copyconstructor(Copyconstructor C){
		this.moviename=C.moviename;
		this.heroname=C.heroname;
		this.heroniename=C.heroniename;
		this.directorname=C.directorname;
		this.moviebudget=C.moviebudget;
		this.productionname=C.productionname;
		this.year=C.year;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copyconstructor C =new Copyconstructor();
		
		C.moviename="Varanasi";
		C.heroname="Mahesh babu";
		C.heroniename="Priyanka chopra";
		C.directorname="SS Rajamouli";
		C.moviebudget=1000000000;
		C.productionname="DDV";
		C.year=2027;
		C.display();
		System.out.println("");
		
		Copyconstructor C1=new Copyconstructor(C);
		C1.display();

		
	}
	void display(){
		System.out.println("Movie name:"+moviename);
		System.out.println("Hero name:"+heroname);
		System.out.println("Heronie name:"+heroniename);
		System.out.println("Director name:"+directorname);
		System.out.println("Production name:"+productionname);
		System.out.println("year of release:"+year);
	}

}
