package file.io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritingWIthWriter {
	public static void main(String[] args) {
		String destFile = "luci4.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(destFile))) {
			bw.append("And now we reach'd the orchard-plot;");
			bw.newLine();
			bw.append("And, as we climb'd the hill,");
			bw.newLine();
			bw.append("Teh sinking moon to Lucy's cot");
			bw.newLine();
			bw.append("Came near and nearer still.");
			
			bw.flush();
			
			System.out.println("Text was written to " + (new File(destFile)).getAbsolutePath());
		} catch (FileNotFoundException e) {
			FileUtil.printFileNotFoundMsg(destFile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
