package oopsConcept;

public class SuperClassB extends SuperClassA{
	
	public SuperClassA sa;
	private String s;
	
	
	public String StringDemo() {
		s = stringMethod();
		System.out.println("String Class B "+s);
		return s;
	}

}
