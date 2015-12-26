package file.io;

import java.io.IOException;
import java.io.OutputStream;

public class DummyStandardOutput extends OutputStream {
	public void write(int b) throws IOException {
		// Do not anything. Swallow whatever is written
	}
}
