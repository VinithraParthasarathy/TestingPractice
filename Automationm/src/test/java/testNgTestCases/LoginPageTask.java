package testNgTestCases;

import org.openqa.selenium.By;

import baseTest.BaseClassTest;

public class LoginPageTask extends BaseClassTest {
	    //by Locators 
		By uname = By.id("Email");
		By pwd = By.id("Password");
		By rem_Me= By.id("RememberMe");
		By login=By.xpath("//button[@type='submit']");
		//Actions or methods 
		public boolean checkLink()
		{
			boolean status = driver.findElement(rem_Me).isDisplayed();
			return status;
		}
		
		public void login()
		{
//			driver.findElement(uname).sendKeys("abcde");
//			driver.findElement(pwd).sendKeys("1234");
//			driver.findElement(login).click();
			
			com.enterValue(uname, "abcde");
			com.enterValue(pwd, "1234");
			com.click(login);
		}

}
