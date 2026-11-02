package Assignment;

import java.util.Scanner;

public class assignment1_switch {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Performance Rating between 1 to 5 only");
		int performancerating = sc.nextInt();
		System.out.println("Enter Employee Salary");
		int employeeSalary = sc.nextInt();
		System.out.println("Enter Year of Service");
		int yearofService = sc.nextInt();
		
		if (performancerating <= 0 || performancerating > 5) {
			System.err.println("Invalid rating! Rating must be between 1 and 5");
			
		}
		else if (employeeSalary <= 0 || yearofService <= 0) {
			System.err.println("Invalid Employee Salary and year of Service ! Both must be greater then zero");
			
		}
		else {
		int performanceBonus = 0;
		int serviceBonus = 0;
		
		switch (performancerating) {
		case 5->performanceBonus = 20;
		case 4->performanceBonus = 15;
		case 3->performanceBonus = 10;
		case 1,2->performanceBonus = 0;
		}
		if (performanceBonus > 0 && yearofService > 5) {
			serviceBonus = 5;
		}
		int totalBonus = performanceBonus + serviceBonus;
		double bonusAmount = employeeSalary * (totalBonus / 100.0);
		double finalSalary = employeeSalary + bonusAmount;
		
		System.out.println("Performance Bonus : " + performanceBonus + "%");
		System.out.println("Service Bonus     : " + serviceBonus + "%");
		System.out.println("Total Bonus       : " + totalBonus + "%");
		System.out.println("Bonus Amount      : " + bonusAmount);
		System.out.println("Final Salary      : " + finalSalary);

	}
	}

}
