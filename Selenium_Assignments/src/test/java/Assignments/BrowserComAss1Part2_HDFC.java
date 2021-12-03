package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserComAss1Part2_HDFC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		driver.manage().window().maximize();
		
		WebElement webele1=driver.findElement(By.xpath("//frame[@name='login_page']"));

        driver.switchTo().frame(webele1);
        
        driver.findElement(By.xpath("//a[normalize-space()='Credit Card only? Login here']")).click();
        Thread.sleep(2000);
        
	String title =driver.getTitle();
	
	System.out.println("----Title----" +title);
	
	String url = driver.getCurrentUrl();
	
	Thread.sleep(2000);
	
	System.out.println("-----CurrentURL====" +url);
	
	driver.quit();
	
	}

}
