package mapInetrfaceConcept;

import java.util.*;
import java.util.Map.Entry;

public class MapInterface {

	public static void main(String[] args) {
		MapInterface mI = new MapInterface();
		mI.nonGeneric();
		mI.generic();
	}
	
	public void generic() {
		
		System.out.println("---------------[Genaric Hashmap(New Style)]-------------------");
		System.out.println();
		System.out.println("-------Execution starts---------");
		System.out.println();
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Banana");
		map.put(2, "Apple");
		map.put(3, "Orange");
		map.put(4, "Grape");
		map.put(5, "Banana");
		
		System.out.println("Map of Elements : -- "+map);
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	
		System.out.println();
		System.out.println("--------Test passed sucessfully-----------");

	}
	
	
	public void nonGeneric() {
		
		System.out.println("---------------[non-Genaric Hashmap(oldStyle)]-------------------");
		System.out.println();
		System.out.println("-------Execution starts---------");
		System.out.println();
		
		Map map = new HashMap();
		map.put(1, "Banana");
		map.put(2, "Apple");
		map.put(3, "Orange");
		map.put(4, "Grape");
		map.put(5, "Banana");
		
		System.out.println("Map of Elements : -- "+map);
		
		
		//Converting to Set so that we can traverse
		Set set = map.entrySet();
		System.out.println();
		System.out.println("Set of map elements: ---"+set);
		System.out.println();
		
		Iterator itr = set.iterator();
		System.out.println("After interator set of elements:-- " + itr);
		System.out.println();
		
		while(itr.hasNext()) {
			//Converting to Map.Entry so that we can get key and value separately
			Map.Entry entry  = (Map.Entry) itr.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		System.out.println();
		System.out.println("--------Test passed sucessfully-----------");
		System.out.println();
		System.out.println();
	}

}
