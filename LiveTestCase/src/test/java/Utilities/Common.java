package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Common {
	public void enterValue(By locator,String text)
	{
	driver.findElement(locator).sendKeys(text);
	}
	public void click(By locator)
	{
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
	}
	public String fetchUrl() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}

}
