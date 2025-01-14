package CommonJavaPrograms;

public class ShiftRightArrayElement {

	public static void main(String[] args) {
		
		int [] arr= {1,2,3,7,4,6};   //outPut {7, 4 ,6, 1 ,2 ,3}
		
		int n=3;
		
		
		for(int i=0;i<n;i++) {
			
			int lastele=arr[arr.length-1];   // select last element
			
			for(int j=arr.length-1;j>0;j--) {
				arr[j]= arr[j-1];    //shifted one element to last position
				
				
			}
			arr[0]=lastele;
		}
		
		for(int i=0;i<arr.length;i++) {
			
			System.out.print(arr[i]+" ");
		}
		

	}

}
