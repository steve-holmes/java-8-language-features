package lambda.methodReference;

import java.util.function.IntFunction;

public class RecursiveTest {
	public static void main(String[] args) {
		IntFunction<Long> factorialCalc = new IntFunction<Long>() {

			@Override
			public Long apply(int value) {
				if (value < 0) {
					String msg = "Number must not be negative.";
					throw new IllegalArgumentException(msg);
				}
				
				if (value == 0) {
					return 1l;
				} else {
					return value * this.apply(value - 1);
				}
			}
			
		};
		
		int n = 5;
		long fact = factorialCalc.apply(5);
		System.out.println("Factorial of " + n + " is " + fact);
	}
}
