package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownAss6_part1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://register.rediff.com/register/register.php");
		
		driver.findElement(By.xpath("//input[@maxlength='61']")).sendKeys("PavithraBurla");
		
		driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("paviburla");
		
		driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).sendKeys("paviash1925");
		
		String mlength = driver.findElement(By.xpath("//input[contains(@name,'passwd')]")).getAttribute("maxlength");
		
		System.out.println("----MaxLength---"+mlength);
		
		driver.findElement(By.xpath("//input[contains(@name,'confirm')]")).sendKeys("paviash1925");
		
		driver.findElement(By.xpath("//input[contains(@name,'altemail')]")).sendKeys("paviburla@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='mobno']")).sendKeys("0123456789");
	       
       
     WebElement day_dropdown = driver.findElement(By.xpath("//select[contains(@name,'DOB_Day')]"));
		
		Select slt = new Select(day_dropdown);
		
		slt.selectByValue("19");
		
		 WebElement month_dropdown = driver.findElement(By.xpath("//select[contains(@name,'DOB_Month')]"));
	
		 Select slt1 = new Select(month_dropdown);
		 
		 slt1.selectByVisibleText("JUN");
		 
		 WebElement year_dropdown = driver.findElement(By.xpath("//select[contains(@name,'DOB_Year')]"));
			
		 Select slt2 = new Select(year_dropdown);
		 
		 slt2.selectByVisibleText("1985");
		 
		 boolean male_button = driver.findElement(By.xpath("//input[@value='m']")).isSelected();
		 
		 System.out.println("----MaleButtonSelected----"+male_button);
		 
		 driver.findElement(By.xpath("//input[@value='f']")).click();
		 
		 WebElement country_dropdown = driver.findElement(By.xpath("//select[@id='country']"));
			
			Select slt3 = new Select(country_dropdown);
			String defaultselect = slt3.getFirstSelectedOption().getText();
			
			System.out.println("------DefaultSelect-----"+defaultselect);
			Boolean multiselect = slt3.isMultiple();
			System.out.println("---MultiSelect----"+multiselect);
			
			List<WebElement> all = slt3.getOptions();
			
			for(int i=0;i<all.size();i++)
			{
				String dropdown_opt = all.get(i).getText();
				
				System.out.println("-----DropdownOptions---"+dropdown_opt);
			}
			
			 slt3.selectByVisibleText("India");
			 
			 WebElement city_dropdown = driver.findElement(By.xpath("//select[contains(@name,'city')]"));
			
			Select slt4 = new Select(city_dropdown);
			
			slt4.selectByVisibleText("Bangalore");
			
			driver.findElement(By.xpath("//input[@id='Register']")).click();
			
			driver.close();
			
		 
		 
		 
		}
		
		
	}


