package grroupExecution;

import org.testng.annotations.Test;

public class TestClass4 {

	@Test(groups = {"sanity","regression","smoke"})
	public void demo1()
	{
		System.out.println("Testclass4 - demo1 - sanity,regression and smoke");
	}
	
	@Test
	public void demo2()
	{
		System.out.println("Testclass4 - demo2 - no group");
	}
	
	
}
