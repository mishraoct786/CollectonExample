package setinterface.mishra.org;

import java.util.LinkedHashSet;
import java.util.Set;

public class TestLinkedHashSet {
public static void main(String args[])
{
	Set <String> linkedHashSet = new LinkedHashSet<String>();
	linkedHashSet.add(null);
	linkedHashSet.add("Shubham");
	linkedHashSet.add("Sarvesh");
	linkedHashSet.add("Rahul");
	linkedHashSet.add("Vijay");
	
	for(String obj : linkedHashSet)
	{
		System.out.println(""+obj);
		
	}
	
}
}
