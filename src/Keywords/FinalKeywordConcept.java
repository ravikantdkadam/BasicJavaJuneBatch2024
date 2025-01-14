package Keywords;

 public class FinalKeywordConcept {
	 
    final int age =100;    // we can not modify variable because we used final keyword 
	
	public static void main(String[] args) {
		
		FinalKeywordConcept f1=new FinalKeywordConcept();
		
		f1.display();
		
		
	}
	

	public void display() {
		
		//age=50;
		
	   System.out.println("This is nonstatic method "+age );
		
		
	}
	

	
	

}
