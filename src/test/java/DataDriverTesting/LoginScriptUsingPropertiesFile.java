package DataDriverTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptUsingPropertiesFile {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","./src/main/resources/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(getData("url"));
	    long time = Long.parseLong(getData("timeouts"));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
		
		driver.findElement(By.id("email")).sendKeys(getData("username"));
		driver.findElement(By.id("password")).sendKeys(getData("password"));
		driver.findElement(By.name("login")).click();
		
		if(driver.getCurrentUrl().contains("home"))
			System.out.println("Login Success");
		else
			System.out.println("Login Faied");
		
		driver.quit();
	   

	}
	
	public static String getData(String key) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("./src/test/resources/data.properties");
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
