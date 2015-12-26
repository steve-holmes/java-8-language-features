package archive;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipUtility {
	public static void main(String[] args) {
		String zipFileName = "ziptest.zip";
		String[] entries = new String[2];
		entries[0] = "test1.txt";
		entries[1] = "notes" + File.separator + "test2.txt";
		zip(zipFileName, entries);
	}
	
	public static void zip(String zipFileName, String[] zipEntries) {
		String currentDirectory = System.getProperty("user.dir");
		
		try (ZipOutputStream zos = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(zipFileName)))) {
			zos.setLevel(Deflater.BEST_COMPRESSION);
			
			for (int i = 0; i < zipEntries.length; i++) {
				File entryFile = new File(zipEntries[i]);
				if (!entryFile.exists()) {
					System.out.println("The entry file " + entryFile.getAbsolutePath() + " does not exist");
					System.out.println("Aborted processing.");
					return;
				}
				
				ZipEntry ze = new ZipEntry(zipEntries[i]);
				
				zos.putNextEntry(ze);
				
				addEntryContent(zos, zipEntries[i]);
				
				zos.closeEntry();
			}
			
			System.out.println("Output has been written to " + currentDirectory + File.separator + zipFileName);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void addEntryContent(ZipOutputStream zos, String entryFileName) throws IOException, FileNotFoundException {
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream(entryFileName));
		
		byte[] buffer = new byte[1024];
		int count = -1;
		while ((count = bis.read(buffer)) != -1) {
			zos.write(buffer, 0, count);
		}
		bis.close();
	}
}
