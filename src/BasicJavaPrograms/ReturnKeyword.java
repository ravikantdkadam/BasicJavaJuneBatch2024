package BasicJavaPrograms;

public class ReturnKeyword {

	public static void main(String[] args) {
	
		
		System.out.println("the sum of two variable is "+sum(10,5));
		
		System.out.println("the sum of two variable is "+sum(120,5));
		
		
		System.out.println("the sum of two variable is "+sum(50,5));
		
		System.out.println("the sum of two variable is "+sum(10,10));
	}
	
	
	public static int sum (int x, int y) {             // using return type as primitive datatype
		
		return x+y;     // After return keyword complier not reachable to code             
		
		
		
		
	}

}
