package Demo.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class POM1 
{

	WebDriver driver;

	@FindBy(xpath="(//div[@class='avatar mx-auto white'])[1]") private WebElement Element;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[1]") private WebElement textbox;

	@FindBy(xpath="//input[@placeholder=\"Full Name\"]") private WebElement FullName;

	@FindBy(xpath="//input[@id=\"userEmail\"]")  private WebElement Email;

	@FindBy(xpath="//div[@id=\"currentAddress-wrapper\"]/div/textarea[@placeholder=\"Current Address\"]") private WebElement Currentaddress;

	@FindBy(xpath="//div[@id=\"permanentAddress-wrapper\"]/div/textarea[@id=\"permanentAddress\"]") private WebElement permanentAddress;

	@FindBy(xpath="//div[@class='text-right col-md-2 col-sm-12']/button[@id='submit']") private WebElement SUBMIT;


	public POM1(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);  


	}


	public void element() 
	{
		Element.click();

	}

	public void textbox() 
	{
		textbox.click();

	}

	public void Fullname(String name) 
	{
		FullName.sendKeys(name); 

	}

	public void Email(String email) 
	{
		Email.sendKeys(email); 

	}

	public void CurrentAddress(String caddress) 
	{

		Currentaddress.sendKeys(caddress); 
	}

	public void ParamnantAdrees(String paddress) 
	{
		permanentAddress.sendKeys(paddress); 

	}


	public void Submit() 
	{

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", SUBMIT);

		//SUBMIT.click();

	}

}
