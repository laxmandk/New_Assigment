package loginmodule;

import java.awt.AWTException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo.Assignment.Base_Class;
import Demo.Assignment.POM1;
import Demo.Assignment.POM2;
import Demo.Assignment.POM3;
import Demo.Assignment.POM4;
import Demo.Assignment.POM5;
import Demo.Assignment.POM6;
import Demo.Assignment.POM7;
import Demo.Assignment.Utility_Class;
import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class DDF_Base_Uclass extends Base_Class 
{
	// public WebDriver driver;

	POM1 page1;
	POM2 page2;
	POM3 page3;
	POM4 page4;
	POM5 page5;
	POM6 page6;
	POM7 page7;



	@BeforeClass
	public void initilisebrowser() 
	{
		openbrowser();

		page1=new POM1(driver);

		page2=new POM2(driver);

		page3=new POM3(driver);

		page4=new POM4 (driver);

		page5=new POM5(driver);

		page6=new POM6(driver);

		page7=new POM7(driver);

	}

	@BeforeMethod
	public void login() throws EncryptedDocumentException, IOException, InterruptedException, AWTException 
	{
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		page1.element();

		Thread.sleep(3000);
		page1.textbox();

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		page1.Fullname(Utility_Class.getdataFromExcel(0, 0));

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		page1.Email(Utility_Class.getdataFromExcel(0, 1));

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		page1.CurrentAddress(Utility_Class.getdataFromExcel(0, 2));

		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);

		page1.ParamnantAdrees(Utility_Class.getdataFromExcel(0, 3));

		//Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);				
		page1.Submit();

		page2.checkbox();

		Thread.sleep(3000);

		page3.radiobtntab();

		Thread.sleep(3000);

		page4.Webtable();

		Thread.sleep(3000);

		page4.FN(Utility_Class.getdataFromExcel(0, 4));

		Thread.sleep(3000);

		page4.LN(Utility_Class.getdataFromExcel(0, 5));

		Thread.sleep(3000);

		page4.Email(Utility_Class.getdataFromExcel(0, 6));

		Thread.sleep(3000);

		page4.Age(Utility_Class.getdataFromExcel(0, 7));

		Thread.sleep(3000);

		page4.Salary(Utility_Class.getdataFromExcel(0, 8));

		Thread.sleep(3000);

		page4.Department(Utility_Class.getdataFromExcel(0, 9));

		Thread.sleep(3000);
		page4.submit();

		Thread.sleep(3000);
		page5.ButtonTab();

		Thread.sleep(3000);
		page6.Links();

		Thread.sleep(3000);
		page7.Fileuploadtab();





	}

	@Test
	public void  TC1()  
	{
		Reporter.log("pass");
	}






}
