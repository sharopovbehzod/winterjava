package day17arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lists02 {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("A");
		list1.add("C");
		list1.add("F");
		list1.add("B");
		list1.add("D");
		
		
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("F");
		list2.add("B");
		list2.add("D");
		
		//How to check a list has a specific element 
		//contains() is used to check the existing of a specified element
		//contains() returns boolean
		
		System.out.println(list1.contains("B"));//true
		System.out.println(list1.contains("X"));//false
		
		//How to check if two list are equal or not
		
		System.out.println(list1.equals(list2));//true
	
		/*
		    Ask user to enter a letter 
		    If the letter exist in list1 convert it to "Got it"
		    otherwise add the element which user entered into the list1
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a letter");
		String s = scan.next().toUpperCase().substring(0,1);
		
		if(list1.contains(s)) {
			list1.set(list1.indexOf(s), "Got it");
			System.out.println(list1);
		}else {
			list1.add(s);
			System.out.println(list1);
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
