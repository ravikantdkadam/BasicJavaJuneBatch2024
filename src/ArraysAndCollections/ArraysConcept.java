package ArraysAndCollections;

public class ArraysConcept {
	
	// Array variable used to store the similar type of information
	// Size is fixed ----Static Array
	// HI = size(n)-1

	public static void main(String[] args) {
		
		// int array variable
		// single dimentional array
		
		int i []= new int[4]; 
		
		 i[0]= 10;
		 i[1]= 20;
		 i[2]= 30;
		 i[3]= 40;
		
		 
		 
		 // length of array 
		 System.out.println("Size of array is :"+i.length);
		 
	    // System.out.println(i[0]);
	     //System.out.println(i[1]);
	     //System.out.println(i[2]);
		// System.out.println(i[3]);		
		 
		// for loop 
		 
		 
		 for(int j=0; j<=(i.length-1) ; j++)         // initlization -condition -incremental/decremental operator
		 {
			 
			 System.out.println(i[j]);
			 
		 }
		 
		 
		 System.out.println("#######For each loop ###############");
		 
		 // for each loop or enhanced loop 
		 
		 
		 for (int x:i) {
			 
			 System.out.println(x);
		 }
		 
		 
//Char array variable 
		 
		 char b []= new char[3];
		 
		 b[0]='M';
		 b[1]='$';
		 b[2]='A';
				 
				 
				 System.out.println(b[1]);
			 
				 
 // Boolean array variable 
				 
				 
				 boolean c[] = new boolean[2];
			
				 System.out.println(c[1]);

			 
				 
 //double array variable 
				 

					double d [] = new double[5];    
					 
					  d[0]=10.25;
					  d[1]=20.65;
					  d[2]=30.25;
					  d[3]=40.58;
				  
					  System.out.println(d[2]);
				  
//String array varaible 
					  
					  String s[]= new String[3];
					  
					  s[0]="Tom";
				      s[1]="Jeery";
				      s[2]="ABC@gmail1234.com";
				 		 
				      
				      System.out.println(s[2]);


	



	// Object array variable- we can store different type values in object array variable
	
	 
	      Object ob[] =new Object[5];  //    Object is a class so we can use initial in capital letter
	      
	
	      ob[0]=10;               //int
		  ob[1]="TOM";              // string
		  ob[2]='@';              // char
		  ob[3]=40.26;             // double
		  ob[4]="ABC12";             //string
		  
		  
		  System.out.println(ob[2]);
		  
		
		  
		  
		  // Two dimensional Array 
		  
		  
		  int a[] [] =new int[2] [3];
		  
		  
		  a[0][0]=12;  
		  a[0][1]=13;
		  a[0][2]=16;
		  a[1][0]=14;
		  a[1][1]=15;
		  a[1][2]=17;
		  
		  
		  
		  
		  // length of the Two diemntional array 
		  
		  
		  System.out.println("Lenth of row is :"+a.length);    // row length
		  
		  System.out.println("Lenth of column is :"+a[0].length);  // column length=====we need to pass the row number in array
		  
		  
		  
		  
		  System.out.println(a[1][1]);    // read single element 
		  
	System.out.println("*********************For loop Two dimentaional *******************************");
	
		  for (int row=0;row<a.length;row++) {                     //0   1   
			  
			  for(int col=0; col<a[row].length; col++) {             //0    1   2  
				  
				  System.out.print(a[row][col]+"  ");
			  }                                              // inner loop always run first 
			  
			 
			  
			  System.out.println();
			  
		  }
		  
		  
		  
		  
		  
			 System.out.println("#######For each loop Two dimentional array ###############");
			 
			 // for each loop or enhanced loop 
			 
			 
			 for (int arr[]:a) {
				 
				 for (int x:arr) {
				 
				 System.out.print(x+" ");
				 
				 }
			 }
			 
		  

	}}

	 

	


