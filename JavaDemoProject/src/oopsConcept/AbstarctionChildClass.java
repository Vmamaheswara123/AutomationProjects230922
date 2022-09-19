package oopsConcept;



abstract class AbstarctionChildClass extends AbstarctionClass {

	void run() {
		System.out.println("running safly");
	}

	public static void main(String[] args) {

		AbstarctionClass aChild = new AbstarctionChildClass() {
		};
		aChild.run();

	}
}
