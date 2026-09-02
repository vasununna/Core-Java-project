package com.javaintro;

public class Institute {

	static String trainerName1 = "Srikanth";
	static String trainerName2="Vishwanath";
	
	/*{
		System.out.println("Trainer Name1:"+ trainerName1);
		System.out.println("Trainer Name2:"+ trainerName2);
		
	}*/
	
	int employeeId;
	String employeeName;
	String employeeDesignation;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Trainer Name1:"+ trainerName1);
		System.out.println("Trainer Name2:"+ trainerName2);
		

		Institute TE=new Institute();
		
		TE.employeeId=101;
		TE.employeeName="karthik";
		TE.employeeDesignation="Deveopler";
		
		System.out.println("Employee Id :"+ TE.employeeId);
		System.out.println("Employee Name :"+ TE.employeeName);
		System.out.println("Employee Designation :"+ TE.employeeDesignation);
		
		
Institute TE1=new Institute();
		
		TE1.employeeId=102;
		TE1.employeeName="Akshith";
		TE1.employeeDesignation="Designer";
		
		System.out.println("Employee Id :"+ TE1.employeeId);
		System.out.println("Employee Name :"+ TE1.employeeName);
		System.out.println("Employee Designation :"+ TE1.employeeDesignation);
		
		
Institute TE2=new Institute();
		
		TE2.employeeId=103;
		TE2.employeeName="Hemanth";
		TE2.employeeDesignation="Tester";
		
		System.out.println("Employee Id :"+ TE2.employeeId);
		System.out.println("Employee Name :"+ TE2.employeeName);
		System.out.println("Employee Designation :"+ TE2.employeeDesignation);
		
		
Institute TE3=new Institute();
		
		TE3.employeeId=104;
		TE3.employeeName="Vignan";
		TE3.employeeDesignation="Ai engineer";
		
		System.out.println("Employee Id :"+ TE3.employeeId);
		System.out.println("Employee Name :"+ TE3.employeeName);
		System.out.println("Employee Designation :"+ TE3.employeeDesignation);
		
		
Institute TE4=new Institute();
		
		TE4.employeeId=105;
		TE4.employeeName="Pavan";
		TE4.employeeDesignation="Data engineer";
		
		System.out.println("Employee Id :"+ TE4.employeeId);
		System.out.println("Employee Name :"+ TE4.employeeName);
		System.out.println("Employee Designation :"+ TE4.employeeDesignation);
		
	}

}


