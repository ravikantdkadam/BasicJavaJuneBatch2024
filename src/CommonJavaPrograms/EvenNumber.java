package CommonJavaPrograms;

public class EvenNumber {

	public static void main(String[] args) {
		
		evenwithmodulus();
		evenwithoutmodulus();
		
		
	}
		
		
		
		

		public static void evenwithmodulus() {
		int num =24;
		
		if (((num%2)==0)) {
			
			System.out.println("number is even ");
					
		}
		
		else {
			
			System.out.println("number is odd");
		}
	}
	
	
	
	
	public static void evenwithoutmodulus() {
		
		int start=1;
		int end=40;
		
	for ( int i= start;i<=end;i++) {
		
		if ((i & 1) == 0) {
			
			System.out.println(i+" ");
		}
	}
		
	
	}
	

}
