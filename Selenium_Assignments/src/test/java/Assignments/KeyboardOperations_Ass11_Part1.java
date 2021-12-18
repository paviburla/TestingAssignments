package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations_Ass11_Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/advanced_search");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("(//input[@id='xX4UFf'])[1]")).sendKeys("field");
		driver.findElement(By.xpath("(//input[@id='xX4UFf'])[1]")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys("field");
		
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"a");
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"c");
		driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.TAB);
		
		driver.findElement(By.xpath("//input[@id='mSoczb']")).sendKeys(Keys.CONTROL+"v");
		driver.close();
		
		
	//	driver.findElement(By.xpath("//input[@id='CwYCWc']")).sendKeys(Keys.CONTROL+"v");
		

	}

}
