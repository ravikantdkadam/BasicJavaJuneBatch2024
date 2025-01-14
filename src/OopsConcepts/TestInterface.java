package OopsConcepts;

public class TestInterface {

	public static void main(String[] args) {
		
		ICICIBank ic1 = new ICICIBank();
		
		
		// ICICIBank implements the RBIBank
		ic1.eduloan();
		ic1.homeloan();
		ic1.goldloan();
		ic1.mutualfund();
		
		
		// ICICIBank implements the UKBank
		ic1.UKeduloan();
		ic1.UKgoldloan();
		ic1.UKhomeloan();
		
		System.out.println("This is static variable "+RBIBank.loan);
		
		
		System.out.println("=========================================================");
		
		RBIBank r1= new ICICIBank();   // Object of ICICIBank refred to RBIBank ref variable 
		
		r1.eduloan();
		r1.goldloan();
		r1.homeloan();
		
		

	}

}
