package day13constructors;

public class Dog {
	
	public String name;
	public int weight;
	public int height;
	
	//I created a constructor below
	//The constructor has no any parameters
	//The constructor has nothing inside the body.
	//That kind of constructors are the same with default constructors.
	//Note: if you create a constructor, Java deletes the "default one".
	
	
	public Dog() {  // this is a constructor, because it is upper case, match with class name and it does not have a return type
		
	}
	
	public Dog(String name) {
		this.name=name;
	}
	
   public Dog(int weight, int height) {
		
	}
   
    public Dog(String name, int weight, int height) {
    	this.name=name;
    	this.weight= weight;
    	this.height= height;
    	
    }
	
	
	public static void main(String[] args) {

		Dog dog1=new Dog("Joe");
		System.out.println(dog1.name);
		
		System.out.println("=====================================");
		
		//Create a dog by using name, weight and height.
		
		Dog dog2=new Dog("Boby", 50,60);
		System.out.println(dog2.name);
		System.out.println( dog2.weight);
		System.out.println(dog2.height);
		
		
		
	}

}
