package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class Task {
public static void main(String[] args) {
	
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	//Get all the prices and add it together
	List<WebElement> prices = driver.findElements(By.xpath("//table[@name='BookTable']//td[4]"));
	int sum =0;
	for(WebElement price: prices)
	{
		String text = price.getText();
		System.out.println(text);
	//convert string to integer
	int parseInt = Integer.parseInt("prices");
	sum = sum+parseInt;}
	System.out.println("Sum of all the prices + sum");
	
}
}
