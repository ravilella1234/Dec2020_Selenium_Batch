package suiteA;

import org.testng.annotations.Test;

public class TestA3 
{
  @Test
  public void f() throws Exception 
  {
	  System.out.println("Staring TestA3");
	  Thread.sleep(3000);
	  System.out.println("Ending TestA3");
  }
}
