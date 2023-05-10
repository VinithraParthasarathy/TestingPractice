package testNgTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderTask {
WebDriver driver;
	
	@Test(priority=0, dataProvider="data")  //@annotation(attribute)              //receiver
	public void launchUrl(String url)
	{
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	
	@Test(priority=1, dataProvider="datas")               //receiver
	public void pageLogin(String uname, String pwd)
	{
	 driver.findElement(By.name("username")).sendKeys(uname);
	 driver.findElement(By.name("password")).sendKeys(pwd);
     driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	 
	}

	
	@DataProvider                                     //supplier
	public Object[] data()
	{
		Object[] arr = {"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"};
		return arr;
	}
	
	
	
	@DataProvider                                     //supplier
	public Object[][] datas()
	{
		Object[][] tarr= { {"Orange123", "2345"}, 
				            {"Data123", "6789"} , 
				            {"admin12345", "2468"},
				            {"Admin", "admin123"}              };
		
		return tarr;
	}
}
