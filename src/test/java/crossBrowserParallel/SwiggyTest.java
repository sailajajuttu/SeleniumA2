package crossBrowserParallel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SwiggyTest extends Baseclass{

	@Test
	public void swiggyTest()
	{
		driver.get("https://www.swiggy.com/");
		WebElement swiggyImage = driver.findElement(By.xpath("//*[name()='svg']"));
		if(swiggyImage.isDisplayed())
			System.out.println("Test Pass");
		else
			System.out.println("Test Failed");
	}
}
