package com.project.MavenFebruary8AMBatch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class LinksTesting1 extends BaseTest
{
	@BeforeMethod(groups = {"regression","smoke"})
	@Parameters("browser")
	public void setup(String bType) throws Exception
	{
		  System.out.println("iam beforemethod...");
		  init();
		  test = report.startTest("LinksTesting1");
		  test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
		  
		  openBrowser(bType);
		  test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
					
		  navigateUrl("googleurl");
		  test.log(LogStatus.FAIL, "Navigated to url : " + childProp.getProperty("googleurl"));
	}
	
	
	@Test(groups = {"regression","smoke"})
	public void linktesting1()
	 {
		String expval="Google Images";
		
		driver.findElement(By.linkText("Images")).click();	
		Reporter.log("Clicked on Image Link");
		String actval=driver.getTitle();
		
		Assert.assertEquals(actval, expval);
		
	 }
	
	@AfterMethod(groups = {"regression","smoke"})
	public void tearDown()
	{
		report.endTest(test);
		report.flush();
		closeBrowser();
	}

}
