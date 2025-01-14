package CommonJavaPrograms;

public class Palindrome {

	public static void main(String[] args) {
		
		// palindrome is nothing but original string and reverse string should be equal 
		
			

		String name ="Nitin";
		
		String rev ="";
		
// lenth of string 
		
		int l= name.length();
		
		System.out.println("Lenth of string is : "+ l);
		
		
		String mname= name.toLowerCase();
	
		// loop 
		
		for (int i=l-1;i>=0;i--) {
			
			rev = rev+ mname.charAt(i);
			
	
		}
		
		System.out.println("Original string is :"+mname);
		System.out.println("Reveersed string is  :"+rev);
		
		
		
	if (mname.equals(rev))	{
		
		System.out.println("String is palindrome ");
		
	
	}
	else {
		
		
		System.out.println("String is not palindrome ");
	}

	}

}
