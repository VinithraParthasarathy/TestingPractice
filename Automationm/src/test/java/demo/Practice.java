package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize(); 
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[contains(@id,'day' ) ]"));
		System.out.println("For Loop");
		for(int i=0; i<checkboxs.size(); i++)
		{
			checkboxs.get(i).click();
		}
		
	}
}
