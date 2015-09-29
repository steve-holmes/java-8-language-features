package reflection;

public class NewInstanceTest {
	public static void main(String[] args) throws InstantiationException {
		Class<Person> personClass = Person.class;
		
		try {
			Person p = personClass.newInstance();
			System.out.println(p);
		} catch (InstantiationException | IllegalAccessException e) {
			System.out.println(e.getMessage());
		}
	}
}
