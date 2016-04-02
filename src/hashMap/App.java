package hashMap;

import java.util.HashMap;
import java.util.Map;

public class App {

	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<>();

		// Basically, creates a look up table
		map.put(5, "five");
		map.put(8, "eight");
		map.put(6, "six");
		map.put(4, "four");
		map.put(2, "two");
		
		String text = map.get(4);
		System.out.println(text);
		
		/*
		 * return null for un mapped keys 
		 */
		//String text = map.get(1);
		//System.out.println(text);
		
		// Modifying(Over riding) with new value
		map.put(6, "Chakka");
		
		String newText = map.get(6);
		System.out.println(newText);
		
		// Iteration
		for(Map.Entry<Integer, String> entry: map.entrySet()){
			
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
	}

}
