import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ExtentReport.ExcelReaderdemo;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTask {
	WebDriver driver;
	@BeforeMethod
	public void url() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}
	@Test(priority=1,dataProviderClass=ExcelReaderdemo.class,dataProvider="getData")
	public void login(String fn,String ln,String Address,String email,String phone) {
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln);
		driver.findElement(By.xpath("//textarea[@rows='3']")).sendKeys(Address);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(phone);
	}
	@AfterMethod
	@Test(priority=2)
	public void details() {
		driver.findElement(By.xpath("//input[@value='FeMale']")).click();
		driver.findElement(By.id("checkbox1")).click();
		
		WebElement lang = driver.findElement(By.id("msdd"));
		WebElement lang1 = driver.findElement(By.xpath("//a[text()='Arabic']"));
		Actions act= new Actions(driver);
		act.moveToElement(lang).click().build().perform();
		act.moveToElement(lang1).click().build().perform();
		
		WebElement skills = driver.findElement(By.id("Skills"));
		Select s = new Select(skills);
		s.selectByVisibleText("Java");
		
		
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		WebElement search = driver.findElement(By.xpath("//input[@type='search']"));
		search.sendKeys("india");
		search.sendKeys(Keys.ENTER);
		
		WebElement year = driver.findElement(By.id("yearbox"));
		Select s1=new Select(year);
		s1.selectByValue("1998");
		
		WebElement month = driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select s2=new Select(month);
		s2.selectByVisibleText("December");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select s3=new Select(day);
		s3.selectByIndex(29);
		
        driver.findElement(By.id("firstpassword")).sendKeys("1234");
        driver.findElement(By.id("secondpassword")).sendKeys("1234");
        
        driver.findElement(By.id("submitbtn")).click();

	}
	@AfterTest
	public void close() {
		driver.close();
	}
	
}
