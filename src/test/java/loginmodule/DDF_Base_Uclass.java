package loginmodule;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.Assignment.Base_Class;
import Demo.Assignment.POM1;
import Demo.Assignment.Utility_Class;

public class DDF_Base_Uclass extends Base_Class 
{
	//public WebDriver driver;
	
	POM1 page1;

	@BeforeClass
	public void initilisebrowser() 
	{
		
		openbrowser();
		
		 page1=new POM1(driver);
		
			
	}
	
	@BeforeMethod
	
	public void login() throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		
		Thread.sleep(2000);
		
		//page1.element();
		
		page1.element();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.textbox();
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.Fullname(Utility_Class.getdataFromExcel(0, 0));
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.Email(Utility_Class.getdataFromExcel(0, 1));
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.CurrentAddress(Utility_Class.getdataFromExcel(0, 2));
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.ParamnantAdrees(Utility_Class.getdataFromExcel(0, 3));
		
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		page1.sumbit();
		
		
		
	}
	
	@Test
	public void TC1() 
	{
		
		
	}
	
	
	
	

}
