package setinterface.mishra.org;

import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	public  static void main(String args[])
	{
		Set<String> treeSet=new TreeSet<String>();
		treeSet.add("shubham");
		treeSet.add("sarvwsh");
		treeSet.add("Rohit");
		treeSet.add("Pawan");
		
		for(String obj :treeSet)
		{
			System.out.println("Element in TReeSet:"+obj);
		}
	}
}
