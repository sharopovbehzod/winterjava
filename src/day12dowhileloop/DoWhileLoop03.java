package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

	public static void main(String[] args) {

		loop() ;

	}
	
	/*
	 * Ask user to enter password.
		 If the password has more than 6 characters print “It is okay”
		 Otherwise, print “Make the password longer than 6 characters” and ask user to enter a new password
	 */
	public static void loop() {
		Scanner scan = new Scanner(System.in);
		String s="";
		do {
			System.out.println("Please enter a password");
			 s =scan.nextLine();
			 
			if(s.length()>6) {
				System.out.println("It is okay");
				
			}else {
				System.out.println("Make the password longer than 6 characters");
			}
		}
		while(s.length()<=6);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
