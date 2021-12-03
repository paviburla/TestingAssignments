package mavenproject.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
	List<WebElement> alllinks = driver.findElements(By.tagName("a"));
		
		int total_Links = alllinks.size();
		
		System.out.println("-----NoOfLinks----"+total_Links);
	
		for(int i=0;i<total_Links;i++)
		{
			String linknames = alllinks.get(i).getText();
			
			System.out.println("----LinkName----"+linknames);
			
		}
		
		
List<WebElement> allimages = driver.findElements(By.tagName("img"));
		
		int total_images = allimages.size();
		
		System.out.println("-----NoOfImages----"+total_images);
		
		for(int i=0;i<total_Links;i++)
		{
			String imagenames = allimages.get(i).getAttribute("src");
			
			System.out.println("----ImageName----"+imagenames);
			
		}
         driver.close();
	}

}
