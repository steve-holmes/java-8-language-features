package reflection;

import java.lang.reflect.Constructor;
import java.util.ArrayList;

public class ConstructorReflection {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		
		System.out.println("Constructors for " + c.getName());
		Constructor[] constructors = c.getConstructors();
		ArrayList<String> constructDescList = getConstructorsDescription(constructors);
		for (String desc: constructDescList) {
			System.out.println(desc);
		}
	}
	
	public static ArrayList<String> getConstructorsDescription(Constructor[] constructors) {
		ArrayList<String> constructorList = new ArrayList<>();
		for (Constructor constructor : constructors) {
			String modifers = ExecutableUtil.getModifiers(constructor);
			String constructorName = constructor.getName();
			
			ArrayList<String> paramsList = ExecutableUtil.getParameters(constructor);
			String params = ExecutableUtil.arrayListToString(paramsList, ",");
			
			String throwsClause = ExecutableUtil.getThrowsClause(constructor);
			
			constructorList.add(modifers + " " + constructorName +
					"(" + params + ")" + throwsClause);
		}
		return constructorList;
	}
}
