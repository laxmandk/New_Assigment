package Demo.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM5 
{
	WebDriver driver;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[5]")  private WebElement Buttons;

	@FindBy(xpath="//button[text()='Double Click Me']")     private WebElement Doubleclk;

	@FindBy(xpath="//button[text()='Right Click Me']")   private WebElement RightClick;

	@FindBy(xpath="//button[text()='Click Me']")      private WebElement SingleClk;


	public POM5(WebDriver driver) 
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}


	public void ButtonTab() throws InterruptedException 
	{

		Thread.sleep(2000);
		Buttons.click();

		Thread.sleep(2000);
		Actions act=new Actions(driver);

		act.doubleClick(Doubleclk).perform();

		Thread.sleep(2000);
		act.contextClick(RightClick).perform();

		Thread.sleep(2000);
		SingleClk.click();





	}






}
