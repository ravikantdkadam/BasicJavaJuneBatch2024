package CommonJavaPrograms;

public class ReversedWordsInString {

	public static void main(String[] args) {
		
		String s= "Welcome to java program ";
		
		String words[]= s.split(" ");
		String reversedString="";
		
		for (String w: words)
		{
			String reversedwords="";
			for (int i =(w.length()-1) ; i>=0;i--) {
				
				reversedwords=reversedwords+ w.charAt(i);
				
			}
			
			reversedString =reversedString+reversedwords+" ";
		
		
		}
	
		
		System.out.println("Reveersed words in string are :"+reversedString);
			

	}

}
