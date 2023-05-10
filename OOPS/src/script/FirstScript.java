package script;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScript {
public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/"); //to open the url
		WebElement textbox=	  driver.findElement(By.className("RNmpXc"));
		  textbox.sendKeys("selenium");
		  textbox.sendKeys("keys.ENTER");
		  List<WebElement> links = driver.findElements(By.tagName("a"));
		  System.out.println(links.size());
}


}

				