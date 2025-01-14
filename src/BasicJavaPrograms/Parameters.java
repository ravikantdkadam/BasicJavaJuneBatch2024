package BasicJavaPrograms;

public class Parameters {

	public static void main(String[] args) {
		
		para1("vishwatech",35, "Pune");	                         // Arguments 
		
		para1("Ravikant",33,"Latur");	                         // Arguments 
		
		para1("Akshay",25,"Mumbai");	                         // Arguments 
		
		para1("Divya",20,"Surat");	                         // Arguments 
		
		
		Parmeters2.para2("rkadam", "test@123");       // static method call from different class with parameters 
		
		
		Parameters p1= new Parameters();                      // object of same class
		
		p1.para3("Ravikant", "MTech", "80%");                   //Non static method call from same class with parameters 
		
	}
	
	
	public static void para1(String name ,	int age, String city) {                          // Parameter pass in method 
	
			System.out.println("The name is "+name+" and age is "+age+ " and city is "+ city);
		
	}
	
	
	public void para3(String name, String classname, String marks) {
		
		System.out.println("Name is  "+name+" and class is "+classname+ "and marks is "+marks);
		
	}


}
