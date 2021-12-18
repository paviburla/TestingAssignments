package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Assert_Ass16_Part2 
{
@Test	
public void Validate_pageTitle()
{
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get(" https://www.google.com/");
	String title = driver.getTitle();
	System.out.println("-----PageTitle-----"+title);
	
	Assert.assertEquals(title, "Google");
	driver.close();
	
	
	
}
	
	
	
}
