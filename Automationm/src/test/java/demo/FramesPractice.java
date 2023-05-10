package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class FramesPractice {
	public static void main(String[] args) {
		WebDriver driver = HelperClass.browserSetup("chrome");
		
		driver.get("https://demo.automationtesting.in/Frames.html"); //to get the u r l
		driver.manage().window().maximize(); //to maximize the u r l
		//driver.switchTo().frame("single frame");	
		WebElement frame = driver.findElement(By.name("SingleFrame"));
		driver.switchTo().frame(0); //driver.switchTo().frame(frame);
		WebElement inputbox  = driver.findElement(By.xpath("//input[@type='text']"));
		inputbox.sendKeys("Selenium");
		driver.switchTo().defaultContent(); //It will switch to the default web page 
		//In line frames 
		WebElement inlineframe = driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']"));
		inlineframe.click();
		
		WebElement outerframe = driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		driver.switchTo().frame(outerframe);
		
		WebElement innerframe = driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']"));
		driver.switchTo().frame(innerframe);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Selenium");
		driver.switchTo().parentFrame();
		
		System.out.println("Switched to parent frame and getting the text ");
		WebElement nested = driver.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		String text = nested.getText();
		System.out.println(text);

}
	
	
	
	
}
