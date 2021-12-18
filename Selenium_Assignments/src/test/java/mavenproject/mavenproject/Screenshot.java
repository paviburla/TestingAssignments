package mavenproject.mavenproject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();
		
		
		TakesScreenshot st=(TakesScreenshot)(driver);
		File src=st.getScreenshotAs(OutputType.FILE);
		
		File dst=new File("C:\\Users\\Asthra\\Pictures\\Roblox.jpeg");
		
	FileUtils.copyFile(src, dst);
	System.out.println("---screenshot done----");

	driver.close();
	

	}

}
