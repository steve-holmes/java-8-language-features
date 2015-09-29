package collections;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetTest {
	public static void main(String[] args) {
		SortedSet<String> sortedNames = new TreeSet<>();
		sortedNames.add("John");
		sortedNames.add("Adam");
		sortedNames.add("Eve");
		sortedNames.add("Donna");
		
		System.out.println(sortedNames);
	}
}
