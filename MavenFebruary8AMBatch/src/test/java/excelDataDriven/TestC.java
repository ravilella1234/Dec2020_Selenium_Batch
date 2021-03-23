package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

public class TestC 
{
	
	@BeforeMethod
	public void start()
	{
		System.out.println("iam before method....");
	}
	
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  System.out.println("iam f test Method");
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  System.out.println("iam dataProvider.....");
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  String sheetName = "Data";
	  String testCaseName = "TestB";
	  
	  return DataUtils.getTestData(e, sheetName, testCaseName);
  }
  
  @AfterMethod
	public void end()
	{
		System.out.println("iam after method....");
	}
}
