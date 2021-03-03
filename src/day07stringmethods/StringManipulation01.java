package day07stringmethods;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {

		
		String str = "Java is Java";
	  //12) endsWith() is used to check last char in a string.
		//endsWith() is used with String, do not use it with chars.
		//endsWith() can be used with multiple char as well.
		//endsWith() returns boolean.
		
		System.out.println(str.endsWith("a"));	//true
		System.out.println(str.endsWith("x"));	//false
		//System.out.println(str.endsWith('a'));	//not be used
		System.out.println(str.endsWith("ava"));	//true
		
		
		//13.startsWith() is used to check first char in a string.
		//startsWith() is used with String, do not use it with chars.
		//startsWith() can be used with multiple char as well.
		//startsWith() returns boolean.
		
		System.out.println(str.startsWith("J"));//true
		System.out.println(str.startsWith("Java"));//true
		
		//If you want to check the character in a specific index do the following:
		System.out.println(str.startsWith("i", 5));//true
		System.out.println(str.startsWith("is", 5));
		
		
		//14) isEmpty() is used to check if a string has 0 character or not
		// If string has no any character isEmpty() returns "true", otherwise returns "False"
		
		System.out.println(str.isEmpty());//false
		
		String str2 = "";
		System.out.println(str2.isEmpty()); //true
		
		//15)replace() is used to change a specific character/s to another one.
		System.out.println(str.replace("a", "x"));
		System.out.println(str);
		System.out.println(str.replace("ava", "a"));
		System.out.println(str.replace("ava", "xxxxxx"));
		//replace() method can be used to delete character/s.
		System.out.println(str.replace("a", ""));
		//in replace() char and string both can be used
		System.out.println(str.replace('a', 'x'));
		
		//System.out.println(str.replace("a", 'x'));//can not be used
		
		System.out.println(str.replace("a", "a"));
		
		//16 replaceAll() does the same with replace(), but there are some diffs
		      //1. in replaceAll() you can't  use char
		     //2. in replaceAll() you can use regular expressions.
		System.out.println(str.replaceAll("a", "x"));
		//System.out.println(str.replaceAll('a', 'x'));// can't be executed
		
		String str3 = "Java123 learn, earn_money!!  .";
		
		// Regular expressions ==> 1. \\s means space character
		     //2. \\S all chacater except  space character (upper case means negative sign)
		    //3.\\w  a-->z, A-->Z, _, 0-->9  (w means word)
		    //4.\\W all characters except a-->z, A-->Z, _, 0-->9
		   //5. \\d  0-->9 (digits)
		   //6.\\D all characters except 0-->9
		System.out.println(str3.replaceAll("\\s", "*"));
		System.out.println(str3.replaceAll(" ", "*"));//this also same but if you use othe regular exp you will understand
		System.out.println(str3.replaceAll("\\S", "*"));
		System.out.println(str3.replaceAll("\\w", "*"));
		System.out.println(str3.replaceAll("\\W", "&"));
		System.out.println(str3.replaceAll("\\d", "&"));
		System.out.println(str3.replaceAll("\\D", "+"));
		
		
		//17 replaceFirst() changes the just first occurance of the character.
		System.out.println(str3.replaceFirst("a", "*"));
		
		//18.substring() is used to get a part of the String by using indexes.
		String str4 = "Java is the best";
		
		System.out.println(str4.substring(3));
		System.out.println(str4.substring(7));
		//System.out.println(str4.substring(0)); and System.out.println(str4); are the same
		System.out.println(str4.substring(0));
		//if you use last index it returns last character, because indexes used in substring() are inclusive
		System.out.println(str4.substring(15));//t
		//if you use length in substring(), it returns nothing
		System.out.println(str4.substring(16));
		//If you use any index greater than length of the string, it returns error like :"StringIndexOutOfBoundsException"
		//System.out.println(str4.substring(17));
		
		
		/*
		 * Ask user to enter a string if the first and last character of the string are same 
		 * Print "Wooow!" on the console, otherwise print "Hmmmm!" on the console
		 */
		/* scan = new Scanner(System.in);
		System.out.println("ENter the string");
		String s = scan.next();
		
		//length() -1 everytime gives you last index
		 * 
		String last = s.substring(s.length()-1);
		
		//Substring() can be used with two parameters. First parameter is starting index(inclusive), second parameter is ending index(exclusive)
		String first = s.substring(0,1);
		
		
		String bb = (first.equals(last)) ? "Wooow" : "Hmmm";
		System.out.println(bb);
		
		*/
		
		String str5 = "Java is an OOP language";
		
		System.out.println(str5.substring(5,14));
		System.out.println(str5.substring(2,3));
		//If starting and ending indexes are the same you not getting anything.
		System.out.println(str5.substring(2,2));
		//In substring() method, starting index can not be larger than ending one. If you do it you will get error.
		System.out.println(str5.substring(3,2));
		
		/*
		  When we type the code we may get 2 types of error messages
		  1) While you type code you may get "red underline", this type error is called "Compile Time Error"
		  2)  While you type code you don't get "red underline", but when you run the code you will get some red error messages on the console. 
		  That kind of errors are called "Run Time Error"
		  
		  
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
