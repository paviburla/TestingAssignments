package mavenproject.mavenproject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(3000);
		
		String text = alt.getText(); //text in alert popup 
		
		System.out.println("-----AlertText----"  +text);
		
		Thread.sleep(2000);
		
		alt.accept();  //ok
		
		//cancel
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
		
		Thread.sleep(2000);
		
		Alert alt1 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		alt1.dismiss();
		
		
	//sendkeys	
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
		
		Thread.sleep(2000);
		
		Alert alt3 = driver.switchTo().alert();
		
		alt3.sendKeys("TEST");
		
		Thread.sleep(2000);
		
		alt3.dismiss();
		
		
	
	//	alt.sendKeys("Text");  //to pass info
		
		driver.close();
		
		
		
		
	}

}
