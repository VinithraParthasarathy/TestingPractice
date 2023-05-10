package demo;



import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstScript {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();   //chromedriver setup
	EdgeDriver driver = new EdgeDriver();
	driver.get("https://www.google.com");
	
}
}
