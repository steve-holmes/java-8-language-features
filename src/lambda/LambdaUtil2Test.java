package lambda;

public class LambdaUtil2Test {
	public static void main(String[] args) {
		LambdaUtil2 util = new LambdaUtil2();
		
		util.test((double x, double y) -> x + y);
		util.test((String x, String y) -> x + y);
		util.test((Joiner)(x, y) -> x + " " + y);
		
		util.test((Joiner)(x, y) -> {
			StringBuilder sbx = new StringBuilder(x);
			StringBuilder sby = new StringBuilder(y);
			sby.reverse().append(",").append(sbx.reverse());
			return sby.toString();
		});
	}
}
