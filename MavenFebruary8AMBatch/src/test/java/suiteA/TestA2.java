package suiteA;

import org.testng.annotations.Test;

public class TestA2 
{

	@Test
	  public void f() throws Exception 
	  {
		  System.out.println("Staring TestA2");
		  Thread.sleep(3000);
		  System.out.println("Ending TestA2");
	  }
}
