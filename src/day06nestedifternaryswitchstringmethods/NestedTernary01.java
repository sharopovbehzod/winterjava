package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class NestedTernary01 {
	/*
	 * Ask user to enter an int
	 * If int is not negative then check if it is less than 10 then return "The Integer is digit"
	 * If the int is negative return "Negatives can not be digits"
	 * Use nested ternary
	 */
	
	

	public static void main(String[] args) {


		 Scanner scan = new Scanner(System.in);
	     System.out.println("Enter an int...");
	     int a =scan.nextInt();
		
		//Structure is:  () ? () : ();
	     
		String result = (a>=0) ? (a<10 ? "The Integer is digit" : "The integer is not digit" ) : ("Negatives can not be digits");
		System.out.println(result);
		

	}

}
