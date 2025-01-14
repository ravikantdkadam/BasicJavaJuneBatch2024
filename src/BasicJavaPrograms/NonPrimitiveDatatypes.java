package BasicJavaPrograms;

public class NonPrimitiveDatatypes {

	public static void main(String[] args) {
		
		String name= "vishwatech@123a";         // String is nonprimitive datatype
		
		String city="  PUNE";
		
		String blankvariable="";       // Yes we can define blank variable 
		
		// length():
		
		System.out.println("The length of name is :"+name.length());            //14
	
		// HI=length()-1:
		
		System.out.println("The HI index of name is :"+(name.length()-1));   // 13	
		
		//charAt():
		
		System.out.println("The charindex is :"+name.charAt(5));            //a
		
		
		 //Conatins():
				
		System.out.println("This is contains method :"+name.contains("shw"));     //true
		
		
		//concat();
		
		System.out.println("This is concat method :"+name.concat(city));        //Vishwatech@123  Pune
			
	 // isBalnak():
		 
		System.out.println("This is isBalnk method :"+name.isBlank());       //false
		
		System.out.println("This is isBalnk method :"+blankvariable.isBlank());   //true  
		
		
		//toUpperCase();
		//toLowerCase();
		
		System.out.println("Convert lowercase to upper case : "+name.toUpperCase());    //VISHWATECH@123
		
		System.out.println("Convert System to Lowercase : "+city.toLowerCase());         //pune	
		
		//indexOf();
		
		System.out.println("The index of chacter is "+name.indexOf("a"));           //5
		
		
		
		//
		
		System.out.println(name.equals(city));
		
	
		
	
		
	}

}