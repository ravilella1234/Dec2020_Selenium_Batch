package launchers;

public class TC_001 extends BaseTest
{

	public static void main(String[] args) 
	{
		openBrowser("firefox");
		
		navigateUrl("https://www.amazon.in");
		
	}

}
