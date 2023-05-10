package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navi {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/");
		driver.navigate().to("https://www.teachmint.com/dashboard");
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().to("https://demo.nopcommerce.com/search?q=hp");
		
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();

		driver.navigate().refresh();
		
		driver.navigate().forward();
		driver.navigate().forward();
		driver.navigate().forward();
		
		
		
		
}
}
