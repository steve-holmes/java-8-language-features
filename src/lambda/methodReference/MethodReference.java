package lambda.methodReference;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Supplier;

import lambda.FunctionUtil;
import lambda.Person;

public class MethodReference {

	public static void main(String[] args) {
		staticMethodReference();
		instanceMethodReferences();
		supertypeInstanceMethodReferences();
		constructorRefereces();
		genericMethodReferences();
	}
	
	// Static method references
	private static void staticMethodReference() {
		Function<Integer, String> func1 = x -> Integer.toBinaryString(x);
		System.out.println(func1.apply(17));
		
		Function<Integer, String> func2 = Integer::toBinaryString;
		System.out.println(func2.apply(17));
		
		BiFunction<Integer, Integer, Integer> func3 = (x, y) -> Integer.sum(x, y);
		System.out.println(func3.apply(15, 15));
		
		BiFunction<Integer, Integer, Integer> func4 = Integer::sum;
		System.out.println(func4.apply(17,  15));
		
		Function<Integer, Integer> func5 = Integer::valueOf;
		Function<String, Integer> func6 = Integer::valueOf;
		BiFunction<String, Integer, Integer> func7 = Integer::valueOf;
		
		System.out.println(func5.apply(17));
		System.out.println(func6.apply("17"));
		System.out.println(func7.apply("10001", 2));
		
		Supplier<List<Person>> supplier = Person::getPersons;
		List<Person> personList = supplier.get();
		FunctionUtil.forEach(personList,  p -> System.out.println(p));
	}
	
	// Instance Method References
	private static void instanceMethodReferences() {
		
		// Bound receiver
		Consumer<String> consumer = System.out::println;
		consumer.accept("Hello");
		
		List<Person> list = Person.getPersons();
		FunctionUtil.forEach(list, System.out::println);
		
		// Unbound receiver
		Function<String, Integer> strLengthFunc = String::length;
		String name = "Ellen";
		int len = strLengthFunc.apply(name);
		System.out.println("name = " + name + ", length = " + len);
		
		BiFunction<String, String, String> func1 = String::concat;
		System.out.println(func1.apply("Hello", name));
		
		List<String> firstNameList= FunctionUtil.map(list,  Person::getFirstName);
		FunctionUtil.forEach(firstNameList, System.out::println);
	}
	
	// Supertype Instance Method References
	private static void supertypeInstanceMethodReferences() {
		// See the implementation in lambda.methodReference.ItemTest.java
	}
	
	// Constructor References
	private static void constructorRefereces() {
		Supplier<Item> func1 = () -> new Item();
		Function<String, Item> func2 = name -> new Item(name);
		BiFunction<String, Double, Item> func3 = (name, price) -> new Item(name, price);
		
		System.out.println(func1.get());
		System.out.println(func2.apply("Apple"));
		System.out.println(func3.apply("Apple", 0.75));
		
		func1 = Item::new;
		func2 = Item::new;
		func3 = Item::new;
		
		System.out.println(func1.get());
		System.out.println(func2.apply("Apple"));
		System.out.println(func3.apply("Apple", 0.75));
		
		// Array constructors
		IntFunction<int[]> arrayCreator1 = size -> new int[size];
		int[] empIds1 = arrayCreator1.apply(5);
		
		IntFunction<int[]> arrayCreator2 = int[]::new;
		int[] empIds2 = arrayCreator2.apply(5);
	}
	
	// Generic Method References
	private static void genericMethodReferences() {
		String[] namesArray = {"Jim", "Ken", "Li"};
		Function<String[], List<String>> asList = Arrays::<String>asList;
		List<String> namesList = asList.apply(namesArray);
		for (String name : namesList) {
			System.out.println(name);
		}
	}

}
