package day18arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists03 {

	public static void main(String[] args) {

		
	 List<Integer> list1 = new ArrayList<>();
		list1.add(12);
		list1.add(21);
		list1.add(32);
		list1.add(25);
		list1.add(90);
		 
		 List<Integer> list2 = new ArrayList<>();
		 list2.add(111);
		 list2.add(222);
		 list2.add(333);
		 list2.add(444);
		 list2.add(555);
		
		//How to join two lists
		//list1 changes below
		//addAll() method adds the elements at the end
		//return true if this list changed as a result of the call
		 
		System.out.println(list1.addAll(list2));
		
		System.out.println(list2);//[111, 222, 333, 444, 555]
		System.out.println(list1);//[12, 21, 32, 25, 90, 111, 222, 333, 444, 555]
		
		
		list1.addAll(2, list2);
		System.out.println(list1);//[12, 21, 111, 222, 333, 444, 555, 32, 25, 90, 111, 222, 333, 444, 555]
		
		//How to delete all elements from  a list 
		//Removes all of the elements from this list.The list will be empty after this call returns
		//returns nothing ==> return type is "void"
		
		//list2.clear();
		//System.out.println(list2);
		
		//How to check existings of multiple elements
		//(list1.containsAll(list2)) method returns true if all elements of lists exist in the first element
		
		
		System.out.println(list1.containsAll(list2));//true
		
		
		//How to get index of last occurance of element in the list
		//it retuns int
		//[12, 21, 111, 222, 333, 444, 555, 32, 25, 90, 111, 222, 333, 444, 555]
		System.out.println(list1.lastIndexOf(111));//10
		
		
		//How to remove multiple elements from a list
		System.out.println(list1.removeAll(list2));//[12, 21, 32, 25, 90]
		System.out.println(list1);
		
		//How to delete elements by using some conditions (lambda exp)
		//it returns true if any element is removed otherwise it returns false
		
		list1.removeIf(t->t>35);
		System.out.println(list1);//[12, 21, 32, 25]
		
		
		//How to get a specific part of the list
		//subList(1,3) ==>1 is inclusive, 3 is inclusive
		//it returns sub list
		System.out.println(list2.subList(1, 3));
		
		//How to convert  a list to a array.
		System.out.println(list2.toArray());//[Ljava.lang.Object;@5f8ed237
		System.out.println(Arrays.toString(list2.toArray()));//[111, 222, 333, 444, 555]
		
		// How to convert an array to a list. We use this many times.
		
		//When you create a list by using array, some array features transfort to a list 
		//as you know arrays are not flexible in length, the list which is created from an array will not be flexible in size.
		
		//Note: The methods are not related with length can be used in length which are created from arrays.
		Integer arr[] = {1,54,21,13};
		List <Integer> list3 = Arrays.asList(arr);
		
		//list3.remove(2);
		//list3.clear();
		//list3.add(34,arr);
		list3.set(1, 63);
		System.out.println(list3);//[1, 63, 21, 13]

		System.out.println(list3.subList(2, 4));
		
		//Hello welcome git
		//first change from GitHub
		
		

	}

}
