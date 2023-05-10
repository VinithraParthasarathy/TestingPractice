package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class DoubleClickPractice {
public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		   driver.get("https://testautomationpractice.blogspot.com/");
		   
		   
		   
		   WebElement field1 = driver.findElement(By.id("field1"));
		   
		   field1.clear();
		   field1.sendKeys("vinithra");
		   
		   WebElement copytext = driver.findElement(By.xpath("//button[text()='Copy Text']"));
		   
		   // Action class 
		   
		   Actions act = new Actions(driver);
		   
		   act.doubleClick(copytext).perform();
	}

	
	
	
	
	
	
	
	
	
	
}
