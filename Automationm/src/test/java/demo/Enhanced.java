package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Enhanced {
	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize(); 
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[contains(@id,'day' ) ]"));

	System.out.println("Enhanced For Loop");
	for(WebElement checkbox:checkboxs)
	{
		String day = checkbox.getAttribute("id");
			if(day.equals("monday") || day.equals("friday"))
		{
		checkbox.click();
		}
}
}
}