package collections;

import java.util.ArrayList;
import java.util.List;

public class NamesList {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		System.out.printf("After creation: Size = %d, Elements = %s%n",
				names.size(), names);
		
		names.add("Ken");
		names.add("Lee");
		names.add("Joe");
		
		System.out.printf("After adding 3 elements: Size = %d, Elements = %s%n",
				names.size(), names);
		
		names.remove("Lee");
		
		System.out.printf("After removing 1 element: Size = %d, Elements = %s%n",
				names.size(), names);
		
		names.clear();
		
		System.out.printf("After clearing all elements: Size = %d, Elements = %s%n",
				names.size(), names);
	}
}
