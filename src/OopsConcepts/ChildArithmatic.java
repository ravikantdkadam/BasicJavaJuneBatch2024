package OopsConcepts;

public class ChildArithmatic extends ArithmaticOperation{

	@Override
	public void sum() {
		
		System.out.println("This is sum abstarction method ");
	}

	@Override
	public void substarction() {
		
		
		System.out.println("This is substarction abstarction method ");
	}

	
	
	public static void main(String[] args) {
		
		
		ChildArithmatic ch1 = new ChildArithmatic();
		
		ch1.sum();
		ch1.substarction();
		ch1.mul();
			
		
	}
	
	

}
