package demo;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class ScreenshotPractice {
	public static  void captureScreenshot(WebDriver driver) throws IOException
	{
		TakesScreenshot tss = (TakesScreenshot) driver;
		File temp = tss.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Screenshot/task"+System.currentTimeMillis()+".png");
		FileUtils.copyFile(temp, dest);
	}
	public static void captureCompleteScreenshot() throws Exception 
	{
	Robot r = new Robot();
	java.awt.Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
	Rectangle rec = new Rectangle(d);
	BufferedImage bi = r.createScreenCapture(rec);
	File dest = new File ("./RobotScreenshot/rec"+System.currentTimeMillis()+".png");
	ImageIO.write(bi,"png", dest);
	}
public static void main(String[] args) throws Exception {
	WebDriver driver = HelperClass.browserSetup("chrome");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    WebElement usern = driver.findElement(By.name("username"));
    usern.sendKeys("Admin");
    captureScreenshot(driver);
    WebElement pwd = driver.findElement(By.name("password"));
    pwd.sendKeys("admin123");
    captureScreenshot(driver);
    driver.findElement(By.xpath("//button[@type='submit']")).click();
    Thread.sleep(2000);
    captureScreenshot(driver);
    driver.close();
}
}
