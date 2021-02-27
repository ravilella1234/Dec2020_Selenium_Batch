package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;

public class TestD 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  if(!data.get("RunMode").equals("Y"))
		  throw new SkipException("Testis skipped..");
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		System.out.println(data.get("Browser"));
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(data.get("UserName"));
		
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(data.get("Pasword"));
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  String sheetName = "Data";
	  String testCaseName = "TestA";
	  
	  return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}
