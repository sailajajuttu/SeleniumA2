package Annotation;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {

	@BeforeSuite
	public void suiteConfig()
	{
		System.out.println("Before Suite");
	}
	@BeforeTest
	public void testConfig()
	{
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void classConfig()
	{
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void methodConfig()
	{
		System.out.println("Before Method");
	}
	
	@AfterMethod
	public void methodTearDown()
	{
		System.out.println("After Method");
	}
	
	@AfterClass
	public void classTearDown()
	{
		System.out.println("After Class");
	}
	
	@AfterTest
	public void testTearDown()
	{
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void suiteTearDown()
	{
		System.out.println("After Suite");
	}
	
	
}