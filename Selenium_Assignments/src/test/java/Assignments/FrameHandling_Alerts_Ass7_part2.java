package Assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameHandling_Alerts_Ass7_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("paviburla");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Paviash1925");
		
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		driver.navigate().refresh();
		
		WebElement webele = driver.findElement(By.xpath("//frame[@name='mainpanel']"));
		
		driver.switchTo().frame(webele);
        WebElement wb = driver.findElement(By.xpath("//a[normalize-space()='Contacts']"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(wb).build().perform();
		
		driver.findElement(By.xpath("//a[normalize-space()='New Contact']")).click();

		
		driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Pavithra");
		driver.findElement(By.xpath("//input[@id='surname']")).sendKeys("Burla");
		driver.findElement(By.xpath("//input[@value='Save']")).click();
		

		driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		driver.findElement(By.xpath("//tbody/tr[5]/td[8]/a[4]/i[1]")).click();
		
		Alert alt = driver.switchTo().alert();
		
		String text = alt.getText();
		System.out.println("----AlertText-----"+text);
		
		alt.dismiss();
		driver.findElement(By.xpath("//tbody/tr[5]/td[8]/a[4]/i[1]")).click();
		alt.accept();
		
		driver.close();	
		
	}

}
