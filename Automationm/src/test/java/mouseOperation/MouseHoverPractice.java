package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class MouseHoverPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
	   driver.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	   
	
	   
	   // Mouse hover operation   //moveToElement(element)
	   
	   WebElement arrow = driver.findElement(By.xpath("//*[@id=\"product-menu-toggle\"]"));
	   
	   WebElement orders = driver.findElement(By.xpath("//*[@id=\"product-menu-dropdown\"]"));
	   
	   // Actions class  //Actions act = new Actions (driver);
	   
	   Actions act = new Actions(driver);
	   
	   act.moveToElement(arrow).perform();
	   
	   act.moveToElement(orders).click().perform();
	   Thread.sleep(3000);
	   driver.close();
	    
	   WebDriver driver1 = HelperClass.browserSetup("chrome");
	   driver1.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
	   
	   driver1.manage().window().maximize();
	   WebElement gmail = driver1.findElement(By.xpath("//*[@id=\"primary-menu\"]"));
	   
	   //Actions class 
	   
	   Actions act1 = new Actions(driver1);
	   
	   act1.contextClick(gmail).build().perform();
	   Thread.sleep(2000);
	   driver1.close();
	}
}
