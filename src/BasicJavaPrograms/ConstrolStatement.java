package BasicJavaPrograms;

public class ConstrolStatement {

	public static void main(String[] args) {
		
		// if statement 
		
		int a=20;
		
		if (a>10)                     // Condition
		{
			
			System.out.println("a is grater");            // block of code
		}
		
		
		
	System.out.println("=================================================================================================");	
	
	//if else Statement
	
	
	int doorcode =1234;
	
	if (doorcode==1234)                  // condition
	{
		System.out.println("Code is correct, Door will be opened ");   // block of code 
	}
	
	else
	{
	System.out.println("Code is wrong, Door remians closed ");	
	}
	
	
		
	System.out.println("======================================================================================");	
		
		
	// else if Statement 
	
	int age =50;
	
	if (age<18)
		
	{
		System.out.println("This is Child genration");
	}
	
	else if (age>=18 && age<=40) {
		System.out.println("This is young genration");
	}
	
	else {
		System.out.println("This is elder genration ");
	}
		
		
	System.out.println("======================================================================================");	
	
	// Nested if statement
	
	String Uid="rkadam";
	
	String pwd="test@123";
	
	if ( Uid=="rkadam123")
	{

				 if (pwd=="test@123") 
					{
						System.out.println("Login successful ");
						}
					else {
						System.out.println("Wrong password ");
						}
	}
	else
	{
		System.out.println("Wrong User ID");
	}
	
	
	
	System.out.println("======================================================================================");	
	
	
	//Switch statement - instead of number of if else statement we can use switch statement 
	
	
			int day=15;   // variable declaration
			
			switch(day)    // switch expression 
			{
			
			case 1:
				
				System.out.println("monday");

			break;
			
	        case 2:
				
				System.out.println("Tuesday");

			break;
			
	        case 3:
				
				System.out.println("Wednesday");

			break;
			
	        case 4:
			
			System.out.println("Thurseday");

			break;
			
	        case 5:
			
			System.out.println("Friday");

			break;
			
	        case 6:
			
			System.out.println("Saturday");

			break;
			
	        case 7:
	    		
	    		System.out.println("Sunday");

	    		break;
	    		
			
	        default:
			
			System.out.println("This is out of calender");

			
			}
			

	}
	

}
