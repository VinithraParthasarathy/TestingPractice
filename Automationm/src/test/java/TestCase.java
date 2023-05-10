import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ExtentReport.ExcelReaderdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase {
	
		 WebDriver driver;
		@BeforeMethod
		public void url()
		
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://demo.automationtesting.in/Register.html");
			}
		
		@Test(dataProviderClass = ExcelReaderdemo.class  , dataProvider="getData")
		public void automationReg(String fn,String ln, String Address,String email, String phone)
		{
			
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);   
			driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln);   
			driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);   
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);                               
			driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys(phone);
}
}
