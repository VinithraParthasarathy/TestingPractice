package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import baseTest.BaseClassTest;

public class LogTestTask extends BaseClassTest {
	
	@Test(priority=0)
	public void checkrem_Me_linkExist() {
		boolean status = rem.checkLink();
		Assert.assertTrue(status);
	}

	@Test(priority=1)
	public void login() {
		rem.login();

	}
}