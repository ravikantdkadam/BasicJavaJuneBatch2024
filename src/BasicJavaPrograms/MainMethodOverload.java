package BasicJavaPrograms;

public class MainMethodOverload {

	// Can we overload main method ?-----------------------> Yes we can overload main method 
	
	public static void main(String[] args) {                         // This is main Method 
		
		System.out.println("This is main method ");
		
		
		main(10.123);
		main(10);
		main(20,30);
		

	}
	
	public static void main(double args) {             // main method with different arguments
		
		System.out.println("This is main method with one parameter and different datatype");

	}
	
	
	
public static void main(int a) {               // main method with one parameter
		
		System.out.println("This is main method with main method with one paramete");

	}
	
	
public static void main(int a, int b) {                   // main method with Two parameter
	 
	System.out.println("This is  main method with Two parameter");

}	
	

}
