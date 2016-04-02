package sets;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {

	public static void main(String[] args) {
		
		// Set contains only unique items
		/*
		 *  HashSet does not retain any order
		 */
		//Set<String> set1 = new HashSet<>();
		
		//LinkedHashSet remembers the order of added items into the set
		//Set<String> set1 = new LinkedHashSet<>();
		
		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<>();

		if(set1.isEmpty()){
			System.out.println("Set is empty");
		}
		
		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");
		
		if(set1.isEmpty()){
			System.out.println("Set is empty");
		}
		// Adding duplicate items, doesn't get added to the set
		set1.add("mouse");
		
		System.out.println(set1);
		
		///////////// Iteration ///////////////
		
		for(String ele: set1) {
			System.out.println(ele);
		}
		
		
		///////////// Does set contain a given item ? /////////////
		if(set1.contains("randonCrap")) {
			System.out.println("Conatins randomCrap");
		}
		
		if(set1.contains("cat")) {
			System.out.println("Contains cat");
		}
		
		
		// Set 2 contains few similar items as in Set 1
		Set<String> set2 = new TreeSet<>();
		
		set2.add("dog");
		set2.add("cat");
		set2.add("giraffe");
		set2.add("monkey");
		set2.add("ant");

		////////////// Intersection ////////////////////
		
		// Making a copy of set1
		Set<String> intersection = new HashSet<>(set1);
		
		System.out.println(intersection);
		
		intersection.retainAll(set2);
		
		System.out.println("Retaining all the common elements in he set: "+intersection);
		
		
		////////////// Difference //////////////////
		/*
		 * Making a copy of set2
		 */
		Set<String> difference = new HashSet<>(set2);
		
		difference.removeAll(set1);
		System.out.println("Remove all the similar elements of set 2 and set 1 from set 2 "+ difference);
		
	}

}




