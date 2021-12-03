package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
//     System.setProperty("webdriver.gecho.driver", "D:\\chromedriver_win32\\chromedriver.exe");
		
		// WebDriver driver1 = new FirefoxDriver();
	}

}
