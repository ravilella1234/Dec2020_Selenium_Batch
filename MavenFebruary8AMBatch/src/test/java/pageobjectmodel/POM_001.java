package pageobjectmodel;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.project.MavenFebruary8AMBatch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import junit.framework.Assert;

public class POM_001 extends BaseTest
{
	Login obj;
	CustomerRegistrationPage obj1 ; 
	
  @BeforeMethod
  @Parameters("browser")
  public void beforeMethod(String bType) throws Exception 
  {
	  System.out.println("iam beforemethod...");
	  init();
	  test = report.startTest("POM_001");
	  test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
	  
	  openBrowser(bType);
	  test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
				
	  navigateUrl("automationurl");
	  test.log(LogStatus.FAIL, "Navigated to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(enabled = false)
  public void login() 
  {
	  obj = new Login(driver);
	  obj.login();
	  Assert.assertEquals("Authentication failed.", obj.getLoginError());
  }
  
  @Test
  public void customerRegistration() throws Exception
  {
	  obj1 = new CustomerRegistrationPage(driver);
	  obj1.customerRegistration();
  }

  @AfterMethod
  public void afterMethod() 
  {
	  report.endTest(test);
	  report.flush();
  }

}
