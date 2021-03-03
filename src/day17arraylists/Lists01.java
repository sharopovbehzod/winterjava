package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
		
		//How to create a list
		//1.Way 
		
		ArrayList<Integer> list1= new ArrayList<>();
		
		//How to create a list
		//2.Way 
		List<Integer> list2= new ArrayList<>();
		
		//How to print a list on the console
		System.out.println(list1);//[]
		
		//How to add element into a list
		list1.add(12);
		list1.add(11);
		list1.add(10);
		
		//How to put element into a specific index
		list1.add(1, 13);
		
		
		System.out.println(list1);//[12,13,11,10]
		
		//How to sort list elements in ascending order
		Collections.sort(list1);
		
		System.out.println(list1);//[10,11,12,13]
		
		//How to get a specific element from a list
		
		System.out.println(list1.get(2));//12
		
	//	System.out.println(list1.get(4));//There is no index 4, because of that we will get RTE
		
		list2.add(9);
		list2.add(2);
		list2.add(19);
		list2.add(4);
		list2.add(71);
		list2.add(-3);
		/*
		 * Type a code to find a min and max value from the list2
		 */
		
		Collections.sort(list2);
		System.out.println(list2);
		
		int min = list2.get(0);
		int max = list2.get(list2.size()-1);
		
		System.out.println("min value is " + min + ", max value is " + max);
		
		//How to check if list is empty or not
		
		System.out.println(list2.isEmpty());//false
		
		List <String> list3 = new ArrayList<>();
		
		System.out.println(list3.isEmpty());//true
		
		//How to remove an element from a list by using index
		//[-3, 2, 4, 9, 19, 71]
		//Below code will remove the element at index 2, and will return the removed element
		
		System.out.println(list2.remove(2));//4==> removed element
		System.out.println(list2);//[-3, 2, 9, 19, 71]
		
		//System.out.println(list2.remove(6));// it gives RTE. because it is non existing element
		
		//How to remove an element from a list by using the element value
		//Note: for int lists, you can not remove an element by using element value.
		//Because when you put an int, inside the remove method it will accept as index
		
	//	System.out.println(list2.remove(19));
		
		list3.add("Ali");
		list3.add("Veli");
		list3.add("Mary");
		list3.add("Sunny");
		list3.add("Tony");
        System.out.println(list3);
        
        System.out.println(list3.remove("Mary"));
        System.out.println(list3);
		
		//Remove "Veli" and add "Velihan" in index of "Veli"
        //1) way but not recommended
        
        int idx = list3.indexOf("Veli");
        list3.remove("Veli");
		list3.add(idx, "Velihan");
		
		System.out.println(list3);
		
		//2)Way set() method is used to update an element
		//set() method is used to update an element by using index
		//set() returns the previous element
		
		list3.set(list3.indexOf("Sunny"), "Jhonny");
		System.out.println(list3);
		
		
		
		
		
	}

}
