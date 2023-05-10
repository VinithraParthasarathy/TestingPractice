package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
	WebDriver driver;
	@Given("User launches the fb url")
	public void user_launches_the_fb_url() {
		WebDriverManager.chromedriver().setup();
		   driver = new ChromeDriver();
		   driver.get("https://www.facebook.com");
		   driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters the username")
	public void user_enters_the_username() {
		driver.findElement(By.id("email")).sendKeys("Oranium");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User enters the password")
	public void user_enters_the_password() {
		driver.findElement(By.id("pass")).sendKeys("43493i");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
		driver.findElement(By.name("login")).click();;
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

	@Then("User should be on facebook page")
	public void user_should_be_on_facebook_page() {
		driver.close();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
	}

}
