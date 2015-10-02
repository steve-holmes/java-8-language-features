package lambda;

import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
	public static void main(String[] args) {
		testFunction();
		testChainFunction();
		testPredicate();
	}
	
	public static void testFunction() {
		System.out.println("Function<T,R>:");
		
		Function<Long, Long> square = x -> x * x;
		Function<Long, Long> addOne = x -> x + 1;
		
		Function<Long, Long> squareAddOne = square.andThen(addOne);
		Function<Long, Long> addOneSquare = square.compose(addOne);
		
		Function <Long, Long> identity = Function.<Long>identity();
		
		long num = 5L;
		System.out.println("Number: " + num);
		System.out.println("Square and then add one: " + squareAddOne.apply(num));
		System.out.println("Add one and then square: " + addOneSquare.apply(num));
		System.out.println("Identity: " + identity.apply(num));
		
		System.err.println();
	}
	
	public static void testChainFunction () {
		System.out.println("Chanied Function:");
		
		Function<Long, Long> chaniedFunction = ((Function<Long, Long>)(x -> x * x))
												.andThen(x -> x + 1)
												.andThen(x -> x * x);
		System.out.println(chaniedFunction.apply(3L));
		
		System.out.println();
	}
	
	public static void testPredicate() {
		System.out.println("Predicate<Integer>:");
		
		Predicate<Integer> greaterThanTen = x -> x > 10;
		Predicate<Integer> divisibleByThree = x -> x % 3 == 0;
		Predicate<Integer> divisibleByFive = x -> x % 5 == 0;
		Predicate<Integer> equalToTen = Predicate.isEqual(null);
		
		Predicate<Integer> lessThanOrEqualToTen = greaterThanTen.negate();
		Predicate<Integer> divisibleByThreeAndFive = divisibleByThree.and(divisibleByFive);
		Predicate<Integer> divisibleByThreeOrFive = divisibleByThree.or(divisibleByFive);
		
		int num = 10;
		System.out.println("Number: " + num);
		System.out.println("greaterThanTen: " + greaterThanTen.test(num));
		System.out.println("divisibleByThree: " + divisibleByThree.test(num));
		System.out.println("divisibleByFive: " + divisibleByFive.test(num));
		System.out.println("lessThanOrEqualToTen: " + lessThanOrEqualToTen.test(num));
		System.out.println("divisibleByThreeAndFive: " + divisibleByThreeAndFive.test(num));
		System.out.println("divisbileByThreeOrFile: " + divisibleByThreeOrFive.test(num));
		System.out.println("equalsToTen: " + equalToTen.test(num));
		
		System.out.println();
	}
}
