package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigationComAss2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		String pgtitle = driver.getTitle();
		
		System.out.println("-----PageTitle----" +pgtitle);
		
		driver.navigate().to("https://www.facebook.com/");
		
         String pgtitle1 = driver.getTitle();
		
		System.out.println("-----NextPageTitle----" +pgtitle1);
		
        Thread.sleep(3000);
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		driver.close();
		
		
		

	}

}
