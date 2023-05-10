package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class RightClickPractice {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver1 = HelperClass.browserSetup("chrome");
		 driver1.manage().window().maximize();
		   driver1.get("https://www.browserstack.com/guide/mouse-hover-in-selenium");
		   
		  
		   WebElement gmail = driver1.findElement(By.xpath("//*[@id=\"primary-menu\"]"));
		   
		   //Actions class 
		   
		   Actions act1 = new Actions(driver1);
		   
		   act1.contextClick(gmail).build().perform();
		   Thread.sleep(2000);
		   driver1.close();
		
	}
}
