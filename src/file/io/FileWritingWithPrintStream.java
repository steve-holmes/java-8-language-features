package file.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class FileWritingWithPrintStream {
	public static void main(String[] args) {
		String destFile = "luci3.txt";
		
		try (PrintStream ps = new PrintStream(destFile)) {
			ps.println("Upon the moon I fix'd my eye,");
			ps.println("All over the wide lea;");
			ps.print("Those paths so dear to me.");
			
			ps.flush();
			
			System.out.println("Text has been written to " + (new File(destFile)).getAbsolutePath());
		} catch (FileNotFoundException e) {
			FileUtil.printFileNotFoundMsg(destFile);
		}
	}
}
