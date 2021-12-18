package Assignments;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOperations_ScreenShot_Ass11_Part2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://ttdsevaonline.com/#/login");
		
		TakesScreenshot st=(TakesScreenshot)(driver);
		File src=st.getScreenshotAs(OutputType.FILE);
		File dst=new File("C:\\Users\\Asthra\\Pictures\\Roblox\screenshot.jpeg");
		FileUtils.copyFile(src, dst);
		
		System.out.println("Ready Shot");
		
		//driver.findElement(By.xpath("")).click();
		
		//TakesScreenshot st1=(TakesScreenshot)(driver);
		//File src1=st1.getScreenshotAs(OutputType.FILE);
		//File dst1=new File("Pictures");
		//FileUtils.copyFile(src1, dst1);
		
		
		driver.close();

	}

}
