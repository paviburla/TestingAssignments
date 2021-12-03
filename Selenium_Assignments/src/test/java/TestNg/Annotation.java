package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Annotation {
	
	WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test(priority = 2)
	public void Amazon()
	{
	
	
	driver.get("https://www.amazon.in/");
		
		System.out.println("-Amazon----");
		
		
		
	}
	
	@Test(priority = 1)
	public void Google()
	{
	
	driver.get("https://www.google.com/");
		String url =  driver.getCurrentUrl();
		System.out.println("-Google----"+url);
		
	}
	
	@AfterClass
	
	public void ClosingBrowser()
	{
		driver.quit();
	}
	

}
