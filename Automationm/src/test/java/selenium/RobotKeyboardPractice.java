package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class RobotKeyboardPractice {
public static void main(String[] args) throws AWTException, InterruptedException {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		WebElement gmail = driver.findElement(By.linkText("Gmail"));   // Right click on g mail  
		
		Actions act = new Actions(driver);
		act.moveToElement(gmail).contextClick().build().perform();
		
		Robot r = new Robot();  // Create an object for Robot class or action class  //robot class is faster
		
		for (int i =1; i<=3;i++)         // use for loop or do repeated actions
		{
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
		
}
}
}