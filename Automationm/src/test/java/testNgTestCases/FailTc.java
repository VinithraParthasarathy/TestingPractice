package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailTc {
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void tc1()
	{
		Assert.assertTrue(false);
	}
	
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void tc2()
	{
		Assert.assertTrue(true);
	}
	
	
	@Test(retryAnalyzer = RetryAnalyzer.class)
	public void tc3()
	{
		Assert.assertTrue(false);
	}
	
}
