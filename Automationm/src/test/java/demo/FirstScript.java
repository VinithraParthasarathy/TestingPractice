package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();

	WebDriver contain = new ChromeDriver();
	contain.get("https://demo.nopcommerce.com/");
	 contain.findElement(By.xpath("//input[(@id='small-searchterms')or(@name='q')]")).click();
	Thread.sleep(3000);
	contain.close();

}
}   

