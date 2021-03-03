package day04ififelseifthenelse;

import java.util.Scanner;

public class IfElseStatement01 {
	
	/*
	 * Ask user to enter the values of length and width of a rectangle, 
	 * then check if it is square or not.
	 */
	

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter lenght and width of the rectangle");
		double length =scan.nextDouble();
		double width =scan.nextDouble();
		
		if(width<=0 || length<=0) {
			System.out.println("width and length can not be 0 or negative value.");
			
		}else {
			if(width ==length) {
				System.out.println("It is a square");
			}else {
				System.out.println("It is not a square");  
			}
		}
		
		
		
		
		
		

	}

}
