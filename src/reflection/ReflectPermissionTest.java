package reflection;

import java.lang.reflect.ReflectPermission;

public class ReflectPermissionTest {
	public static void main(String[] args) {
		try {
			ReflectPermission rp = new ReflectPermission("suppressAccessChecks");
			
			rp.checkGuard(null);
			System.out.println("Reflect permission is granted");
		} catch (SecurityException e) {
			System.out.println("Reflect permission is not granted");
		}
	}
}
