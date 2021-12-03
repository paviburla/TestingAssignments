package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindEleAss5_part2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//input[@title='Search']")).sendKeys("selenium");
		Thread.sleep(3000);
		
      List<WebElement> allemnts = driver.findElements(By.xpath("//input[@title='Search']"));
		
	
		

		
		for(int i=0;i<allemnts.size();i++)
		{
			String dropdown_opt = allemnts.get(i).getText();
			
			System.out.println("-----DropdownOptions---"+dropdown_opt);
		}
		
		driver.close();
		

	}

}
