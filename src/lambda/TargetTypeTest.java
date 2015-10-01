package lambda;

public class TargetTypeTest {
	public static void main(String[] args) {
		Adder adder = (x,y) -> x + y;
		Joiner joiner = (x,y) -> x + y;
		
		double sum1 = adder.add(10.34, 89.11);
		double sum2 = adder.add(10, 89);
		
		String str = joiner.join("Hello", " lambda");
		
		System.out.println("sum1 = " + sum1);
		System.out.println("sum2 = " + sum2);
		System.out.println("str = " + str);
	}
}
