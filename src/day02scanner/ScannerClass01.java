package day02scanner;

import java.util.Scanner;

public class ScannerClass01 {
	
	



	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter the first integer");
		int num1 = scan.nextInt();
		
		System.out.println("Please enter the second integer");
		int num2 = scan.nextInt();
		
		
		System.out.println("Sum: " + (num1+num2));
		System.out.println("Product: " + (num1*num2));
		System.out.println("Differ: " + (num1-num2));
		
		
		scan.close();
		
		
		
		
		
		
	}
	
	
}
