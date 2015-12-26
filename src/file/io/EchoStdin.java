package file.io;

import java.io.IOException;

public class EchoStdin {
	public static void main(String[] args) throws IOException {
		System.out.print("Please type a message and press enter: ");
		
		int c = '\n';
		while ((c = System.in.read()) != '\n') {
			System.out.print((char)c);
		}
	}
}
