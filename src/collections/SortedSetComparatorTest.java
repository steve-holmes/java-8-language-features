package collections;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetComparatorTest {
	public static void main(String[] args) {
		SortedSet<Person> personsById = new TreeSet<>(Comparator.comparing(Person::getId));
		
		personsById.add(new Person(1, "John"));
		personsById.add(new Person(2, "Adam"));
		personsById.add(new Person(3, "Eve"));
		personsById.add(new Person(4, "Donna"));
		personsById.add(new Person(4, "Donna"));
		
		System.out.println("Persons by Id:");
		personsById.forEach(System.out::println);
		
		SortedSet<Person> personsByName = new TreeSet<>(Comparator.comparing(Person::getName));
		
		personsByName.add(new Person(1, "John"));
		personsByName.add(new Person(2, "Adam"));
		personsByName.add(new Person(3, "Eve"));
		personsByName.add(new Person(4, "Donna"));
		personsByName.add(new Person(4, "Kip"));
		
		System.out.println("Persons by Name: ");
		personsByName.forEach(System.out::println);
	}
}
