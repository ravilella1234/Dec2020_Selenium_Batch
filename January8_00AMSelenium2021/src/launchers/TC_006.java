package launchers;

import com.relevantcodes.extentreports.LogStatus;

public class TC_006 extends BaseTest
{
	
	
	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_006");
		test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
				
		openBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.FAIL, "Navigated to url : " + childProp.getProperty("amazonurl"));
				
		selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books By using locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked onButton by Using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
	
		report.endTest(test);
		report.flush();
		
		/*
		 * WebElement loc = driver.findElement(By.id("searchDropdownBox"));
		 * loc.sendKeys("Beauty");
		 * 
		 * Thread.sleep(4000);
		 */
		 
		 //driver.findElement(By.id("searchDropdownBox")).sendKeys("Books");
		 
		// driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Harry Potter");
		 
		// driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}

	

}
