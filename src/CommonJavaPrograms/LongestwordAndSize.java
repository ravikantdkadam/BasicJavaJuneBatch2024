package CommonJavaPrograms;

public class LongestwordAndSize {

	public static void main(String[] args) {
		 //largest word
        
        String input= "lenze SDCabcd ";
        
        String [] words=input.split(" ");
        
       
        
       String longestword =words[0];
       
       int longestwordSize= words[0].length();
        
        for(int i=0;i<words.length;i++) {
        	
        	if(words[i].length()>longestwordSize) {
        		
        		longestword=words[i];
        		longestwordSize=words[i].length();
        	}
        	
        	
        }
        
        System.out.println(longestword+"-"+longestwordSize);
        
        
        

	}

}
