package dequeinterface.mishra.org;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestArrayDeque {
	public static void main(String args [])
	{
		Deque<String> testArrayDeque = new ArrayDeque<String>();
		
		testArrayDeque.offer("trilokey");
		testArrayDeque.add("shubham");
		testArrayDeque.add("Rahul");
		testArrayDeque.add("Shubham");
		testArrayDeque.add("Tarun");
		testArrayDeque.offer("jack");
		testArrayDeque.offer("trilokey");
		testArrayDeque.offer("meghana");
		testArrayDeque.offerFirst("karan");
		
		for(String obj : testArrayDeque)
		{
		System.out.println(obj);	
		}
	}
	

}
