package collections;

import java.util.Deque;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class DequeAsQueue {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<>();
		deque.addLast("John");
		deque.offerLast("Richard");
		deque.offerLast("Donna");
		deque.offerLast("Ken");
		
		System.out.println("Deque: " + deque);
		
		while (deque.peekFirst() != null) {
			System.out.println("Head Element: " + deque.peekFirst());
			deque.removeFirst();
			System.out.println("Removed one element from Deque");
			System.out.println("Deque: " + deque);
		}
		
		System.out.println("deque.isEmpty(): " + deque.isEmpty());
		System.out.println("deque.peekFirst(): " + deque.peekFirst());
		System.out.println("deque.pollFirst(): " + deque.pollFirst());
		
		try {
			String str = deque.getFirst();
			System.out.println("deque.getFirst(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("deque.getFirst(): Deque is empty.");
		}
		
		try {
			String str = deque.removeFirst();
			System.out.println("deque.removeFirst(): " + str);
		} catch (NoSuchElementException e) {
			System.out.println("deque.removeFirst(): Deque is empty.");
		}
	}
}
