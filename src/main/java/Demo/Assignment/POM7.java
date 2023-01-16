package Demo.Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM7 
{
	WebDriver driver;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[8]")   private WebElement upload;

	@FindBy(xpath="//input[@type=\"file\"]")  private WebElement Fileupload;


	public POM7(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);

	}

	public void Fileuploadtab() throws InterruptedException, AWTException 
	{
		Thread.sleep(2000);
		upload.click();

		Thread.sleep(2000);
		Fileupload.click();


		Thread.sleep(2000);
		Robot rb=new Robot();	
		rb.delay(2000);		
		StringSelection ss=new StringSelection("C:\\Users\\admin\\Desktop\\Express Car 3.pdf");

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		//CTROL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);	
		//ENTER
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);



	}




}
