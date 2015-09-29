package collections;

import java.util.Random;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class TQProducer extends Thread {
	private final String name;
	private final TransferQueue<Integer> tQueue;
	private final AtomicInteger sequence;
	private Random rand = new Random();
	
	public TQProducer(String name, TransferQueue<Integer> tQueue, AtomicInteger sequence) {
		super();
		this.name = name;
		this.tQueue = tQueue;
		this.sequence = sequence;
	}
	
	@Override
	public void run() {
		while (true) {
			try {
				int sleepTime = rand.nextInt(5) + 1;
				Thread.sleep(sleepTime * 1000);
				
				int nextNum = this.sequence.incrementAndGet();
				
				if (nextNum % 2 == 0) {
					System.out.format("%s: Enqueuing: %d%n", name, nextNum);
					tQueue.put(nextNum);
				} else {
					System.out.format("%s: Handing off: %d%n", name, nextNum);
					System.out.format("%s: has a wating consumer: %b%n", name, tQueue.hasWaitingConsumer());
					tQueue.transfer(nextNum);
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
