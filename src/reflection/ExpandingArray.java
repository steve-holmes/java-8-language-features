package reflection;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExpandingArray {
	public static void main(String[] args) {
		int[] ids = {101, 102};
		
		System.out.println("Old array length: " + ids.length);
		System.out.println("Old array elments: " + Arrays.toString(ids));
		
		ids = (int[]) expandBy(ids, 1);
		
		ids[2] = 103;
		System.out.println("New array length: " + ids.length);
		System.out.println("New array elements: " + Arrays.toString(ids));
	}
	
	public static Object expandBy(Object oldArray, int increment) {
		Object newArray = null;
		
		int oldLength = Array.getLength(oldArray);
		int newLength = oldLength + increment;
		
		Class<?> c = oldArray.getClass();
		
		newArray = Array.newInstance(c.getComponentType(), newLength);
		
		System.arraycopy(oldArray, 0, newArray, 0, oldLength);
		
		return newArray;
	}
}
