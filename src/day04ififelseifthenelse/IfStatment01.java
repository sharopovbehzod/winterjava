package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatment01 {
	
	/*
	 * Type java code, if an integer is even, output will be �The integer is even�.
       If the integer is odd, output will be �The integer is odd�.
	 */
	

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Pleaase enter the integer to check if it is odd or even");
		int a = scan.nextInt();
		
		if(a%2 == 0) {
			System.out.println("The integer is even");
			
		}
		
		if(a%2 != 0) {
			System.out.println("The integer is odd");
			
		}

		
		

	}

}
