package launchers;

public class TC_003 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("axisbankurl");
				
		//windowMaximize();
		
		//cookiesDelete();

	}

}
