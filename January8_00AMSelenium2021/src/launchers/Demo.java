package launchers;

import java.util.Date;

public class Demo 
{

	public static void main(String[] args) 
	{
		Date dt = new Date();
		System.out.println(dt);
		String p = dt.toString().replace(':', '_').replace(' ', '_');
		System.out.println(p);

	}

}
