package day15arrays;

import java.util.Arrays;

public class Arrays03 {
	
	/*
	 * One more String method...
	 * split() method is used to split a String by using a specific character/s
	 * split() method  puts the splitted parts into an array.
	 * 
	 */

	public static void main(String[] args) {
		
		String str = "JavaGood";
		String arr[] = str.split("a");
		
		System.out.println(Arrays.toString(arr));// [J v Good]
		
		String brr [] = str.split("");
		System.out.println(Arrays.toString(brr));
		
		System.out.println(brr.length);
		
		String str2 = "Ali Can come here no i do not wanna come";
		String crr[] = str2.split(" ");
		System.out.println(crr.length);
		
	}

}
