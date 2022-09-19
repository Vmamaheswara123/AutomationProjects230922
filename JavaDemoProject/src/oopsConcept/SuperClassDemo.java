package oopsConcept;

public class SuperClassDemo {
	
	private SuperClassB sb;
	private SuperClassC sc;
	private String s;
	
	public static void main(String[] args) {
		SuperClassDemo scd = new SuperClassDemo();
		//scd.test();
		scd.test2();
		
	}

	public void test() {
		sb = new SuperClassB();
		sb.StringDemo();
		//System.out.println("Demo Class calling B");
	}
	
	public void test2() {
		sc = new SuperClassC();
		sc.StringDem();
		//System.out.println("Demo Class calling c");
	}
}
