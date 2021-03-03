package day10forloops;

public class WhileLoop01 {

	public static void main(String[] args) {

		typeLoop();
		System.out.println();
		printOdd2();
		System.out.println();
		printInt();

	}
	
	/*
	 * Type a program to print odd ints from 4 to 25 on the console. 
	 * 1) use for loop
	 * 2) use while -loop
	 */
	
	
	public static void typeLoop() {
		
	for(int i=4; i<26; i++){
		
		if(i%2!= 0) {
			System.out.print(i + " ");
		}
		
	}
	
	
	}
	
	//While loop
	public static void printOdd2() {
		
	
	int i = 4;
	
	while(i<10) {
		
		if(i%2!= 0) {
			System.out.print(i + " ");
		
		
	     }i++;
	
	  }
	
	}
	
	/*
	 * Create a method to print integers which are divisable by 6 and 8 from   500 to 25 on the console
	 * 
	 */
	
	public static void printInt() {
		
		int i=500;
		while(i>24) {
			if(i%6==0 && i%8==0) {
				System.out.print(i + " ");
				
			}
			//do not forget to type increment and decrement
			i--;
			
		}
		
		
		
	}
	
	
	
	
	
	
}
