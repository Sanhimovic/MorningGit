package generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.internal.annotations.ITest;

import testScripts.TestScriptLogin;

public class Base_Class implements Framework_Constants
{
	public WebDriver driver;
	@BeforeMethod
	public void before()
	{
		System.setProperty(Gecko_key, Gecko_value);
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void after(ITestResult res) throws InterruptedException, IOException
	{
		if (res.getStatus()==ITestResult.FAILURE) 
		{
			Generic_Screenshot.get_Photo(driver);
		}
		Thread.sleep(5000);
		driver.close();
	}
}
