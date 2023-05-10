package testNgTestCases;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTask {
static WebDriver driver;
	
	@BeforeTest
	public void  launchBrowser()

	{
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
    driver.get("https://blazedemo.com/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
	@Test
	public void click() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='vacation.html']")).click();
		driver.navigate().back();
		Thread.sleep(1000);
		{
			
		Select se = new Select(driver.findElement(By.xpath("//select[@name='fromPort']")));
		se.selectByVisibleText("Paris");
		Thread.sleep(1000);
		}
		{
			Select se = new Select(driver.findElement(By.xpath("//select[@name='toPort']")));
			se.selectByIndex(2);
			Thread.sleep(1000);
		}
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		Thread.sleep(2000);
		
	double value=0;
 List<WebElement> a = driver.findElements(By.xpath("//table[@class='table']//td[6]"));
 for(int b=0; b<a.size(); b++)
 {
	 String text = a.get(b).getText();
	 String substring = text.substring(1);
	 double d = Double.parseDouble(substring);
	 value=value+d;
//	 System.out.println(value);
 }
 
 System.out.println(value);

	}
	@AfterTest
	public void quit()
	{
		driver.close();
	}
	
}
