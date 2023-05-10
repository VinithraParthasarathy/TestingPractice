package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AttributesPractice {
	@Test(priority=-2, description="Test case for login functionality" )
	public void login ()
	{
		System.out.println("Login functionality check ");
		Assert.assertTrue(false);     //hard assertion 
	}

	@Test(priority=-1,dependsOnMethods="login",alwaysRun=true, timeOut=2000)
	public void homepage() throws InterruptedException
	{
		Thread.sleep(2100);
		System.out.println("Home page check ");
	}

	@Test(priority=0, description="Test case for product page ",invocationCount=2, invocationTimeOut=2 )
	public void productpage()
	{
		System.out.println("Product check ");
	}
	
	@Test(priority=1, description= "Test case for addtocart page ",enabled=false, expectedExceptions=Exception.class)
	public void addToCart()  
	{
		System.out.println("Add to cart check ");
	}
}
