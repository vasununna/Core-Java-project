package com.javaintro;

public class Testmethods1 {
	
	int basicsalary=100000;
	int travel=5000;
	int food=2000;
	int pf=10000;
	int Experience=3;
	int Noofcompaniesworked=2;
	int noofprojectsworked=10;
	
	
	 void main(String[] args) {
		// TODO Auto-generated method stub

		basicsalary();
		travel();
		food();
		pf();
		compancy("Hcl");
		location("Hyderabad");
		morning(true);
		Department("It");
		project("Development the application");
		Role("Backend developer");
		Manager("Srikanth");
		Experince();
		Noofcompaniesworked();
		Noofprojectsworked();
		
	}

	         void Noofprojectsworked() {
	        	 System.out.println("NO of projects worked till now :"+ noofprojectsworked);
	}

			void Experince() {
	        	System.out.println("Experience:"+Experience);
	}

		   void Noofcompaniesworked() {
	    	   System.out.println("No of companies worked till now:"+Noofcompaniesworked);
	}

		  void Manager(String Mname) {
	    	  System.out.println("Manager name:"+Mname);
	}

		 void Role(String role) {
	    	 System.out.println("Team:"+role);
	}

		void project(String project) {
	    	System.out.println("Project name:"+project);
	}

	   void Department(String dname) {
		   System.out.println("Department name:"+dname);
	}

	  boolean morning(boolean Morning) {
		  System.out.println("Shift:"+Morning);
		  return Morning;
	}

	 String location(String location) {
		 System.out.println("Location:"+location);
		return location;
	}

	String compancy(String compancy) {
		System.out.println("Compancy:"+compancy);
		return compancy;
	}

	 int pf() {
		 System.out.println("pf:"+pf);
		 return pf;
	}

	 int food() {
		 System.out.println("food:"+food);
		 return food;
	}

	 int travel() {
		 System.out.println("Travel:"+travel);
		 return travel;
	}

	int basicsalary() {
		System.out.println("Basic Salary:"+basicsalary);
		return basicsalary;
	}
	
}
