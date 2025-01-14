package ExceptionHandling;

public class NullpointerException {

	public static void main(String[] args) {

try {                                             // statement to be tested for error 
			
			System.out.println("Inside try block");
			
			String name= null;

        
			 System.out.println(name.length());
			
		
		}
		
		catch(NullPointerException e ) {                           // statment to be executed when will get error in try block 
			
			
			System.out.println("This is an exception "+e);
			
		
		}
		
		
		System.out.println("outside the try catch ");
		
		

	}

}
