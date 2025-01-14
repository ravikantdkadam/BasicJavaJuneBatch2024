package CommonJavaPrograms;

public class Countvowels {

	public static void main(String[] args) {
		
		String s="selenium is my strength";
		    String newstring=s.toLowerCase();
		
		char[] arr=newstring.toCharArray();
		int count=0;
		
		for(char c:arr) {
			
			if(c=='a' ||c=='e'|| c=='i'||c=='o'||c=='u') {
				
				count++;
				
			}
		}
		
		System.out.println("number of ovels in string are" +count);

	}

}
