package collections;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("Ken");
		names.add("Lee");
		names.add("Joe");
		
		for (String name: names) {
			System.out.println(name);
		}
	}
}
