package CommonJavaPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		
		 
	      //1.number should be grater than 1
	      //2. number should be devided by 1 or itself
		
		int num=29;
		
		int count=0;
		
		if(num>1) {
			
			for(int i=1;i<=num;i++) {
				
				if(num%i==0)
					count++;
			}
			
			if(count==2)
			{
            System.out.println("Number is prime number ");

			}
			else {
				System.out.println("number is not prime number");
								
			}
				
			}
			
		
		else {
			System.out.println("number is not prime number ");
		}
	}

	}
