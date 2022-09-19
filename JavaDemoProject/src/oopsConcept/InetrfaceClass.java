package oopsConcept;

public class InetrfaceClass implements InterfaceConcept{
	
	public void print(){
		System.out.println("Concept of Interface in Opps");
	}

	public static void main(String[] args) {
		
		InetrfaceClass obj = new InetrfaceClass();
		obj.print();
		
	}
}
