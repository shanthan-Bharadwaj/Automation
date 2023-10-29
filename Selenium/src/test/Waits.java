package test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		 WebDriver  driver ;
		 projectpath = System.getProperty("user.dir");
		 System.setProperty("webdriver.chrome.driver", projectpath +
		 "/src/test/resources/drivers/chromedriver.exe"); 
		 driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		

	}

}
