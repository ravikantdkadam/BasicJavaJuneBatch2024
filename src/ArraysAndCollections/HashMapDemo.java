package ArraysAndCollections;

import java.util.HashMap;
import java.util.HashSet;

public class HashMapDemo {

	public static void main(String[] args) {
		//   HashMap hm= new HashMap ();
			
		  HashMap<Integer,Integer> hm= new HashMap <Integer,Integer>();
		  
		  
		 // put method : to add the element 
		  
		  hm.put(101, 20000);
		  hm.put(102, 30000);
		  hm.put(103, 30000);  // duplicate value are allowed 
		  hm.put(104, 40000);
		  hm.put(105, 50000);
		  hm.put(105, 20000);   // duplicate key not allowed
		  hm.put(null, 60000);  // single null key allowed 
		  hm.put(null, 70000);  // duplicate null kwy not allowed
		  
		  
		  
		  hm.put(106, null);
		  
		  hm.put(107, null);   // multiple null values accepted 
		  
		  
		  System.out.println(hm);   // {101=20000, 102=30000, 103=30000, 104=40000, 105=20000}
		  
		  
		  //get method to retrieve the values for key
		  
		 System.out.println("to retrive the value for key "+hm.get(104));
		 
		 // remove method 
		 
		 //containskey 
		 
		 hm.containsKey(103);
		 hm.containsValue(20000);
		 
		 
		 
		// special Methods in HashMap 
		 
		 // Keyset ()---------------------Return Type is set(duplicate now allowed) 
		 
		System.out.println("keys collection "+hm.keySet());  //  [null, 101, 102, 103, 104, 105, 106, 107]
		
		
		// values()-----------------------return type is collection (duplicates allowed )
		
		System.out.println("values collection "+hm.values());  //  [70000, 20000, 30000, 30000, 40000, 20000, null, null]
		
		// entrySet ()
		
		System.out.println("Entry collection "+hm.entrySet());   // [null=70000, 101=20000, 102=30000, 103=30000, 104=40000, 105=20000, 106=null, 107=null]
		
		  
		  
		  
			

	}

}
