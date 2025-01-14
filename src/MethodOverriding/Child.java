package MethodOverriding;

public class Child extends Parent {
	
	public void bike() {
		
		
		System.out.println("child====================bike");
	}
	
	
	
	public void car() {
		
		System.out.println("Child==================car");
		
	}
	

	public static void main(String[] args) {
		
		Child c5 = new Child();
		
		c5.bike();
		c5.home();
		c5.car();
		

	}

}
