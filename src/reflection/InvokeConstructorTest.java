package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class InvokeConstructorTest {
	public static void main(String[] args) {
		Class<Person> personClass = Person.class;
		
		try {
			Constructor<Person> cons = personClass.getConstructor(int.class, String.class);
			
			Person chris = cons.newInstance(1994, "Chris");
			System.out.println(chris);
		} catch (NoSuchMethodException | SecurityException |
				InstantiationException | IllegalAccessException |
				IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
	}
}
