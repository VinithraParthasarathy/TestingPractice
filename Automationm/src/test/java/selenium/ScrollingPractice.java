package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class ScrollingPractice {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		driver.get("https://en.wikipedia.org/wiki/India");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		//jse.executeScript("window.scrollBy(0,3000);");  // Scroll down using pixels
		
		//OR
		
		WebElement politics = driver.findElement(By.id("Politics"));   // Scroll till the particular element 
		
		jse.executeScript("arguments[0].scrollIntoView(true);", politics);
		
		
		WebElement ad = driver.findElement(By.id("Administrative_divisions"));   // Scroll from one element to another element 
		
		jse.executeScript("arguments[0].scrollIntoView(true);arguments[1].scrollIntoView(true);",politics,ad);
		
		
		
	
	}
}
