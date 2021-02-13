package verificationsAndReportings;

import org.openqa.selenium.By;

import launchers.BaseTest;

public class TC_007 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		driver.manage().window().maximize();
		
		//String actualLink = driver.findElement(By.linkText("Customer Service")).getText();
		String actualLink = driver.findElement(By.linkText("Customer Service")).getAttribute("innerHTML");
		String expectedLink = "customer ser";
		
		System.out.println("ActualLink : "  +actualLink);
		System.out.println("ExpectedLink : " + expectedLink);
		
		//if(actualLink.equals(expectedLink))
		//if(actualLink.equalsIgnoreCase(expectedLink))
		//if(actualLink.contains(expectedLink))
		if(actualLink.toLowerCase().contains(expectedLink))
		{
			System.out.println("Both links are equal...");
		}
		else
		{
			System.out.println("Both Links are not equal....");
		}

	}

}
