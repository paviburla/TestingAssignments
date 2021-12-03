package mavenproject.mavenproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://google.com/");
		
		String title = driver.getTitle();
		
		System.out.println("-----TItle of the page----- " +title);
		
	    String url = driver.getCurrentUrl();
		
		System.out.println("----URL--- " +url);
		
		String pgsrc = driver.getPageSource();
		
		System.out.println("--- PageSource---"  +pgsrc);
		
		driver.close();
		
		//driver.quit();
	}

}
