package collections;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BQProducerConsumerTest {
	public static void main(String[] args) {
		int capacity = 5;
		boolean fair = true;
		BlockingQueue<String> queue = new ArrayBlockingQueue<>(capacity, fair);
		
		new BQProducer(queue, "Producer1").start();
		new BQConsumer(queue, "Consumer1").start();
		new BQConsumer(queue, "Consumer2").start();
	}
}
