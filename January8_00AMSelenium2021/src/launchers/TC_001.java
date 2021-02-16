package launchers;

public class TC_001 extends BaseTest
{

	int x=10,y=20,z=30;
	public static void main(String[] args) 
	{
		openBrowser("firefox");
		
		navigateUrl("https://www.amazon.in");
		
	}

}
