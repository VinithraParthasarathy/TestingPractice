package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo1.HelperClass;

public class ExplicitPractice {
	public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://www.google.com");   //To open the u r l
		driver.manage().window().maximize();    //To maximize
		
		WebElement inputbox = driver.findElement(By.name("q"));   // By is an abstract class 
		
		WebDriverWait wait = new WebDriverWait(driver,10);	  //Explicit
		
		WebElement ib = wait.until(ExpectedConditions.elementToBeClickable(inputbox));
		
		ib.sendKeys("Explicit");
		
		Boolean a = wait.until(ExpectedConditions.titleIs("Google"));
		
		System.out.println(a);
		((WebDriver) ib).close();
	}
	
}
