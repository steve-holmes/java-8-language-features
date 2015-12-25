package thread;

public class MultiLocks {
	public synchronized void method_1() {
		// some statements go here
		
		// There is one monitor, but it was locked twice.
		this.method_2();
		
		// some statements go here
	}
	
	public synchronized void method_11() {
		// some statements go here
		
		// There are 2 monitors: this and MultiLocks.class
		this.method_2();
		MultiLocks.method_3();
		
		// some statements go here
	}
	
	public synchronized void method_2() {
		// some statements go here
	}
	
	public static synchronized void method_3() {
		// some statements go here
		
		// There is one monitor, but it was locked twice.
		MultiLocks.method_4();
		
		// some statements go here
	}
	
	public static synchronized void method_4() {
		// some statements go here
	}
}
