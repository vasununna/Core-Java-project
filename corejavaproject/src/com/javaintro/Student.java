package com.javaintro;

public class Student {

	static String collageName="vcube";
		
		{
				System.out.println("collage name :" + collageName);
				}
				
	
	
	
	int studentId;
	String studentName;
	int studentMarks;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student VD = new Student();
		
		VD.studentId=1234;
		VD.studentName="vasu";
		VD.studentMarks=100;
		
		
			System.out.println("collage name :" + collageName);
			
			
		System.out.println("StudentID:"+ VD.studentId);
		System.out.println("StudentName:"+ VD.studentName);
		System.out.println("StudentMarks:"+ VD.studentMarks);
		
		Student MSD = new Student();
		
		MSD.studentId=4321;
		MSD.studentName="Dhoni";
		MSD.studentMarks=100;
		
		
		System.out.println("StudentID:"+ MSD.studentId);
		System.out.println("StudentName:"+ MSD.studentName);
		System.out.println("StudentMarks:"+ MSD.studentMarks);
		
	
	

	}

}
