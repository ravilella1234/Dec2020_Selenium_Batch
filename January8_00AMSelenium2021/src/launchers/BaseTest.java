package launchers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	
	public static void openBrowser(String browser)
	{
		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	
	public  static void navigateUrl(String url) 
	{
		driver.get(url);
	}
	
	public static String getcurrentUrl() 
	{
		return driver.getCurrentUrl();
	}

	public static String getTitlePage() 
	{
		return driver.getTitle();
	}

	public static void cookiesDelete() 
	{
		driver.manage().deleteAllCookies();
	}

	public static void windowMaximize() 
	{
		driver.manage().window().maximize();
	}
	
	public static void waitforElement(int milliSeconds) throws Exception 
	{
		Thread.sleep(milliSeconds);
	}

	public static void browserRefresh() 
	{
		driver.navigate().refresh();
	}

	public static void browserForward() 
	{
		driver.navigate().forward();
	}

	public static void browserBack() 
	{
		driver.navigate().back();
	}

	public static void closeBrowser() 
	{
		driver.quit();		
	}

}
