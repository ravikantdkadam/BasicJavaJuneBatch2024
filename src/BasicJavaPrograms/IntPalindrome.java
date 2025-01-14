package BasicJavaPrograms;

public class IntPalindrome {
	
	  
	public static void main(String[] args) {
		
		
	     int number =1331; 
			int reminder,revnumber=0;
		
			
			while(number>0)
		{

		    reminder=number%10;
			
	        number= number/10;
	   
           revnumber=revnumber*10+reminder;
		}
		
			
			
		System.out.println("Reversed number is "+revnumber);
		
	
		
}
	
	
	
}
