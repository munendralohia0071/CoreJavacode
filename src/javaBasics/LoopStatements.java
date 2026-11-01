package javaBasics;

import java.util.Scanner;

public class LoopStatements {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    
    System.out.println("Enter Number: ");
    
    		int n=sc.nextInt();
    		LoopStatements lo=new LoopStatements();
    		lo.doWhileloop(n);
    		lo.whileLoop(n);
    		lo.forloop(n);
	}
	
	void doWhileloop(int n) {
		/* print certain statement atleast once before your loop runs */
		/* Use do-while loop in case of pagination; if we want to click on some navigation atleast once 
		 * search for an element in web page first, if available go ahead with next steps; else have multiple attempts repeated to find it */ 
		do {
			System.out.println("Do while loop Value of n: "+ n);
			n++;
		}
		while(n<=10);
			
	}
	void whileLoop(int n) {
		/* Use while loop in case of pagination; scrolling ; retry logic in automation ; or anything that is dynamic size */
		
		while(n<=10) {
			System.out.println("Whli loop value of n:"+n);
			n++;
		}
		
	}
	void forloop(int n) {
		// for(initialization ; conditional check ; increment or decrement)
				/* In automation - processing multiple web elements; execute multiple values; fixed page size, fixed table size  */
		
		for(int i=n;i<=10;i++) {
			System.out.println("Forloop :-value of n: "+n);
			n++;
		}
		
	}

}
