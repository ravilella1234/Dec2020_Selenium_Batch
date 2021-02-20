package suiteB;

import org.testng.annotations.Test;

public class TestB2 
{
  @Test
  public void f() throws Exception
  {
	  System.out.println("Staring TestB2");
	  Thread.sleep(3000);
	  System.out.println("Ending TestB2");
  }
}
