import org.testng.annotations.Test;

public class Class1Prac {

	
	
	@Test (groups="Regression, smoke")   //group testing
	public void method1() {
		System.out.println(System.currentTimeMillis());
		System.out.println("method1");
	}
}
