package Inheritance;

public class Child extends Father {
	
	
	public void bike() {
		
		System.out.println("Child -------------bike");
	}
	
	
	public static void main(String[] args) {
		
		Child c1 = new Child();             // inheritance 
          c1.bike();
	     c1.car();
	     c1.home();
	     c1.money();
	  //   c1.farm();
	    
		
	     System.out.println("=====================Upcasting ================================");
		
		Father f1 =new Child();       // object creation for upcasting    
		
		 f1.car();
		 f1.home();
		 f1.money();
		 
		 
		
	}

}
