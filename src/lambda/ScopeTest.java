package lambda;

public class ScopeTest {
	public static void main(String[] args) {
		ScopeTest test = new ScopeTest();
		Printer lambdaPrinter = test.getLambdaPrinter();
		lambdaPrinter.print("Lambda Expressions");
		
		Printer anonymousPrinter = test.getAnonymousPrinter();
		anonymousPrinter.print("Anonymous Class");
	}
	
	public Printer getLambdaPrinter() {
		System.out.println("getLambdaPrinter(): " + this.getClass());
		
		Printer printer = msg -> {
			System.out.println(msg + ": " + this.getClass());
		};
		
		return printer;
	}
	
	public Printer getAnonymousPrinter() {
		System.out.println("getAnonymousPrinter(): " + this.getClass());
		
		Printer printer = new Printer() {
			@Override
			public void print(String msg) {
				System.out.println(msg + ": " + this.getClass());
			}
		};
		
		return printer;
	}
}
