package file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PersonDeserializationTest {
	public static void main(String[] args) {
		File fileObject = new File("person.ser");
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))) {
			Person john = (Person)ois.readObject();
			Person wally = (Person)ois.readObject();
			Person katrina = (Person)ois.readObject();
			
			System.out.println(john);
			System.out.println(wally);
			System.out.println(katrina);
			
			System.out.println("Objects were read from " + fileObject.getAbsolutePath());
		} catch (FileNotFoundException e) {
			FileUtil.printFileNotFoundMsg(fileObject.getPath());
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		}
	}
}
