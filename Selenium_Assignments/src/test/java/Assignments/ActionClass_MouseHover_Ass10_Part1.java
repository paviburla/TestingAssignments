package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClass_MouseHover_Ass10_Part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		


		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://book.spicejet.com/RetrieveBooking.aspx?AddMeal=true");
		
		driver.manage().window().maximize();
		
		WebElement wb = driver.findElement(By.xpath("//a[@id='Login']"));
         Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		WebElement wb1 = driver.findElement(By.xpath("//a[@href='javascript:void();']"));
        Actions act1 = new Actions(driver);
		
		act1.moveToElement(wb1).build().perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign up']")).click();



	}

}
