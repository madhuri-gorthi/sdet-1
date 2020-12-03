package Session3;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class Activity3_3B {

	public static void main(String[] args) {
		Deque<String> dq = new LinkedList<String>();
		dq.add("tiger");
		dq.add("lion");
		dq.add("wolf");
		dq.offer("monkey");
		dq.addLast("donkey");
		dq.offerFirst("dog");
		Iterator<String> itr = dq.iterator();
		while(itr.hasNext()) {
		System.out.println("animals "+itr.next());
		}		
        System.out.println("Peek: " + dq.peekFirst());    	
        System.out.println("Peek: " + dq.peekLast());
	
      
        System.out.println("After peek: " + dq);
		System.out.println("queue contains wolf "+dq.contains("wolf"));
		dq.removeFirst();
		dq.removeLast();
		System.out.println("dq size"+dq.size());
		
	}

}
