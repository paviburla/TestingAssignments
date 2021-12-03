package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OperationsAss4_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		driver.findElement(By.xpath("//a[normalize-space()='Sign Up']")).click();
		boolean subbutton = driver.findElement(By.xpath("//div[@class='myButton']")).isDisplayed();
		
		System.out.println("----SubmitButton---" +subbutton);
		
boolean subbutton1 = driver.findElement(By.xpath("//button[@id='submitButton']")).isEnabled();
		
		System.out.println("----SubmitButton---" +subbutton1); 
		
	boolean chkbox=	driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
	
	System.out.println("----CheckBox---" +chkbox); 
	
	
		
		driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
		
		boolean chkbox1=	driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
		
		System.out.println("----CheckBoxAfterSelected---" +chkbox1); 
		
		driver.close();
		
		
		
		

	}

}
