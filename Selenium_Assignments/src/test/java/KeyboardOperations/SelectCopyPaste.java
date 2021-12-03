package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectCopyPaste {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.com/advanced_search");
		driver.manage().window().maximize();

		driver.findElement(By.name("as_q")).sendKeys("ABCD");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.name("as_q")).sendKeys(Keys.CONTROL+"c");
		
		driver.findElement(By.name("as_q")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).clear();
		
		Thread.sleep(2000);
		
		driver.close();
		
		
		
	}

}
