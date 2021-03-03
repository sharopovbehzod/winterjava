package day02scanner;

import java.util.Scanner;

public class ScannerClassHomework01 {
	
	/*
	  Homework
	 
	    1)Type a program which calculates the area and the perimeter of a circle
	      whose radius is entered by user. (Use float)
	      Hint 1: Take pi number as 3.14159
	      Hint 2: Area of a circle is 3.14159 x radius x radius
	      Hint 3: Perimeter of a circle is 2 x 3.14159 x radius
	      Hint 4: To get float, use nextFloat()
	   
	   
	*/
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		float pi = 3.14159f;
		System.out.println("Please, enter the radius value");//10
		float radius = scan.nextFloat();
		
		System.out.println("Area of the circle is " + (pi * radius * radius)); //314.159
		System.out.println("Perimiter of the circle is " + (2 * pi * radius)); //62.8318
		
		
		/*
		  2)Type a program which calculates the perimeter of a triangle whose
	      Side lengths are entered by user. (Use byte)
	      Hint 1: Perimeter of a triangle is a + b + c
	      Hint 4: To get byte, use nextByte()
		 */
		
		System.out.println("Please enter the A side length for triangle"); //5
		byte a = scan.nextByte();
		
		System.out.println("Please enter the B side length for triangle"); //5
		byte b = scan.nextByte();
		
		System.out.println("Please enter the C side length for triangle"); //5
		byte c = scan.nextByte();
		
		System.out.println("Perimeter of the triangle is " + ( a + b + c)); //15
		
		
		/*
	    3)Type a program which converts the mile to kilometer. Mile value will be
	      entered by user. (Use double)
	      Hint 1: km = mile x 1.6
	      Hint 2: To get double, use nextDouble()
	   
		 */
		
		
		System.out.println("Please, enter the mile ");//5
		double mile = scan.nextDouble();
		
		System.out.println("5 mile = " + (mile * 1.6) + "km"); // 8
		
		/*
		 4)Type a program which converts the hours to seconds. Hours value will be
	      entered by user. (Use long)
	      Hint 1: second = hour x 60 x 60
	      Hint 2: To get long, use nextLong()
		 */
		
		System.out.println("Please, enter the hr");
		long hour =scan.nextLong();
		
		System.out.println("1 hr = " + (hour*60*60) + " Second");
		
		scan.close();

	}

}
