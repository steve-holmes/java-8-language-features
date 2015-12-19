package lambda.methodReference;

public class VariableCapture {
	private int counter = 0;
	
	public static void main(String[] args) {
		VariableCapture vc1 = new VariableCapture();
		VariableCapture vc2 = new VariableCapture();
		
		Printer p1 = vc1.createLambda(1);
		Printer p2 = vc2.createLambda(100);
		
		p1.print("Lambda #1");
		p2.print("Lambda #2");
		p1.print("Lambda #1");
		p2.print("Lambda #2");
		p1.print("Lambda #1");
		p2.print("Lambda #2");
	}
	
	public Printer createLambda(int incrementBy) {
		Printer printer = msg -> {
			counter += incrementBy;
			System.out.println(msg + ": counter = " + counter);
		};
		return printer;
	}
}
