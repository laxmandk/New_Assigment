package Demo.Assignment;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 
{ 
	WebDriver driver;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul//li)[3]")   private WebElement radiobtn;

	@FindBy(xpath="(//input[@type=\"radio\"])[1]")  private WebElement Yesbtn;

	public POM3(WebDriver driver) 
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void radiobtntab() throws InterruptedException 
	{
		radiobtn.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", Yesbtn);

		boolean rediobtns=Yesbtn.isSelected();

		System.out.println(rediobtns);

		//Yesbtn.click();

	}


}
