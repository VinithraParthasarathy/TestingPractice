package demo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import demo1.HelperClass;

public class AlertPractice {
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		System.out.println("Simple alert");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		
		System.out.println("Confirm alert");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert alt1 = driver.switchTo().alert();
		
		                      //alt1.accept();
		alt1.dismiss();
		Thread.sleep(2000);
		
		System.out.println("Prompt alert ");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		
		Alert alt2 = driver.switchTo().alert();
		alt2.sendKeys("selenium");
		alt2.accept();
		
		
		Thread.sleep(2000);
		driver.close();
}
}


