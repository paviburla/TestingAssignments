package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
				
		//driver.switchTo().frame(0); //we dont prefer this
		
		//driver.switchTo().frame("login_page");
		
		WebElement webele = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(webele); //use this
		
		

		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("Test");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[normalize-space()='Credit Card only? Login here']")).click();
		
		Thread.sleep(2000);
		
		
		
		
		//driver.close();
		
		driver.quit();


	}

}
