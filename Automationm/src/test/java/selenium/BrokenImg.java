package selenium;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


import demo1.HelperClass;

public class BrokenImg {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();

		JavascriptExecutor jse = (JavascriptExecutor)driver;
	String url = jse.executeScript("return document.URL;").toString();
	 
	 System.out.println(url);
	 
	 String title = jse.executeScript("return document.title;").toString();
	 System.out.println(title);

	 driver.close();
	}
}
