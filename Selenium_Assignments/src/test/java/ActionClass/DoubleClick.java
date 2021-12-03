package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DoubleClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://api.jquery.com/dblclick/");
		driver.manage().window().maximize();

		WebElement webele = driver.findElement(By.xpath("//div[@class='demo code-demo']//iframe"));
		driver.switchTo().frame(webele);
		WebElement wb = driver.findElement(By.xpath("//body//div"));
		Actions act = new Actions(driver);
		act.doubleClick(wb).build().perform();
		
		driver.close();
	}

}
