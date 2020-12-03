package Session3;

import java.util.LinkedList;
import java.util.Queue;

public class Acitvity3_3A {

	public static void main(String[] args) {
	Queue<Integer> namesQueue = new LinkedList<>();
	namesQueue.add(1);
	namesQueue.add(2);
	namesQueue.add(3);
	namesQueue.add(4);
	namesQueue.add(5);
	
	System.out.println("queue"+namesQueue);
	
	System.out.println("removed element"+namesQueue.remove());
	System.out.println("head of the queue"+namesQueue.peek());
	System.out.println("size of the queue"+namesQueue.size());
	System.out.println("queue"+namesQueue);
	}
	
}
