package generic_script;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class Base_test {
	public WebDriver driver;
	@BeforeMethod
	public void openapl()
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
	}
	@AfterMethod
	public void closeapl(ITestResult res) throws IOException
	{
		if(ITestResult.FAILURE==res.getStatus())
		{
	TakeScreenShot.getPhoto(driver);
		}
		driver.close();
	}

}



