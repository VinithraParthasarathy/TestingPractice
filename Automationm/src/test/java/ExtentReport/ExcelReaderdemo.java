package ExtentReport;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.bouncycastle.openssl.EncryptionException;
import org.testng.annotations.DataProvider;

public class ExcelReaderdemo {
	
	
	@DataProvider               // supply the data to your test case 
	public String [][]  getData() throws EncryptionException, IOException
	{

		String excelsheetname="Login";
		File f = new File(System.getProperty("user.dir") +"\\src\\test\\resources\\TestData\\Task.xlsx");
	     
		FileInputStream fis = new FileInputStream(f);   // Step1   // Reading the file 
		
	  Workbook wb = WorkbookFactory.create(fis);       //Step 2 
	  
	  Sheet sheetname = wb.getSheet(excelsheetname);    //Step 3
	  
	  int rows = sheetname.getPhysicalNumberOfRows();    // Step4  To find rows and columns 
	   
	  System.out.println("Number of rows:" +rows);   //4
	  
	 int columns = sheetname.getRow(0).getPhysicalNumberOfCells();
	 
	 System.out.println("Number of columns:" + columns );   //2 
	 
	 DataFormatter format = new DataFormatter();              // Step 5
	 String[][] testdata= new String[rows][columns];    
	
	 for(int row =1; row<rows; row++)   //1
	 {
		 for(int col=0; col<columns;col++)  //0 
		 {
		testdata[row-1][col]= format.formatCellValue( sheetname.getRow(row).getCell(col))	; 
		
		System.out.println(testdata[row-1][col]);
		 }
	 }
	 
	 return testdata;
	 
	  
}
}