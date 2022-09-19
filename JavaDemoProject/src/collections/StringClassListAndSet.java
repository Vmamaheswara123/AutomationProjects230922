package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class StringClassListAndSet {

	public static void main(String[] args) {
		arrayList();
		linkedList();
		vector();
		stack();
		hashSet();
		linkedHashSet();
		treeSet();
	}

	public static void arrayList() {

		System.out.println("---------------------------Array list ---------------------------");

		ArrayList<String> arylist = new ArrayList<String>();

		arylist.add("Ravi");
		arylist.add("Manas");
		arylist.add("Tanmai");
		arylist.add("faruq");

		System.out.println("List of ArrayList elements : " + arylist);

		Iterator<String> irList = arylist.iterator();

		System.out.println("After iterator ArrayList elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("Array list passed successfully");
		System.out.println();

	}

	public static void linkedList() {

		System.out.println("-------------------Linked list --------------");
		LinkedList<String> linklist = new LinkedList<String>();

		linklist.add("Ravi");
		linklist.add("Manas");
		linklist.add("Tanmai");
		linklist.add("faruq");

		System.out.println("List of LinkedList elements : " + linklist);

		Iterator<String> irList = linklist.iterator();

		System.out.println("After iterator LinkedList elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("Linked list passed successfully");
		System.out.println();

	}
	
	public static void vector() {

		System.out.println("-------------------vector--------------");
		Vector<String> vct = new Vector<String>();

		vct.add("Ravi");
		vct.add("Manas");
		vct.add("Tanmai");
		vct.add("faruq");

		System.out.println("List of vector elements : " + vct);

		Iterator<String> irList = vct.iterator();

		System.out.println("After iterator vector elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("vector passed successfully");
		System.out.println();

	}
	
	public static void stack() {

		System.out.println("-------------------stack--------------");
		Stack<String> stk = new Stack<String>();

		stk.add("Ravi");
		stk.add("Manas");
		stk.add("Tanmai");
		stk.add("faruq");
		stk.add("salim");
		stk.pop();  // new method for stack: The element is popped from the top of the stack and is removed from the same.

		System.out.println("List of stack elements : " + stk);

		Iterator<String> irList = stk.iterator();

		System.out.println("After iterator stack elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("stack passed successfully");
		System.out.println();

	}
	
	public static void hashSet() {
		System.out.println("-------------------hashSet--------------");
		
		HashSet<String> hashset = new HashSet<String>();
		
		hashset.add("Ravi");
		hashset.add("Manas");
		hashset.add("Tanmai");
		hashset.add("faruq");
		hashset.add("salim");
		hashset.add("Ravi");
		
		System.out.println("Set of hashSet elements : " + hashset);

		Iterator<String> irList = hashset.iterator();

		System.out.println("After iterator hashSet elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("hashSet passed successfully");
		System.out.println();
	}
	
	
	public static void linkedHashSet() {
		System.out.println("-------------------linkedHashSet--------------");
		
		//HashSet<String> hashset = new HashSet<String>();
		LinkedHashSet<String> lHashSet = new LinkedHashSet<String>();
		
		lHashSet.add("Ravi");
		lHashSet.add("Manas");
		lHashSet.add("Tanmai");
		lHashSet.add("faruq");
		lHashSet.add("salim");
		lHashSet.add("Ravi");
		
		System.out.println("Set of linkedHashSet elements : " + lHashSet);

		Iterator<String> irList = lHashSet.iterator();

		System.out.println("After iterator linkedHashSet elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("linkedHashSet passed successfully");
		System.out.println();
	}
	
	public static void treeSet() {
		System.out.println("-------------------treeSet--------------");
		
		//HashSet<String> hashset = new HashSet<String>();
		TreeSet<String> treeSet = new TreeSet<String>();
		
		treeSet.add("Ravi");
		treeSet.add("Manas");
		treeSet.add("Tanmai");
		treeSet.add("faruq");
		treeSet.add("salim");
		treeSet.add("Ravi");
		
		System.out.println("Set of treeSet elements : " + treeSet);

		Iterator<String> irList = treeSet.iterator();

		System.out.println("After iterator treeSet elements : " + irList);

		while (irList.hasNext()) {
			System.out.println("After we got final iterator elements : " + irList.next());
		}
		
		System.out.println("treeSet passed successfully");
		System.out.println();
	}
	
	public static void sampleMethodName() {
		System.out.println("-------------------methodName--------------");
		
		System.out.println("methodName passed successfully");
		System.out.println();
	}
}
