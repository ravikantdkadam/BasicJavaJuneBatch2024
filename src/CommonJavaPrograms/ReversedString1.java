package CommonJavaPrograms;

public class ReversedString1 {

	public static void main(String[] args) {
		
		
		String name ="Vishwatech";
		
		String rev ="";
		
// lenth of string 
		
		int l= name.length();
		
		System.out.println("Lenth of string is : "+ l);
		
	
		// loop 
		
		for (int i=l-1;i>=0;i--) {
			
			rev = rev+ name.charAt(i);
			
	
		}
		
		System.out.println("Original string is :"+name);
		System.out.println("Reveersed string is  :"+rev);
		
		
	}

}
