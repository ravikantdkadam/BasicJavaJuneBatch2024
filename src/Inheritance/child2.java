package Inheritance;

public class child2 extends Father{
	
	
	public void office() {
		
		System.out.println("child2-----------------office");
	}

	public static void main(String[] args) {
		
		child2 c2=new child2();
		
		c2.office();
		c2.home();
		c2.money();
		c2.car();
		
		
		
		
	}
	
	
	
}
