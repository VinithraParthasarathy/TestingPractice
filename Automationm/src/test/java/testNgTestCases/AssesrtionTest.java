package testNgTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssesrtionTest {
	
@Test
	
	public void login()
	{
		Assert.assertTrue(false);                       //hard assert(fail)
		System.out.println("After hard assertion ");  //It will not come to this step
		Assert.assertEquals(11,10);                       //fail
		System.out.println("After assertion");
	}
	
	@Test
	
	public void homepage()
	{
		SoftAssert s = new SoftAssert();        //soft assert
		s.assertTrue(false);
		
		System.out.println("After soft assertion ");
		s.assertAll();
	}
}
