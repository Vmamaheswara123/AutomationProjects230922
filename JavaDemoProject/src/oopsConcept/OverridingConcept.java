package oopsConcept;

public class OverridingConcept extends OverloadingConcept {

	public static void main(String[] args) {
		OverridingConcept b = new OverridingConcept();
		b.brand();

	}

	
	public void brand() {
		System.out.println("Hond have car and bike showrooms");
	}

}

/*
 * It is a way to achieve data hiding in Java because other class will not be
 * able to access the data through the private data members you can write the
 * logic inside the setter method. You can write the logic not to store the
 * negative numbers in the setter methods
 */
