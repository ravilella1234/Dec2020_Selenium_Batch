package com.crm.SalesforceCRM.keywords;

import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericKeywords 
{
	public Properties orProp;
	public String objectKey;
	public String dataKey;
	public Hashtable<String, String> td;
	public WebDriver driver;
	

	public void setOrProp(Properties orProp) {
		this.orProp = orProp;
	}

	public void setObjectKey(String objectKey) {
		this.objectKey = objectKey;
	}

	public void setDataKey(String dataKey) {
		this.dataKey = dataKey;
	}

	public void setTd(Hashtable<String, String> td) {
		this.td = td;
	}

	
	public void typeText() 
	{
		System.out.println("Type Text ...  " + orProp.getProperty(objectKey) +"---"+ td.get(dataKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).sendKeys(td.get(dataKey));
		getObject(objectKey).sendKeys(td.get(dataKey));
	}

	public void clickElement() throws Exception 
	{
		System.out.println("Clicked on Element..." +orProp.getProperty(objectKey));
		//driver.findElement(By.xpath(orProp.getProperty(objectKey))).click();
		getObject(objectKey).click();
	}
	
	public WebElement getObject(String objectKey)
	{
		WebElement element = null;
		
		try 
		{
			if(objectKey.endsWith("_id")) {
				element = driver.findElement(By.id(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_name")) {
				element = driver.findElement(By.name(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_classname")) {
				element = driver.findElement(By.className(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_xpath")) {
				element = driver.findElement(By.xpath(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_css")) {
				element = driver.findElement(By.cssSelector(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_linktext")) {
				element = driver.findElement(By.linkText(orProp.getProperty(objectKey)));
			}else if(objectKey.endsWith("_partiallinktext")) {
				element = driver.findElement(By.partialLinkText(orProp.getProperty(objectKey)));
			}
			
			WebDriverWait wait = new WebDriverWait(driver, 30);
			//check the visibility of Object
			wait.until(ExpectedConditions.visibilityOf(element));
			
			//Check state of the Object - whether it is clickable or not
			wait.until(ExpectedConditions.elementToBeClickable(element));
		} 
		catch (Exception e) 
		{
			//failure - Report that failure
			reportFailure("Object not found : "+ objectKey);
			e.printStackTrace();
		}
		
		return element;
	}
	

	public void navigateUrl() 
	{
		System.out.println("Navigated to the Url...  " + td.get(dataKey));
		driver.get(td.get(dataKey));
	}

	public void openBrowser() 
	{
		String browser = td.get(dataKey);
		System.out.println("Opened The Browser...   " + browser);
		
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DELL\\Desktop\\grid\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	
	public void verifyTitle()
	{
		String expectedTitle = orProp.getProperty(objectKey);
		String actualTitle = driver.getTitle();
		System.out.println("Validate Title....."+ expectedTitle);
		if(!actualTitle.equals(expectedTitle))
		{
			// report the failure
			reportFailure("Given Title didn't match, Got the title as :-" + actualTitle);
		}
	}
	
	public void quit()
	{
		if(driver!=null)
			driver.quit();
	}
	
	
	//  *************************  Reporting Function  ******************************
	
	public void reportFailure(String failureMsg)
	{
		// fail the test
		// take the failure Screenshot, and embedded that in project folder & in HTML Report
	}

}
