package CommonJavaPrograms;

public class ReversedFristWordsFromString {

	public static void main(String[] args) {
		 String input = "INDIA IS MY COUNTRY"; // Example input
		 
	        // Split the string into words
	        String[] words = input.split(" ", 2); // Limit to two parts: first word and the rest
	       String reversedFirstWord="";

			
	        // Reverse the first word
	       
	       
	        String firstWord = words[0];
	      //  String reversedFirstWord = new StringBuilder(firstWord).reverse().toString();
	        
	        for(int i=firstWord.length()-1;i>=0;i--) {
				   
	        	reversedFirstWord=reversedFirstWord+ firstWord.charAt(i);
			   }
  
	

	        // Combine the reversed first word with the rest of the string
	       String modifiedresponse;
	        
	        if(words.length>=1) {
	        	
	        	 modifiedresponse=reversedFirstWord+" "+words[1];
	        }
	        else {
	        	
	         modifiedresponse=reversedFirstWord+" ";
	        }
	        
	 
	        System.out.println("Original String :"+input);
	        System.out.println("Modified string : "+modifiedresponse);
	        
	        
	    

	}

}
