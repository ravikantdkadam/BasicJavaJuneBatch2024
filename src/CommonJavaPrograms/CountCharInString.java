package CommonJavaPrograms;

public class CountCharInString {

	public static void main(String[] args) {
		
		String s="Vishwatech solutions";
		int count=0;
		
		System.out.println("Length of string is "+s.length());
		for(int i =0;i<s.length();i++) {
			
			if(s.charAt(i)!=' ')
			{
				count++;
				
			}
			
	
		}
     
		System.out.println("Count of charcter is :"+count);
	}

}
