package firstCrawler;
import java.util.*;


public class Queue {
	private LinkedList queue=new LinkedList();
	public void enQueue(Object t){
		queue.addLast(t);
	}
	public Object deQueue(){
		return queue.removeFirst();
	}
	public boolean isQueueEmpty(){
		return queue.isEmpty();
	}
	public boolean elemContains(Object t){
		return queue.contains(t);
	}
	public boolean empty(){
		return queue.isEmpty();
	}
}
