package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptWithInstragramUsingPropertiesFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData("url"));
		
		long time = Long.parseLong(getData("timeouts"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		

		driver.findElement(By.name("username")).sendKeys(getData("email"));
		driver.findElement(By.xpath("//label[.='Password']")).sendKeys(getData("password"));
		
		driver.findElement(By.xpath("//div[.='Log in']")).click();
		
		if(driver.getCurrentUrl().contains("home"))
			System.out.println("Login Success");
		else
			System.out.println("Login Failed");

		driver.quit();
	}
	
public static String getData(String key) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/dataqspiders.properties");
		} catch (FileNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Properties property= new Properties();
		try {
			
			property.load(fis);
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return property.getProperty(key);
		

}
}
