package file.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class PersonExtSerializationTest {
	public static void main(String[] args) {
		PersonExt john = new PersonExt("John", "Male", 6.7);
		PersonExt wally = new PersonExt("Wally", "Male", 5.7);
		PersonExt katrina = new PersonExt("Katrina", "Female", 5.4);
		
		File fileObject = new File("personext.ser");
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {
			oos.writeObject(john);
			oos.writeObject(wally);
			oos.writeObject(katrina);
			
			System.out.println(john);
			System.out.println(wally);
			System.out.println(katrina);
			
			System.out.println("Objects were written to " + fileObject.getAbsolutePath());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
