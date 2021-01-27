package launchers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserLaunch 
{

	public static void main(String[] args)
	{
		WebDriver driver;
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\2021 drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver  = new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		
		//System.setProperty("webdriver.gecko.driver", "C:/Users/DELL/Desktop/2021 drivers/geckodriver.exe");
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//drivers//geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://bestbuy.com");
		
		
		//edge -  "webdriver.edge.driver"
		//IE   -   "webdriver.ie.driver"

	}

}
