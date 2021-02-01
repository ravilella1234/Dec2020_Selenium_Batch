package launchers;

public class TC_004 extends BaseTest
{
	
	public static void main(String[] args) throws Exception 
	{
		init();
		
		openBrowser("chromebrowser");
		
		navigateUrl("amazonurl");
		
		selectOption("amazondropbox_id","Books");
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		
		clickElement("amazonsearchbutton_xpath");
				
	
		
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
