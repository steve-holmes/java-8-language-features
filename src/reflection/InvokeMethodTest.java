package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InvokeMethodTest {
	public static void main(String[] args) {
		Class<Person> personClass = Person.class;
		
		try {
			Person p = personClass.newInstance();
			System.out.println(p);
			
			Method setName = personClass.getMethod("setName", String.class);
			setName.invoke(p, "Ann");
			System.out.println(p);
		} catch (InstantiationException | IllegalAccessException |
				NoSuchMethodException | SecurityException |
				IllegalArgumentException | InvocationTargetException e) {
			System.out.println(e.getMessage());
		}
	}
}
