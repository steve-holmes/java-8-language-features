package file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonExtDeserializationTest {
	public static void main(String[] args) {
		File fileObject = new File("personext.ser");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))) {
			PersonExt john = (PersonExt) ois.readObject();
			PersonExt wally = (PersonExt) ois.readObject();
			PersonExt katrina = (PersonExt) ois.readObject();
			
			System.out.println(john);
			System.out.println(wally);
			System.out.println(katrina);
			
			System.out.println("Objects were read form " + fileObject.getAbsolutePath());
		} catch (FileNotFoundException e) {
			FileUtil.printFileNotFoundMsg(fileObject.getPath());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
