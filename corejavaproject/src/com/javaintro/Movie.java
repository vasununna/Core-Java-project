package com.javaintro;

public class Movie {

	static String theaterName="Vishwanth Theater";
	static String theaterLocation="KPHB";
	
	static void theater() {
		 
		System.out.println("theaterName:"+ theaterName);
		System.out.println("theaterLocation:"+theaterLocation);
	}
	
	String movieName;
	String movieBudget;
	String releaseDate;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		Movie M=new Movie();
		
		
		M.movieName="sprit";
		M.movieBudget="200 cr";
		M.releaseDate="5th march 2027";
		
		theater();
		
		System.out.println("MovieName:"+M.movieName);
		System.out.println("MovieBudget:"+M.movieBudget);
		System.out.println("ReleaseDate:"+M.releaseDate);
		
		
		Movie M1=new Movie();
		
		
		M1.movieName="Varanasi";
		M1.movieBudget="1000 cr";
		M1.releaseDate="10th apral 2027";
		
		theater();
		
		System.out.println("MovieName:"+M1.movieName);
		System.out.println("MovieBudget:"+M1.movieBudget);
		System.out.println("ReleaseDate:"+M1.releaseDate);
		
		
		
		
		Movie M2=new Movie();
		
		
		M2.movieName="fauzi";
		M2.movieBudget="500 cr";
		M2.releaseDate="3rd dec 2026";
		
		theater();
		
		System.out.println("MovieName:"+M2.movieName);
		System.out.println("MovieBudget:"+M2.movieBudget);
		System.out.println("ReleaseDate:"+M2.releaseDate);
		
		
		
		

	}

}
