package day02scanner;

import java.util.Scanner;

public class ScannerClass05 {
	
	/*
	  Type a program which asks user to enter his/her first name and last name, 
      then print it on the console.
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your first name and last name");
		String fullName = scan.nextLine();
		
		System.out.println("Your fullname is " + (fullName));
		
		System.out.println("Enter your kid's first name");
		String kidsFirstname = scan.next();
		
		System.out.println(kidsFirstname);
		
		scan.close();

	}

}
