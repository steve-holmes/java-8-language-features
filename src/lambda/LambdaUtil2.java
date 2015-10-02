package lambda;

public class LambdaUtil2 {
	public void test(Adder adder) {
		double x = 190.90;
		double y = 8.50;
		double sum = adder.add(x, y);
		System.out.println("Using an Adder:");
		System.out.println(x + " + " + y + " = " + sum);
	}
	
	public void test(Joiner joiner) {
		String s1 = "Hello";
		String s2 = "Word";
		String s3 = joiner.join(s1, s2);
		System.out.println("Using a Joiner:");
		System.out.println("\"" + s1 + "\" + \"" + s2 + "\" = \"" + s3 + "\"");
	}
}
