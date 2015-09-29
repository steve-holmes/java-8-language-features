package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapViews {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("John", "(342)113-9878");
		map.put("Richard", "(245)890-9045");
		map.put("Donna", "(205)678-9823");
		map.put("Ken", "(205)678-9823");
		
		System.out.println("Map: " + map.toString());
		
		listKeys(map);
		listValues(map);
		listEntries(map);
	}

	public static void listEntries(Map<String, String> map) {
		System.out.println("Entry Set:");
		
		Set<Map.Entry<String, String>>entries = map.entrySet();
		entries.forEach((Map.Entry<String, String> entry) -> {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("key=" + key + ", value=" + value);
		});
	}

	public static void listValues(Map<String, String> map) {
		System.out.println("Values Collection:");
		Collection<String> values = map.values();
		values.forEach(System.out::println);
		System.out.println();
	}

	public static void listKeys(Map<String, String> map) {
		System.out.println("Key Set:");
		Set<String> keys = map.keySet();
		keys.forEach(System.out::println);
		System.out.println();
	}
}
