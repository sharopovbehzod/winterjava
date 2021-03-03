package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary03 {
	/*
	 * Ask user to enter an integer. If the number has 3 digits, output will be
       “This number has 3 digits.” Otherwise, output will be “This number has no 3 digits.”
     How can you decide the number of digits of an integer?
	 */

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the int...");
		int a =scan.nextInt();
		
		String result = (a>99 && a<1000) ||(a<-99 && a>-1000)  ? "This number has 3 digits " : "This number has no 3 digits.";
		System.out.println(result);
		
		
		//Second question
		//Ask user to enter a String. If the String has 2 characters, output will be
		//“It is valid for state abbreviations” Otherwise, output will be “It is not valid for state abbreviations”
		
		System.out.println("Enter the String...");
		String b =scan.next();
		
		String result2 = b.length()==2 ? "It is valid for state abbreviations" : "It is not valid for state abbreviations";
		System.out.println(result2);
		
		scan.close();

	}

}
