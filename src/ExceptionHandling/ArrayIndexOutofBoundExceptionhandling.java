package ExceptionHandling;

public class ArrayIndexOutofBoundExceptionhandling {

	public static void main(String[] args) {
		
	try {                                                  // statement to be tested for error 
			
			System.out.println("Inside try block");
			
			   int a[] = {1,2,3,4};
			   
			System.out.println("The lenth of array is "+a.length);
			   
			   System.out.println("The element at postion "+a[10]);
			   
		
		}
		
		catch(ArrayIndexOutOfBoundsException e ) {                           // Statement to be executed when will get error in try block 
			
			
			System.out.println("This is an exception "+e);
			
		
		}
		
		
		System.out.println("outside the try catch ");
		
		

	}
	}

