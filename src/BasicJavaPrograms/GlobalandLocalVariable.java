package BasicJavaPrograms;

public class GlobalandLocalVariable {

		// Declaring this variable outside the method -Global variable
		// Scope of this variable is through out the project and it is permanent
		
		
		int i=5;
		String trainer ="Ravikant";    // Global Variable (scope is through out project)
		
		

		public static void main(String[] args) {
			
			// Declaring this variable inside the method -Local variable
			// Scope of this variable is within that method only  and it is temporary
			
					
			int i=20;
			int b =45;       // Local variable
			
			
			System.out.println(i);
			
		
			
			
			GlobalandLocalVariable var= new GlobalandLocalVariable();   // object of a class
			
			
			var.nonstatic();   // call nonstatic method 
		 
			
			
			
			System.out.println("This is value of global variable "+var.i);  //*** To access global variable we have to create object*****
			
			
			System.out.println(var.trainer);
				   
					
		}
		
		
	public void nonstatic() {
		   int m=10;  // local variable and scope is for this method only
		   
		       System.out.println(m);
		      System.out.println("This is nonstatic method");
		
	}

		

	}


