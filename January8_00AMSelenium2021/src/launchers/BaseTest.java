package launchers;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest 
{
	public static WebDriver driver;
	public static String projectPath = System.getProperty("user.dir");
	public static FileInputStream fis;
	public static Properties p;
	public static Properties parentProp;
	public static Properties childProp;
	
	
	
	public static void init() throws Exception
	{
		fis = new FileInputStream(projectPath +"//data.properties");
		p = new Properties();
		p.load(fis);
		
		fis = new FileInputStream(projectPath + "//enironment.properties");
		parentProp = new Properties();
		parentProp.load(fis);
		String e = parentProp.getProperty("env");
		System.out.println(e);
		
		fis = new FileInputStream(projectPath + "//"+e+".properties" );
		childProp = new Properties();
		childProp.load(fis);
		String url = childProp.getProperty("amazonurl");
		System.out.println(url);
		
		
	}
	
	public static void openBrowser(String browser)
	{
		if(p.getProperty(browser).equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(p.getProperty(browser).equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", projectPath+"//drivers//geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
	}
	
	public  static void navigateUrl(String url) 
	{
		driver.get(childProp.getProperty(url));
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
