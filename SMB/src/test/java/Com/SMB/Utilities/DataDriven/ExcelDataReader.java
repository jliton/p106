package Com.SMB.Utilities.DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.hssf.model.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import Com.SMB.Base.TestBase;

public class ExcelDataReader  {
	String Excelfile=System.getProperty("user.dir") + "\\src\\test\\resources\\Excel\\TestData.xlsx";
	public Iterator<Row> Itr;
	String m="AddCustomerTest";
	int rowCount;
	
	
	
	@Test
	public void Reader() throws IOException {
	File src=new File(Excelfile);
	
	FileInputStream input=new FileInputStream(src);
	XSSFWorkbook wb=new XSSFWorkbook(input);
	XSSFSheet sheet = wb.getSheet(m);
	 //System.out.println(sheet.getSheetName());
	 int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	 for (int i = 1; i < rowCount+1; i++) {

	        Row row = sheet.getRow(i);

	        //Create a loop to print cell values in a row

	        for (int j = 0; j < row.getLastCellNum(); j++) {

	        	

	        }

	       
	    } 
     
   
  
    }

}
	

