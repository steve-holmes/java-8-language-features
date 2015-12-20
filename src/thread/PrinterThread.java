package thread;

public class PrinterThread {
	public static void main(String[] args) {
		Thread t = new Thread(PrinterThread::print);
		t.start();
	}
	
	public static void print() {
		for (int i = 1; i <= 500; i++) {
			System.out.print(i + " ");
		}
	}
}
