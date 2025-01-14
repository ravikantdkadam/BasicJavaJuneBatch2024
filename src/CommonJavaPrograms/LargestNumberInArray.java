package CommonJavaPrograms;

public class LargestNumberInArray {

	public static void main(String[] args) {
		 
			  int numbers[]= {10,15,25,35,37,50,30,60,25,12};
		        // Find the largest number
		        int largest = numbers[0]; // Assume the first element is the largest
		        for (int i = 1; i < numbers.length; i++) {
		            if (numbers[i] > largest) {
		                largest = numbers[i];
		            }
		        }

		        // Output: Largest number
		        System.out.println("The largest number in the array is: " + largest);

		      
		    }
		

	}


