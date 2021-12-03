package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/#Photo%20Manager");
		
		driver.manage().window().maximize();
		
		WebElement frameelement = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		
		driver.switchTo().frame(frameelement);
		
		WebElement source = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		
		WebElement dest = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, dest).build().perform();
		
		System.out.println("----drag and drop done----");
		driver.close();
	}

}
