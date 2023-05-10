package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.orangehrm.com/");
	driver.manage().window().maximize();

	WebElement findElement = driver.findElement(By.name("Email"));
	findElement.sendKeys("vinithra");
	boolean displayed = findElement.isDisplayed();
	System.out.println(displayed);
	
	boolean enabled=findElement.isEnabled();
	System.out.println(enabled);
	
	WebElement findElement1 = driver.findElement(By.id("Form_getForm_action_submitForm"));
	boolean select = findElement1.isSelected();
	System.out.println(select);
	
}
}
