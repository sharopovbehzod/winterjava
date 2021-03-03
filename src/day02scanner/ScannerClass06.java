package day02scanner;

import java.util.Scanner;

public class ScannerClass06 {
	
	
	/*
	   Ask user to enter his/her full name
	   Then ask user to enter spouse's name
	   Then ask user to enter his address
	   Then print all on the console
	 */
	
	
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your Full name");
		String fullName = scan.nextLine();
		
		System.out.println("Please enter your spouse's first  name");
		String spouseName = scan.next();
		
		// to avoid Line issue you can type "scan.nextLine();" once,  before writing next line code
		scan.nextLine();
		
		System.out.println("Please enter your Address");
		String address = scan.nextLine();
		
		System.out.println("My full name is " + (fullName));
		System.out.println("My spouses's name is " + (spouseName));
		System.out.println("My address is " + (address));
		
		
		scan.close();

	}

}
