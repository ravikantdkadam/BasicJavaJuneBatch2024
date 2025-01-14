package ArraysAndCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraListDemo {

	public static void main(String[] args) {
		
		// Used to make an insertion operation 
		//Default capacity is 10 
		// we can store duplicate elements
		// we can add null value in arraylist
		
		
	
		
		ArrayList ar = new ArrayList();   // Homogenous+hetrogenous
		
		// Add Method : to add element in arraylist by making an insertion operation 
		
		ar.add(10);    // int
		
		
		ar.add("Vishwatech");   //String
		
		ar.add("98.52");       // double
		
		ar.add('M');   // char
		
		ar.add("98.52");       // double
		
		ar.add(null);  // null 
		
		System.out.println(ar);   // [10, Vishwatech, 98.52, M, 98.52, null]
	
		
		// Add element at beginning , at middle of list or at end of list 
		

		ar.add(0, "Start");
			
		System.out.println(ar);  //[Start, 10, Vishwatech, 98.52, M, 98.52, null]

		

		ar.add(3, "Ravikant");
			
		System.out.println(ar);   //[Start, 10, Vishwatech, Ravikant, 98.52, M, 98.52, null]
		
		
		ar.add("Last element");
		
		
		System.out.println(ar); // [Start, 10, Vishwatech, Ravikant, 98.52, M, 98.52, null, Last element]
		
		
		
		
		// remove- To remove the element
		
	
		ar.remove("Ravikant");  // remove element directly 
		
		
		System.out.println(ar);   // [Start, 10, Vishwatech, 98.52, M, 98.52, null, Last element]
		
		
		
		ar.remove(3);   // remove elemnt by index
		
		
		System.out.println(ar);  //[Start, 10, Vishwatech, M, 98.52, null, Last element]
		
		
		// get method: to get the elements from list by the index
		
		
		
		System.out.println(	ar.get(4));
		
		
		
		//set method: used to replace the current element/object
	
		
		ar.set(6, "End");
		

		System.out.println(ar);
		
		
		// contains - this is used to check element is prsent/contains in list or not 
		
		//ar.contains(10); 
		
		System.out.println(ar.contains(50));   // true or false 
		
		
		//isempty();
		
		ar.isEmpty();
		
		
		System.out.println(ar.isEmpty());    // true or false
		
		
		//ar.size();
		
		System.out.println(ar.size());
		
		
		
	// addAll-----> used to combine 2 or more lists	
		
		// If we want to add homogenous (similar type of information ) then we caan add the wrapper class
		
		
		ArrayList<Integer> list= new ArrayList<Integer> ();   // homogenous (Integre)
		
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
	System.out.println(ar);	//[Start, 10, Vishwatech, M, 98.52, null, End]
	System.out.println(list);   //[20, 30, 40, 50]
		
		
		ar.addAll(list);
		
		System.out.println(ar.addAll(list));   // true or false
		
		
		System.out.println(ar);  //[Start, 10, Vishwatech, M, 98.52, null, End, 20, 30, 40, 50, 20, 30, 40, 50]
		
	
		
		ar.removeAll(list);
		
		System.out.println(ar.removeAll(list));   // true or false 
		
		
		System.out.println(ar);   //[Start, 10, Vishwatech, M, 98.52, null, End]
		
		
		
		
		// how we can convert Arrays to arraylist 
		
		ArrayList al = new ArrayList(Arrays.asList(10,20,30,40,50,60,70,80));
		
	
		
		System.out.println(al);
		
		
		// Read all elements from arrayList 
		// for loop 
		
		
//		for (int i=0; i<ar.size();i++) {
//			
//			
//			System.out.println(ar.get(i));
//			
//		}
		
		
		// for each loop 
		
		for(int b:list) {
			
			System.out.println(b);
		}
		
		
		
		// Iterator 
		
		
		
//		Iterator it =ar.iterator();
//		
//		while(it.hasNext()){
//			
//			System.out.println(it.next());
//		}
		
		
		
		
		
		
		
		
	}

}
