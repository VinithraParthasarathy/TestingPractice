package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class BorderOverAndFlashing {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		WebElement email = driver.findElement(By.id("email"));
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		jse.executeScript("arguments[0].value='Selenium' ;", email); 
		
		jse.executeScript("arguments[0].style.border='3px solid purple' ;", email); //Draw a border over the email element
		
		
		WebElement login = driver.findElement(By.name("login"));
		
		String loginbgcolor = login.getCssValue("background-color");   //to know the b g color
		
		System.out.println(loginbgcolor);    
		
		String logincolor = login.getCssValue("color");   // color code
		
		System.out.println(logincolor);   
		
		// To know where the operation is going on , We can perform Flash operation 
		
		String bgcolor="rgb(235, 229, 52)";   //color code
		
		for (int i =0;i<100;i++)
		{
			
			jse.executeScript("arguments[0].style.backgroundColor= '" +loginbgcolor+ " '  ;" , login);
			
			jse.executeScript("arguments[0].style.backgroundColor= '" + bgcolor+ " '  ;" , login);
		}
		
		jse.executeScript("arguments[0].click();", login);
		
		Thread.sleep(1000);
		driver.close();
		
		
		
	}
}
