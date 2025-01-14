package BasicJavaPrograms;

public class PremitiveDataTypes {

	public static void main(String[] args) {
		
		// DataType is nothing but which types of information stored in variable 
		// DataType declaration is mandatory for every variable declaration 
		// All primitive dataTypes are keywords-And Keywords should start with small letters 
		
		
        byte smallnum = 100;          // Size 1 byte     (-128 to 127)
		
		short num =5000;          // size- 2byte (-32768 to 32767)
		
		int a=10;          // size- 4byte,int stores whole number either positive or negative 
		
		long l=12053699152246195L;   //  size- 8byte, when int should not sufficient to store long value then use long data type -8byte
		
			
		
		float b =15.25f;                 //size- 4byte,float store number with decimal ,you should end value with f for float with d for double 
		double d=153625.154d;           //size- 8byte,float store number with decimal ,you should end value with f for float with d for double
		
		
		
		char c='A';    // Size -2 byte ,Character stores single byte characters 
		
		boolean bol= true;  // Size 1 bit ,boolean save value either true or false 
		
		
		
	    System.out.println("The small number is :"+smallnum);
	    
	    System.out.println("The number is "+num);
	    
	    System.out.println("The integer datatype :"+a);  // uses 
	    System.out.println("The long dattype : "+l);
	    System.out.println("The float datatype is : "+b);
	    System.out.println("The double datatype is :"+d);
	    System.out.println("The boolean datatype is :"+bol);
	    System.out.println("The chardataType si :"+c);
	    
	 
		
		
		
	}

}
