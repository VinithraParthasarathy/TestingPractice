package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class WindowsHandlingPractice {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://testautomationpractice.blogspot.com/"); //u r l
		driver.manage().window().maximize();  //maximize
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); //implicit
		WebElement inputbox = driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		inputbox.sendKeys("Java");
		inputbox.sendKeys(Keys.ENTER);
		
List<WebElement> alllinks = driver.findElements(By.xpath("//div[@id='wikipedia-search-result-link']/a")); // Getting all the links 
		
		for(WebElement link:alllinks)
		{
			link.click();   // It will open each one of the links from the parent window 
		}
		// Windows handling 
		String parentwindowid = driver.getWindowHandle();   // Get the parent window id 
		
		System.out.println("Parent window id is:" +parentwindowid);   // CDwindow-59CF528660C639554901E2B501FF869A
		
		Set<String> allhandles = driver.getWindowHandles();  // Each one of the window id will be unique .  
		
		//Switched to all the child windows and get the title of it 
	for (String currhandle: allhandles )
	{
		driver.switchTo().window(currhandle);
		String title = driver.getTitle();
		System.out.println(title);
		}
		
		
		// Switch to the particular window , When Selenium (software) - Wikipedia title matches to the current window title 
	for (String currhandle: allhandles )
	{		driver.switchTo().window(currhandle);
		String title = driver.getTitle();
			
			if(title.equals("Selenium (software) - Wikipedia"))
			{
			System.out.println(title);
			driver.close();
			}
		}
		
		
		// We can convert the set into list,because list is an index based , we can easily pass the index and switch 
		// on to the particular window 
		
		List<String> l = new ArrayList<>(allhandles);   //Converted set of string i.e :all handles into list<String> 
		
		for(String a: l)   // Enhanced for loop 
		{
			driver.switchTo().window(a);
			driver.close();
		}
		
		//If we want to switch to the particular window using index 
		
		driver.switchTo().window(l.get(4));
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		driver.close();
}
}

