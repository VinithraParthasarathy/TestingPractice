package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeLogin {
	WebDriver driver ;
	@Given("User is on orange hrm page")
	public void user_is_on_orange_hrm_page() {
		
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	   
	
	@When("User enters the username for login page")
	public void user_enters_the_username_for_login_page() {
		
		driver.findElement(By.name("username")).sendKeys("Admin");
	}
	    
	
	@When("User enters the password for login page")
	public void user_enters_the_password_for_login_page() {
		driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	@When("User clicks on login button in login page")
	public void user_clicks_on_login_button_in_login_page() {
	    
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("User should see the homepage")
	public void user_should_see_the_homepage() {
	   
    String text = driver.findElement(By.xpath("//h6[text()='Dashboard']")).getText();
   
    if(text.equals("Dashboard"))
    {
    	System.out.println("User is on homepage ");
    }
    
    else 
    {
    	System.out.println("User is not on homepage ..");
    }
    
    driver.close();

}
	

@When("User enters the username {string} for login page")
public void user_enters_the_username_for_login_page(String uname) {
	driver.findElement(By.name("username")).sendKeys(uname);
}
@When("User enters the password {string} for login page")
public void user_enters_the_password_for_login_page(String pass) {
	driver.findElement(By.name("password")).sendKeys(pass);
}

}
