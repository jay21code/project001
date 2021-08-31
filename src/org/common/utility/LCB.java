package org.common.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LCB {
	WebDriver driver;
	@Test
	@Parameters("Browser")
	 public void openBrowser(String Browser)
	{
		
		if(Browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		}
		
		else if(Browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.firefox.driver", "E:\\Drivers\\geckodriver.exe");
			
			 driver = new FirefoxDriver();
		}
		
		else
		{
            System.setProperty("webdriver.ie.driver", "E:\\Drivers\\IEDriverServer.exe");
			
			driver = new InternetExplorerDriver();
		}
		driver.get("https://testwmchristusweb.azurewebsites.net/");
		
          String pageTitle = driver.getTitle().toString();
          System.out.println(" The title of tha page is : " +pageTitle);
		
		driver.manage().window().maximize();
	}
	
	

}
