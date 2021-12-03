package Assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserComAss1Part1_Bofa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();	
		
		driver.manage().window().maximize();
		
		driver.get("https://www.bankofamerica.com/smallbusiness/");
		
		String title = driver.getTitle();
		
		System.out.println("-----Title----- " +title);
		
		String url = driver.getCurrentUrl();
		
		System.out.println("-----URL----" +url);
		
		String pgsrc = driver.getPageSource();
		
		System.out.println("-----PageSource----" + pgsrc);
		
		driver.close();
	}

}
