package day16multidimensionalarrays;

import java.util.ArrayList;

public class ArrayList01 {
	/*
	 * 1) ArrayLists are flexible in size 2) ArrayLists can not store multiple data
	 * types 3) ArrayLists store non - primitive data types (use wrapper class) 4)
	 * ArrayLists are updated version of Arrays
	 * 
	 */

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();

		// To print an ArraysList, using just its name in Syso is enough
		System.out.println(list1);// []

		// How to add elements into an ArrayList
		list1.add(12);
		list1.add(21);
		list1.add(31);

		// How to add element into specific index

		list1.add(1, 45);

		System.out.println(list1);// [12,21]

	}

}
