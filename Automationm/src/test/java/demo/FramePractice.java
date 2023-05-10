package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import demo1.HelperClass;

public class FramePractice {
public static void main(String[] args) throws InterruptedException {
WebDriver driver =	HelperClass.browserSetup("chrome");
driver.get("https://chercher.tech/practice/frames");  //opens u r l
driver.manage().window().maximize();  //maximize
driver.switchTo().frame("frame1");    //frame
driver.switchTo().frame("frame3");  //frame
driver.findElement(By.id("a")).click();
driver.switchTo().parentFrame();  //parent frame
driver.findElement(By.xpath("//input")).sendKeys("FRAMES");
driver.switchTo().defaultContent(); //switch to default web page 
driver.switchTo().frame("frame2");
WebElement dd =driver.findElement(By.id("animals"));
Select s = new Select(dd);
s.selectByIndex(3);
Thread.sleep(3000);
driver.close();


	}
}
