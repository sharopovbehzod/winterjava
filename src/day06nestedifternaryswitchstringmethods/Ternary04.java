package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class Ternary04 {
	/*
	 * Ask user to enter an int.
	 * If the integer is negative return "This integer is negative."
	 * If int is not negative returns its square
	 * Use ternary
	 */

	public static void main(String[] args) {
		
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter an int...");
		int a =scan.nextInt();
		
		System.out.println(a<0 ? "This integer is negative." : a*a);
		scan.close();

	}

}
