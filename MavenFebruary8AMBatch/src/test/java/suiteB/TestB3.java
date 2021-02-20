package suiteB;

import org.testng.annotations.Test;

public class TestB3 
{
  @Test
  public void f() throws Exception 
  {
	  System.out.println("Staring TestB3");
	  Thread.sleep(3000);
	  System.out.println("Ending TestB3");
  }
}
