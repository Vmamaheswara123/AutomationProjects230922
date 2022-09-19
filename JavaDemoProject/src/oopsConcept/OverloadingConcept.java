package oopsConcept;

public class OverloadingConcept {

	private String name = "KTM";
	private int sumOfBikes = 2022;

	public static void main(String[] args) {
		OverloadingConcept b = new OverloadingConcept();
		b.bike();
		b.bike("Honda");
		b.bike("Honda", 20);
		
	}

	public static void main(int[] args) {
		
	}
	public void brand() {
		System.out.println("Hond have car and bike showrooms");
	}

	public void bike() {
		System.out.println("Hero hond brand Bike ");
		System.out.println("Bike brand is "+name + ".Sum of bikes are "+ sumOfBikes);
	}

	public void bike(String name) {
		this.name = name;
		System.out.println("After replace the KTM brand is "+ name);
	}

	public void bike(String name, int sumOfBikes) {
		this.name = name;
		this.sumOfBikes = sumOfBikes;
		System.out.println("After replace Suziki brand sum of bikes are Bike "+ sumOfBikes);
	}

}
