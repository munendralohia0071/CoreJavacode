package Assignment;

import java.util.Scanner;

public class Assignment3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter environment :");
		String environment=sc.next();
		
		if(!environment.equalsIgnoreCase("DEV")&&!environment.equalsIgnoreCase("QA")&&!environment.equalsIgnoreCase("STAGE")) {
			System.err.println("Provide valid Environment: DEV, QA or STAGE");
			return;
		}
		System.out.println("Select Browser :");
		System.out.println("Chrome : 1\nFirefox: 2 \nEdge 3");
				            
		int browsernumner=sc.nextInt();
		if(browsernumner!=1&&browsernumner!=2&&browsernumner!=3) {
			System.err.println("Selected Browser not valid");
			return;
		}
		System.out.println("Selected Test Suite :");
		System.out.println("Smoke : 1\nRegression: 2 \nSanity 3");
				            
		int testSuitenumner=sc.nextInt();
		if(testSuitenumner!=1&&testSuitenumner!=2&&testSuitenumner!=3) {
			System.err.println("Select Test Suite not valid");
			return;
		}
		String browserName="";
		switch (browsernumner) 
		{
		case 1 -> browserName="Chrome";
		case 2-> browserName="Firefox";
		case 3->browserName="Edge";
		
		}
		String testSuite="";
		int testCount=0;
		switch (testSuitenumner) 
		{
		case 1 -> {testSuite="Smoke";testCount=20;}
		case 2-> {testSuite="Regression";testCount=100;}
		case 3->{testSuite="Sanity";testCount=30;}
		
		}
		System.out.println("Execution Summary");
		System.out.println("Environment :" +environment);
		System.out.println("Browser :" +browserName);
		System.out.println("Test Suite :" +testSuite);
		System.out.println("Test Count :" +testCount);
		
		
		
		

	}

}
