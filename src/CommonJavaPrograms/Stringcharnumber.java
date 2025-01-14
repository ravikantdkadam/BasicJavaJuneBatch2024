package CommonJavaPrograms;

import java.util.HashMap;

public class Stringcharnumber {

	public static void main(String[] args) {
		// input=aaabbbcc;
		//output=a3b3c2;
		
	String input="aaabbbccddddeegg";	
	
	char [] array=input.toCharArray();
	
	HashMap<Character,Integer> map=new HashMap();
	
	
	for(char c:array) {
		
		
		if (map.containsKey(c)){
			
			map.put(c, map.get(c)+1);
		}
		
		
		else {
			map.put(c, 1);
			
		}	

	}

	for(char k:map.keySet()) {
		
		System.out.print(k+""+map.get(k));
	}
   

	}

}
