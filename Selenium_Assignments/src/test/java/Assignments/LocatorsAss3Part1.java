package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsAss3Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
	//	WebElement textbox = driver.findElement(By.className("newTerm"));
		
	//	textbox.getAttribute(null);
		
		driver.findElement(By.id("username"));
		
		//driver.findElement(By.name("country24dba02e"));
		
		//driver.findElement(By.linkText("terms and conditions"));
		
		//driver.findElement(By.cssSelector(""));
		
		//driver.findElement(By.xpath("//input[@class='captcha']"));
		
		//driver.findElement(By.tagName("input"));
		
		//driver.findElement(By.partialLinkText("terms"));
		
		driver.close();

	}

}
