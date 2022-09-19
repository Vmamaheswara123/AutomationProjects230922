package JavaNumaricPrograms;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionChecking {

	public static void main(String[] args) {
		linkList();
		arrayList();

	}
	
	public static void linkList() {
		int a[] = {1,2,3,5,4,6,3,};
		
		LinkedList<Integer> lin = new LinkedList<Integer>();
		
		for(int i=0; i<a.length;i++) {
			lin.add(a[i]);
		}
		System.out.println("Linked list elements  : "+lin);
	}
	
	public static void arrayList() {
		int a[] = {1,2,3,5,4,6,3};
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) {
			arl.add(a[i]);
		}
		System.out.println("Array list elements  : "+arl);
	}
	
	public static void treeSet() {
		int a[] = {1,2,3,5,4,6,3};
		
		ArrayList<Integer> arl = new ArrayList<Integer>();
		
		for(int i=0; i<a.length;i++) {
			arl.add(a[i]);
		}
		System.out.println("Array list elements  : "+arl);
	}
}
