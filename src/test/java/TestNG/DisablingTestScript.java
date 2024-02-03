package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DisablingTestScript {

	@Test
	public void demo1() {
		Reporter.log("demo1",true);
	}
	
	@Test(enabled = false)
	public void demo2()
	{
		Reporter.log("demo2",true);
	}
}
