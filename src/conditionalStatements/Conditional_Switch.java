package conditionalStatements;

public class Conditional_Switch {

	public static void main(String[] args) {
		
		int n=10;
		int b=20;
		char c='+';
		
		String weekday="Mon";
		
		/*legacy switch */
		
		switch (c) {
		case '+': System.out.println("Addtion :" + (n+b));
					break;
		case '-': System.out.println("Substraction :" + (n-b));
					break;
		case '*': System.out.println("Multipication :" + (n*b));
		           break;
		           
	    default : System.out.println("Please chooes valid oprater"); 
		
		}
		
		/* advavnced switch statment */
		
		switch(c) {
		case '+' ->System.out.println("Addition :"+ (n+b)); 
		case '-' -> System.out.println("Substraction :"+ (n-b));		
		case '*'->System.out.println("multipication :"+ (n*b));
		case '/' -> System.out.println("Division :"+ (n/b)); 
		case '%' -> System.out.println("Modulus :"+ (n%b));
		default ->  System.out.println("Please choose valid arithmetic operator");
		
		}
	

	}

}
