package Keywords;

public class FinallyKeywordConcept {

	public static void main(String[] args) {
	
		

	try {	
		
		int age =50/0;
	 
	 System.out.println("The valu of age is : "+age);
	
	}
	
	catch(ArithmeticException e) {
		
		System.out.println("This is catch block code execution " +e);
		
	
	}
	
		
	finally {	
	                                                       // it is always executed even java throw an exception or not 
	
		System.out.println("This is code after the arithmatic execution error ");
	 
	}
	
	
	}

}
