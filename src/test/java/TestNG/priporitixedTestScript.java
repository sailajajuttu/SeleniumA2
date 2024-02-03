package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class priporitixedTestScript {

	@Test(priority = 1)
	public void demo1()
	{
		Reporter.log("demo1,true");
	}
	
	@Test(priority = 0)
	public void demo2()
	{
		Reporter.log("demo2,true");
	}
}
