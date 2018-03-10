package mapinterface.mishra.org;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
public static void main(String args[])
{
	Map<Integer,String> testHashMap =new HashMap<Integer,String>();
	testHashMap.put(1, "shubham");
	testHashMap.put(12, "rahul");
	testHashMap.put(13, "ravi");
	testHashMap.put(14, "suraj");
	testHashMap.put(15, "vikas");
	testHashMap.put(16, "vinod");
	
	for(Map.Entry m : testHashMap.entrySet())
	{
		System.out.println(m.getKey() +":"+m.getValue());
	}
}
}
