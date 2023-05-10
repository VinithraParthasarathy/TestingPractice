package ExtentReport;

import java.lang.module.ModuleDescriptor.Exports;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ExtentReportTask {
	Exports extent;
	ExtentSparkReporter spark;
	ExtentTest test;
	
	@BeforeTest
	public void start()
	{
		ExtentSparkReporter spark = new ExtentSparkReporter(System.getProperty("user.dir")+"\\Report\\extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(spark);
	}
	
	@Test
	public void signIn()
	{
	 test = extent.createTest("User is signing on first page");
	 test.log(Status.PASS, "Sign in page got pass");
	 
	}
	
	@Test
	
	public void homepage()
	{
		test= extent.createTest("Homepage Test").assignAuthor("Oranium").assignCategory("smoke").assignDevice("chrome");
		test.pass("User is on home page succesfully");
	}
	
	@Test
	public void productpage()
	{
		test= extent.createTest("Product page test").assignAuthor("Guys").assignCategory("Regression").assignDevice("Edge");
		test.fail("Product page test case got failed"); 
		
	}
	
	
	@AfterTest
	public void quit()
	{
		extent.flush();
	}
	
}

