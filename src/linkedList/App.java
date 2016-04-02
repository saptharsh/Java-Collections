package linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {

	private static void doTimings(String type, List<Integer> list) {
		
		// 1E5 => 100,000
		/*
		 * For small size lists, the type of list doesn't matter
		 */
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		/*
		// Adding items to end of the lists
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
		*/
		
		/*
		// Add items to beginning of the list
		for (int i = 0; i < 1E5; i++) {
			
			// Addind items to beginning of the list
			list.add(0, i);
		}
		*/
		
		// Adding items in the middle of the lists
		/*
		 * ArrayList should be taking longer time. But, Linked list is longer in this case.
		 * This might be due to traversal time, or the size of the array should be bigger than the current
		 */
		/*
		for(int i = 0; i < 1E5; i++){
			list.add(list.size() - 50000, i);
		}
		*/
		
		// ArrayList can be considered if we are dealing with indexes close to array length
		for(int i = 0; i < 1E5; i++){
			list.add(list.size() - 100, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time takem: "+ (end - start) +" ms for "+ type);
	}

	public static void main(String[] args) {

		// If you want to add/remove elements only from the end of the list
		/*
		 * ArrayLists manage arrays internally
		 * [0][1][2][3][4][5] .....
		 */
		ArrayList<Integer> arrList = new ArrayList<>();
		
		// If you want to add/remove elements from anywhere in the list
		/*
		 * LinkedLists consists of elements, where each element has a reference to the 
		 * previous and next element
		 * [0]->[1]->[2] ....
		 * 	  <-   <-
		 * Hence, traversing through a LinkedLists is time consuming due to references
		 */
		LinkedList<Integer> linList = new LinkedList<>();

		doTimings("ArrayList", arrList);
		doTimings("LinkedList", linList);
		
	}

}
