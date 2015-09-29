package collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<String> s1 = new HashSet<>();
		
		s1.add("John");
		s1.add("Donna");
		s1.add("Ken");
		s1.add("Ken");
		
		Set<String> s2 = new HashSet<>(s1);
		
		s2.add("Ellen");
		s2.add("Sara");
		s2.add(null);
		s2.add(null);
		
		System.out.println("s1:" + s1);
		System.out.println("s1.size():" + s1.size());
		
		System.out.println("s2:" + s2);
		System.out.println("s2.size():" + s2.size());
	}
}
