package com.javaintro;



public class Bugtracker {
	
	int bugid;
	String applicationName;
	String bugTitle;
	String serveity;
	String priority;
	String status;
	String assignedDeveloper;
	
	void display(){
		System.out.println("Bug id:"+bugid);
		System.out.println("Application Name:"+applicationName);
		System.out.println("Bug Title:"+bugTitle);
		System.out.println("Seveity:"+serveity);
		System.out.println("Priority:"+priority);
		System.out.println("Status:"+status);
		System.out.println("Assigned Developer:"+assignedDeveloper);

	}
	
	
	

	public static  void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main method started");
		
		 Bugtracker B= new Bugtracker();
		 
		 B.bugid=1;
		 B.applicationName= "Online Doctor consultaion";
		 B.bugTitle="Backend error";
		 B.serveity="Important";
		 B.priority="top";
		 B.status= "Bug generated";
		 B.assignedDeveloper="Not assigned";
		
		
		B.displaybugsummary();
		B.assigntodeveloper(1,"pradeep","In development");
		System.out.println("");
		System.out.println("Assigning the developer");
		System.out.println("");
		B.displaybugsummary();
		
		System.out.println("Main method ended");

	}

	 int  getBugid() {
		return bugid;
	}
	String getApplicationName() {
		return applicationName;
	}
	String getbugtitle() {
		return bugTitle;
	}
	String getserveity() {
		return serveity;
	}
	String getpriority() {
		return priority;
	}
	String getstatus() {
		return status;
	}
	 String getassignedDeveloper() {
		return assignedDeveloper;
	}
	 void assigntodeveloper(int bugid,String developerName,String progress) {
		assignedDeveloper=developerName;
		updatestatus(progress);
	 }
	 void updatestatus(String newstatus) {
		status =newstatus;
	 }
	void displaybugsummary(){
		System.out.println("Bug id:"+ getBugid());
		System.out.println("Application Name:"+ getApplicationName());
		System.out.println("Bug title:"+getbugtitle());
		System.out.println("Serveity:"+getserveity());
		System.out.println("Priority:"+getpriority());
		System.out.println("Status:"+getstatus());
		System.out.println("Assigned Developer:"+getassignedDeveloper());

	 }
	
}
