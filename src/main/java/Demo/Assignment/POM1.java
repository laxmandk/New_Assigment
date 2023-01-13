package Demo.Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
	@FindBy(xpath="(//div[@class='avatar mx-auto white'])[1]") private WebElement Element;
	
	@FindBy(xpath="(//div[@class=\"left-pannel\"]//ul/li)[1]") private WebElement textbox;
	
	@FindBy(xpath="//input[@placeholder=\"Full Name\"]") private WebElement FullName;
	
	@FindBy(xpath="//input[@id=\"userEmail\"]")  private WebElement Email;
	
	@FindBy(xpath="//div[@id=\"currentAddress-wrapper\"]/div/textarea[@placeholder=\"Current Address\"]") private WebElement Currentaddress;
	
	@FindBy(xpath="//div[@id=\"permanentAddress-wrapper\"]/div/textarea[@id=\"permanentAddress\"]") private WebElement permanentAddress;
	
	@FindBy(xpath="//button[@id=\"submit\"]") private WebElement submit;
	
	
  public POM1(WebDriver driver) 
  {
	  
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
 
 public void sumbit() 
 {
	 
	 submit.click();
	 
 }
 
 
	

}
