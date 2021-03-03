package day10forloops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		//printEvenInt1();
		//printEvenInt2();
		//printEvenInt3();
		printStringInReverseOrder();
	}
	
	
	/*
	 * Print all even int from 100 to 23 on the console in a same line with a space among them
	 */
	
	//1way
	public static void printEvenInt1() {
		
		for(int i=100; i>95; i=i-2) {
			System.out.print(i + " ");
		}
		
	}
	
	//2 way
	public static void printEvenInt2() {
		
		for(int i =100; i>22; i--) {
			if(i%2==0) {
				System.out.print(i + " ");
			}
			
		}
		
	}
	
	/*
	 * Print all integers which are divisible by 5 from 100 to 23 on the console in a same line with a space among them
	 */
	
	public static void printEvenInt3() {
		
		for(int i=100; i>22; i--) {
			if(i%5==0) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	
	/* Note: Interview question:
	 * 1)Ask user to enter a String
		 2)Print the String reverse
		 For example; Germany ===> ynamreG
	 */
	
	public static void printStringInReverseOrder() {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a string to see it in reverse order");
	    String str =scan.nextLine();
	    
	    for(int i =str.length()-1; i>=0; i--) {
	    	System.out.print(str.charAt(i));
	    }
	    scan.close();
	}
	
	
	
	
	
	
	
	
	
	
	

}
