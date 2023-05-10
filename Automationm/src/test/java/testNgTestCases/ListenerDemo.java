package testNgTestCases;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;



public class ListenerDemo extends TestCaseListeners implements ITestListener{
	public  void onTestStart(ITestResult result) {
		   
		 System.out.println("on test started ");
		  }
	 
	 
	public  void onTestSuccess(ITestResult result) {
		    System.out.println("Test success");
		  }
	
	public void onTestFailure(ITestResult result) {
		   System.out.println("TEst failure");
		   captureScreenshot();
		   
		  }
	
	
	public void onTestSkipped(ITestResult result) {
		   System.out.println("Test Skipped ");
		  }
	
	
	 public  void onStart(ITestContext context) {
		  System.out.println("On test start");
		  }

	 
	 
	 public  void onFinish(ITestContext context) {
		   System.out.println("Test Finished ");
		  }


	
}
