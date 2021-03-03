package day02scanner;

public class TypeCasting01 {
	
	
	/*
	 * byte < short < int < long < float < double
	 * 
	 * 1.Type casting from smaller to large is easier way and can be done by Java.
	 * 2.Type casting from larger to smaller data types is complicated.
	 */
	

	public static void main(String[] args) {
		
		//1.Type casting from smaller to large is easier way and can be done automatically by Java and is called
		//Auto Widening
		
		byte b1 = 112;
		int i1 = b1;
		
		System.out.println(b1);
		System.out.println(i1);
	
		
		//2Explicit Narrowing: If you assign a large data type to a small data type,
		//          type casting cannot be done by Java automatically.
		//          You should take the responsibility and type the casting explicitly.
		//          This process is called “Explicit Narrowing”
		
		int i2 = 112;
		short s1 = (short)i2;
		System.out.println(s1);
		System.out.println(i2);
		
		
		
		
		short s2 =120;
		byte b4 = (byte)s2;
		System.out.println(s2);
		System.out.println(b4);
		
		// Result will be 2 because data type is int
		int i3 = 5;
		int i4 = 2;
		System.out.println(i3/i4);
		
		// if you use different data types in mathematical operations, the result data type will be largest data type.
		//If you use “Explicit Narrowing” with the numbers which are not in the interval
		//then you will get different results. The result will be calculated according to the 
		//modulus operation.
		
		int i5 = 5;
		double d1 = 2;
		System.out.println(i5/d1);
		
		
		float f1 = 2.3f;
		float f2 = 2.35F;
		float f3 =(float)2.3;
		double f5 = 2.3;
		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);
		System.out.println(f5);
		
	     

	}

}
