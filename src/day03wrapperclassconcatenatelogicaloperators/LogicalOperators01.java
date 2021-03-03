package day03wrapperclassconcatenatelogicaloperators;

public class LogicalOperators01 {
	
	/*
	 * Operators in Java:
	 * 
	 * 1) "=" is assignment operator.
	 *    Get the value from right and put it into container on the left
	 *    For example; int s = 12;
	 *    
	 *    Note: Followings are "Comparison Operators"
	 *          returns boolean every time.
	 *   
	 * 2)"==" is equal sign in Java
	 *    5 == 2 + 3 returns boolean
	 *    If left side equals to right side it returns True, otherwise it returns False.
	 *    
	 *    3) != means not equal. 
	 *    
	 *    Note: ! ==> Not
	 *    
	 * 4) > greater than
	 * > returns booleans
	 * 
	 * 5) < less than
	 * < returns boolean
	 * 
	 * 6) >= greater than or equal to
	 * 
	 * 7) <= less than or equal to
	 *    returns boolean
	 *    
	 *    Note: Followings are "Logical Operators"
	 *          returns boolean
	 *    
	 * 8) && AND operator
	 *    returns true if everything is true
	 *    
	 *  9) || OR operator
	 *      returns False if everything is false
	 *      
	 *  10) & AND operator
	 *      returns true if everything is true
	 *  
	 */     

	public static void main(String[] args) {


		
		//5 = 2 + 3;
		
		System.out.println(5 == 2 + 3);
		
		System.out.println(5 != 2 + 4);
		
		System.out.println(5 > 13);
		
		System.out.println(5 >= 5);
		
		System.out.println(5 <= 3);
		
		
		System.out.println((5 <7) && (3>1));
		
		System.out.println((5 <7) || (3>1));
		
		//What is the difference  between && and &
		
		System.out.println((5 >7) & (3>1) & (4==4));
		System.out.println((5 >7) && (3>1) && (4==4));

	}

}
