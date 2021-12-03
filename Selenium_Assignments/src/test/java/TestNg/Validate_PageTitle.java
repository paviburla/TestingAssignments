package TestNg;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Validate_PageTitle	
 {
	@Test
	public void validate_Title()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.naukri.com/");
		String actualTitle =  driver.getTitle();
		System.out.println("-Title----"+actualTitle);
		
		Assert.assertEquals(actualTitle, "Jobs - Recruitment - Job Search - Employment -Job Vacancies - Naukri.com");
		//Assert.assertTrue(false)
		
	}
	
	@Test
	public void validate_Url()
	{
	WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
		String url =  driver.getCurrentUrl();
		System.out.println("-URL----"+url);
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(url,"https://www.google.com/");
		
		
	driver.quit();
	soft.assertAll();

}
 }
