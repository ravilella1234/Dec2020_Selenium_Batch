package launchers;

public class TC_001 extends BaseTest
{

	int a=100,b=200,c=300;
	public static void main(String[] args) 
	{
		openBrowser("firefox");
		
		navigateUrl("https://www.amazon.in");
		
	}

}
