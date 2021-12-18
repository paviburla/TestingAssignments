package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.math.BigDecimal;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Excel_Reader {

WebDriver driver;
	
	@BeforeClass
	public void LaunchingBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void Input() throws IOException, InterruptedException 
	{
		driver.get("http://demo.automationtesting.in/Register.html");
		
		FileInputStream f1 = new FileInputStream("D:\\Selenium_Java_Workspace\\mavenproject\\Resources\\TestData.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f1);
		XSSFSheet sheet =  wb.getSheet("Sheet1");
		
		String Firstname = sheet.getRow(1).getCell(0).getStringCellValue();
		String Lastname = sheet.getRow(1).getCell(1).getStringCellValue();
		//Double PhNo = sheet.getRow(1).getCell(2).getNumericCellValue();
		//String PhoneString = BigDecimal.valueOf( PhNo ).toBigInteger().toString();
		String PhNo = sheet.getRow(1).getCell(2).getStringCellValue();
		System.out.println("----FirstName---"+Firstname);
		System.out.println("----Lastname---"+Lastname);
		//System.out.println("----PhNo---"+PhoneString);
		System.out.println("----PhNo---"+PhNo);
		
		
		
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
	    driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(PhNo);
		
		Thread.sleep(2000);
	}
	
	
	
@AfterClass
	
	public void ClosingBrowser()
	{
		driver.quit();
	}
}
