package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FramesHandlingAss7_part1 {

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
		
List<WebElement> contact_dropdown = driver.findElements(By.xpath("//a[normalize-space()='Contacts']"));

   int totallinks = contact_dropdown.size();
   
   for(int i=0;i<totallinks;i++)
   {
	   String contactdd = contact_dropdown.get(i).getText();
	   System.out.println("----ContactDropDown----"+contactdd);
   }
		
		
		//driver.findElement(By.xpath("//a[normalize-space()='Contacts']")).click();
		
		

	}

}
