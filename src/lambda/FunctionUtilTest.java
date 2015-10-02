package lambda;

import java.util.List;

import static lambda.Gender.MALE;

public class FunctionUtilTest {
	public static void main(String[] args) {
		List<Person> list = Person.getPersons();
		
		System.out.println("Original list of persons:");
		FunctionUtil.forEach(list, p -> System.out.println(p));
		
		List<Person> maleList = FunctionUtil.filter(list, p -> p.getGender() == MALE);
		
		System.out.println("\nMales only:");
		FunctionUtil.forEach(maleList, p -> System.out.println(p));
		
		List<Integer> dobYearList = FunctionUtil.map(list, p -> p.getDob().getYear());
		
		System.out.println("\nPersons mapped to year of their birth:");
		FunctionUtil.forEach(dobYearList, year -> System.out.println(year));
		
		FunctionUtil.forEach(maleList, p -> p.setDob(p.getDob().plusYears(1)));
		
		System.out.println("\nMales only after adding 1 year to DOB:");
		FunctionUtil.forEach(maleList, p -> System.out.println(p));
	}
}
