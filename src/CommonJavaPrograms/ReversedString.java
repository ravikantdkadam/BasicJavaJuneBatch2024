package CommonJavaPrograms;

public class ReversedString {

	public static void main(String[] args) {
		
		        String name="Vishwatech";
		        
		        String rev="";
		        
		        int stringlength=name.length();
		        
		       
		        for(int i=stringlength-1;i>=0;i--){
					
				rev=rev+name.charAt(i);
					
				
		            

		         
		        }
		        System.out.print(rev);
		    }		
	}

