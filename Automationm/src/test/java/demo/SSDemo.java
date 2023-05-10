package demo;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class SSDemo {
	public static  void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tss = (TakesScreenshot) driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/fb"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, dest);
	}
	public void captureCompleteScreenshot() throws Exception 
	{
	Robot r = new Robot();
	java.awt.Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec = new Rectangle(d);
	BufferedImage bi = r.createScreenCapture(rec);
	File dest = new File ("./RobotScreenshot/rec"+System.currentTimeMillis()+".png");
	ImageIO.write(bi,"png", dest);
	}
public static void main(String[] args) throws IOException {
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/login/");
	WebElement username = driver.findElement(By.id("email"));
	username.sendKeys("vinithra");
	captureScreenshot(driver);
	WebElement pwd = driver.findElement(By.id("pass"));
	pwd.sendKeys("1234");
	captureScreenshot(driver);
	driver.findElement(By.id("loginbutton")).click();
	captureScreenshot(driver);
	
}	
}
