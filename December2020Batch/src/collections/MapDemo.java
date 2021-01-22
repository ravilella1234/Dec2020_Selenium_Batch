package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

public class MapDemo 
{

	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> h  = new HashMap<Integer, Integer>();
		h.put(10, 100);
		h.put(20, 200);
		h.put(10, 300);
		h.put(30, 200);
		h.put(40, 400);
		
		System.out.println(h);
		System.out.println(h.get(10));
		System.out.println(h.size());
		System.out.println(h.isEmpty());
		
		Set<Integer> keys = h.keySet();
		
		for(Integer k : keys)
		{
			if(k.equals(20))
			System.out.println(k + "--" + h.get(k));
		}
		
		System.out.println(h.containsKey(50));
		
		
		LinkedHashMap<Integer, Integer> h1  = new LinkedHashMap<Integer, Integer>();
		h1.put(10, 100);
		h1.put(20, 200);
		h1.put(10, 300);
		h1.put(30, 200);
		h1.put(40, 400);
		
		System.out.println(h1);
		
		
		TreeMap<Integer, Integer> h2  = new TreeMap<Integer, Integer>();
		h2.put(1000, 100);
		h2.put(200, 200);
		h2.put(10, 300);
		h2.put(1, 200);
		h2.put(40, 400);
		
		System.out.println(h2);
		
		

	}

}
