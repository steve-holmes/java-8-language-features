package collections;

import java.util.ArrayList;
import java.util.List;

public class NameIterator {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Ken");
		names.add("Lee");
		names.add("Joe");
		
		names.iterator()
			.forEachRemaining(System.out::println);
	}
}
