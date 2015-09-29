package collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeAsStack {
	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<>();
		deque.push("John");
		deque.push("Richard");
		deque.push("Donna");
		deque.push("Ken");
		
		System.out.println("Stack: " + deque);
		
		while (deque.peek() != null) {
			System.out.println("Element at top: " + deque.peek());
			System.out.println("Popped: " + deque.pop());
			System.out.println("Stack: " + deque);
		}
		
		System.out.println("Stack is empty: " + deque.isEmpty());
	}
}
