package collections;

import java.util.NavigableSet;
import java.util.TreeSet;

public class NavigableSetTest {
	public static void main(String[] args) {
		NavigableSet<Integer> ns = new TreeSet<>();
		ns.add(1);
		ns.add(2);
		ns.add(3);
		ns.add(4);
		ns.add(5);
		
		NavigableSet reverseNs = ns.descendingSet();
		
		System.out.println("Normal View of the set: " + ns);
		System.out.println("Reverse view of the set: " + reverseNs);
		
		System.out.println("\nGetting subset of the set");
		
		NavigableSet threeOrMore = ns.tailSet(3, true);
		System.out.println("3 or more: " + threeOrMore);
		
		System.out.println();
		System.out.println("Searching through the set");
		
		System.out.println("lower(3): " + ns.lower(3));
		System.out.println("floor(3): " + ns.floor(3));
		System.out.println("higher(3): " + ns.higher(3));
		System.out.println("ceiling(3): " + ns.ceiling(3));
		
		System.out.println();
		System.out.println("Polling elements from the set");
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollLast(): " + ns.pollLast());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("Navigable Set: " + ns);
		
		// Since the set is empty, polling will return null
		System.out.println("pollFirst(): " + ns.pollFirst());
		System.out.println("pollLast(): " + ns.pollLast());
	}
}
