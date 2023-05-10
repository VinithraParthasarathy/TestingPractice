import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import junit.framework.TestCase;

public class ListenersTask {
	public class Listener extends TestCase implements ITestListener{
		
		 public  void onTestStart(ITestResult result) {
			   
			 System.out.println("On Test Started ");
			  }
		 
		 
		public  void onTestSuccess(ITestResult result) {
			    System.out.println("Test success");
			  }
		
		public void onTestFailure(ITestResult result) {
			   System.out.println("Test failure");
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

	
}
