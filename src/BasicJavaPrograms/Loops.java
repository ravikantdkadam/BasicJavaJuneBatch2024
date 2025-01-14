package BasicJavaPrograms;

public class Loops {

	public static void main(String[] args) {
		// while loop 
	    // It is pretest loop 
	   // disadvantage  it will generate infinite loops if we don't given incremental or decremental oprator 
 
		
		//incremental or decremenal operator 
		
		
		int i=1;       // Initialization
		
		
		while (i<=10)                    // condition
		
		
		{
		 
			System.out.println(i);	   // statement 
			i++;                                         // Incremental operator 
			
		}
		
System.out.println("=======================================================================================================================");


	// do-while loop 
	
	// It is post test loop 
	// In do while execute the loop body at least once 

	  int j=1;  // initilization
	do 
	{
		System.out.println(j);                     // statement
		j++;     // incremental operator 
	}
	
	while (j<=10);                                      // condition
	
	System.out.println("=======================================================================================================================");

	// For Loop 	
	//Advantages: Advantage of for loop over a while loop is readability 
		
		
	for (int k=1;k<=10;k++)    // initlization,conditional,incremental
	{
		System.out.println(k);    // statement 
	}
	




System.out.println("=======================================================================================================================");

//For loop -------- post Decremental 
		
	for (int m=10;m>=0;m--)    // initlization,conditional,decremental
	{
		
		System.out.println(m);
	}
	
		
	System.out.println("=======================================================================================================================");
	
	
	// for each loop 
	
	//  for each loop -String array 
	
    String name[] ={"ravi","Akshay","Divya"};
    
    
    for (String b:name)  
    {
        
        System.out.println("the value of b is " +b);
        
    } 
     
    System.out.println("======================================================================================================================="); 
    
    
   // for each loop - int array 
	
	
  int a[]= {10,20,30,40,50};
	
	
  
  for (int b:a)      //(Datatype collection:array )  
  {
      
      System.out.println("the value of b is " +b);
      
  } 
   
	}

}










