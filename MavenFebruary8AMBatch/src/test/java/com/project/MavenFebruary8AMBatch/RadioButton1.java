package com.project.MavenFebruary8AMBatch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

public class RadioButton1 extends BaseTest
{

	@BeforeMethod
	  public void beforeMethod() throws Exception 
	  {
		  System.out.println("iam beforemethod...");
		  init();
		  test = report.startTest("LinksTesting1");
		  test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
		  
		  openBrowser("chromebrowser");
		  test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
					
		  navigateUrl("radiobuttonurl");
		  test.log(LogStatus.FAIL, "Navigated to url : " + childProp.getProperty("radiobuttonurl"));
	  }
	
	
	@Test
	public void checkboxTest()
	{
		WebElement radio=driver.findElement(By.xpath("(//td[@class='table5'])[2]"));
		List<WebElement> rbutton=radio.findElements(By.name("group1"));
		for(int i=0;i<rbutton.size();i++)
		{
			System.out.println(rbutton.get(i).getAttribute("value")+ "----" + rbutton.get(i).getAttribute("checked"));
		}
	}
 

  @AfterMethod
  public void afterMethod() 
  {
	    report.endTest(test);
		report.flush();
		closeBrowser();
  }
	
}
