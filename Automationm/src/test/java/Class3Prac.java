import org.testng.annotations.Test;

public class Class3Prac {
	

		
		
		@Test  //parallel testing
		public void method3() {
			System.out.println(System.currentTimeMillis());
			System.out.println("method3");
		}
	

			
			
			@Test(groups="sanity")    //group testing
			public void method4() {
				System.out.println(System.currentTimeMillis());
				System.out.println("method4");
			}
}
