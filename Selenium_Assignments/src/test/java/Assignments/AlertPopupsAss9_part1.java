package Assignments;
//test
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPopupsAss9_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.xpath("//input[@title='Sign in']")).click();
		
		Alert alt = driver.switchTo().alert();
		
        String text = alt.getText(); // Print text in alert popup 
		
		System.out.println("-----AlertText----"  +text);
		
		alt.accept();
		
		driver.close();

	}

}
