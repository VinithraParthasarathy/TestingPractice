package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import demo1.HelperClass;

public class ExceptionHandlingPractice {
public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://letcode.in/waits"); //to open url
		driver.manage().window().maximize();  //to maximize
		
		WebElement alert = driver.findElement(By.id("accept"));
		
		alert.click(); 

		WebDriverWait wait = new WebDriverWait(driver,10);  //Explicit wait
		
		Alert alt = wait.until(ExpectedConditions.alertIsPresent());
		
		alt.accept();
		
}
}