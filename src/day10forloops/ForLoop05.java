package day10forloops;

import java.util.Scanner;

public class ForLoop05 {

	public static void main(String[] args) {

		drawTriangle();
		

	}
	
	
	/*
	 * Note: Interview question
	 * 
	 * 1)Ask user to enter a positive integer
		 2)Create and print the following image on the console
							       *
							      * *
							     * * *
							    * * * *
							       .
							       .
							       .
	 */
	public static void drawTriangle() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer value ");
		int s = scan.nextInt();
		
		//To run the inner codes for every row
		for(int j=1; j<=s; j++) {
			
			//To draw spaces
		for(int i=s-j; i>0; i--) {
			//do not use "println" because you should print spaces in the same line
			System.out.print(" ");
		}
		 //To draw "*_"
		for(int k=1; k<=j; k++ ) { //why k<=j not <=s ???
			System.out.print("* ");
		}
		//To move pointer to the next line
		System.out.println();
		
		}
		scan.close();
	}
	
	
	
	//oh okay, first loop is descending , 2nd loop is ascending , So that their logic are reverse to each other
	
	
	
	
	
	
	
	
	
	

}
