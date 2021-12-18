package mavenproject.mavenproject;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		
		WebElement webele = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(webele);
		
		driver.findElement(By.xpath("//a[normalize-space()='Register Now']")).click();
		
		
		String parent_id = driver.getWindowHandle();
		System.out.println("-----ParentWindowId----"+parent_id);
		
		Set<String>allwindowids = driver.getWindowHandles();
		
		/*
		 * ArrayList <String> list = new ArrayList <String>(allwindowids);
		 * for(int i=0;i<list.size();i++)
		 * {
		 * driver.switchTo.window(nameOrHandle);
		 * }
		 * 
		 */
		java.util.Iterator<String> it = allwindowids.iterator();
		String parentwindow_id = it.next();
		String childwindow_id = it.next();
		
		System.out.println("-----ParentWindowId----"+parentwindow_id);
		System.out.println("-----ChildWindowId----"+childwindow_id);
		
		driver.switchTo().window(childwindow_id);
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("123456");
		
		
		
		driver.switchTo().window(parentwindow_id);
		
		System.out.println(driver.getCurrentUrl());
		
      WebElement webele1 = driver.findElement(By.xpath("//frame[@name='login_page']"));
		
		driver.switchTo().frame(webele1);
		
		String parentwindow_text = driver.findElement(By.xpath("//div[normalize-space()='Log in to NetBanking']")).getText();
		System.out.println("-----ParentWindowText----"+parentwindow_text);
		
		driver.quit();

	}

}
