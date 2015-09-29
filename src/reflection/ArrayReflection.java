package reflection;

import java.lang.reflect.Array;

public class ArrayReflection {
	public static void main(String[] args) {
		try {
			Object arrayObject = Array.newInstance(int.class, 2);
			
			int n1 = Array.getInt(arrayObject, 0);
			int n2 = Array.getInt(arrayObject, 1);
			System.out.println("n1 = " + n1 + ", n2 = " + n2);
			
			Array.set(arrayObject, 0, 101);
			Array.set(arrayObject, 1, 102);
			
			n1 = Array.getInt(arrayObject, 0);
			n2 = Array.getInt(arrayObject, 1);
			System.out.println("n1 = " + n1 + ", n2 = " + n2);
		} catch (NegativeArraySizeException | IllegalArgumentException |
				ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
	}
}
