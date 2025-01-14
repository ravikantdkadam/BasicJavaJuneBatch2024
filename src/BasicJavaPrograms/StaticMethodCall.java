package BasicJavaPrograms;

import CommonJavaPrograms.DuplicateCharinString;

public class StaticMethodCall {

	public static void main(String[] args) {
		

		System.out.println("This is a Main Method ");
		
		method1();                                 // call static regular method 1
		
		method2();									// call static regular method 2
		
		DuplicateCharinString.regular2();            // call the static regular method from different class
		
		
		// call static regular method by the method name only because regular methods and main method are in same class====>methodname();
		
		
		// Call static regular method from different class then call by=======>  Classname.methodname()
	}
	
	
	public static void method1() {
		
		System.out.println("This is static method 1");
		
		
		
	} 
	
public static void method2() {
		
		System.out.println("This is static method 2");
		
		
		
	} 
	

}
