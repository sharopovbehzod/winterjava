package day03wrapperclassconcatenatelogicaloperators;

public class Concatenation01 {
	
	
	/*
	 * Concatenation: Joining strings
	 * 
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		String s1 = "Ali";
		String s2 = "Can";
		System.out.println(s1 + " " + s2);
		
		int a = 5;
		int b = 7;
		String s3 = "Java";
		
		System.out.println(a + s3);
		
		System.out.println(s3 + a);
		System.out.println( a +  s3 + b);
		System.out.println( a + b + s3);
		System.out.println( s3 + a + b );
		
		
		// by using following variables print 61 Study -1 on the console
		int m = 2;
		int n = 3;
		String s = "Study";
		String str2 = "Hard";
		
		System.out.println(((m+n) * n *m *m + (n-m)) + " " + s + (m-n));

	}

}
