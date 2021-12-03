package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover_Flipkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(text(),'✕')]")).click();
		
		WebElement wb = driver.findElement(By.xpath("//div[contains(text(),'Electronics')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
WebElement wb1 = driver.findElement(By.xpath("//a[normalize-space()='Audio']"));
		
		Actions act1 = new Actions(driver);
		
		act1.moveToElement(wb1).build().perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Home Theatres']")).click();
		
		driver.close();
		
		
		
		
		
		
	}

}
