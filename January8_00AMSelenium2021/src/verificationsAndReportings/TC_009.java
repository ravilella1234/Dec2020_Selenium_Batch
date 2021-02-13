package verificationsAndReportings;

import com.relevantcodes.extentreports.LogStatus;

import launchers.BaseTest;

public class TC_009 extends BaseTest
{

	public static void main(String[] args) throws Exception 
	{
		init();
		test = report.startTest("TC_009");
		test.log(LogStatus.INFO, "Loding Property files & configuration files .......");
				
		openBrowser("chromebrowser");
		test.log(LogStatus.PASS, "Opened the browser : " + p.getProperty("chromebrowser"));
				
		navigateUrl("amazonurl");
		test.log(LogStatus.PASS, "Navigated to url : " + childProp.getProperty("amazonurl"));
		
		driver.manage().window().maximize();
		
		String expectedLink = "Customer service";
		
		if(!compareLinks(expectedLink))
			reportFailure("Both Links are not equal..");
		else
			reportSuccess("Both Links are equal...");
		
		report.endTest(test);
		report.flush();
	}

	
}
