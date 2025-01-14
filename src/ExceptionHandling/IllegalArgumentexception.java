package ExceptionHandling;

public class IllegalArgumentexception {

	public static void main(String[] args) {
		IllegalArgumentexception  i1= new IllegalArgumentexception ();
		
		
		i1.login("vishwatech", 1234567891234);
	}
	
	
	public void login(String uid,int pwd) {
		
		System.out.println("This is method defination");
		
	}

}
