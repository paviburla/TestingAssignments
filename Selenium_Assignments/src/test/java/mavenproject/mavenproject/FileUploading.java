package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.monsterindia.com/seeker/registration");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\SelTestDoc.txt");
		
		//driver.close();
		

		

	}

}
