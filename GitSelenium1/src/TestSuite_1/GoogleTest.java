package TestSuite_1;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleTest 
{
	WebDriver d1 = null;
	@Before
	public void beforeTest()
	{
		d1 = new FirefoxDriver();
		d1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	@Test
	public void actualTest() 
	{
		d1.get("http://www.google.com");
	}
	@After
	public void afterTest()
	{
		d1.quit();
	}

}
