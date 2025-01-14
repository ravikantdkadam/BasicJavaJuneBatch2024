package Operators;

public class LogicalOperators {

	public static void main(String[] args) {

		int x=5;
		
		// && Logical and : Return true if both statements are true
		
		System.out.println(x>3 && x<10);    // True

		//||  Logical Or:  Return true if one of the statement is true 
		
		System.out.println(x>3 || x<4);    // true
		
		//!   logical not : Reverse the result returns false if result is true 
		
		System.out.println(!(x>3 || x<4));     // false

	}

}
