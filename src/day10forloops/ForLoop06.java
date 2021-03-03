package day10forloops;

import java.util.Scanner;

public class ForLoop06 {

	public static void main(String[] args) {

		drawTriangle();
		

	}
	
	/*
	 * Create the following image by getting the number of rows from user
		 				 
		         
		       * * * *
		        * * *
		         * *
		          *
	 */
	
public static void drawTriangle() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an integer value ");
		int s = scan.nextInt();
		
		for(int i=s; i>0; i--) {
			
			//Create for look for spaces
			for(int j =0; j< s-i; j++) {
				System.out.print(" ");
			}
			
			//Create a for loop for "* "
			
			for(int k=s; k>s-i; k--) {
				System.out.print("* ");
			}
			System.out.println();
			
		}
		scan.close();
		
		
		
		
		
        }
	
	
	

}
