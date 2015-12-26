package file.io;

import java.io.FilterReader;
import java.io.IOException;
import java.io.Reader;

public class LowerCaseReader extends FilterReader {
	public LowerCaseReader(Reader in) {
		super(in);
	}
	
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		int count = super.read(cbuf, off, len);
		if (count != -1) {
			int limit = off + count;
			for (int i = off; i < limit; i++) {
				cbuf[i] = Character.toLowerCase(cbuf[i]);
			}
		}
		return count;
	}
}
