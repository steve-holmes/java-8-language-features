package file;

import java.io.File;

public class FileLists {
	public static void main(String[] args) {
		String dirPath = "C:\\";
		
		File dir = new File(dirPath);
		File[] list = dir.listFiles();
		
		for (File f : list) {
			if (f.isFile()) {
				System.out.println(f.getPath() + " (File)");
			} else if (f.isDirectory()) {
				System.out.println(f.getPath() + " (Directory)");
			}
		}
	}
}
