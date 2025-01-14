package ArraysAndCollections;

import java.util.HashSet;

// insertion operation not preserved 

// duplicate are not allowed 

public class HashSetDemo {

	public static void main(String[] args) {
		
           HashSet hs= new HashSet ();
		
		// HashSet <Integer> hs = new HashSet <Integer> ();
		
   
		// HashSet hs = new HashSet  (100);   // initial capacity is 100 
		
		
	// add: add element/object in set 
           
           hs.add(10);
           hs.add(20);
           
           hs.add(30);
           hs.add(40);
		
           hs.add(50);
           
  
		System.out.println(hs);   // [50, 20, 40, 10, 30]
		
		// get and set method we can not used in set 
		
	
		// remove : 
		
		hs.remove(40);
		
		
		System.out.println(hs);  // [50, 20, 10, 30]
		
		//contains----True/false
		

	System.out.println(hs.contains(90));
	
	//isEmpty();
	
	System.out.println(hs.isEmpty());
	
	
	HashSet hs2= new HashSet();
	
	 hs2.add("vishwatech");
     hs2.add("Solutions");
     
     hs2.add(30);
     hs2.add(40);
	
     hs2.add(50);
     
     hs2.add(50);   // duplicate elements are not allowed in Set 
     
     hs2.add(null);
     
     
     hs2.add(null);  // only single null key allowed 
     
     
     
	
     System.out.println("Set 1: "+hs);
   System.out.println("Set 2:" +hs2);
   
   // union : addAll ====to combine 2 or more sets 
   
   hs.addAll(hs2);
   
   
   System.out.println("After union of 2 sets : "+hs);
   
   
   
   // intersection(common element retrieve): retainsAll
   
   System.out.println(hs.retainAll(hs2));   // true 
   
   
   // difference - removeAll
   
   hs.removeAll(hs2);
   
 System.out.println(hs);
   
  
   
	}

}
