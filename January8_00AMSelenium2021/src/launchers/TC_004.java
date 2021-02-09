package launchers;

import org.apache.log4j.Logger;

public class TC_004 extends BaseTest
{
	private static final Logger log = Logger.getLogger(TC_004.class);
	
	
	public static void main(String[] args) throws Exception 
	{
		
		init();
		log.info("---------------   Test case Started ----------------------");
		log.info("Loding Property files & configuration files .......");
		
		openBrowser("chromebrowser");
		log.info("Opened the browser : " + p.getProperty("chromebrowser"));
		
		navigateUrl("amazonurl");
		log.info("Navigated to url : " + childProp.getProperty("amazonurl"));
		
		selectOption("amazondropbox_id","Books");
		log.info("Selected the option Books By using locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		log.info("Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		log.info("Clicked onButton by Using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
	
		
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
