package Demo.Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Utility_Class 
{
	
	
	
  public static String  getdataFromExcel(int Rowindex, int Cellindex) throws EncryptedDocumentException, IOException 
  {
	  
	FileInputStream file=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\Assignment\\TestDataFolder\\12june.xlsx");  
	  
	     String s1=WorkbookFactory.create(file).getSheet("Sheet1").getRow(Rowindex).getCell( Cellindex).getStringCellValue();
	     
	     return s1;
	  
  }
	
	
	
	
	
	
	

}
