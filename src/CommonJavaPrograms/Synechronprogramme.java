package CommonJavaPrograms;

public class Synechronprogramme {

	public static void main(String[] args) {

   String input="abc200def200and2";
   
   String[] numbers=input.split("\\D+");
   
   int sum=0;
   
   for(String num:numbers) {
	   
	   if(!num.isEmpty()) {
	   sum=sum+Integer.parseInt(num);  // convert string into integer
	   
	   }
   }
   
System.out.println(sum);

	}

}
