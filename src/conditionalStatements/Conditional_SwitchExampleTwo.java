package conditionalStatements;

public class Conditional_SwitchExampleTwo 
	 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			String browserName = "Chrome";
			
			switch(browserName) {
			case "Chrome" : System.out.println("Executing on Chrome Browser"); 
							break;
			case "Firefox" : System.out.println("Executing on Firefox Browser"); 
			break;
			case "Edge" : System.out.println("Executing on Edge Browser"); 
			break;
			case "Mobile_Chrome" : System.out.println("Executing on Mobile_Chrome Browser");  break;
			case "iOS_Safari" : System.out.println("Executing on iOS_Safari Browser"); 
							break;

			default :  System.out.println("Please choose valid BrowserName");
			
			}
			
			/************** EXample *****************/
			String day = "Tuesday";
			switch(day) {
			case "Saturday","Sunday" -> System.out.println("Weekend"); 
						
			case "Monday","Tuesday","Wedesday","Thursday","Friday" -> System.out.println("Weekday"); 
		
			default ->  System.out.println("Invalid");
			}
		}

	}

