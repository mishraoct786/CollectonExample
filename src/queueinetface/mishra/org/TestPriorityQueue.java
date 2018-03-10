package queueinetface.mishra.org;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class TestPriorityQueue {
	
	public static void main(String args[])
	{
		Queue <String > testPriorityQueue = new PriorityQueue<String>();
		testPriorityQueue.add("shubham");
		testPriorityQueue.add("Rahul");
		testPriorityQueue.add("vikash");
		testPriorityQueue.add("sonu");
		testPriorityQueue.add("hanuman");
		Iterator<String> itr= testPriorityQueue.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		System.out.println("printing first element :"+testPriorityQueue.peek());
		System.out.println("Remove the first Element:" +testPriorityQueue.poll());
		System.out.println("head:"+testPriorityQueue.element());  
	}

}
