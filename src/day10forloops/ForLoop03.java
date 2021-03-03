package day10forloops;

public class ForLoop03 {

	public static void main(String[] args) {

		sumOfAllInt();

	}
	
	/*
	 * Find the sum of all ints from 10 to 200
	 */
	public static void sumOfAllInt() {
		
		int sum=0;
		 for(int i =4; i<7; i++) {
			sum = sum + i; //sum+=i; works as well. If you dont put "sum +" in here, it doesn't add the values. It will assign just i value one by one.
			
			//if you want to see the sum value for every Loop put "System.out.println(sum);" inside the "For Loop"
			//System.out.println(sum);
		 }
		 //if you type "System.out.println(sum);" after the "For loop" it will display the final value of sum
		System.out.println(sum);
	}
	
	

}
