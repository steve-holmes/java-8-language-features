package reflection;

import java.lang.reflect.Field;

public class AccessPrivateField {
	public static void main(String[] args) {
		Class<Person> personClass = Person.class;
		
		try {
			Person p = personClass.newInstance();
			
			Field nameField = personClass.getDeclaredField("name");
			
			nameField.setAccessible(true);
			
			String nameValue = (String) nameField.get(p);
			System.out.println("Current name is " + nameValue);
			
			nameField.set(p, "Sherry");
			
			nameValue = (String) nameField.get(p);
			System.out.println("New name is " + nameValue);
		} catch (InstantiationException | IllegalAccessException |
				NoSuchFieldException | SecurityException |
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
