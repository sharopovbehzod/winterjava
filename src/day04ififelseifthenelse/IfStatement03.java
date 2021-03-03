package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement03 {

	/*
	 * Type java code by using if statement. When you enter the name of the day of a week,
       output will be “Weekday” or “Weekend day” according to the name of the day.
	 */
	
	
	
	public static void main(String[] args) {
		
		
		//version 1.Positive scenarios
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a day of the week");
		String day = scan.next().toLowerCase(); // we can convert it to lower case.
		
		//Note: To compare Strings, DO NOT USE "==". Use "equals()" method.
				// "Ali".equals("Veli"); ==> false
				// "Ali".equals("Ali"); ==> true
				// "Ali".equals("ali"); ==> false

		
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || 
		   day.equals("thursday") || day.equals("friday")) {
			System.out.println("Weekday");
			
		}
		
		if(day.equals("saturday") || day.equals("sunday") ) {
			System.out.println("Weekend day");
			
		}
		
		//version2. Negative scenarios.
		
		
		if(!day.equals("monday") && !day.equals("tuesday") && !day.equals("wednesday") && 
		   !day.equals("thurday") && !day.equals("friday") && !day.equals("saturday") && !day.equals("sunday")) {
			System.out.println("Give me valid day name");
		}
		
		

	}

}
