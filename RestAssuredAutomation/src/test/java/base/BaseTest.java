package base;

import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class BaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static WebDriver driver;
	public static Properties prop = new Properties();
	public static FileReader fr;
	
	
	public void setup() {
		
		if(driver== null) {
			
		}
	}
	
	public void tearDown() {
		
	}

}
