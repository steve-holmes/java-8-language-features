package thread;

public class NonDaemonThread {
	public static void main(String[] args) {
		Thread t = new Thread(DaemonThread::print);
		t.setDaemon(false);
		t.start();
		System.out.println("Exiting main method");
	}
	
	public static void print() {
		int counter = 1;
		while (true) {
			try {
				System.out.println("Counter:" + counter++);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
