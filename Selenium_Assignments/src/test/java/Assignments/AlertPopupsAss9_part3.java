package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupsAss9_part3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
        String text = alt.getText(); // Print text in alert popup 
		
		System.out.println("-----AlertText----"  +text);
		
		Thread.sleep(2000);
		
		alt.dismiss();
		
		Thread.sleep(2000);
		
    driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		
		alt1.sendKeys("Suresh");
		
		Thread.sleep(2000);
		
		alt1.accept();
		
		Thread.sleep(2000);
		
		driver.close();

	}

}
