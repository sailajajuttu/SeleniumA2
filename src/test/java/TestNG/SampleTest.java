package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SampleTest {
    
	@Test
	public void demoTest() {
		
		Reporter.log("Hello World",true);
		
	}
}
