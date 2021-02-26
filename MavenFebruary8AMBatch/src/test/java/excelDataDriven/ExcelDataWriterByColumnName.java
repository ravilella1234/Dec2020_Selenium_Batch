package excelDataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataWriterByColumnName 
{

	public static void main(String[] args) throws Exception 
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		FileOutputStream fos = null;
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("login");
		XSSFRow row;
		XSSFCell cell;
		
		row = sheet.getRow(0);
		int colIndex = 0;
		for(int i=0;i<row.getLastCellNum();i++)
		{
			if(row.getCell(i).getStringCellValue().trim().equals("Result"))
				colIndex=i;
		}
		
		row = sheet.getRow(3);
		cell = row.getCell(colIndex);
		
		cell.setCellValue("Aborted");
		
		fos = new FileOutputStream("C:\\Users\\DELL\\Desktop\\testdata2.xlsx");
		wb.write(fos);
		wb.close();
		fos.close();
		fis.close();
	}

}
