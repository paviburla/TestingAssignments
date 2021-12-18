package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider
{

WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1,dataProvider = "TestData",invocationCount=2)
	public void Login(String Fullname, String Email)
	{
		
		driver.get("https://register.rediff.com/register/register.php");
		driver.findElement(By.xpath("(//input[contains(@name,'name')])[1]")).sendKeys(Fullname);
		driver.findElement(By.xpath("(//input[contains(@name,'login')])")).sendKeys(Email);
				
	}
	
	@org.testng.annotations.DataProvider
	
	public Object[][] TestData()
	{
		Object [] [] data = new Object [2] [2];
		data [0][0]="Pavithra";
		data [0][1]="paviburla@gmail.com";
		data [1][0]="Bindu";
		data [1][1]="bindu.barola@gmail.com";
		
		return data;
	}
	
@AfterClass
	
	public void ClosingBrowser()
	{
		driver.quit();
	}
	
}
