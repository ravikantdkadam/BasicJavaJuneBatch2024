package CommonJavaPrograms;

public class CharOccurences {

	public static void main(String[] args) {
		
		String s= "Vishwatechsolutions";
		
		int count=0;
		
		char character='s';

		for (int i=0 ;i<s.length();i++) {
			
			char t =s.charAt(i);
			
			if(t==character) {
				
				count++;
			}
			
			
		}
				
		System.out.println(count);
	}

}
