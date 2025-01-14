package Keywords;

public class Subclass extends Bike{
	
	
	public void honda() {                    // can not override method beacuse metod declared with final keyword in Bike class
		
		System.out.println("Subclass-----------------honda");
	}
	

	public static void main(String[] args) {
		
		
		s1.honda();
		
		
	}

}
