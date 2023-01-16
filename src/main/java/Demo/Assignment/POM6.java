package Demo.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM6 
{

	WebDriver driver;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[6]")  private WebElement Links;

	@FindBy(xpath="(//a[text()='Home'])[1]")   private WebElement Home;


	public POM6(WebDriver driver) 
	{

		this.driver= driver;
		PageFactory.initElements(driver, this);	

	}

	public void Links() throws InterruptedException 
	{
		Thread.sleep(2000);
		Links.click();

		Thread.sleep(2000);
		Home.click();

		String  Title=driver.getTitle();

		System.out.println(Title);

		driver.switchTo().defaultContent();

	}









}
