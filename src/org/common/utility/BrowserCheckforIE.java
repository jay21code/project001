package org.common.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserCheckforIE {

	public static void main(String[] args) {
		
WebDriver driver;
		
		String path = System.getProperty("user.dir");
		System.setProperty("webdriver.ie.driver", path+"\\Drivers\\IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize()
;		
		
		

	}

}
