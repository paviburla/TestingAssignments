package mavenproject.mavenproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementsCommands {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://classic.freecrm.com/register/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Firstname");
		
		//driver.findElement(By.xpath("")).sendKeys("abc");
		
		Thread.sleep(3000);
     driver.findElement(By.xpath("//input[@placeholder='First Name']")).clear();
      
       String classvalue = driver.findElement(By.xpath("//input[@placeholder='First Name']")).getAttribute("class");
       System.out.println("-------classvalue--- " +classvalue); 
       
       String text = driver.findElement(By.xpath("//a[normalize-space()='Pricing']")).getText();
       System.out.println("-------text--- " +text); 
       
       //driver.findElement(By.xpath("")).getText();
     //  driver.findElement(By.xpath("")).getTagName();
       boolean featureTab = driver.findElement(By.xpath("//a[normalize-space()='Features']")).isDisplayed();
      System.out.println("----featureTab---- " +featureTab);
      
     
    //  Thread.sleep(3000);
      
      boolean chkbox = driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
      System.out.println("----chkbox----- " +chkbox);
      
      boolean submitbutton = driver.findElement(By.xpath("//div[@class='myButton']")).isEnabled();
      System.out.println("----submitbutton---- " +submitbutton);
      
   
       
      
      
      driver.findElement(By.xpath("//input[@name='agreeTerms']")).click();
      
      boolean submitbutton1 = driver.findElement(By.xpath("//div[@class='myButton']")).isEnabled();
      System.out.println("----checkboxafterselected---- " +submitbutton1);
      
      
      boolean chkbox1 = driver.findElement(By.xpath("//input[@name='agreeTerms']")).isSelected();
      System.out.println("----afterselectchkbox----- " +chkbox1);
      
      
     String cssvalue =  driver.findElement(By.xpath("//img[@class='img-responsive']")).getCssValue("color");
     System.out.println("-----cssvalue----" +cssvalue);
      
      
      
      driver.close();
	}
	
	
	
	
	

}
