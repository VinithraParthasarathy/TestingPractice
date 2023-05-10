package slidePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class SliderDemoPractice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
	WebElement miniSlide = driver.findElement(By.xpath("//*[@id='slider-range']/span[1]"));
	WebElement maxiSlide = driver.findElement(By.xpath("//*[@id='slider-range']/span[2]"));
	
	Actions act = new Actions(driver);
	Point location = miniSlide.getLocation();
	System.out.println(location);
	Point location2 = maxiSlide.getLocation();
	System.out.println(location2);
	
	act.dragAndDropBy(miniSlide,200, 250).perform();
	act.dragAndDropBy(maxiSlide,-150, 250).perform();
	System.out.println();
	
	Thread.sleep(2000);
	driver.close();
	
	
	
}
}
