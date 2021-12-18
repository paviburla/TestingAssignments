package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validation_Assert_Soft_Ass17 {
	WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	@Test(priority=2)
	public void HardAssert()
	{
driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("----Title----" +title);
		
		Assert.assertEquals(title, "Cogmento CRM");
		
      String url = driver.getCurrentUrl();
		
		System.out.println("----CurrentURL----" +url);
		
		Assert.assertEquals(url, "https://api.cogmento.com/register/");
		
	
driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Myemail@gmail.com");
	    
	    driver.findElement(By.xpath("//input[@id='phone_number']")).sendKeys("123456");
	    
	    driver.findElement(By.xpath("//input[@id='terms']")).click();

	}

	@Test(priority = 1)
	public void SoftAssert()
	{
		driver.get("https://classic.freecrm.com/index.html");
        driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("----Title----" +title);
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(title,"Cogmento CRM");
	    soft.assertAll();
}
	@AfterClass
	public void ClosingBrowser() {
		
		driver.quit();
	}
	
}