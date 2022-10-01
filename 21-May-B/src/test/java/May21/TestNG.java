package May21;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

	
	@BeforeClass
	public void launchbrowser()
	{
		System.out.println("launch the browser");
	}
    @BeforeMethod
    public void login()
    {
    	System.out.println("login page");
    }
    @Test(priority=2,timeOut=2000)
    public void test1() throws InterruptedException {
    	System.out.println("test 1");
    	Thread.sleep(3000);
    	
    }
    @Test(invocationCount=2)
    public void test4() {
    	System.out.println("test 4");
    }
    @Test(dependsOnMethods={"test4","test1"})
    public void test3() {
    	System.out.println("test 3");
    }
    @Test(priority=2,enabled=false)
    public void test2() {
    	System.out.println("test 2");
    }
      @AfterMethod
    public void logout()
    {
    	System.out.println("logout");
    }
    @AfterClass
    public void browserclose()
    {
    	System.out.println("close");
    }
}
