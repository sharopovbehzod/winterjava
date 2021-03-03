package day02scanner;

import java.util.Scanner;

public class ScannerClass07 {
	
	/*
	 User will enter his first name you will print first character on the console
	 User will enter his last name you will print first character on the console
	 */

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Enter your first nsme ");
		// if you want to get initial of first word you can use this : ".next().charAt(0);" it asks Index of characters. It starts from 0.
		
		char firstNameInitial = scan.next().charAt(0);
		
		System.out.println("Enter your last name");
		char lastNameInitial = scan.next().charAt(0);
		
		System.out.println("Initial of the first name is " + firstNameInitial);
		System.out.println("Initial of the last name is " + lastNameInitial);
		
		//if you use mathematical operations for chars java uses ASCII values of charts.
		 // if you want to print char on the console as characters not ASCII you have 2 options
		// 1. Use double quotes together with chars
		//2. Use System.out.print(); without ln
		System.out.println("" + firstNameInitial + lastNameInitial);
		
		//2. Use System.out.print();
		System.out.print(firstNameInitial);
		System.out.println(lastNameInitial);
		scan.close();

	}

}
