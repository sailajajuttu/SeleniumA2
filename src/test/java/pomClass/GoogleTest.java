package pomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		GooglePageWithPom google = new GooglePageWithPom(driver);
		
		if(google.getGoogleImage().isDisplayed())
			System.out.println("Google Page Is Displayed");
		else
			System.out.println("Google Page Not Found");
		
        
	google.setSearchTF("selenium");
	google.clickSearchButton();
	
	Thread.sleep(5000);
	
	driver.quit();
	}

}
