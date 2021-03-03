package day02scanner;

import java.util.Scanner;

public class ScannerClass04 {
	
	/*
	   Type a program which calculates the volume of a rectangular prism
       whose length, with, and height are entered by user.
       Hint 1: Volume of a rectangular prism is width x length x height
	 */
	



	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please give me the length of the ectaangle");
		double length = scan.nextDouble();
		
		System.out.println("Please give me the wingth of the ectaangle");
		double wingth = scan.nextDouble();
		
		System.out.println("Please give me the height of the ectaangle");
		double height = scan.nextDouble();
		
		System.out.println("Volumn: " + (wingth * length * height));
		
		scan.close();

	}

}


