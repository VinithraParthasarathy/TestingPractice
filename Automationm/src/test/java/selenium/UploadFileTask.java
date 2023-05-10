package selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import demo1.HelperClass;

public class UploadFileTask {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.foundit.in/");  
		
		driver.findElement(By.xpath("//*[@id=\"heroSection-container\"]/div[3]/div[2]/div[2]")).click();
		WebElement file = driver.findElement(By.id("file-upload"));
		file.sendKeys("C:\\Users\\ADMIN\\Desktop\\resume.txt");
		WebElement findElement = driver.findElement(By.id("pop_upload"));
		findElement.click();
		
		Thread.sleep(1000);
		driver.close();
	}
}
