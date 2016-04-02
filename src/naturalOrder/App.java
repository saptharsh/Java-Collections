package naturalOrder;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

// Natural order for our own type of object
class Person implements Comparable<Person>{
	
	private String name;
	
	public Person(String name){
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public String toString() {
		return name;
	}

	@Override
	public int compareTo(Person person) {
		//return name.compareTo(person.name);
		/*
		 * Sorting in reverse alphabetical order
		 */
		//return -name.compareTo(person.name);
		
		int len1 = name.length();
		int len2 = person.name.length();
		
		if(len1 > len2){
			return 1;
		} else if (len1 < len2) {
			return -1;
		} else {
			
			return name.compareTo(person.name);
			
			// Cannot compare Person Objects with the same name length  		
			// return 0;
		}
	}
}

public class App {

	private static void addElements(Collection<String> col){
	
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clarke");
		col.add("Mike");
	}
	
	private static void addElements1(Collection<Person> col){
		
		col.add(new Person("Joe"));
		col.add(new Person("Sue"));
		col.add(new Person("Juliet"));
		col.add(new Person("Clarke"));
		col.add(new Person("Mike"));
	}
	
	private static void showElements(Collection<String> col){
		
		for(String element: col){
			
			System.out.println(element);
		}
	}
	
	private static void showElements1(Collection<Person> col){
		
		for(Person element: col){
			
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		SortedSet<String> set = new TreeSet<>();

		List<Person> list1 = new ArrayList<Person>();
		SortedSet<Person> set1 = new TreeSet<>();
		
		addElements(list);
		addElements(set);
		
		// When the list Type has a natural order
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
		
		addElements1(list1);
		addElements1(set1);

		// Can't call sort() on the Person list Type as it doesn't have a natural order
		/*
		 * Natural order is obtained by implementing Comparable  
		 */
		Collections.sort(list1);

		System.out.println("Sorting Defined Objects");
		
		showElements1(list1);
		System.out.println();
		showElements1(set1);
		
	}

}
