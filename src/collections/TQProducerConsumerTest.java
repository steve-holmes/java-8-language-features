package collections;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class TQProducerConsumerTest {
	public static void main(String[] args) {
		final TransferQueue<Integer> tQueue = new LinkedTransferQueue<>();
		final AtomicInteger sequence = new AtomicInteger();
		
		for (int i = 0; i < 5; i++) {
			try {
				tQueue.put(sequence.incrementAndGet());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("Initial queue: " + tQueue);
		
		new TQProducer("Producer-1", tQueue, sequence).start();
		new TQConsumer("Consumer-1", tQueue).start();
	}
}
