package sortingLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Sorting other than the natural order
class StringLenComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		int len1 = o1.length();
		int len2 = o2.length();
		
		if(len1 > len2){
			return 1;
		} else if (len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

//Sorting in natural order
class AlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return o1.compareTo(o2);
	}
	
}

//Reverse Sorting in natural order
class ReverseAlphabeticalComparator implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {

		return -o1.compareTo(o2);
	}
	
}


public class App {

	public static void main(String[] args) {

		
		
		/////////////////////////////// Sorting Strings //////////////////////////////
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("snake");
		animals.add("mongoose");

		Collections.sort(animals);

		for (String animal : animals) {
			System.out.println(animal);
		}
		
		Collections.sort(animals, new StringLenComparator());
		
		System.out.println("Custom sort, sorting by length");
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		
		Collections.sort(animals, new AlphabeticalComparator());
		
		System.out.println("Sorting in alphabetical order");
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		System.out.println("Sorting in Reverse alphabetical order");
		for (String animal : animals) {
			System.out.println(animal);
		}
		
		/////////////////////////////// Sorting numbers //////////////////////////////
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(3);
		numbers.add(1);
		numbers.add(36);
		numbers.add(73);
		numbers.add(40);
		numbers.add(1);
		
		Collections.sort(numbers);
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer n1, Integer n2) {

				return -n1.compareTo(n2);
			}
			
		});
		
		System.out.println("Sorting number in the reverse order");
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		
		/////////////////////////////// Sorting Arbitrary Classes //////////////////////////////
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person(1, "Joe"));
		people.add(new Person(3, "Sue"));
		people.add(new Person(4, "Clarke"));
		people.add(new Person(2, "Bob"));
		
		// Sorting in the order of ID
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				if(p1.getId() > p2.getId()){
					return 1;
				} else if (p1.getId() < p2.getId()) {
					return -1;
				}
				
				return 0;
			}
			
			
		});
		
		
		for (Person person : people) {
			System.out.println(person);
		}
		
		
		// Sorting in the order of Name
		Collections.sort(people, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				return p1.getName().compareTo(p2.getName());
			}
			
		});
		
		System.out.println("Sorting according to names");
		for (Person person : people) {
			System.out.println(person);
		}

	}

}




