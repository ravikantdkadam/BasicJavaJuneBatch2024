package BasicJavaPrograms;

public class MethodOverloadConcept {
	
	// When the method name is same with different parameters and arguments within same class, this is called as method overloading.

	public static void main(String[] args) {
		
		
		System.out.println("This is main Method");
		
		
		MethodOverloadConcept m1=new MethodOverloadConcept();               // object of class to call nonstatic methods 
		
		m1.sum();
		m1.sum(10);
		m1.sum(20.123);
		

	}
	
	
	public void sum() {                                               // Zero parameter 
		
		System.out.println("This is zero aprameter method ");
	}
	

	public void sum(int a) {                                      // one parameter        
		
		System.out.println("This is one prameter method "+ a);
	}
	

	//We can create method with same name and same parameters but with different datatype. -------------VVVIMP
	

	public void sum(double b) {                                      // one parameter with different datatype       
		
		System.out.println("This is one prameter method with different datatype"+b);
	}
	
	
	
	
}
