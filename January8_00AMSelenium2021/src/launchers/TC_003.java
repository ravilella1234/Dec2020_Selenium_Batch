package launchers;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("firefoxbrowser");
		
		navigateUrl("amazonurl");
				
		//windowMaximize();
		
		//cookiesDelete();

	}

}
