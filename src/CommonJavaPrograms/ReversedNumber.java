package CommonJavaPrograms;

public class ReversedNumber {

	public static void main(String[] args) {
		
		int num=12345678;
		int rev=0;
		
		while(num!=0) {
			int digit=num % 10;                    // Extract the last digit 
			
			System.out.println(digit);
			
			rev=rev*10+digit;   //8  87  876 8765 87654 
			
			num=num/10;   // remove the last degit 
		}
		
		System.out.println("reversed number is : "+rev);
		

	}

}

/*
 * //Variable to store the reversed number int reversed = 0;
 * 
 * // Reverse the number using a loop
 *  while (number != 0)
 *   { 
 *   int digit = number %10;            
 *   reversed = reversed * 10 + digit; // Add it to
 * the reversed number 
 * number/ 10; // Remove the last digit
 * 
 *  
 *  }
 * 
 * // Print the reversed number System.out.println("Reversed Number: " +
 * reversed);
 */