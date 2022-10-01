package utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Baseclass {
	
	public static WebDriver chromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions coptions=new ChromeOptions();
		coptions.addArguments("--inCognito");
		DesiredCapabilities dcapability=DesiredCapabilities.chrome();
		dcapability.setCapability(ChromeOptions.CAPABILITY,0);
		 WebDriver driver=new ChromeDriver();
		 return driver;
	}
	public static WebDriver firefoxbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 return driver;
	}
	

}
