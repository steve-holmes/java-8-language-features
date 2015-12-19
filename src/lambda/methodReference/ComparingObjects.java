package lambda.methodReference;

import java.util.Comparator;
import java.util.List;

import lambda.FunctionUtil;
import lambda.Person;

public class ComparingObjects {

	public static void main(String[] args) {
		List<Person> people = Person.getPersons();
		
		people.sort(Comparator.comparing(Person::getFirstName));
		
		System.out.println("Sorted be the first name:");
		FunctionUtil.forEach(people, System.out::println);
		
		people.sort(Comparator.comparing(Person::getLastName)
				.thenComparing(Person::getFirstName)
				.thenComparing(Person::getDob));
		
		System.out.println("\nSorted by the last name, first name, and dob:");
		FunctionUtil.forEach(people, System.out::println);
	}

}
