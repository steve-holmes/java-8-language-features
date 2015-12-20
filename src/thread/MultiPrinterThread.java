package thread;

public class MultiPrinterThread {
	public static void main(String[] args) {
		Thread t1 = new Thread(MultiPrinterThread::print);
		Thread t2 = new Thread(MultiPrinterThread::print);
		
		t1.start();
		t2.start();
	}
	
	public static void print() {
		for (int i = 1; i <= 500; i++) {
			System.out.println(i);
		}
	}
}
