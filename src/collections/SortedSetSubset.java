package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetSubset {
	public static void main(String[] args) {
		SortedSet<String> names = new TreeSet<>();
		names.add("John");
		names.add("Adam");
		names.add("Eve");
		names.add("Donna");
		
		System.out.println("Sorted Set: " + names);
		
		System.out.println("First: " + names.first());
		System.out.println("Last: " + names.last());
		
		SortedSet ssBeforeDonna = names.headSet("Donna");
		System.out.println("Head Set Before Donna: " + ssBeforeDonna);
		
		SortedSet ssBetweenDonnaAndJohn = names.subSet("Donna", "John");
		System.out.println("Subset between Donna and John (exclusive): " + ssBetweenDonnaAndJohn);
		
		SortedSet ssBetweenDonnaAndJohn2 = names.subSet("Donna", "John" + "\0");
		System.out.println("Subset between Donna and John (Inclusive): " + ssBetweenDonnaAndJohn2);
		
		SortedSet ssDonnaAndAfter = names.tailSet("Donna");
		System.out.println("Subset from Donna onwards: " + ssDonnaAndAfter);
	}
}
