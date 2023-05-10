package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxLoop {
	public static void main(String[] args)  {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		driver.manage().window().maximize(); 
		
		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[contains(@id,'day' ) ]"));
		int size = checkboxs.size();
		System.out.println(size);
		System.out.println("For Loop");
		for(int i=0; i<checkboxs.size(); i++) {
			if(i>4)
		{
			checkboxs.get(i).click();
		}
		}
	}
}
