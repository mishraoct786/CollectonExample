package setinterface.mishra.org;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashSet {

	public static void main(String args[]) 
	{
		Set<String> hashSet= new HashSet<String>();
		hashSet.add("Shubham");
		hashSet.add("pawan");
		hashSet.add("Rohit");
		
		Iterator <String> tr= hashSet.iterator();
		
		while(tr.hasNext())
		{
			System.out.println(tr.next());
			
		}
		
		
		
	}
}
