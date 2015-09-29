package reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class MethodReflection {
	public static void main(String[] args) {
		Class<Person> c = Person.class;
		
		ArrayList<String> methodsDescription = getDeclaredMethodList(c);
		System.out.println("Declared Methods for " + c.getName());
		for (String desc: methodsDescription) {
			System.out.println(desc);
		}
		
		methodsDescription = getMethodsList(c);
		System.out.println("\nMethods for " + c.getName());
		for (String desc: methodsDescription) {
			System.out.println(desc);
		}
	}
	
	public static ArrayList<String> getMethodsList(Class c) {
		Method[] methods = c.getMethods();
		ArrayList<String> methodsList = getMethodsDescription(methods);
		return methodsList;
	}
	
	public static ArrayList<String> getDeclaredMethodList(Class c) {
		Method[] methods = c.getDeclaredMethods();
		ArrayList<String> methodsList = getMethodsDescription(methods);
		return methodsList;
	}
	
	public static ArrayList<String> getMethodsDescription(Method[] methods) {
		ArrayList<String> methodList = new ArrayList<>();
		
		for (Method m : methods) {
			String modifiers = ExecutableUtil.getModifiers(m);
			
			Class returnType = m.getReturnType();
			String returnTypeName = returnType.getSimpleName();
			
			String methodName = m.getName();
			
			ArrayList<String> paramsList = ExecutableUtil.getParameters(m);
			String params = ExecutableUtil.arrayListToString(paramsList, ",");
			
			String throwsClause = ExecutableUtil.getThrowsClause(m);
			
			methodList.add(modifiers + " " + returnTypeName + " " +
						methodName + "(" + params + ")" + throwsClause);
		}
		return methodList;
	}
}
