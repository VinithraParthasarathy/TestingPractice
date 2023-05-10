package mouseOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import demo1.HelperClass;

public class DragAndDropPractice {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = HelperClass.browserSetup("chrome");
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        driver.manage().window().maximize();
		
		WebElement washington = driver.findElement(By.id("box3"));
		WebElement norway = driver.findElement(By.id("box101"));
		
		WebElement rome = driver.findElement(By.id("box6"));
		WebElement denmark = driver.findElement(By.id("box104"));
		
		WebElement Italy = driver.findElement(By.id("box106"));
		WebElement Oslo = driver.findElement(By.id("box1"));
		
		WebElement Spain = driver.findElement(By.id("box107"));
		WebElement Stockholm = driver.findElement(By.id("box2"));
		
		WebElement SouthKorea = driver.findElement(By.id("box105"));
		WebElement Copenhagen = driver.findElement(By.id("box4"));
		
		WebElement Sweden = driver.findElement(By.id("box102"));
		WebElement Seoul = driver.findElement(By.id("box5"));
		
		WebElement UnitedStates = driver.findElement(By.id("box103"));
		WebElement Madrid = driver.findElement(By.id("box7"));
		//Actions class 
		Actions act = new Actions(driver);
		
        act.dragAndDrop(washington, norway).dragAndDrop(rome, denmark).dragAndDrop(Oslo, Italy)
        .dragAndDrop(Stockholm, Spain).dragAndDrop(Copenhagen, SouthKorea)
        .dragAndDrop(Seoul, Sweden).dragAndDrop(Madrid, UnitedStates).perform();
        
        Thread.sleep(2000);
        driver.close();
	}


}
