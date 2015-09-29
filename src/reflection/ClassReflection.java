package reflection;

import java.lang.reflect.Modifier;
import java.lang.reflect.TypeVariable;

public class ClassReflection {
	public static void main(String[] args) {
		String classDescription = getClassDescription(Person.class);
		System.out.println(classDescription);
	}
	
	public static String getClassDescription(Class c) {
		StringBuilder classDesc = new StringBuilder();
		
		int modifierBits = 0;
		String keyword = "";
		
		if (c.isPrimitive()) {
			
		} else if (c.isInterface()) {
			modifierBits = c.getModifiers() & Modifier.interfaceModifiers();
			
			if (c.isAnnotation()) {
				keyword = "@interface";
			} else {
				keyword = "interface";
			}
		} else if (c.isEnum()) {
			modifierBits = c.getModifiers() & Modifier.classModifiers();
			keyword = "enum";
		} else {
			modifierBits = c.getModifiers() & Modifier.classModifiers();
			keyword = "class";
		}
		
		String modifiers = Modifier.toString(modifierBits);
		classDesc.append(modifiers);
		classDesc.append(" " + keyword);
		
		String simpleName = c.getSimpleName();
		classDesc.append(" " + simpleName);
		
		String genericParms = getGenericTypeParams(c);
		classDesc.append(genericParms);
		
		Class superClass = c.getSuperclass();
		if (superClass != null) {
			String superClassSimpleName = superClass.getSimpleName();
			classDesc.append(" extends " + superClassSimpleName);
		}
		
		String interfaces = ClassReflection.getClassInterfaces(c);
		if (interfaces != null) {
			classDesc.append(" implements " + interfaces);
		}
		
		return classDesc.toString();
	}
	
	public static String getClassInterfaces(Class c) {
		Class[] interfaces = c.getInterfaces();
		String interfacesList = null;
		if (interfaces.length > 0) {
			String[] interfaceNames = new String[interfaces.length];
			for (int i = 0; i < interfaces.length; i++) {
				interfaceNames[i] = interfaces[i].getSimpleName();
			}
			interfacesList = String.join(",", interfaceNames);
		}
		return interfacesList;
	}
	
	public static String getGenericTypeParams(Class c) {
		StringBuilder sb = new StringBuilder();
		TypeVariable<?>[] typeParms = c.getTypeParameters();
		
		if (typeParms.length > 0) {
			String[] paramNames = new String[typeParms.length];
			for (int i = 0; i < typeParms.length; i++) {
				paramNames[i] = typeParms[i].getTypeName();
			}
			
			sb.append('<');
			String parmsList = String.join(",", paramNames);
			sb.append(parmsList);
			sb.append('>');
		}
		return sb.toString();
	}
}
