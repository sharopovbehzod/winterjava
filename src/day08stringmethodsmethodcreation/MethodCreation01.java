package day08stringmethodsmethodcreation;

public class MethodCreation01 {

	public static void main(String[] args) {
		
		System.out.println(add(3, 5));
		System.out.println(add(12.32, 21.112345));
		
		//.out.println(add(3, 5));
	
		
		
		
	}
	/*
	   1) We create method out of the main method and use them in main method to make main method simple.
	   2)The variables which are created in method parenthesis are called "parameters"==>num1 and num2
	      The values which are used in method are called "arguments" ==> For example 3 and 5
	   3) To call a method from inside the main method, use just main method name + method parenthesis + arguments.
	   4)"static" method can use just Static class members, because of that if you will call a method from inside
	      the main method you have to make it "static"
	      5) For number parameters you can use "char" but do not use "String" or "Boolean", otherwise you will get CompileTimeEror.
	   
	 */
	/*
	 * If you need to use the same method name in methods in a Class, you have to make parametrs different.
	 * To make parameters different we have 3 ways
	 * 1) Change data type of parameters.
	 * 2) Change the number of parameters
	 * 3)If data types of parameters are different youy may change their order
	 * Note for interview: If you create methods are same, parameters are different in a class it is called "method overloading"
	 * 
	 * Note : when you use the same name for methods in a class, Java complains. To stop complains you have to change the parameters.
	 *      Changing "return type" can not stop complain.
	 *       Changing "Access Modifier" can not stop complain.
	 *       Removing or adding Static keyword can not stop complain.
	 *       
	 *       
	 */
	
	public static double add(double num1, double num2) {
		return num1 +num2;
		
		
	}
	
	
	public static double add(int num1, char num2) {
		return num1 +num2;
	
	}
	
	public static double add(char num2, int num1 ) {
		return num1 +num2;
	
	}
	
	
	
	public static double add(int num1, char num2,int num3) {
		return num1 +num2;
	
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
