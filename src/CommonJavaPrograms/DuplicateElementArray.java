package CommonJavaPrograms;

public class DuplicateElementArray {

	public static void main(String[] args) {
		
		       String name [] ={"Ravi","Mahesh","Ravi","Kadam","Mahesh"};
		       
		       
		     
		       for(int i=0; i<=name.length; i++){
		           
		           for (int j=i+1;j<name.length;j++){
		               
		               if(name[i]==name[j] && (i!=j)){
		            	   
		            	   System.out.println("Duplicate element is :"+name[j]);  
		               }
		             
		           }
		           
		           
		       }
		       
		       
		       
		    }

	}


