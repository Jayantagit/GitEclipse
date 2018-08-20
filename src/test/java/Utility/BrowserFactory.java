package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory 
{
	
	   WebDriver driver;
		public WebDriver StartBrowser(String browserName,String URL)
		{
			if(browserName.equals("firefox"))
			{
				driver=new FirefoxDriver();
			}
			else if(browserName.equals("Chrome"))
			{
				  System.setProperty("webdriver.chrome.driver", "D:\\Software\\LatestChromeDriver\\chromedriver.exe");
		    	  driver=new ChromeDriver();
			}
			driver.manage().window().maximize();
			driver.get(URL);
			return driver;
			
		}

}
