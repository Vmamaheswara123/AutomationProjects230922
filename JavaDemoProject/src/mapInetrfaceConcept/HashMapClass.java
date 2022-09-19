package mapInetrfaceConcept;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapClass {

	public static void main(String[] args) {
		
		HashMapClass hMapI = new HashMapClass();
		hMapI.hashmapAdd();

	}
	
	public void hashmapAdd() {
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		hm.put(1, "Apple");
		hm.put(2, "Banana");
		hm.put(3, "Grape");
		hm.put(4, "Orange");
		hm.put(1, "Orange");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Hash map Key and Value : "+ me.getKey()+ " "+ me.getValue());
		}
		
		System.out.println();
		hm.putIfAbsent(3, "Gruva");
		System.out.println("After invoking putIfAbsent method....");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Hash map Key and Value : "+ me.getKey()+ " "+ me.getValue());
		}
		
		System.out.println();
		hm.put(5, "wahtermlone");
		hm.putAll(hm);
		System.out.println("After using put all method.....");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Hash map Key and Value : "+ me.getKey()+ " "+ me.getValue());
		}
		
		System.out.println();
		hm.remove(5);
		hm.putAll(hm);
		System.out.println("After using remove method.....");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Hash map Key and Value : "+ me.getKey()+ " "+ me.getValue());
		}
		
		System.out.println();
		hm.replace(3, "Gruva");
		hm.putAll(hm);
		System.out.println("After using replace method.....");
		
		for(Map.Entry me: hm.entrySet()) {
			System.out.println("Hash map Key and Value : "+ me.getKey()+ " "+ me.getValue());
		}
	}
	

}

/* It is not Legacy()
 * Hash map class implements the Map Interface
 * Which is allow us to store key and pair value
 * key and Values both are Objects
 * it doesn't allow the duplicate keys, but values may be duplicate
 * one null value allowed at key side, but Any no of null values are allowed at values side.
 * it is not synchronized
 * it is not followed insertion order
 * sorting order is not followed
 * It is internal data structure is "Hash table"
 * it is initial capacity is 16 elements
 * it is not synchronized
 * It is allowed more than one thread to access data
 * it follows the parallel execution 
 * it will reduce the application execution time
 * it will improve application performance
 * it is not thread safe
 */
