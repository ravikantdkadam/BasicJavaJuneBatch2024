package CommonJavaPrograms;

public class StringPaliindrome {

	public static void main(String[] args) {
		  String str ="Level";
		  
		  str=str.toLowerCase();
	        
	        String rev ="";
	        
	       int size= str.length(); 
	        
	        
	        for (int i=(size-1);i>=0;i--)
	        {
	           rev = rev+str.charAt(i);
	            
	      
	        }
	        
	        System.out.println("This is reversed string "+rev);
	        
	        
	        
	        if(str.equals(rev))  {
	        	
	            System.out.println("String is palindrome");
	        }
	        else{
	            
	             System.out.println("String is not palindrome");
	        }
	      

	}

}
