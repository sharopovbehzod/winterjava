package day12dowhileloop;

public class Car {
	
	/*
	 * When you create a class, java knows you will create objects
	 * To create objects you need "Constructor", because of that Java put constructor behind the class. That kind of constructors are called "Default Constructors".
	 * 
	 * 
	 * 
	 */
	
	public String make="Honda";
	public String model="Accord";
	public int price=20000 ;
	public int year = 2020;
	
	
	

	public static void main(String[] args) {
		
		Car myCar1 = new Car();
		
		System.out.println(myCar1.make);
		System.out.println(myCar1.model);
		System.out.println(myCar1.price);
		System.out.println(myCar1.year);
		
		myCar1.move();
		myCar1.stop();

	}
	public static void move() {
		System.out.println("Moves fast");
		
	}
	
	public static void stop() {
		System.out.println("The car can stop");
		
	}
	
	
	
	

}
