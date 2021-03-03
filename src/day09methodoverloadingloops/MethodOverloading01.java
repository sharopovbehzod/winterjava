package day09methodoverloadingloops;

public class MethodOverloading01 {
	

	public static void main(String[] args) {

		add(3,5); //int and int 8
		add(1.2 , 2.3);//double and double
		add(1.2, 7);//double and int
		add('a', 'b');//char and char

	}
	/*
	  Method name and method parameters are called "Method Signature".
	  in method overloading, Method Signature must be different.
	  
	 */
	
	public static void add(int a, int b) {
		System.out.println("Int and int  " + (a+b));
	}
	
	public static void add(double a, double b) {
		System.out.println("double and double  " + (a+b));
	}
	
	public static void add(double a, int b) {
		System.out.println("double and int  " + (a+b));
	}
	
	public static void add(char a, char b) {
		System.out.println("char and char  " + (a+b));
	}
	

}
