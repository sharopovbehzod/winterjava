package day05ifelseif;

import java.util.Scanner;

public class IfElseStatement05 {
	/*
	 * Type java code by using if-else if() statement,
       if both of the two integers are positive, output will be the sum of them.
       If both of the two integers are negative, output will be the multiplication of them.
       Otherwise; output will be “I cannot add or multiply different signed numbers”
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 2 integers");
		int int1 = scan.nextInt();
		int int2 = scan.nextInt();
		
		if(int1 >0 && int2>0) {
			System.out.println(int1+int2);
		}else if(int1<0 && int2 < 0) {
			System.out.println(int1*int2);
		}else if(int1==0 && int2 ==0) {
			System.out.println(int1+int2);
		}
		else {
			System.out.println("I cannot add or multiply different signed numbers");
		}
		
		
		scan.close();
		
		
		
		
		
		

	}

}
