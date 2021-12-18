package Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Bootstrap_DropdownAss6_part2 {

	public static void main(String[] args) throws InterruptedException {
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
     Thread.sleep(1000);
     
     driver.findElement(By.
    	xpath("/html[1]/body[1]/div[3]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/span[1]/div[1]/ul[1]/li[5]/a[1]/label[1]/input[1]"
     		)).click();
     
    // driver.findElement(By.xpath("//input[@value='CSS']")).click();
     Thread.sleep(1000);
     
     

     List<WebElement>allcheckboxes_check = driver.findElements(By.xpath("//label[@class='checkbox']"));

     int total_checkboxes_check = allcheckboxes_check.size();

     for(int i=0;i<total_checkboxes_check;i++)
     {
    	allcheckboxes_check.get(i).click();
    	
Thread.sleep(1000);

     }

     
   
     
     
     
     
     
    // driver.close();
     
     
	}

}
