package Keywords;

public class ConstructorConcept {
	
	
//  Constructor name should be the same as class Name.
// Constructor doesn’t  have return value.
// Whenever we create an object of class then immediately call the default constructor .
//If we want call the parameter constructor then we have to pass arguments in created object .
	
//We can overload the Constructor 
	
	
public static void main(String[] args) {
		
		ConstructorConcept c1 = new ConstructorConcept();   // object of class
		ConstructorConcept c2 = new ConstructorConcept(20);
		ConstructorConcept c3 = new ConstructorConcept(15,30);
		
	

	}
	 
	
	public ConstructorConcept() {                               // Default constructor
		
	  System.out.println("This is default constructor");
	}
	
	
	public ConstructorConcept(int a) {                          //Single parameter constructor
		
		System.out.println("This is Single parameter constructor"+a);
	}
	
	

	public ConstructorConcept(int a, int b) {                     //Two parameter constructor
		
		System.out.println("This is Two parameter constructor"+ a);
		System.out.println("This is Two parameter constructor"+ b);
		
	}
	

}
