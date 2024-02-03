package pomClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demoapp.skillrary.com/login.php?type=login");
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 
		 LoginPageWithPomClass login = new LoginPageWithPomClass(driver);
		 
		 if(login.getPageHeader().equals("Login"))
			 System.out.println(" Login Success");
		 else
			 System.out.println("Login Failed");
		 
		 login.setUsername("admin");
		 login.setPassword("admin");
		 login.clickKeepMeLoggedInCB();
		 login.clickLoginButton();
		 
		 Thread.sleep(3000);
		 
         driver.quit();
	}

}
