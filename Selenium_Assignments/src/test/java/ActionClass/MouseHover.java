package ActionClass;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		


		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://www.spicejet.com/");
		
		driver.manage().window().maximize();
		
	Thread.sleep(3000);
		
		WebElement wb = driver.findElement(By.xpath("//div[contains(text(),'Add-ons')]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();

		driver.close();
	}

}
