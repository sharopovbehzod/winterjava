package day12dowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {

		 checkInitial();

	}
	/*
	 * Ask user to enter his/her first name
		 If the initial is lower case print a message like �Make the initial upper case�
		 If the initial is upper case print a message like �You did it right�
	 */
	public static void checkInitial() {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter your first name");// if you want to make first message different use it outside of the loop
	String fn ="";
	
	do {
		//System.out.println("Enter your first name"); if you use it here, you will get it on the console
		fn=scan.next();
		if(fn.charAt(0)>='A' && fn.charAt(0)<='Z' ){
		System.out.println("You did it right...");
	}else {
		
		System.out.println("Please, make the initial uppercase");
	}
	
	}
	while(!(fn.charAt(0)>='A' && fn.charAt(0)<='Z'));
	
	
	
	
	
	}
	
	

}
