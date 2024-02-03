package crossBrowserParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;


public class GoogleTest extends Baseclass{

	@Test
	public void googleTest()
	{
		driver.get("https://www.google.com/");
		WebElement googleImage = driver.findElement(By.xpath("//img[@alt='Google']"));
		if(googleImage.isDisplayed())
			System.out.println("Test Pass");
		else
			System.out.println("Test Failed");
	}
	
}
