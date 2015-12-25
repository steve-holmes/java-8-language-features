package thread;

public class WaitMethodCall {
	// Object that is used to synchronize a block
	private Object objectRef = new Object();
	private static String str = "";
	
	public synchronized void someMethod_1() throws InterruptedException {
		// The thread running here has already acquired the monitor lock on
		// the object represented by the reference this because it is a
		// synchronized and non-static method
		
		// other statements go here
		
		while (str.isEmpty()) { // some condition is true
			// It is ok to call the wait() method on this, because the
			// current thread possesses monitor lock on this
			this.wait();
		}
		// other statements go here
		
		if (str.isEmpty()) {
			// Notify all waiting threads
			this.notifyAll();
		}
	}
	
	public static synchronized void someMethod_2() throws InterruptedException {
		// The thread running here has already acquired the monitor lock on
		// the class object represented by the WaitMethodCall.class reference
		// because it is a synchronized and static method
		
		while (str.isEmpty()) { // some condition is true
			// It is ok to call the wait() method on WaitMethodCall.class
			// because the current thread possesses monitor lock on
			// WaitMethodClass.class object
			WaitMethodCall.class.wait();
		}
		// other statements go here
		
		if (str.isEmpty()) {
			// Notify all waiting threads
			WaitMethodCall.class.notifyAll();
		}
	}
	
	public void someMethod_3() throws InterruptedException {
		// other statements go here
		
		synchronized (objectRef) {
			// Currently thread possesses monitor lock of objectRef
			
			while (str.isEmpty()) { // some condition is true
				// It is ok to call the wait() method on objectRef because
				// the current thread possesses monitor lock on objectRef
				objectRef.wait();
			}
			// others statements go here.
			
			if (str.isEmpty()) {
				// Notify all waiting threads
				objectRef.notifyAll();
			}
		}
	}
	
	public void wrongSynchronizationMethod() {
		// This objectRef is created every time a thread calls this method
		Object objectRef = new Object();
		
		// It is a blunder to use objectRef for synchronization below
		synchronized (objectRef) {
			// In fact, this block works as if there is no synchronization, because every
			// thread creates a new objectRef and acquires its monitor lock immediately
		}
	}
}
