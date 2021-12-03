package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap_DropdownAss6_part2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@title='HTML, CSS']")).click();
		
		List<WebElement>allcheckboxes = driver.findElements(By.tagName("label"));
		
		int total_checkboxes = allcheckboxes.size();
		
		for(int i=0;i<total_checkboxes;i++)
		{
			String checkboxes = allcheckboxes.get(i).getText();
			
			System.out.println("----AllCheckBoxes----"+checkboxes);
			
		}
		
     driver.findElement(By.xpath("//input[@value='HTML']")).click();
     
     driver.close();
     
     
     driver.findElement(By.xpath("//input[@value='CSS']")).click();
     
     
	}

}
