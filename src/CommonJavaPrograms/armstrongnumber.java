package CommonJavaPrograms;

public class armstrongnumber {

	public static void main(String[] args) {
		

int num=153;
int r;
int cube=0;
int t=num ;   // original number 

 
 
 
while(num>0){
 
	r=num%10;              //3 5   1// modulus for reminder
	
	 num=num/10;           //15  1  0   // division for dividends 
	 
	 
  cube=cube+(r*r*r);     //27  152   153
}


if (t==cube){
System.out.println("number is armstrong");
}
else {
  System.out.println("number is not armstrong");
}
}}