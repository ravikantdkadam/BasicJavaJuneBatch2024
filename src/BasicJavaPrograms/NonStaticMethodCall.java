package BasicJavaPrograms;

public class NonStaticMethodCall {

	public static void main(String[] args) {
		
			
		System.out.println("This is main Method");
		
	
		
		NonStaticMethodCall n1=new NonStaticMethodCall();                // object creation of same class
		
		n1.nregular1();                                                  // Call nonstatic method in same class
		
		
		
		Variable2 n2= new Variable2();                                     // object of different class
		
		n2.nregular2();                                                      // Call nonstatic method from different class
		
		

	}
	
	
	public void nregular1() {
		
		System.out.println("This is non static regular1 method ");
		
	}
	
	


}
