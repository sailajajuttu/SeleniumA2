package grroupExecution;

import org.testng.annotations.Test;

public class TestClass2 {

	@Test(groups = "sanity")
	public void demo1()
	{
		System.out.println("Testclass2 - demo1 - sanity");
	}
	
	@Test(groups = "smoke")
	public void demo2()
	{
		System.out.println("Testclass2 - demo2 - regression");
	}
	
	@Test(groups = {"sanity","smoke"})
	public void demo3()
	{
		System.out.println("Testclass2 - demo3 - sanity,regression");
	}

}
