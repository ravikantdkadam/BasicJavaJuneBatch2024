package Inheritance;

public class child3 extends Father{
	
	
	public void gold() {
		
		System.out.println("child3-----------gold");
	}

	
	
	public static void main(String[] args) {
		
		child3 c3=new child3();
		
		c3.gold();
		c3.home();
		c3.money();
		c3.car();
		
		
}}
