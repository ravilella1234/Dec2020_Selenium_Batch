package verificationsAndReportings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import launchers.BaseTest;

public class TC_008 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		WebElement loc = driver.findElement(By.id("twotabsearchtextbox"));
		
		loc.sendKeys("sony");
		
		String text = loc.getAttribute("value");
		System.out.println("Text is : "  +text);

	}

}
