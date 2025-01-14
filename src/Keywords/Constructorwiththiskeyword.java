package Keywords;

public class Constructorwiththiskeyword {
	
// this() keyword used with constructor only 
	
// this ()keyword used  when global variable and local variable are same
			
// this keyword used to initialize global variable 
			
	
	String name;                 // global variable
   int age ;
	
    

	
	public Constructorwiththiskeyword(String name, int age ) {                   // local variable
		
	this.name=name;
	this.age=age;             // global variable initilized with local variable 
	
	
	
	System.out.println(name);
	System.out.println(age);
		
	}
	
	
 
    public static void main(String[] args) {

		
		Constructorwiththiskeyword c1= new Constructorwiththiskeyword("Vishwatech",50);
		

	}
	
	

}
