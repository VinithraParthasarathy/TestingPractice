package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class JavaScriptExePractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		
		WebElement register = driver.findElement(By.linkText("Register"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].click();", register);
		
		WebElement fname = driver.findElement(By.id("FirstName"));
		
		WebElement female = driver.findElement(By.id("gender-female"));
		
		jse.executeScript("arguments[0].click();arguments[1].value='SELENIUM'; ", female, fname);
		
		
	}
}
