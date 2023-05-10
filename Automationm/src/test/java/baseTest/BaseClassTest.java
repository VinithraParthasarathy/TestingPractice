package baseTest;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import testNgTestCases.LoginPageTask;

public class BaseClassTest {
	public  WebDriver driver;
	Properties prop;
	public static LoginPageTask rem=new LoginPageTask();
	
	@BeforeTest
	public void setUp() throws IOException
	{
		if(driver==null)
		{
	    File f = new File(System.getProperty("user.dir")+""
	    		+ "\\src\\test\\resources\\configFiles\\config.properties");
		FileReader fr = new FileReader(f);
		prop = new Properties();
		prop.load(fr);
		}
		
		if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
		{
			WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
			driver.get(prop.getProperty("testUrl"));
			driver.manage().window().maximize();
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			 driver = new EdgeDriver();
			 driver.get(prop.getProperty("testUrl"));
			 driver.manage().window().maximize();
			 
			
		}
		else if (prop.getProperty("browser").equalsIgnoreCase("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			 driver.get(prop.getProperty("testurl"));
			 driver.manage().window().maximize();
			
		}
		else
		{
			System.out.println("Pass the valid browser ...");
		}
	}

	
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
