package reflection;

import java.lang.reflect.Field;

public class FieldAccessTest {
	public static void main(String[] args) {
		Class<PublicPerson> ppClass = PublicPerson.class;
		
		try {
			PublicPerson p = ppClass.newInstance();
			
			Field name = ppClass.getField("name");
			
			String nameValue = (String) name.get(p);
			System.out.println("Current name is " + nameValue);
			
			name.set(p, "Ann");
			
			nameValue = (String) name.get(p);
			System.out.println("New name is " + nameValue);
		} catch (InstantiationException | IllegalAccessException |
				NoSuchFieldException | SecurityException |
				IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
}
