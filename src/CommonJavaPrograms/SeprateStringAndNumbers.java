package CommonJavaPrograms;

import java.util.ArrayList;
import java.util.List;

public class SeprateStringAndNumbers {
	
	public static void main(String[] args) {
		String s= "123abc456def";
		
	   String numbers[]= s.split("\\D+");
	   
	   String[] characters=s.split("\\d+");
	   
	   
	   
	   ArrayList<String> num=new ArrayList<>();
	   ArrayList<String> cst=new ArrayList<>();
	   
	   
	   for (String c:numbers) {	   
		   if(!c.isEmpty()) {
			  
			 num.add(c);
			  
			
		   }
		 
	   }

	   for (String d:characters) {
		   
		   if(!d.isEmpty()) {
				  
				 cst.add(d);
				
	   }
	   }
	   
	   
	   System.out.println(num);
	   System.out.println(cst);
	}
	

}
