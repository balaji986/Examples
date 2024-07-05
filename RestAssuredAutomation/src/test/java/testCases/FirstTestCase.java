package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirstTestCase {
	
	public static void main(String[] args) {
		
		
//		WebDriver driver;
		WebDriverManager.chromedriver().setup();	
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.zoho.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@id='login_id']")).sendKeys("balajji07@gmail.com");
		driver.findElement(By.id("nextbtn")).click();
		driver.findElement(By.id("password")).sendKeys("Ayan@939250"); 
		driver.findElement(By.xpath("//button[@id='nextbtn']/span")).click();
		
		driver.quit();

		
				
		
				
		
	}

}
