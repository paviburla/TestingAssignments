package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");
		
	//	WebElement textbox = driver.findElement(By.className("newTerm"));
		
	//	textbox.getAttribute(null);
		
		//driver.findElement(By.id("country"));
		
		driver.findElement(By.name("country24dba02e"));
		
		//driver.findElement(By.linkText("terms and conditions"));
		
		//driver.findElement(By.cssSelector(""));
		
		//driver.findElement(By.xpath("//input[@class='captcha']"));
		
		//driver.findElement(By.tagName("input"));
		
		//driver.findElement(By.partialLinkText("terms"));

	}

}
