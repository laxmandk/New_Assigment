package Demo.Assignment;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class POM8 
{

	@FindBy(xpath="(//div[@class=\"left-pannel\"]/div//span)[12]")  private WebElement Form;

	@FindBy(xpath="//div[@class=\"element-list collapse show\"]/ul/li") private WebElement PracticeForm;

	@FindBy(xpath="//input[@id=\"firstName\"]")  private WebElement FN;

	@FindBy(xpath="//input[@id=\"lastName\"]") private WebElement LN;

	@FindBy(xpath="//input[@id=\"userEmail\"]") private WebElement Email;

	@FindBy(xpath="(//div[@id=\"genterWrapper\"]/div//input)[1]")    private WebElement Malebox;

	@FindBy(xpath="//input[@id=\"userNumber\"]") private WebElement MobNo;

	@FindBy(xpath="//div[@id=\"dateOfBirth-wrapper\"]/div//input")  private WebElement DOB;

	@FindBy(xpath="(((//div[@class=\"react-datepicker__month-container\"]/div)[2]/div)[3]/div)[4]") private WebElement DOBclk;

	@FindBy(xpath="(//div[@id=\"subjectsWrapper\"]/div)[2]") private WebElement subject;

	@FindBy(xpath="((//div[@id=\"hobbiesWrapper\"]/div)[2]//input)[1]") private WebElement Hobbies;

	@FindBy(xpath="//div[@class=\"form-file\"]//input") private WebElement ChooseFile;

	@FindBy(xpath="//div[@id=\"currentAddress-wrapper\"]//textarea[@id=\"currentAddress\"]") private WebElement CurrentAddress;

}
