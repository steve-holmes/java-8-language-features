package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest {
	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<>();
		s1.add("John");
		s1.add("Adam");
		s1.add("Eve");
		s1.add("Donna");
		System.out.println("LinkedHashSet: " + s1);
		
		Set<String> s2 = new HashSet<>();
		s2.add("John");
		s2.add("Adam");
		s2.add("Eve");
		s2.add("Donna");
		System.out.println("HashSet: " + s2);
		
		System.out.println("s1.quals(s2): " + s1.equals(s2));
	}
}
