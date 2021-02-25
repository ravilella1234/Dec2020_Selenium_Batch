package excelDataDriven;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataReadingByColumnNumber 
{

	public static void main(String[] args) throws Exception 
	{
		//FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata.xlsx");
		FileInputStream fis = new FileInputStream(new File("C:\\Users\\DELL\\Desktop\\testdata.xlsx"));
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(1);
		String str = cell.getStringCellValue();
		
		System.out.println(str);
		
		wb.close();
		fis.close();
	}

}
