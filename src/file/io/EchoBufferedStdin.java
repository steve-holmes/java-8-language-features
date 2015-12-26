package file.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EchoBufferedStdin {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String text = "q";
		while (true) {
			System.out.print("Please type a message (Q/q to quit) and press enter: ");
			
			text = br.readLine();
			if (text.equalsIgnoreCase("q")) {
				System.out.println("You have decided to exit the program");
				break;
			} else {
				System.out.println("You typed: " + text);
			}
		}
	}
}
