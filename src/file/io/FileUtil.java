package file.io;

import java.io.Closeable;
import java.io.IOException;

public class FileUtil {
	public static void printFileNotFoundMsg(String fileName) {
		String workingDir = System.getProperty("user.dir");
		System.out.println("Could not find the file '" + fileName + "' in '" + workingDir + "' directory ");
	}
	
	public static void close(Closeable resource) {
		if (resource != null) {
			try {
				resource.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
