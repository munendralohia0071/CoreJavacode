package Assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		
		int atmpin=1234;
		double totalamout=200000;
		Scanner  sc=new  Scanner(System.in);
		System.out.println("Enter 4 digit valid ATM PIN");
		int atmPin=sc.nextInt();
		if(atmPin!=atmpin) {
			System.err.println("Invalid PIN. Access denied."); 
		}
		else {
			System.out.println("Login successful.");
			
			System.out.println("Enter withdrawal amount");
			double amount=sc.nextDouble();
			
			if(amount <=0) {
				System.err.println("Withdrawal amount should be in multiples of 100");
				return;
		     }
			if(amount >totalamout) {
				System.err.println("Insufficient balance");
				System.out.println("Available Balance :"+ totalamout);
				return;
			}
			if(amount%100!=0) {
				System.err.println("Withdrawal amount in multiples of 100");
				return;
			}
				System.out.println("Withdrawal successful");
				System.out.println("Withdrawn Amount  :"+amount);		
				System.out.println("Remaining Balance  :"+(totalamout-amount));
		
		}

	}

}
