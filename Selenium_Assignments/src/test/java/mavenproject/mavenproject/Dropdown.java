package mavenproject.mavenproject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php");
		
		driver.manage().window().maximize();
		
		WebElement country_dropdown = driver.findElement(By.xpath("//select[@id='country']"));
		
		Select slt = new Select(country_dropdown);
		
	//	slt.selectByIndex(4);
		
		
	//	slt.selectByValue("13");
		
		slt.selectByVisibleText("Bahamas");
		
		Thread.sleep(2000);
		
		List<WebElement> all = slt.getOptions();
		
		for(int i=0;i<all.size();i++)
		{
			String dropdown_opt = all.get(i).getText();
			
			System.out.println("-----DropdownOptions---"+dropdown_opt);
		}
		
		driver.close();
		

	}

}
