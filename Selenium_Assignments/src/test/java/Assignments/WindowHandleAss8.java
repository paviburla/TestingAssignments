package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleAss8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement webele = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(webele);
		
		driver.findElement(By.xpath("//a[normalize-space()='Credit Card only? Login here']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("----Title---"+title);
		
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.navigate().back();
		
		driver.quit();
		
		

	}

}
