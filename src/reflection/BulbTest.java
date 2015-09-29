package reflection;

public class BulbTest {
	public static void main(String[] args) {
		BulbTest.createObject();
//		BulbTest.forName();
//		BulbTest.forNameVersion2();
//		BulbTest.classLiteral();
	}
	
	public static void classLiteral() {
		Class<Bulb> c = Bulb.class;
	}
	
	public static void forNameVersion2() {
		try {
			String className = "reflection.Bulb";
			boolean initialize = false;
			ClassLoader cLoader = BulbTest.class.getClassLoader();
			Class c = Class.forName(className, initialize, cLoader);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void forName() {
		try {
			String className = "reflection.Bulb";
			Class c = Class.forName(className);
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void createObject() {
		new Bulb();
	}
}
