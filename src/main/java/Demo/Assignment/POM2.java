package Demo.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 
{

	WebDriver driver;

	@FindBy(xpath="(//div[@class='avatar mx-auto white'])[1]") private WebElement Element;

	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[2]")  private WebElement checkbox;

	@FindBy(xpath="(//div[@class=\"react-checkbox-tree rct-icons-fa4\"]//button)[3]")   private WebElement toggle;

	@FindBy(xpath="(//div[@class=\"react-checkbox-tree rct-icons-fa4\"]//button)[5]") private WebElement doctog;

	@FindBy(xpath="(//div[@class=\"react-checkbox-tree rct-icons-fa4\"]//button)[7]") private WebElement officetog;

	@FindBy(xpath="(//label[@for=\"tree-node-private\"]/span)[1]") private WebElement checkbxprivate;


	public POM2(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	public void checkbox() throws InterruptedException 
	{

		//Element.click();

		Thread.sleep(2000);

		checkbox.click();

		Thread.sleep(2000);

		toggle.click();

		Thread.sleep(2000);

		doctog.click();

		Thread.sleep(2000);

		officetog.click();

		Thread.sleep(2000);

		boolean s1=checkbxprivate.isEnabled();

		System.out.println(s1);






	}





}
