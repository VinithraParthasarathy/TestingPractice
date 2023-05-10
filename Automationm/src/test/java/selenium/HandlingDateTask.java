package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class HandlingDateTask {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://jqueryui.com/datepicker/");  
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement inputbox = driver.findElement(By.id("datepicker"));
//		inputbox.sendKeys("29/12/1998");
		inputbox.click();

		String month = "December";
		String day = "29";
		String year = "1998";
		
		while(true)
		{
			String mon = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();
			String yr = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();
			
			if(mon.equals(month) && year.equals(yr))
			{
				break;  
			}
			else
			{
				driver.findElement(By.xpath("//span[text()='Prev']")).click();
			}
			
		}
		
		List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr/td/a"));  // To pick the date 
		
		for (WebElement date: alldates)
		{
			String date1 = date.getText();
			
			if(date1.equals(day))
			{
				date.click();
			}
		}
		
	}
}