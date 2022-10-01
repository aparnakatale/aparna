package May21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import utility.Baseclass;

public class TestngClass {
	WebDriver driver;
   @Parameters("browser")
	@BeforeClass
	public void launchBrowser(String browsername)
	{
		if(browsername.equals("Chrome"))
		{
			/*System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();*/
			 driver=Baseclass.chromebrowser();
		}
		if(browsername.equals("Firefox"))
		{
			/*System.setProperty("webdriver.gecko.driver", "E:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
			driver=new FirefoxDriver();*/
			driver=Baseclass.firefoxbrowser();
			
		}
		
	}
	@BeforeMethod
	public void openapplication()
	{
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
	}
	
	@Test
	public void testcase()
	{
		System.out.println("test cases");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("logout");
	}
	
	@AfterClass
	public void closebrowser()
	{
		//driver.close();
		System.out.println("driver close");
	}
	
	

}
