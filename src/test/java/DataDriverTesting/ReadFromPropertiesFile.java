package DataDriverTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadFromPropertiesFile {

	public static void main(String[] args) throws IOException {
	
		// Step1: Covert physical file into java readable file
		
		FileInputStream fis= new FileInputStream("./src/test/resources/data.properties");
		
		//Step2: Create an instance of Properties class
		
		Properties property= new Properties();//java.util
		
		//Step3: Load all key-value pairs into properties object
		
		property.load(fis);
		
		//Step4: Fetch data from Properties object
		
		System.out.println(property.getProperty("url"));
		System.out.println(property.getProperty("browser"));
		
		

	}

}
