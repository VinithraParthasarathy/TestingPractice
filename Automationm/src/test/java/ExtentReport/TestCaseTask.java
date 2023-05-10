package ExtentReport;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCaseTask {
	public WebDriver driver;
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
		
		driver.findElement(By.name("radiooptions")).click();   
		driver.findElement(By.id("checkbox1")).click();      
		
		WebElement d = driver.findElement(By.id("msdd"));
		Select s = new Select(d);
		s.selectByVisibleText("English");
		
		
				
		WebElement d1 = driver.findElement(By.id("Skills"));
		Select s1 = new Select(d1);
		s1.selectByVisibleText("Java");
		
		
		
		WebElement d2 = driver.findElement(By.xpath("//input[@type='search']"));
		d2.sendKeys("india");
		d2.sendKeys(Keys.ENTER);
		
		
		WebElement d3 = driver.findElement(By.id("yearbox"));
		d3.sendKeys("1998");
		d3.sendKeys(Keys.ENTER);
		
		
		
		WebElement d4 = driver.findElement(By.xpath("//select[@type='text']"));
		d4.sendKeys("December");
		d4.sendKeys(Keys.ENTER);
		
		
		
		WebElement d5 = driver.findElement(By.id("daybox"));
		d5.sendKeys("29");
		d5.sendKeys(Keys.ENTER);
		
	
//		driver.findElement(By.id("firstpassword")).sendKeys(pwd);   
//		driver.findElement(By.id("secondpassword")).sendKeys(pwd);    
		
		
		
		}
		
}

