package launchers;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_005 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		/*
		 * driver.findElement(By.id("twotabsearchtextbox")).sendKeys("philips");
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.name("field-keywords")).clear();
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys(
		 * "samsung");
		 * 
		 * Thread.sleep(8000);
		 * 
		 * driver.findElement(By.cssSelector("#twotabsearchtextbox")).clear();
		 * 
		 * Thread.sleep(6000);
		 */
		//driver.findElement(By.linkText("Customer Service")).click();
		
		//driver.findElement(By.partialLinkText("Customer Ser")).click();
		
		int visiblelinksCount=0;
		List<WebElement> loc = driver.findElements(By.tagName("a"));
		System.out.println("Visible & Hidden Links count : " + loc.size());
		for(int i=1;i<loc.size();i++)
		{
			if(!loc.get(i).getText().isEmpty()) 
			{
				System.out.println(loc.get(i).getText());
				visiblelinksCount++;
			}
			
		}
		System.out.println("Visible links count is : " + visiblelinksCount);

	}

}
