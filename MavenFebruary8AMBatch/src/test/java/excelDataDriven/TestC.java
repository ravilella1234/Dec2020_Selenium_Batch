package excelDataDriven;

import org.testng.annotations.Test;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;

public class TestC 
{
  @Test(dataProvider = "getData")
  public void f(Hashtable<String, String> data) 
  {
	  
  }

  @DataProvider
  public Object[][] getData() throws Exception 
  {
	  ExcelAPI e = new ExcelAPI("C:\\Users\\DELL\\Desktop\\SuiteA.xlsx");
	  String sheetName = "Data";
	  String testCaseName = "TestB";
	  
	  return DataUtils.getTestData(e, sheetName, testCaseName);
  }
}
