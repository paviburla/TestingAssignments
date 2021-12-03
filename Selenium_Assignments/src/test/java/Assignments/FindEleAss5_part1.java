package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindEleAss5_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/index.html");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int totalLinks = links.size();
		
	//	System.out.println("-----NOofLinks----"+totalLinks);
		
		for (int i=0;i<totalLinks;i++)
		{
		String linkName = links.get(i).getText();	
		
		System.out.println("-----LinkName----"+linkName);
		}
		
		driver.close();

	}

}
