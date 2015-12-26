package archive;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class UnzipUtility {
	public static void main(String[] args) {
		String zipFileName = "ziptest.zip";
		String unzipDirectory = "extracted";
		unzip(zipFileName, unzipDirectory);
	}
	
	public static void unzip(String zipFileName, String unzipDir) {
		try (ZipInputStream zis = new ZipInputStream(new BufferedInputStream(new FileInputStream(zipFileName)))) {
			ZipEntry entry = null;
			while ((entry = zis.getNextEntry()) != null) {
				extractEntryContent(zis, entry, unzipDir);
			}
			
			System.out.println("ZIP file's contents have been extracted to " + (new File(unzipDir)).getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void extractEntryContent(ZipInputStream zis, ZipEntry entry, String unzipDir) throws IOException, FileNotFoundException {
		String entryFileName = entry.getName();
		String entryPath = unzipDir + File.separator + entryFileName;
		
		createFile(entryPath);
		
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(entryPath));
		
		byte[] buffer = new byte[1024];
		int count = -1;
		while ((count = zis.read(buffer)) != -1) {
			bos.write(buffer, 0, count);
		}
		bos.close();
	}
	
	public static void createFile(String filePath) throws IOException {
		File file = new File(filePath);
		File parent = file.getParentFile();
		
		if (!parent.exists()) {
			parent.mkdirs();
		}
		file.createNewFile();
	}
}
