package OopsConcepts;

public class Polymorphisam {
	
	
	   // Compile Time polymorphisam (Static Binding or early binding):
	
      // In compile time polymorphism method declaration is binding with method definition at compilation time based on arguments.
			
			
	   //	Run Time Polymorphisam(Dynamic binding or late binding ):
	           
			
	   //In Run time polymorphisam method declaration is binding with method definition during run time or execution time based on object creation is known as runtime polymorphism

			

	public static void main(String[] args) {
		
		
		Polymorphisam p1 =new Polymorphisam();       // object creation 
		
		p1.compileTime();
		
	}
	
	public void compileTime() {                                             // Method declaration 
		
           int a=10/0;            
		
		System.out.println("This is compileTime polymorphisam "+a);                         // Method definition
	}
	
   
	
	
	public void compileTime(int x) {
		
		System.out.println("This is compileTime polymorphisam ");
	}
	
	
	
	

}
