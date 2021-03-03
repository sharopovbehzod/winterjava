package day14constructorsstatickeywordarrays;

public class Animal {
	
	
	
	public String name;
	public int weight;
	public boolean herbivorous;
	
	//1)
	public Animal() {
		this("Joe", 23, true);
		System.out.println("1st constructor is executed");
		
	}
	//  2)
	public Animal(String name) {
		this();
		System.out.println("2nd constructor is executed");
		this.name = name;
	}
    //3)
	public Animal(String name, int weight) {
		//this("Dog");
		System.out.println("3rd constructor is executed");
		this.name = name;
		this.weight = weight;
	}
     //4)  1)Constructor call must be done in the first line every time.
	    // 2)in a constructor you can use just single constructor code, because if you do 
	    //   multiple constructor calls at least one of them will not be in the fitst line.
	    //   That contradicts with the first rule
	
	public Animal(String name, int weight, boolean herbivorous) {
		//this("Boba");
		System.out.println("4th constructor is executed");
		this.name = name;
		this.weight = weight;
		this.herbivorous = herbivorous;
	}
	
	

	public static void main(String[] args) {
		
		//Animal dog1= new Animal();
		//System.out.println(dog1.name);//Joe
		//System.out.println(dog1.weight);//23
		
		Animal dog2= new Animal("Too");
		
		System.out.println(dog2.name);
		System.out.println(dog2.weight);
		
		
		
		
	}
	
	

}
