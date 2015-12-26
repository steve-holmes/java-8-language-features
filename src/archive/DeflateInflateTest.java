package archive;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;

public class DeflateInflateTest {
	public static void main(String[] args) throws Exception {
		String input = "Hello world!";
		byte[] uncompressedData = input.getBytes("UTF-8");
		
		byte[] compressedData = compress(uncompressedData, Deflater.BEST_COMPRESSION, false);
		
		byte[] decompressedData = decompress(compressedData, false);
		
		String output = new String(decompressedData, "UTF-8");
		
		System.out.println("Input String: " + input);
		System.out.println("Uncompressed data length: " + uncompressedData.length);
		System.out.println("Compressed data length: " + compressedData.length);
		System.out.println("Decompressed data length: " + decompressedData.length);
		System.out.println("Output String: " + output);
	}
	
	public static byte[] compress(byte[] input, int compressionLevel, boolean GZIPFormat) throws IOException {
		Deflater compressor = new Deflater(compressionLevel, GZIPFormat);
		
		compressor.setInput(input);
		
		compressor.finish();
		
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		byte[] readBuffer = new byte[1024];
		int readCount = 0;
		
		while (!compressor.finished()) {
			readCount = compressor.deflate(readBuffer);
			if (readCount > 0) {
				bao.write(readBuffer, 0, readCount);
			}
		}
		
		compressor.end();
		
		return bao.toByteArray();
	}
	
	public static byte[] decompress(byte[] input, boolean GZIPFormat) throws IOException, DataFormatException {
		Inflater decompressor = new Inflater(GZIPFormat);
		
		decompressor.setInput(input);
		
		ByteArrayOutputStream bao = new ByteArrayOutputStream();
		byte[] readBuffer = new byte[1024];
		int readCount = 0;
		
		while (!decompressor.finished()) {
			readCount = decompressor.inflate(readBuffer);
			if (readCount > 0) {
				bao.write(readBuffer, 0, readCount);
			}
		}
		
		decompressor.end();
		
		return bao.toByteArray();
	}
}
