package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Authentication_Popup {
WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	@Test 
	public void Authentication() 
	{
		//driver.get("http://the-internet.herokuapp.com/basic_auth");
		
		//syntax: 	http://username:password@url 
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			
	}

}
