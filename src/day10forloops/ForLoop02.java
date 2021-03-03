package day10forloops;

import java.util.Scanner;

public class ForLoop02 {
	
	//Homeworks in the slide

	public static void main(String[] args) {

		printStringInReverseOrder();
		

	}
	
	/*Note: Interview question
	 * 1)Ask user to enter a String
	2)Check the String if it is “Palindrome” or not
	For example: "aba" and "aba"
	 */
	public static void printStringInReverseOrder() {
	Scanner scan = new Scanner(System.in);
    System.out.println("Enter a string to see if it a Palindrome or not");
    String str =scan.nextLine(); //1)reverse the string . 2) put reverse string into container. 3) compare the string with reverse string
    
    String revStr ="";
    
    for(int i =str.length()-1; i>=0; i--) {////1)reverse the string 
    	
    	revStr = revStr + str.substring(i, i+1);//2) put reverse string into container
    }
    if(str.equalsIgnoreCase(revStr)) {  // 3) compare the string with reverse string
    	System.out.println(str + " is Palindrome");
    }else {
    	System.out.println(str + " is not Palindrome");
    }
    
    
	}
	
	
	
	
	
	
	
	
	
	

}
