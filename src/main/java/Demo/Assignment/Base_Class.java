package Demo.Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class 
{

	public static WebDriver driver;

	public void openbrowser() 
	{

		System.setProperty("webdriver.chrome.driver","C:\\Users\\admin\\eclipse-workspace\\Assignment\\Browser\\chromedriver.exe");

		driver=new ChromeDriver();

		driver.get("https://demoqa.com/");

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);






	}







}
