package slidePractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class KeyboardShortcut {
public static void main(String[] args) {
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");

	WebElement userid = driver.findElement(By.name("email"));
	WebElement pass = driver.findElement(By.id("pass"));
	WebElement log = driver.findElement(By.id("loginbutton"));
	
	Actions act = new Actions(driver);
	
	act.sendKeys(userid,"VINITHRA").perform();                                           //send the keys
	
	act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();  //control+a
	
	act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();  //control+c
	 
	act.sendKeys(Keys.TAB).perform();                                               //password field
	
	act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();  //control+v
	
	act.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.ENTER).perform();      //two tabs and press enter
	
	driver.close();
	
	
	
	
	

	
}

}
