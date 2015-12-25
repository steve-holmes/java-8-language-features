package thread;

public class ThreadPriority {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("main Thread Priority:" + t.getPriority());
		
		Thread t1 = new Thread();
		System.out.println("Thread(t1) Priority:" + t1.getPriority());
		
		t.setPriority(Thread.MAX_PRIORITY);
		System.out.println("main Thread Priority:" + t.getPriority());
		
		Thread t2 = new Thread();
		System.out.println("Thread(t2) Priority:" + t2.getPriority());
		
		t2.setPriority(Thread.MIN_PRIORITY);
		System.out.println("Thread(t2) Priority:" + t2.getPriority());
	}
}
