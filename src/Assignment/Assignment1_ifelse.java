package Assignment;

import java.util.Scanner;

public class Assignment1_ifelse {

	public static void main(String[] args) {
		
		Scanner  sc=new  Scanner(System.in);
		System.out.println("Enter Performance Rating between 1 to 5 only");
		int performancerating=sc.nextInt();
		System.out.println("Enter Employee Salary");
		int employeeSalary=sc.nextInt();
		System.out.println("Enter Year of Service");
		int yearofService=sc.nextInt();
		double bonusAmount;
		if(performancerating <=0 || performancerating>5) {
			System.err.println("Invalid rating! Rating must be between 1 and 5");
		}
		else if (employeeSalary<=0 || yearofService <=0) {
			System.err.println("Invalid Employee Salary and year of Service ! Both must be greater then zero");
		}
		else if(performancerating==5) {
			if(yearofService >5) {
				bonusAmount=employeeSalary*0.25;
				System.out.println("Performance Bonus : 20%");
				System.out.println("Service Bonus : 5%");
				System.out.println("Total Bonus : 25%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
			else {
				bonusAmount=employeeSalary*0.20;
				System.out.println("Performance Bonus : 20%");
				System.out.println("Service Bonus : 0%");
				System.out.println("Total Bonus : 20%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
		}
		else if(performancerating==4  )
				{
			if(yearofService >5) {
				bonusAmount=employeeSalary*0.20;
				System.out.println("Performance Bonus : 15%");
				System.out.println("Service Bonus : 5%");
				System.out.println("Total Bonus : 20%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
			else {
				bonusAmount=employeeSalary*0.15;
				System.out.println("Performance Bonus : 15%");
				System.out.println("Service Bonus : 0%");
				System.out.println("Total Bonus : 15%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
		}
		else if(performancerating==3 ) {
			if(yearofService >5) {
				bonusAmount=employeeSalary*0.15;
				System.out.println("Performance Bonus : 10%");
				System.out.println("Service Bonus : 5%");
				System.out.println("Total Bonus : 15%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
			else {
				bonusAmount=employeeSalary*0.10;
				System.out.println("Performance Bonus : 10%");
				System.out.println("Service Bonus : 0%");
				System.out.println("Total Bonus : 10%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			}
		}
		else if(performancerating==1 ||performancerating==2 ) {
		
				bonusAmount=employeeSalary*0.00;
				System.out.println("Performance Bonus : 0%");
				System.out.println("Service Bonus : 0%");
				System.out.println("Total Bonus : 0%");
				System.out.println("Bonus Amount : "+bonusAmount);
				System.out.println("Final Salary : "+(bonusAmount+employeeSalary));
				
			
		}
			
		else {
			System.err.println("provdie details not correct");
		}

	}

}
