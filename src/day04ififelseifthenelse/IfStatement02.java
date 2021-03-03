package day04ififelseifthenelse;

import java.util.Scanner;

public class IfStatement02 {

	/*
	 * /*
		 * Type java code by using if statement. When you enter the initial of the day of a week,
           output should be all possible names of the days.
           For example; if the initial is ‘S’ output should be “Saturday or Sunday”
           
           M,T,W,T,F,S,S
           
	*/
	 
	
	

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the initial");
		char initial = scan.next().toUpperCase().charAt(0);
		
		//1.
		if(initial =='M') {
			System.out.println("Monday");
		}
		if(initial =='T') {
			System.out.println("Tuesday or Thursday");
		}
		
		if(initial =='W') {
			System.out.println("Wednesday");
		}
		if(initial =='F') {
			System.out.println("Friday");
		}
			
		if(initial =='S') {
				System.out.println("Saturday or Sunday");
			}
		
		//2. For negative testing or user notification message about wrong input, do this:
		
		if(initial != 'M' && initial != 'T' && initial != 'W' && initial != 'F' && initial != 'S' ) {
			System.out.println("Enter a valid initial");
		}
		
		
		//version3. working with Case issue: 1. add this || after each uppercase initial in if statement
		//                                   2. use this "scan.next().toUpperCase().charAt(0);"
		
		
		
		
		

	}

}
