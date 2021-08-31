package org.common.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browserfirefox {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", path+"\\Drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize()
;		
		

	}

}
