package Keywords;

public class Childclass extends ConstructorwithSuperkeyword{

// super () keyword used to call the parent constructor
	
	// super keyword always used in 1st line
	
	
	public Childclass() {
		
		//super(10,20);   // call parent constructor 
		super(30);
		
		
		System.out.println("This is child constructor");
		
		
		
	}
	
	
public static void main(String[] args) {
		
		Childclass c1= new Childclass();
		
		
	}
	
	
	

}
