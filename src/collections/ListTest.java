package collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("John");
		list.add("Richard");
		list.add("Donna");
		list.add("Ken");
		
		System.out.println("List: " + list);
		
		int count = list.size();
		System.out.println("Size of List: " + count);
		
		for (int i = 0; i < count; i++) {
			String element = list.get(i);
			System.out.println("Index=" + i + ", Element=" + element);
		}
		
		List<String> subList = list.subList(1, 3);
		System.out.println("Sub List 1 to 3(excluded): " + subList);
		
		list.remove("Donna");
		System.out.println("List (after removing Donna): " + list);
	}
}
