package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependencyBetwwenMethods {

	@Test
	public void navigateToApp()
	{
		
		Reporter.log("navigateToApp");
	}
	
	@Test(dependsOnMethods = "navigateToApp")
	public void loginToApp()
	{
		Reporter.log("loginToApp");
	}
}
