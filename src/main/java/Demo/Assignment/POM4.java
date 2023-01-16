package Demo.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM4 
{
	WebDriver driver;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[4]") private WebElement Webtabletab;

	@FindBy(xpath="//button[text()='Add']") private WebElement Addbtn;

	@FindBy(xpath="//input[@id=\"firstName\"]")   private WebElement FN;

	@FindBy(xpath="//input[@id=\"lastName\"]")  private WebElement LN;

	@FindBy(xpath="//input[@id=\"userEmail\"]")  private WebElement Email;

	@FindBy(xpath="//input[@id=\"age\"]")  private WebElement Age;

	@FindBy(xpath="//input[@id=\"salary\"]")  private WebElement Salary;

	@FindBy(xpath="//input[@id=\"department\"]")  private WebElement Department;

	@FindBy(xpath="//button[@id=\"submit\"]")  private WebElement submitbtn;

	public POM4(WebDriver driver) 
	{

		this.driver= driver;
		PageFactory.initElements(driver, this);

	} 

	public void Webtable() throws InterruptedException 
	{
		Thread.sleep(2000);
		Webtabletab.click();

		Thread.sleep(2000);
		Addbtn.click();

	}


	public void FN(String Fname) 
	{

		FN.sendKeys(Fname);
	}

	public void LN(String Lname) 
	{
		LN.sendKeys(Lname);

	}

	public void Email(String email) 
	{
		Email.sendKeys(email);

	}

	public void Age(String age) 
	{

		Age.sendKeys(age);	
	}

	public void Salary(String salary) 
	{

		Salary.sendKeys(salary);
	}


	public void Department(String dpart) 
	{
		Department.sendKeys(dpart);
	}


	public void submit() 
	{
		submitbtn.click();
	}

}
