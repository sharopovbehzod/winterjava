package day12dowhileloop;

public class InstanceLocalAndClassVariables {
	
	/*
	 * 1) If a variable is created 
	 *   a) inside the class but outside the main method 
	 *   b) it is not "static"
	 *        then it is called "Instance(Object) Variable" 
	 * Note: If you do not assign any value for instance variable, java will assign 0 for it, if the variable is a number
	      The values which java assigns are called "default value". 0 for numbers
	 * 
	 2) If a variable is created 
	     a) inside the class but outside the main method 
	 *   b) it is  "static"
	   Then it is called "Class Variable'
	 
	 Note: The main difference between Static(Class) and Instance(Object) Variable is that 
	 a) All updates on a static variable is visible by all objects which are created from the class, but 
	    all updates on a Instanced variable is visible just by the object.
	 b) "Static Variables" are common for all objects, but Instance variables are specified for an object.
	 
	 3) If a variable is created inside  method is called "Local variables".
	    Note: For "Local Variables", there is no default value. 
	    You have to assign value, when you create local variable.
	 Note: Local variables which are created in a Static method are static automatically.
	 
	 
	 
	 
	 */
	
	
	
	
	int i=12;// this is instance variable
	int k ; //this is instance variable
	String  str; //this is instance variable, default value for str is NULL.
	boolean bl; //this is instance, default value for bl is False.
	char ch;  //this is instance, default value for ch is ''.
	
	static byte by; // this is static variable, default value for by is '0'.
	
	
	
	

	public static void main(String[] args) {
		
		short sh = 11; // This is a local variable.
		sh++;
		
		boolean bl ; // if you don't assign any value, it will complain like below example
		//bl++;
		
		
	}
	
	
	
	
	

}
