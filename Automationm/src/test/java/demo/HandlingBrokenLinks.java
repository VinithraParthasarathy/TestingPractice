package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class HandlingBrokenLinks {
public static void main(String[] args) {
		
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		driver.get("http://www.deadlinkcity.com/");
		
		//Fetch all the a tags 
		
		List<WebElement> alltags = driver.findElements(By.tagName("a"));
		
		for(WebElement tags:alltags)
		{
			String url = tags.getAttribute("href");
			HelperBrokenLinkCheck.brokenLinkChecker(url);
		}
		
		
		}

}
