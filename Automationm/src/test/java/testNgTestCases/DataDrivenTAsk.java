package testNgTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataDrivenTAsk {

WebDriver driver;
	@Parameters({"URL"})
	@Test(priority=0)
	public void fburl(String url)
	{
		WebDriverManager.chromedriver().setup();
	     driver = new ChromeDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
	}
	@Parameters({"USERNAME","PASSWORD"})
	
	@Test(priority=1)
	public void fbLogin(String uname, String password)
	{
	    driver.findElement(By.name("username")).sendKeys(uname);
	    driver.findElement(By.name("password")).sendKeys(password);
	    driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
}
