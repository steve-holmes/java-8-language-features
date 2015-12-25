package file;

import java.io.File;
import java.io.FileFilter;

public class FilteredFileList {
	public static void main(String[] args) {
		String dirPath = "C:\\";
		File dir = new File(dirPath);
		
		FileFilter filter = file -> {
			if (file.isFile()) {
				String fileName = file.getName().toLowerCase();
				if (fileName.endsWith(".sys")) {
					return false;
				}
			}
			return true;
		};
		
		File[] list = dir.listFiles(filter);
		
		for (File f : list) {
			if (f.isFile()) {
				System.out.println(f.getPath() + " (File)");
			} else if (f.isDirectory()) {
				System.out.println(f.getPath() + " (Directory)");
			}
		}
	}
}
