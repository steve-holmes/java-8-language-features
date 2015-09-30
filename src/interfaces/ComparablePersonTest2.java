package interfaces;

import java.util.Arrays;
import java.util.Comparator;

public class ComparablePersonTest2 {
	public static void main(String[] args) {
		ComparablePerson[] persons = new ComparablePerson[] {
			new ComparablePerson("John", "Jacobs"),
			new ComparablePerson("Jeff", "Jacobs"),
			new ComparablePerson("Wally", "Inman")
		};
		
		System.out.println("Original array...");
		print(persons);
		
		Comparator<ComparablePerson> fnComparator = new FirstNameComparator();
		Arrays.sort(persons, fnComparator);
		System.out.println("\nAfter sorting on first name...");
		print(persons);
		
		Comparator<ComparablePerson> lnComparator = new LastNameComparator();
		Arrays.sort(persons, lnComparator);
		System.out.println("\nAfter sorting on last name...");
		print(persons);
		
		Comparator<ComparablePerson> firstLastComparator = fnComparator.thenComparing(lnComparator);
		Arrays.sort(persons, firstLastComparator);
		System.out.println("\nAfter sorting on first, then last name...");
		print(persons);
		
		Comparator<ComparablePerson> firstLastReverseComparator = firstLastComparator.reversed();
		Arrays.sort(persons, firstLastReverseComparator);
		System.out.println("\nAfter sorting on first, then last name in reversed...");
		print(persons);
		
		Comparator<ComparablePerson> nullFirstComparator = Comparator.nullsFirst(firstLastComparator);
		ComparablePerson[] personsWithNulls = new ComparablePerson[] {
			new ComparablePerson("John", "Jacobs"),
			null,
			new ComparablePerson("Jeff", "Jacobs"),
			new ComparablePerson("Wally", "Inman"),
			null
		};
		Arrays.sort(personsWithNulls, nullFirstComparator);
		System.out.println("\nAfter sorting on first, then last name using null first...");
		print(personsWithNulls);
	}
	
	public static void print(ComparablePerson[] persons) {
		for (ComparablePerson person : persons) {
			System.out.println(person);
		}
	}
}
