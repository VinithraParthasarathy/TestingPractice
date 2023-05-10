package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class WebTableDemo {
public static void main(String[] args) {
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.get("https://testautomationpractice.blogspot.com/");
	  List<WebElement> findElements = driver.findElements(By.xpath("//table[@name='BookTable']//tr"));
	  int rows = findElements.size();
	System.out.println(rows);
	List<WebElement> findElements1 = driver.findElements(By.xpath("//table[@name='BookTable']//th"));
	  int h = findElements1.size();
	System.out.println(h);
	
		for(int row=2; row<=rows; row++)
		{
			for (int col=1; col<=h; col++)
			{
	String text = driver.findElement(By.xpath("//table[@name='BookTable']//tr["+row+"]/td["+col+"]")).getText();
	System.err.print(text + "  ");
			}
	System.out.println();
		}
		for(int row=2; row<=rows; row++)
		{
			String author = driver.findElement(By.xpath("//table[@name='BookTable]//tr["+row+"]/td[2]")).getText();
			if(author.equals("Amod"))
			{
				String text2 = driver.findElement(By.xpath("//table[@name='BookTable]//tr["+row+"]/td[1]")).getText();
				System.out.println(text2);
			}
		}
	driver.close();
}

}
