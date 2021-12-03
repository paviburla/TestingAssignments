package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClickAndHold_Release {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.manage().window().maximize();
		
		WebElement webele = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(webele);
		
		WebElement source = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
		
		driver.close();

	}

}
