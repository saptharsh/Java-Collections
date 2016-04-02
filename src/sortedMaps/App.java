package sortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp{
	
}

public class App {

	// All the below 3 Maps implement Map Interface
	public static void testMap(Map<Integer, String> map){
		
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		
		// map.keySet() => gives the Set of keys
		for(Integer key: map.keySet()){
			
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}
	
	public static void main(String[] args) {
		
		// 1
		/*
		 * Map<Integer, String> hashMap = new HashMap<>(); => Holds good
		 */
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		// To keep the mapping in order
		// 2
		LinkedHashMap<Integer, String> linHashMap = new LinkedHashMap<>();
		
		/*
		 * sortedMaps.Temp@139a55 => 139a55 (hash code)
		 */
		//System.out.println(new Temp());
		
		// Tree sorts the values in natural order
		// 3
		TreeMap<Integer, String> treeMap = new TreeMap<>();
 
		// Calling the method
		/*
		 * Sometimes gives the Map in sorted order
		 */
		//testMap(hashMap);
		/*
		 * Maintains the order in which the items are added to the Map
		 */
		testMap(linHashMap);
		/*
		 * Gives back the Map in which the keys are sorted in Natural order
		 */
		//testMap(treeMap);
	}

}
