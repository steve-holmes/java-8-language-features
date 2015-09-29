package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

public class FieldReflection {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		
		ArrayList<String> fieldsDescription = getDeclaredFieldsList(c);
		
		System.out.println("Declared Fields for " + c.getName());
		for (String desc: fieldsDescription) {
			System.out.println(desc);
		}
		
		fieldsDescription = getFieldsList(c);
		
		System.out.println("\nAccessible Fields for " + c.getName());
		for (String desc : fieldsDescription) {
			System.out.println(desc);
		}
	}
	
	public static ArrayList<String> getFieldsList(Class c) {
		Field[] fields = c.getFields();
		ArrayList<String> fieldsList = getFieldsDescription(fields);
		return fieldsList;
	}
	
	public static ArrayList<String> getDeclaredFieldsList(Class c) {
		Field[] fields = c.getDeclaredFields();
		ArrayList<String> fieldsList = getFieldsDescription(fields);
		return fieldsList;
	}
	
	public static ArrayList<String> getFieldsDescription(Field[] fields) {
		ArrayList<String> fieldList = new ArrayList<>();
		
		for (Field f: fields) {
			int mod = f.getModifiers() & Modifier.fieldModifiers();
			String modifers = Modifier.toString(mod);
			
			Class<?> type = f.getType();
			String typeName = type.getSimpleName();
			
			String fieldName = f.getName();
			
			fieldList.add(modifers + " " + typeName + " " + fieldName);
		}
		
		return fieldList;
	}
}
