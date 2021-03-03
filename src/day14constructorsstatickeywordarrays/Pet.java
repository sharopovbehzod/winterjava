package day14constructorsstatickeywordarrays;

public class Pet {

	public static void main(String[] args) {
		Dog.eat(); // To access static method, just class name is enough
		
		Dog dog = new Dog();
		dog.drink(); // To access non-static method, you must create object
		dog.eat(); // To access static method you can use objects as well, but it is not recommended, because it is long way
		             // and java gives you notification with yellow underline.
		
	}
	
	
	
	
	
	
	

}
