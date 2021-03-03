package day06nestedifternaryswitchstringmethods;

import java.util.Scanner;

public class StringManipulation01 {
	
	/*
	 * String Methods: 
	 * 1) toUpperCase()
	 * 2) toLowerCase()
	 * 3)charAt()
	 * 4) equals()
	 * 5) equalsIgnoreCase()
	 * 6)length()
	 * 7)next()
	 * 8)nextLine()
	 * 9)indexOf()
	 * 10)lastIndexOf()
	 * 11) contains()
	 * 
	 * 
	 * 
	 */
	
	

	public static void main(String[] args) {

		String str ="Java is easy if you study";
		
		//9) indexOf() returns the index of first occurance of the character
		
		System.out.println(str.indexOf("i"));//5
		
		//indexOf() accepts char as parameter as well
		System.out.println(str.indexOf('i'));//5
		
		//If the character doesn't exist in the string, it returns "-1"
		System.out.println(str.indexOf("x"));//-1
		
		//If you use multiple characters in indexOf() it returns index of first character.
		System.out.println(str.indexOf("easy"));//8
		
		//If you use indexOf() with 2 parameters Java looks for the characters after the given index(or we give the starting point of first char)
		System.out.println(str.indexOf('i',8));//13
		
		//second parameter is inclusive
		System.out.println(str.indexOf('e',8)); //8
		
		
		
		/*
		 * Interview Question:
		 * Ask user to enter a string and a character, then check if the string has the char or not
		 */
		
		Scanner scan = new Scanner(System.in);
		/*System.out.println("Enter a String the enter a character");
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		
		String result = s.indexOf(ch)==-1 ? "The String has no the character" : "The String has the character";
		System.out.println(result);
		*/
		
		//10)lastIndexOf() returns index of last occurance of the character
		
		String t = "Java ah Java";
		
		// in lastIndexOf(), you can use char and string, both are acceptable
		System.out.println(t.lastIndexOf('a'));//11
		System.out.println(t.lastIndexOf("a"));//11
		
		//lastIndexOf() returns'-1' if the character does not exist in the string
		System.out.println(t.lastIndexOf("w"));//-1
		
	   //lastIndexOf() returns the index of first char of last occurance of "Java"
		System.out.println(t.lastIndexOf("Java"));//8
		//If you use lastIndexsOf() with two parameters get the characters starting with the index and to the beginning of the String
		//in the following example we are using "Java a"
		System.out.println(t.lastIndexOf("v",5));//2
		
		//11) contains()
		
		/*
		 * Ask user to give you a string and and a character.
		   If the character does not exist in the string or exists just once, print "Not good"
		   If character used multipler times print "Wooow"
		*/
		
		
		System.out.println("Enter a String the enter a character");
		String s = scan.nextLine();
		char ch = scan.next().charAt(0);
		
		
		if(s.indexOf(ch)==-1 || s.indexOf(ch)==s.lastIndexOf(ch)) {
			System.out.println("Not good!");
		}
        if(s.indexOf(ch)!=s.lastIndexOf(ch)) {
        	System.out.println("Wooow");
        }
		
		
        
		//11) contains() is used to check if a single character or multiple characters exist in aString
		//It returns boolean
		//can not be used with chars. you have to use just String.
        String r ="Learn Java, earn money";
        System.out.println(r.contains("e"));//true
        System.out.println(r.contains("x"));//false
       // System.out.println(r.contains('x'));
        
        System.out.println(r.contains("earn"));
        

	}

}
