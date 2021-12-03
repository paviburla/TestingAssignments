package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationsAss4_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		
		String title = driver.getTitle();
		
		System.out.println("----Title----" +title);
		
      String url = driver.getCurrentUrl();
		
		System.out.println("----CurrentURL----" +url);
		
	
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("First Name");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Last Name");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("Myemail@gmail.com");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Confirm Email']")).sendKeys("Myemail@gmail.com");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Username");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("password");
		   
		   driver.findElement(By.xpath("//input[@placeholder='Confirm Password']")).sendKeys("password");
		   
		   String text = driver.findElement(By.xpath("//span[normalize-space()='All fields are required.']")).getText();
	       System.out.println("-------text--- " +text); 
		   
		   driver.close();

		
		

	}

}
