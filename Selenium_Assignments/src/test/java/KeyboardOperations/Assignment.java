package KeyboardOperations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("http://the-internet.herokuapp.com/key_presses");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='target']")).sendKeys("ABCD");
		driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.BACK_SPACE);
		
		


		WebElement webele = driver.findElement(By.xpath("//p[@id='result']"));
		String text = webele.getText();
		
		System.out.println("---Text----"+text);
		
		driver.findElement(By.xpath("//input[@id='target']")).sendKeys(Keys.ALT);

		WebElement webele1 = driver.findElement(By.xpath("//p[@id='result']"));
		String text1= webele1.getText();
		
		System.out.println("---Text----"+text1);
		
		driver.close();
		
	}

}
