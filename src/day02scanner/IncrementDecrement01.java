package day02scanner;

public class IncrementDecrement01 {
	
	//Increment: If you increase the value of a variable, then this process is called
	//           as "increment"
	

	public static void main(String[] args) {


		int num1 = 5;
		System.out.println(num1);
		
		//Increase the value of num1 by 3.
		// "=" is a  assignment operator. Assignment operator gets the value from the right and puts it in the container.
		//1st way:
		
		num1 = num1 + 3;
		System.out.println(num1);
		
		
		//2nd way to increment
		
		num1 += 3;
		System.out.println(num1);
		
		//3rd way. this way can be used just to increase by 1:
		
		num1++; 
		System.out.println(num1);
		
		
		//Note: increment can be done by multiplication as well
		num1 = num1*2;
		System.out.println(num1);
		
		num1 *=2;
		System.out.println(num1);
		
		//Decrease the num1 by 2
		
		//1.way:
		
		num1=num1-2;
		System.out.println(num1);//46
		
		//2.way:
		
	    num1 -= 2;
	    System.out.println(num1);//44
		
		//3.way
	    num1--;
	    num1--;
	    System.out.println(num1);//43
		
	    
	    
	    //Note: Decrement can be done by division as well.
	    num1 = num1 / 2;
	    System.out.println(num1);//21
	    
	    num1 /= 3;
	    System.out.println(num1); //7
	    
	    

	}

}
