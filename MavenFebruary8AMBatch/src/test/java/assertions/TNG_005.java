package assertions;

import org.testng.annotations.Test;

import com.project.MavenFebruary8AMBatch.BaseTest;
import com.relevantcodes.extentreports.LogStatus;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;

public class TNG_005 extends BaseTest
{
  
  @BeforeMethod(groups = {"regression","sanity"})
  @Parameters("browser")
  public void startProcess(String bType) throws Exception 
  {
	  System.out.println("iam beforemethod...");
	  init();
	  test = report.startTest("TNG_004");
	  test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
	  Reporter.log("Loding Property files & configuration files .......");
	  
	  openBrowser(bType);
	  test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
	  Reporter.log("Opened the browser : " + p.getProperty("chromebrowser"));
				
	  navigateUrl("amazonurl");
	  test.log(LogStatus.FAIL, "Navigated to url : " + childProp.getProperty("amazonurl"));
	  Reporter.log("Navigated to url : " + childProp.getProperty("amazonurl"));
  }
  
  @Test(groups = {"regression","sanity"})
  public void amazon()
  {
	   System.out.println("iam testmethod...");	
	  
	    selectOption("amazondropbox_id","Books");
		test.log(LogStatus.PASS, "Selected the option Books By using locator :- " + orProp.getProperty("amazondropbox_id"));
		Reporter.log("Selected the option Books By using locator :- " + orProp.getProperty("amazondropbox_id"));
		
		typeText("amazonsearchtextbox_name","Harry Potter");
		test.log(LogStatus.PASS, "Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		Reporter.log("Entered the text Harry Potter By using the locator :- " + orProp.getProperty("amazonsearchtextbox_name"));
		
		clickElement("amazonsearchbutton_xpath");
		test.log(LogStatus.PASS, "Clicked onButton by Using locator :-" + orProp.getProperty("amazonsearchbutton_xpath")); 
		Reporter.log("Clicked onButton by Using locator :-" + orProp.getProperty("amazonsearchbutton_xpath"));
  }

  @AfterMethod(groups = {"regression","sanity"})
  public void endProcess() 
  {
	  System.out.println("iam aftermethod...");
	  
	  report.endTest(test);
	  report.flush();
	  
	  closeBrowser();
  }

}
