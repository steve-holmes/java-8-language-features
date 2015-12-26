package file.io;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		String msg = "You can evaluate an arithmetic expressing.\n"
				+ "Expression must be in the form: a op b\n"
				+ "a and b are two numbers and op is +, -, * or /."
				+ "\nPlease enter an expression and press Enter";
		System.out.println(msg);
		
		Scanner scanner = new Scanner(System.in);
		double n1 = Double.NaN;
		double n2 = Double.NaN;
		String operation = null;
		
		try {
			n1 = scanner.nextDouble();
			operation = scanner.next();
			n2 = scanner.nextDouble();
			
			double result = calculate(n1, n2, operation);
			System.out.printf("%s %s %s = %.2f%n", n1, operation, n2, result);
		} catch (Exception e) {
			System.out.println("An invalid expression.");
		}
	}
	
	public static double calculate(double op1, double op2, String operation) {
		switch (operation) {
		case "+":
			return op1 + op2;
		case "-":
			return op1 - op2;
		case "*":
			return op1 * op2;
		case "/":
			return op1 / op2;
		}
		
		return Double.NaN;
	}
}
