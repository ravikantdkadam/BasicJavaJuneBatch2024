package CommonJavaPrograms;

public class CountwordsinString {

	public static void main(String[] args) {
	   
	        String s ="Welcome to Java selnium world";
	        int count=1;
	         
	         for (int i =0; i<s.length(); i++){
	             if((s.charAt(i)==' ')&&(s.charAt(i+1)!=0))
	             {
	                  count++;
	                 
	             }
	            
	         }
	        
	         System.out.println("number of words are "+count);
             
	    }

	}



