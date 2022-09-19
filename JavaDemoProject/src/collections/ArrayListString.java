package collections;

import java.util.ArrayList;

public class ArrayListString {

	public static void main(String[] args) {

		arrayListH();
	}

	public static void arrayList() {

		System.out.println("--------------------arrayList--------------------");
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println();

		ArrayList<String> aryList = new ArrayList<String>();

		aryList.add("Apple");
		aryList.add("Banana");
		aryList.add("Almond");
		aryList.add("Greaps");

		System.out.println("List of ArrayList elements : " + aryList);
		System.out.println();
	}
	
	public static void arrayListH() {
		
		arrayList();
		
		System.out.println("--------------arrayListHashNext----------------");
		
	}

}
