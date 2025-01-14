package ArraysAndCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		
		
		LinkedList linklist = new LinkedList(Arrays.asList(10,20,30,40,50,60,70));
		
		System.out.println(linklist);
		
		
		// add element in middle of list 
		
		linklist.add(3, 90);
		System.out.println(linklist);
		
		linklist.addFirst(101);
		linklist.addLast(901);
		

		System.out.println(linklist);
		
		


	}

}
