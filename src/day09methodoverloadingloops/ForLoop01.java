package day09methodoverloadingloops;

public class ForLoop01 {

	public static void main(String[] args) {

		//printHello();
		//typeInt();
		printInt() ;
	}
	
	/*
	 * Type the code to print "Hello world" 10 times
	 */
	
	public static void printHello() {
	
	for(int i=1; i<=5 ; i++ ) {
		System.out.println("Hello World!");
	    }
	
	}
	
	
	/*
	 * Type a code to print integers from 5 to 12 on the console
	 */
	public static void typeInt() {
		
		for(int n=5; n<=8 ; n++ ) {
			System.out.print(n + " ");
		    }

		}
	
	/*
	  Type a code to print int from 12 to 5
	 */
	public static void printInt() {
       for(int i=12; i>=9; i--) {
			
			System.out.print(i + " ");
		}
	}
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
