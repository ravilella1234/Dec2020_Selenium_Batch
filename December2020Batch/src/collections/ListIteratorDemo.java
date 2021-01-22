package collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo 
{

	public static void main(String[] args)
	{
		ArrayList<String> a  = new ArrayList<String>();
		a.add("oracle");
		a.add("durgasoft");
		a.add("MindQ");
		a.add("kosmik");
		a.add("OAKTech");
		
		System.out.println(a);
		
		ListIterator<String> val = a.listIterator();
		while(val.hasNext())
		{
			String var = val.next();
			if(!var.equals("durgasoft"))
				val.remove();
			else
				val.set("durgasoft solutions");
		}
		
		System.out.println(a);

	}

}
