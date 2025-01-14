package ExceptionHandling;

public class SuperclassExecption {

	public static void main(String[] args) {
try {                                             // statement to be tested for error 
			
			System.out.println("Inside try block");
			
			//int i =25/0;
			
			
		//System.out.println("The valu of i is "+i);
			
			
			String name=null;
			
			System.out.println(name.length());
				
		}
		
		catch(Exception e ) {                           // statment to be executed when will get error in try block 
			
			
			System.out.println("This is an exception "+e);
				
		}
		
		
		System.out.println("outside the try catch ");
				

	}


	}


