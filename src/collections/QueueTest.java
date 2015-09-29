package collections;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class QueueTest {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		
		queue.offer("Richard");
		queue.offer("Donna");
		queue.offer("Ken");
		
		System.out.println("Queue: " + queue);
		
		while (queue.peek() != null) {
			System.out.println("Head Element: " + queue.peek());
			queue.remove();
			System.out.println("Removed on element from Queue");
			System.out.println("Queue: " + queue);
		}
		
		System.out.println("queue.isEmpty(): " + queue.isEmpty());
		System.out.println("queue.peek(): " + queue.peek());
		System.out.println("queue.poll(): " + queue.poll());
		
		try {
			String str = queue.element();
			System.out.println("queue.element(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("queue.element(): Queue is empty.");
		}
		
		try {
			String str = queue.remove();
			System.out.println("queue.remove(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("queue.remove(): Queue is empty.");
		}
	}
}
