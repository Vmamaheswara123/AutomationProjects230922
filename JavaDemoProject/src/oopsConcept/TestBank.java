package oopsConcept;

public class TestBank {
	
	public static void main(String[] args) {
		Bank b;
		
		b = new SBI();
		System.out.println("SBI Rate of interst is: --  "+b.getRateOfInterst());
		
		b = new PNB();
		System.out.println();
		System.out.println("PNB Rate of interst is: --  "+b.getRateOfInterst());
		
	}

}
