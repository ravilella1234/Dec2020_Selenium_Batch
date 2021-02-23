package assertions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.project.MavenFebruary8AMBatch.BaseTest;

public class HardAssert extends BaseTest
{

	public static void main(String[] args) 
	{
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Desktop\\grid\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://www.amazon.in");
		  driver.manage().window().maximize();
		  
		  String actualTitle = driver.getTitle();
		  String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.i";
		  
		  //Assert.assertEquals(actualTitle, expectedTitle);
		  //Assert.assertTrue(actualTitle.equals(expectedTitle), "Both titles are not equal...");
		  
		  SoftAssert s = new SoftAssert();
		  //s.assertEquals(actualTitle, expectedTitle);
		  s.assertTrue(actualTitle.equals(expectedTitle), "Both titles are not equal...");
		  
		  System.out.println("statement1...");
		  
		  s.assertTrue(false, "err1");
		  
		  System.out.println("statement2...");
		  
		  s.assertTrue(false, "err2");
		  
		  System.out.println("statement3...");
		  
		  s.assertTrue(true, "err3");
		  
		  System.out.println("statement4...");
		  
		  s.assertTrue(false, "err4");
		  
		  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("sony");
		  
		  s.assertAll();

	}

}
