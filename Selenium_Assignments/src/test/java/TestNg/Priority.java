
	package TestNg;

	import org.openqa.selenium.WebDriver;

	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	import org.testng.asserts.SoftAssert;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Priority	
	 {
		@Test(priority = 2)
		public void Amazon()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
			
			System.out.println("-Amazon----");
			
			
			
		}
		
		@Test(priority = 1)
		public void Google()
		{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
			String url =  driver.getCurrentUrl();
			System.out.println("-Google----"+url);
			
			
			
			
		driver.quit();
		

	}
	 

}
