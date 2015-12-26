package file.io;

import java.io.PrintStream;

public class SwallowOutput {
	public static void main(String[] args) {
		PrintStream ps = new PrintStream(new DummyStandardOutput());
		
		System.setOut(ps);
		
		System.out.println("Hello world!");
		System.out.println("Is someone listening?");
		System.out.println("No. We are all talking a nap!!");
	}
}
