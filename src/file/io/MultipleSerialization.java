package file.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MultipleSerialization {
	public static void main(String[] args) {
		String fileName = "mutableperson.ser";
		
		serialize(fileName);
		System.out.println("--------------------------");
		deserialize(fileName);
	}
	
	public static void serialize(String fileName) {
		MutablePerson john = new MutablePerson("John", "Male", 6.7);
		
		File fileObject = new File(fileName);
		
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileObject))) {
			System.out.println("Objects are written to " + fileObject.getAbsolutePath());
			
			oos.writeObject(john);
			System.out.println(john);
			
			john.setName("John Jacobs");
			john.setHeight(6.9);
			
			oos.writeObject(john);
			System.out.println(john);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void deserialize(String fileName) {
		File fileObject = new File(fileName);
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileObject))) {
			MutablePerson john1 = (MutablePerson) ois.readObject();
			MutablePerson john2=  (MutablePerson) ois.readObject();
			
			System.out.println("Objects are read from " + fileObject.getAbsolutePath());
			
			System.out.println(john1);
			System.out.println(john2);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
