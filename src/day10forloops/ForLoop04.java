package day10forloops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {

		productOfInt();
		
		

	}
	
	/*Note: Interview question
	 * Ask user to enter beginning and ending values.
	 * Type code to calculate the multiplication of the ints from the beginning to ending values.
	 * 
	 * That question can be asked like :
	 * Type code to calculate the factorial of given number 
	 */
	
	public static void productOfInt() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a starting integer value ");
		int s = scan.nextInt();
		
		System.out.println("Enter a ending integer value ");
		int e = scan.nextInt();
		
		int product =1;
		
		
		
		for(int i=s; i<=e; i++) {
			product = product *1;
		}
		
		System.out.println(product);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
