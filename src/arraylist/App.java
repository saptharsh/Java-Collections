package arraylist;

import java.util.ArrayList;
import java.util.List;


public class App {

	public static void main(String[] args){
		
		// ArrayList<Integer> numbers = new ArrayList<>(25);
		/*
		 * Default size is 10 if 25 was not specified
		 */
		ArrayList<Integer> numbers = new ArrayList<>();
		
		// Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		// Retrieving
		System.out.println(numbers.get(0));
		
		System.out.println("Iteration #1: ");
		
		// Indexed for loop for Iteration
		for(int i = 0; i < numbers.size(); i++){
			
			System.out.println(numbers.get(i));
		}
		
		System.out.println("Iteration #2: ");

		// Removing the items from an ArrayList
		numbers.remove(numbers.size() - 1);

		// This removal is very slow, removing the first item or middle item from the list
		numbers.remove(0);
		
		for (Integer value : numbers) {
			System.out.println(value);
		}
		
		
		// List Interface
		/*
		 * All the different kind of lists, implement List Interface
		 */
		List<String> texts = new ArrayList<>(50);
	}
}









