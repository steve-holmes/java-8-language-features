package thread;

public class CriticalSection {
	public synchronized void someMethod_1() {}
	
	public void someMethod_11() {
		synchronized(this) {}
	}
	
	public void someMethod_12() {
		// some statements go here
		
		synchronized (this) {}
		
		// some statements go here
	}
	
	public synchronized void someMethod_2() {}
	
	public static void someMethod_21() {
		synchronized(CriticalSection.class) {}
	}
	
	public static void someMethod_22() {
		// some statements go here
		
		synchronized (CriticalSection.class) {}
		
		// some statements go here
	}
}
