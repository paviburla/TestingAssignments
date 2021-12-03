package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProvider {

WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 1)
	public void Login() {
		
		driver.get("");
		
		
	}
	
	
	
@AfterClass
	
	public void ClosingBrowser()
	{
		driver.quit();
	}
	
}
