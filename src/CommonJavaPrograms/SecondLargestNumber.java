package CommonJavaPrograms;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		int [] number= {10,20,30,40,80,50,60,100,50};
		
		int largest=number[0];
		int secondlargest=0;
		
		for(int i=0;i<number.length;i++) {
			if(number[i]>largest) {
					largest=number[i];
			}
			
		}
		
		for(int i=0;i<number.length;i++) {
			if((number[i]>secondlargest) && (number[i]!=largest) ){
				secondlargest=number[i];
			}
			
		}	
		
System.out.println(secondlargest);

	}

}
