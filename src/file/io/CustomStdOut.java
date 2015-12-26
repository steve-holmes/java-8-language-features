package file.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class CustomStdOut {
	public static void main(String[] args) throws Exception {
		File outFile = new File("stdout.txt");
		PrintStream ps = new PrintStream(new FileOutputStream(outFile));
		
		System.out.println("Messages will be redirected to " + outFile.getAbsolutePath());
		
		System.setOut(ps);
		
		System.out.println("Hello world!");
		System.out.println("Java I/O is cool!");
	}
}
