package day13constructors;

public class Animal {
	/*
	 *1) Constructors must have same name with the class
	 *2) Constructor names start with upper case(Because they must match with Class names) but method name start with lower case
	 *3) Method must have a "return type", but constructors must not.
	 */
	
	public String name="Joe";
	public int weight = 78;
	public static  boolean isHerbivorous= false;
	
	public static void main(String[] args) {
		
		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println(dog.weight);
		System.out.println(dog.isHerbivorous);
		
		dog.move();
		dog.eat();
		dog.drink();

	}
	
	public static void eat() {
		if(isHerbivorous) {
		System.out.println("Eats plants");
		} else {
			System.out.println("Eats both plants and meet");
		}
		
	}
	
   public static void drink() {
		
		System.out.println("Drinks water");
	}
   public static void move() {
		
		System.out.println("Moves");
	}
	

}
