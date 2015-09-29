package collections;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class BQConsumer extends Thread {
	private final BlockingQueue<String> queue;
	private final String name;
	private final Random random = new Random();
	
	public BQConsumer(BlockingQueue<String> queue, String name) {
		this.queue = queue;
		this.name = name;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				System.out.println(name + " is trying to take an element. Remaining capacity: " + queue.remainingCapacity());
				
				String str = this.queue.take();
				System.out.println(name + " took: " + str);
				
				int sleepTime = (random.nextInt(5) + 1) * 1000;
				Thread.sleep(sleepTime);
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}
		}
	}
}
