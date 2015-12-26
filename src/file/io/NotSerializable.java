package file.io;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class NotSerializable implements Serializable {
	private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
		throw new IOException("Not meant for serialization!!!");
	}
	
	private void writeObject(ObjectOutputStream os) throws IOException {
		throw new IOException("Not meant for serialization!!!");
	}
}
