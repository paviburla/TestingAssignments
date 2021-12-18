package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestSuite_Ass18 {
	
WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test
	public void Open_Url() {
		driver.get("https://classic.freecrm.com/index.html");
	}

	@AfterClass
	public void ClosingBrowser() {
		driver.close();
	}
}
