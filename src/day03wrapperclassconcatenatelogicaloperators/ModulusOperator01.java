package day03wrapperclassconcatenatelogicaloperators;

import java.util.Scanner;

public class ModulusOperator01 {
	
	/*
	 Ask user to enter 3 digit integer
	 Type a program to find the sum of the digits
	 For example: 438==>4+3+8 =15
	 */
	
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter a 3 digitd integer");
		int a = scan.nextInt();
		
		int lastDigit = a%10;
		
		int num1 = a/10;
		int secondDigit = num1%10;
		
		int firstDigit = a/100;
		
		System.out.println(firstDigit + secondDigit + lastDigit);
		
		
		
		
		System.out.println("Please enter a 4 digits integer");
		int b = scan.nextInt();
		
		int num11 = b%10;
		int num2 = (b/10)%10;
		int num3 = (b/100)%10;
		int num4 = b/1000;
		System.out.println(num11 + num4 );
				
		
		
		

	}

}
